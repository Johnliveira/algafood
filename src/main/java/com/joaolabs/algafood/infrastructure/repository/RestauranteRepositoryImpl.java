package com.joaolabs.algafood.infrastructure.repository;

import com.joaolabs.algafood.domain.entity.Restaurante;
import com.joaolabs.algafood.domain.repository.RestauranteRepository;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Component
public class RestauranteRepositoryImpl implements RestauranteRepository {

    @PersistenceContext
    EntityManager entityManager;

    @Override
    public List<Restaurante> findAll() {
        return entityManager.createQuery("from Restaurante", Restaurante.class).getResultList();
    }

    @Override
    public Restaurante porId(Long id) {
        return entityManager.find(Restaurante.class, id);
    }

    @Transactional
    @Override
    public Restaurante adicionar(Restaurante restaurante) {
         return entityManager.merge(restaurante);
    }

    @Override
    public void remover(Restaurante restaurante) {
        restaurante = porId(restaurante.getId());
        entityManager.remove(restaurante);
    }
}