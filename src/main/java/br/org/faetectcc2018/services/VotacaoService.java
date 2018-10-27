package br.org.faetectcc2018.services;

import br.org.faetectcc2018.model.Votacao;
import br.org.faetectcc2018.repositories.VotacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VotacaoService {

    @Autowired
    private VotacaoRepository repository;

    public Optional<Votacao> find(Long id) {
        return repository.findById(id);
    }

    public Optional<List<Votacao>> findAll() {
        return Optional.ofNullable(repository.findAll());
    }

    public Optional<Page<Votacao>> findPage(Integer page, Integer linesPerPage, String orderBy, String direction) {
        return Optional.ofNullable(repository.findAll(PageRequest.of(page, linesPerPage, Sort.Direction.valueOf(direction), orderBy)));
    }
}