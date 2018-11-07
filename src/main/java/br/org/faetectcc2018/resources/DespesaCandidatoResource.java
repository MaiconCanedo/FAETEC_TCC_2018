package br.org.faetectcc2018.resources;

import br.org.faetectcc2018.model.DespesaCandidato;
import br.org.faetectcc2018.services.DespesaCandidatoService;
import br.org.faetectcc2018.resources.exceptions.ObjectNotFoundException;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/votacoes")
public class DespesaCandidatoResource {

    @Autowired
    private DespesaCandidatoService service;

    @ApiOperation(value = "Retorna uma votação pelo id")
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<DespesaCandidato> find(@PathVariable Long id) {
        return ResponseEntity.ok(
                service.find(id)
                        .orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado! Id: " + id + ", Tipo: " + DespesaCandidato.class.getName()))
        );
    }

    @ApiOperation(value = "Retorna todas as despesas dos candidatos com paginação")
    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<Page<DespesaCandidato>> findPage(@RequestParam(value = "page", defaultValue = "0") Integer page,
                                                           @RequestParam(value = "linesPerPage", defaultValue = "24") Integer linesPerPage,
                                                           @RequestParam(value = "orderBy", defaultValue = "anoEleicao") String orderBy,
                                                           @RequestParam(value = "direction", defaultValue = "DESC") String direction) {
        return ResponseEntity.ok(
                service.findPage(page, linesPerPage, orderBy, direction)
                        .orElseThrow(() -> new ObjectNotFoundException("Nenhum objeto encontrado! Tipo: " + DespesaCandidato.class.getName()))
        );
    }
}