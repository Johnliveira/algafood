package com.joaolabs.algafood.domain.repository;

import com.joaolabs.algafood.domain.entity.Restaurante;
import org.springframework.stereotype.Component;

import java.util.List;

public interface RestauranteRepository {

    List<Restaurante> findAll();
    Restaurante porId(Long id);
    Restaurante adicionar(Restaurante restaurante);
    void remover (Restaurante restaurante);
}
