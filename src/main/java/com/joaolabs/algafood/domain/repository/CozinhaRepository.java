package com.joaolabs.algafood.domain.repository;

import com.joaolabs.algafood.domain.entity.Cozinha;

import java.util.List;

public interface CozinhaRepository {

    List<Cozinha> todas();
    Cozinha porId(Long id);
    Cozinha adicionar(Cozinha cozinha);
    void remover(Cozinha cozinha);
}
