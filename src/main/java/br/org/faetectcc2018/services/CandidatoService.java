package br.org.faetectcc2018.services;

import br.org.faetectcc2018.model.Candidato;
import br.org.faetectcc2018.repositories.CandidatoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.*;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CandidatoService {

    @Autowired
    private CandidatoRepository repository;

    public Optional<Candidato> find(Long id) {
        return repository.findById(id);
    }

    public Optional<List<Candidato>> findAll() {
        return Optional.ofNullable(repository.findAll());
    }

    public Optional<Page<Candidato>> findPage(Integer page, Integer linesPerPage, String orderBy, String direction) {
        return Optional.ofNullable(repository.findAll(PageRequest.of(page, linesPerPage, Sort.Direction.valueOf(direction), orderBy)));
    }
}