package br.org.faetectcc2018.service;

import br.org.faetectcc2018.model.BemCandidato;
import br.org.faetectcc2018.dto.TipoBemCandidatoDTO;
import br.org.faetectcc2018.repository.BemCandidatoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BemCandidatoService {

    @Autowired
    private BemCandidatoRepository repository;

    public Optional<BemCandidato> find(Long id) {
        return repository.findById(id);
    }

    public Optional<List<BemCandidato>> findAll() {
        return Optional.ofNullable(repository.findAll());
    }

    public Optional<Page<BemCandidato>> findPage(Integer page, Integer linesPerPage, String orderBy, String direction) {
        Page<BemCandidato> bemCandidatoPage = repository.findAll(PageRequest.of(page, linesPerPage, Sort.Direction.valueOf(direction), orderBy));

        if (bemCandidatoPage.getContent().isEmpty())
            return Optional.empty();

        return Optional.of(bemCandidatoPage);
    }

    public Optional<List<TipoBemCandidatoDTO>> findAllTipoDeBem() {
        return Optional.ofNullable(repository.findDistinctByDsTipoBemCandidatoCustom());
    }
}
