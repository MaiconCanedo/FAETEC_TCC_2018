package br.org.faetectcc2018.teste;


import br.org.faetectcc2018.dao.BemCandidatoDAO;
import br.org.faetectcc2018.dao.CandidatoDAO;
import br.org.faetectcc2018.modelo.BemCandidato;
import br.org.faetectcc2018.modelo.Candidato;

import java.util.ArrayList;

public class TesteJPA {

    private static CandidatoDAO candidatoDAO = new CandidatoDAO();
    private static BemCandidatoDAO bemCandidatoDAO = new BemCandidatoDAO();

    public static void main(String[] args) {
        ArrayList<Candidato> candidatos = candidatoDAO.listarTodos();
        for (Candidato candidato: candidatos) {
            System.out.println(candidato);
        }

        ArrayList<BemCandidato> bensCandidatos = bemCandidatoDAO.listarTodos();
        for (BemCandidato bemCandidato: bensCandidatos) {
            System.out.println(bemCandidato);
        }
    }
}
