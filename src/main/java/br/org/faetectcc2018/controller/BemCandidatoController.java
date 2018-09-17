package br.org.faetectcc2018.controller;

import br.org.faetectcc2018.services.BemCandidatoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/benscandidatos")
public class BemCandidatoController {

    @Autowired
    private BemCandidatoService bemCandidatoService;

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<?> listar() {
        return listar(0);
    }

    @RequestMapping(value = "/page/{page}", method = RequestMethod.GET)
    public ResponseEntity<?> listar(@PathVariable Integer page) {
        return ResponseEntity.ok().body(bemCandidatoService.listar(page));
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<?> buscar(@PathVariable Long id) {
        return ResponseEntity.ok().body(bemCandidatoService.bucar(id));
    }

    @RequestMapping(value = "/tiposdebens")
    public ResponseEntity<?> listarTipoDeBem() {
        return ResponseEntity.ok().body(bemCandidatoService.listarTipoDeBem());
    }
}