package com.joaolabs.algafood.jpa;

import com.joaolabs.algafood.AlgafoodApiApplication;
import com.joaolabs.algafood.domain.entity.Cozinha;
import com.joaolabs.algafood.domain.repository.CozinhaRepository;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

import java.util.List;

public class ConsultaCozinhaMain {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new SpringApplicationBuilder(AlgafoodApiApplication.class)
                .web(WebApplicationType.NONE)
                .run(args);

        CozinhaRepository cozinhas = applicationContext.getBean(CozinhaRepository.class);

        List<Cozinha> todasCozinhas = cozinhas.todas();

        todasCozinhas.forEach(cozinha -> System.out.println(cozinha.getNome()));
    }
}
