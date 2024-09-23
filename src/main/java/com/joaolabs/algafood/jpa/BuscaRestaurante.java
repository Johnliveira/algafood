package com.joaolabs.algafood.jpa;

import com.joaolabs.algafood.AlgafoodApiApplication;
import com.joaolabs.algafood.domain.repository.RestauranteRepository;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

public class BuscaRestaurante {

    public static void main(String[] args) {
        ApplicationContext context = new SpringApplicationBuilder(AlgafoodApiApplication.class)
                .web(WebApplicationType.NONE)
                .run(args);

        RestauranteRepository restauranteRepository = context.getBean(RestauranteRepository.class);

        restauranteRepository.findAll().forEach(System.out::println);
    }
}
