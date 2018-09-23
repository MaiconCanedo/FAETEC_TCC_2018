package br.org.faetectcc2018.controller;

import br.org.faetectcc2018.model.BemCandidato;
import br.org.faetectcc2018.dto.TipoBemCandidato;
import br.org.faetectcc2018.services.BemCandidatoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/benscandidatos")
public class BemCandidatoController {

    @Autowired
    private BemCandidatoService service;

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<List<BemCandidato>> findAll() {
        return ResponseEntity.ok().body(service.findAll());
    }

    @RequestMapping(value = "/page", method = RequestMethod.GET)
    public ResponseEntity<Page<BemCandidato>> findPage(@RequestParam(value = "page", defaultValue = "0") Integer page,
                                                       @RequestParam(value = "linesPerPage", defaultValue = "24") Integer linesPerPage,
                                                       @RequestParam(value = "orderBy", defaultValue = "id") String orderBy,
                                                       @RequestParam(value = "direction", defaultValue = "ASC") String direction) {
        return ResponseEntity.ok().body(service.findPage(page, linesPerPage, orderBy, direction));
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<BemCandidato> find(@PathVariable Long id) {
        return ResponseEntity.ok().body(service.find(id));
    }

    @RequestMapping(value = "/tiposdebens", method = RequestMethod.GET)
    public ResponseEntity<List<TipoBemCandidato>> findTipoDeBem() {
        return ResponseEntity.ok().body(service.findAllTipoDeBem());
    }
}