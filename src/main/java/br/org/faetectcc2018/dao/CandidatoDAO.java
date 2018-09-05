package br.org.faetectcc2018.dao;

import br.org.faetectcc2018.connection.ConexaoJPA;
import br.org.faetectcc2018.modelo.Candidato;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceException;
import javax.persistence.TypedQuery;
import java.util.ArrayList;

public class CandidatoDAO {

    /*private static final String SELECT = "SELECT c FROM Candidato c";

    private ConexaoJPA jpa = new ConexaoJPA();
    private EntityManager entityManager;

    //\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\
    public ArrayList<Candidato> listarTodos(int offset, int limit) throws PersistenceException {
        try {
            entityManager = jpa.getEntityManager();
            TypedQuery<Candidato> query = entityManager.createQuery(SELECT, Candidato.class);
            query.setMaxResults(limit);
            query.setFirstResult(offset);
            return new ArrayList<>(query.getResultList());
        } catch (Exception e) {
            throw new PersistenceException("listar todos: " + e.getMessage(), e);
        } finally {
            entityManager.close();
        }
    }

    public ArrayList<Candidato> listarTodos(int offset) {
        return listarTodos(offset, 100);
    }

    public ArrayList<Candidato> listarTodos() {
        return listarTodos(0);
    }*/
}
