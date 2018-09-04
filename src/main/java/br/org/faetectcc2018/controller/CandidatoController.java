package br.org.faetectcc2018.controller;

import br.org.faetectcc2018.modelo.Candidato;
import br.org.faetectcc2018.repository.CandidatoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CandidatoController {

    @Autowired
    private CandidatoRepository candidatoRepository;

    @RequestMapping("/")
    public String listaCandidatos(Model model) {
        Iterable<Candidato> candidatos = candidatoRepository.findAll();
        model.addAttribute("candidatos", candidatos);
        return "index";
    }
}
