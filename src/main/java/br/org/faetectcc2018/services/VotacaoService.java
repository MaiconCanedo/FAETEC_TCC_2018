package br.org.faetectcc2018.services;

import br.org.faetectcc2018.model.Votacao;
import br.org.faetectcc2018.repositories.VotacaoRepository;
import br.org.faetectcc2018.services.exceptions.ObjectNotFoundException;
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

    public Votacao find(Long id) {
        Optional<Votacao> votacao = repository.findById(id);
        return votacao.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado! Id: " + id + ", Tipo: " + Votacao.class.getName()));
    }

    public List<Votacao> findAll() {
        List<Votacao> votacoes = repository.findAll();
        if (votacoes.isEmpty()) throw new ObjectNotFoundException("Nenhum objeto foi encontrado! Tipo: " + Votacao.class.getName());
        return votacoes;
    }

    public Page<Votacao> findPage(Integer page, Integer linesPerPage, String orderBy, String direction) {
        PageRequest pageRequest = PageRequest.of(page, linesPerPage, Sort.Direction.valueOf(direction), orderBy);
        Page<Votacao> votacoes = repository.findAll(pageRequest);
        if (votacoes.getContent().isEmpty()) throw new ObjectNotFoundException("Nenhum objeto encontrado! Tipo: " + Votacao.class.getName());
        return votacoes;
    }
}