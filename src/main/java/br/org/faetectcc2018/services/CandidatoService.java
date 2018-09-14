package br.org.faetectcc2018.services;

import br.org.faetectcc2018.model.Candidato;
import br.org.faetectcc2018.repositories.CandidatoRepository;
import br.org.faetectcc2018.services.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.*;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CandidatoService {

    @Autowired
    private CandidatoRepository candidatoRepository;

    public Candidato bucar(Long id) {
        Optional<Candidato> candidato = candidatoRepository.findById(id);
        return candidato.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado! Id: " + id + ", Tipo: " + Candidato.class.getName()));
    }

    public Page<Candidato> listar(Integer page) {
        PageRequest pageRequest = PageRequest.of(page, 100, Sort.Direction.ASC, "id");
        Page<Candidato> candidatos = candidatoRepository.findAll(pageRequest);
        if (candidatos.getContent().size() == 0) throw new ObjectNotFoundException("Nenhum objeto foi encontrado! Tipo: " + Candidato.class.getName());
        return candidatos;
    }
}
