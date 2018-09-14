package br.org.faetectcc2018.controller;

import br.org.faetectcc2018.modelo.Candidato;
import br.org.faetectcc2018.repository.CandidatoPaging;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/candidatos")
public class CandidatoController {

    @Autowired
    private CandidatoPaging candidatoPaging;

    @RequestMapping(value = "/page/{page}", method = RequestMethod.GET)
    public ResponseEntity<?> listar(@PathVariable Integer page) {
        PageRequest pageRequest = new PageRequest(page, 100, Sort.Direction.ASC, "id");
        List<Candidato> candidatos = candidatoPaging.findAll(pageRequest).getContent();
        return ResponseEntity.ok().body(candidatos);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<?> buscar(@PathVariable Long id) {
        Optional<Candidato> candidato = candidatoPaging.findById(id);
        return ResponseEntity.ok().body(candidato.orElse(null));
    }
}