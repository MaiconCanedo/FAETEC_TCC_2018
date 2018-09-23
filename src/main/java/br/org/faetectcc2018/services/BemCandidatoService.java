package br.org.faetectcc2018.services;

import br.org.faetectcc2018.model.BemCandidato;
import br.org.faetectcc2018.dto.TipoBemCandidato;
import br.org.faetectcc2018.repositories.BemCandidatoRepository;
import br.org.faetectcc2018.services.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BemCandidatoService {

    @Autowired
    private BemCandidatoRepository repository;

    public BemCandidato find(Long id){
        Optional<BemCandidato> bemCandidato = repository.findById(id);
        return bemCandidato.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado! Id: " + id + ", Tipo: " + BemCandidato.class.getName()));
    }

    public List<BemCandidato> findAll(){
        List<BemCandidato> bensCandidatos = repository.findAll();
        if (bensCandidatos.size() == 0) throw new ObjectNotFoundException("Nenhum objeto foi encontrado! Tipo: " + BemCandidato.class.getName());
        return bensCandidatos;
    }

    public Page<BemCandidato> findPage(Integer page, Integer linesPerPage, String orderBy, String direction) {
        PageRequest pageRequest = PageRequest.of(page, linesPerPage, Sort.Direction.valueOf(direction), orderBy);
        Page<BemCandidato> bensCandidatos = repository.findAll(pageRequest);
        if (bensCandidatos.getContent().size() == 0) throw new ObjectNotFoundException("Nenhum objeto foi encontrado! Tipo: " + BemCandidato.class.getName());
        return bensCandidatos;
    }

    public List<TipoBemCandidato> findAllTipoDeBem(){
        List<TipoBemCandidato> tiposDeBens = repository.findDistinctByDsTipoBemCandidatoCustom();
        if (tiposDeBens.size() == 0) throw new ObjectNotFoundException("Nenhum objeto foi encontrado!");
        return tiposDeBens;
    }
}
