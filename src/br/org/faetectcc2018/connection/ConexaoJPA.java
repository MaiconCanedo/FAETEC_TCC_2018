package br.org.faetectcc2018.connection;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ConexaoJPA {

    private static EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("dados_publicos-postgres");

    public EntityManager getEntityManager() {
        return entityManagerFactory.createEntityManager();
    }
}