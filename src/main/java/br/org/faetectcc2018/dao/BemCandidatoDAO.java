package br.org.faetectcc2018.dao;

import br.org.faetectcc2018.connection.ConexaoJPA;
import br.org.faetectcc2018.modelo.BemCandidato;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceException;
import javax.persistence.TypedQuery;
import java.util.ArrayList;

public class BemCandidatoDAO {

    private static final String SELECT = "SELECT bc FROM BemCandidato bc";

    private ConexaoJPA jpa = new ConexaoJPA();
    private EntityManager entityManager;

    //\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\
    public ArrayList<BemCandidato> listarTodos(int offset, int limit) throws PersistenceException {
        try {
            entityManager = jpa.getEntityManager();
            TypedQuery<BemCandidato> query = entityManager.createQuery(SELECT, BemCandidato.class);
            query.setFirstResult(offset);
            query.setMaxResults(limit);
            return new ArrayList<>(query.getResultList());
        } catch (Exception e) {
            throw new PersistenceException("listar todos: " + e.getMessage(), e);
        } finally {
            entityManager.close();
        }
    }

    public ArrayList<BemCandidato> listarTodos(int offset) throws PersistenceException {
        return listarTodos(offset, 100);
    }

    public ArrayList<BemCandidato> listarTodos() throws PersistenceException {
        return  listarTodos(0);
    }
}
