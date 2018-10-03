package br.org.faetectcc2018.services;

import br.org.faetectcc2018.model.Candidato;
import br.org.faetectcc2018.repositories.CandidatoRepository;
import br.org.faetectcc2018.services.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.*;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CandidatoService {

    @Autowired
    private CandidatoRepository repository;

    public Candidato find(Long id) {
        Optional<Candidato> candidato = repository.findById(id);
        return candidato.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado! Id: " + id + ", Tipo: " + Candidato.class.getName()));
    }

    public List<Candidato> findAll() {
        List<Candidato> candidatos = repository.findAll();
        if (candidatos.isEmpty()) throw new ObjectNotFoundException("Nenhum objeto foi encontrado! Tipo: " + Candidato.class.getName());
        return candidatos;
    }

    public Page<Candidato> findPage(Integer page, Integer linesPerPage, String orderBy, String direction) {
        PageRequest pageRequest = PageRequest.of(page, linesPerPage, Sort.Direction.valueOf(direction), orderBy);
        Page<Candidato> candidatos = repository.findAll(pageRequest);
        if (candidatos.getContent().isEmpty()) throw new ObjectNotFoundException("Nenhum objeto foi encontrado! Tipo: " + Candidato.class.getName());
        return candidatos;
    }
}
