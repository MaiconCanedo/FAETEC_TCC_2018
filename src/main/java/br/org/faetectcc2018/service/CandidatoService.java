package br.org.faetectcc2018.service;

import br.org.faetectcc2018.model.Candidato;
import br.org.faetectcc2018.repository.CandidatoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.*;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CandidatoService {

    @Autowired
    private CandidatoRepository repository;

    public Optional<Candidato> find(Long id) {
        return repository.findById(id);
    }

    public Optional<Page<Candidato>> findPage(Integer page, Integer linesPerPage, String orderBy, String direction) {
        Page<Candidato> candidatoPage = repository.findAll(PageRequest.of(page, linesPerPage, Sort.Direction.valueOf(direction), orderBy));

        if (candidatoPage.getContent().isEmpty())
            return Optional.empty();

        return Optional.of(candidatoPage);
    }

    public Optional<Page<Candidato>> findByCargoAndUf(String siglaUf, String cargoCodigo, Integer page, Integer linesPerPage, String orderBy, String direction){
        Page<Candidato> candidatoPage = repository.findBySgUfAndDsCargo(siglaUf, cargoCodigo, PageRequest.of(page, linesPerPage, Sort.Direction.valueOf(direction), orderBy));

        if (candidatoPage.getContent().isEmpty())
            return Optional.empty();

        return Optional.of(candidatoPage);
    }
}