package br.org.faetectcc2018.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtil {

    private static EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("dados_publicos-postgres");

    public EntityManager getEntityManager() {
        return entityManagerFactory.createEntityManager();
    }
}