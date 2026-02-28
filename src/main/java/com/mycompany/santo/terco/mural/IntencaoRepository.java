package com.mycompany.santo.terco.mural;

import java.time.LocalDateTime;
import java.util.List;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

@ApplicationScoped
public class IntencaoRepository {

    private EntityManagerFactory entityManagerFactory;

    @PostConstruct
    public void init() {
        entityManagerFactory = Persistence.createEntityManagerFactory("fecatolicaPU");
    }

    @PreDestroy
    public void destroy() {
        if (entityManagerFactory != null && entityManagerFactory.isOpen()) {
            entityManagerFactory.close();
        }
    }

    public void salvar(String nome, String texto, LocalDateTime criadoEm) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        try {
            entityManager.getTransaction().begin();
    
            Intencao intencao = new Intencao();
            intencao.setNome(nome);
            intencao.setTexto(texto);
            intencao.setCriadoEm(criadoEm);
    
            entityManager.persist(intencao);
            entityManager.getTransaction().commit();
        } catch (Exception e) {
            if (entityManager.getTransaction().isActive()) {
                entityManager.getTransaction().rollback();
            }
            throw e;
        } finally {
            entityManager.close();
        }
    }

    public List<Intencao> listarRecentes(int limite) {
        try (EntityManager entityManager = entityManagerFactory.createEntityManager()) {
            return entityManager
                    .createQuery("SELECT i FROM Intencao i ORDER BY i.criadoEm DESC", Intencao.class)
                    .setMaxResults(limite)
                    .getResultList();
        }
    }

    public int contar() {
        try (EntityManager entityManager = entityManagerFactory.createEntityManager()) {
            Long total = entityManager.createQuery("SELECT COUNT(i) FROM Intencao i", Long.class).getSingleResult();
            return total.intValue();
        }
    }

    public void removerExcedentes(int limite) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        try {
            List<Long> idsExcedentes = entityManager
                    .createQuery("SELECT i.id FROM Intencao i ORDER BY i.criadoEm DESC", Long.class)
                    .setFirstResult(limite)
                    .getResultList();
    
            if (idsExcedentes.isEmpty()) {
                return;
            }
    
            entityManager.getTransaction().begin();
            entityManager.createQuery("DELETE FROM Intencao i WHERE i.id IN :ids")
                    .setParameter("ids", idsExcedentes)
                    .executeUpdate();
            entityManager.getTransaction().commit();
        } catch (Exception e) {
            if (entityManager.getTransaction().isActive()) {
                entityManager.getTransaction().rollback();
            }
            throw e;
        } finally {
            entityManager.close();
        }
    }
}
