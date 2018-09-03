package br.org.faetectcc2018.teste;


import br.org.faetectcc2018.dao.CandidatoDAO;
import br.org.faetectcc2018.modelo.Candidato;

import java.util.ArrayList;

public class TesteJPA {

    private static CandidatoDAO candidatoDAO = new CandidatoDAO();

    public static void main(String[] args) {
        ArrayList<Candidato> candidatos = candidatoDAO.listarTodos();
        for (Candidato candidato: candidatos) {
            System.out.println(candidato);
        }


    }
}
