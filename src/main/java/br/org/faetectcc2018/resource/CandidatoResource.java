package br.org.faetectcc2018.resource;

import br.org.faetectcc2018.model.Candidato;
import br.org.faetectcc2018.service.CandidatoService;
import br.org.faetectcc2018.resource.exceptions.ObjectNotFoundException;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/candidato")
public class CandidatoResource {

    @Autowired
    private CandidatoService service;

    @ApiOperation(value = "Retorna todos os candidatos com paginação")
    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<Page<Candidato>> findByCargoAndUf(@RequestParam(value = "uf", defaultValue = "") String siglaUf,
                                                            @RequestParam(value = "cargo", defaultValue = "") String cargo,
                                                            @RequestParam(value = "page", defaultValue = "0") Integer page,
                                                            @RequestParam(value = "linesPerPage", defaultValue = "24") Integer linesPerPage,
                                                            @RequestParam(value = "orderBy", defaultValue = "id") String orderBy,
                                                            @RequestParam(value = "direction", defaultValue = "ASC") String direction) {
        return ResponseEntity.ok(service.findByCargoAndUf(siglaUf, cargo, page, linesPerPage, orderBy, direction)
                .orElseThrow(() -> new ObjectNotFoundException("Nenhum objeto foi encontrado! Tipo: " + Candidato.class.getName()))
        );
    }


    @ApiOperation(value = "Retorna um candidato")
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<Candidato> find(@PathVariable Long id) {
        return ResponseEntity.ok(service.find(id)
                .orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado! Id: " + id + ", Tipo: " + Candidato.class.getName()))
        );
    }
}