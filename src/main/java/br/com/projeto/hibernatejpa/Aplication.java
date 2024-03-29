package br.com.projeto.hibernatejpa;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Aplication {

    public static void main(String[] args) {
        Pessoa yuri = new Pessoa("yuri", "glecios");
        EntityManagerFactory managerFactory = Persistence.createEntityManagerFactory("hibernate");
        EntityManager entityManager = managerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(yuri);
        entityManager.getTransaction().commit();
        entityManager.close();
        managerFactory.close();

    }
}
