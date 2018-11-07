package br.org.faetectcc2018.resource;

import br.org.faetectcc2018.model.BemCandidato;
import br.org.faetectcc2018.dto.TipoBemCandidatoDTO;
import br.org.faetectcc2018.service.BemCandidatoService;
import br.org.faetectcc2018.resource.exceptions.ObjectNotFoundException;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/bem")
public class BemCandidatoResource {

    @Autowired
    private BemCandidatoService service;

    @ApiOperation(value = "Retorna uma lista paginada dos bens dos candidatos")
    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<Page<BemCandidato>> findPage(@RequestParam(value = "page", defaultValue = "0") Integer page,
                                                       @RequestParam(value = "linesPerPage", defaultValue = "24") Integer linesPerPage,
                                                       @RequestParam(value = "orderBy", defaultValue = "id") String orderBy,
                                                       @RequestParam(value = "direction", defaultValue = "ASC") String direction) {
        return ResponseEntity.ok(
                service.findPage(page, linesPerPage, orderBy, direction)
                        .orElseThrow(() -> new ObjectNotFoundException("Nenhum objeto foi encontrado! Tipo: " + BemCandidato.class.getName()))
        );
    }

    @ApiOperation(value = "Busca um Bem de Candidato pelo id")
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<BemCandidato> find(@PathVariable Long id) {
        return ResponseEntity.ok(
                service.find(id)
                        .orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado! Id: " + id + ", Tipo: " + BemCandidato.class.getName()))
        );
    }

    @ApiOperation(value = "Retorna todos os tipos de bens ordenados por nome")
    @RequestMapping(value = "/tiposdebens", method = RequestMethod.GET)
    public ResponseEntity<List<TipoBemCandidatoDTO>> findTipoDeBem() {
        return ResponseEntity.ok(service.findAllTipoDeBem().orElseThrow(() -> new ObjectNotFoundException("Nenhum objeto foi encontrado!")));
    }
}