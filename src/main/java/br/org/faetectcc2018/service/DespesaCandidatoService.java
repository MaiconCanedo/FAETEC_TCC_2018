package br.org.faetectcc2018.service;

import br.org.faetectcc2018.model.DespesaCandidato;
import br.org.faetectcc2018.repository.DespesaCandidatoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DespesaCandidatoService {

    @Autowired
    private DespesaCandidatoRepository repository;

    public Optional<DespesaCandidato> find(Long id) {
        return repository.findById(id);
    }

    public Optional<Page<DespesaCandidato>> findPage(Integer page, Integer linesPerPage, String orderBy, String direction) {
        Page<DespesaCandidato> despesaCandidatoPage = repository.findAll(PageRequest.of(page, linesPerPage, Sort.Direction.valueOf(direction), orderBy));

        if (despesaCandidatoPage.getContent().isEmpty())
            return Optional.empty();

        return Optional.of(despesaCandidatoPage);
    }
}