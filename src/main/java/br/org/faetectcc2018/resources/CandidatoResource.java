package br.org.faetectcc2018.resources;

import br.org.faetectcc2018.model.Candidato;
import br.org.faetectcc2018.services.CandidatoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/candidatos")
public class CandidatoResource {

    @Autowired
    private CandidatoService service;

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<Page<Candidato>> findPage(@RequestParam(value = "page", defaultValue = "0") Integer page,
                                                    @RequestParam(value = "linesPerPage", defaultValue = "24") Integer linesPerPage,
                                                    @RequestParam(value = "orderBy", defaultValue = "id") String orderBy,
                                                    @RequestParam(value = "direction", defaultValue = "ASC") String direction) {
        return ResponseEntity.ok(service.findPage(page, linesPerPage, orderBy, direction));
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<Candidato> find(@PathVariable Long id) {
        return ResponseEntity.ok(service.find(id));
    }
}