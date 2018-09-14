package br.org.faetectcc2018.controller;

import br.org.faetectcc2018.modelo.BemCandidato;
import br.org.faetectcc2018.repository.BemCandidatoRepository;
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
@RequestMapping("/benscandidatos")
public class BemCandidatoController {

    @Autowired
    private BemCandidatoRepository candidatoRepository;

    @RequestMapping(value = "/page/{page}", method = RequestMethod.GET)
    public ResponseEntity<?> listar(@PathVariable Integer page) {
        PageRequest pageRequest = new PageRequest(page, 100, Sort.Direction.ASC, "id");
        List<BemCandidato> bensCandidatos = candidatoRepository.findAll(pageRequest).getContent();
        return ResponseEntity.ok().body(bensCandidatos);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<?> buscar(@PathVariable Long id) {
        Optional<BemCandidato> bemCandidato = candidatoRepository.findById(id);
        return ResponseEntity.ok().body(bemCandidato.orElse(null));
    }
}