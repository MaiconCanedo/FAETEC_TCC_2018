package br.org.faetectcc2018.services;

import br.org.faetectcc2018.model.Candidato;
import br.org.faetectcc2018.repositories.CandidatoRepository;
import br.org.faetectcc2018.services.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CandidatoService {

    @Autowired
    private CandidatoRepository candidatoRepository;

    public Candidato bucar(Long id){
        Optional<Candidato> candidato = candidatoRepository.findById(id);
        return candidato.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado! Id: " + id + ", Tipo: " + Candidato.class.getName()));
    }

    public List<Candidato> listar(Integer page){
        PageRequest pageRequest = new PageRequest(page, 100, Sort.Direction.ASC, "id");
        List<Candidato> candidatos = candidatoRepository.findAll(pageRequest).getContent();
        if (candidatos.size() == 0) throw new ObjectNotFoundException("Nenhum objeto foi encontrado! Tipo: " + Candidato.class.getName());
        return candidatos;
    }
}
