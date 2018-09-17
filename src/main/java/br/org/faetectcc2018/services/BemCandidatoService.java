package br.org.faetectcc2018.services;

import br.org.faetectcc2018.model.BemCandidato;
import br.org.faetectcc2018.model.dto.TipoBemCandidato;
import br.org.faetectcc2018.repositories.BemCandidatoRepository;
import br.org.faetectcc2018.services.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.Optional;

@Service
public class BemCandidatoService {

    @Autowired
    private BemCandidatoRepository bemCandidatoRepository;

    public BemCandidato bucar(Long id){
        Optional<BemCandidato> bemCandidato = bemCandidatoRepository.findById(id);
        return bemCandidato.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado! Id: " + id + ", Tipo: " + BemCandidato.class.getName()));
    }

    public Page<BemCandidato> listar(Integer page){
        PageRequest pageRequest = PageRequest.of(page, 100, Sort.Direction.ASC, "id");
        Page<BemCandidato> bensCandidatos = bemCandidatoRepository.findAll(pageRequest);
        if (bensCandidatos.getContent().size() == 0) throw new ObjectNotFoundException("Nenhum objeto foi encontrado! Tipo: " + BemCandidato.class.getName());
        return bensCandidatos;
    }

    public List<TipoBemCandidato> listarTipoDeBem(){
        List<TipoBemCandidato> tiposDeBens = bemCandidatoRepository.findDistinctByDsTipoBemCandidatoCustom();
        if (tiposDeBens.size() == 0) throw new ObjectNotFoundException("Nenhum objeto foi encontrado!");
        return tiposDeBens;
    }
}
