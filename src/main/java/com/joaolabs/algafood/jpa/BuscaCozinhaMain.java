package com.joaolabs.algafood.jpa;

import com.joaolabs.algafood.AlgafoodApiApplication;
import com.joaolabs.algafood.domain.entity.Cozinha;
import com.joaolabs.algafood.domain.repository.CozinhaRepository;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

public class BuscaCozinhaMain {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new SpringApplicationBuilder(AlgafoodApiApplication.class)
                .web(WebApplicationType.NONE)
                .run(args);

        CozinhaRepository cozinhaRepository = applicationContext.getBean(CozinhaRepository.class);

        Cozinha cozinha = cozinhaRepository.porId(1L);
        System.out.println(cozinha.getNome());
    }
}
