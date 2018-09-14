package br.org.faetectcc2018.services;

import br.org.faetectcc2018.model.BemCandidato;
import br.org.faetectcc2018.model.Candidato;
import br.org.faetectcc2018.repositories.BemCandidatoRepository;
import br.org.faetectcc2018.services.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BemCandidatoService {

    @Autowired
    private BemCandidatoRepository bemCandidatoRepository;

    public BemCandidato bucar(Long id){
        Optional<BemCandidato> bemCandidato = bemCandidatoRepository.findById(id);
        return bemCandidato.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado! Id: " + id + ", Tipo: " + BemCandidato.class.getName()));
    }

    public List<BemCandidato> listar(Integer page){
        PageRequest pageRequest = new PageRequest(page, 100, Sort.Direction.ASC, "id");
        List<BemCandidato> bensCandidatos = bemCandidatoRepository.findAll(pageRequest).getContent();
        if (bensCandidatos.size() == 0) throw new ObjectNotFoundException("Nenhum objeto foi encontrado! Tipo: " + BemCandidato.class.getName());
        return bensCandidatos;
    }
}
