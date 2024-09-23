package com.joaolabs.algafood.jpa;

import com.joaolabs.algafood.AlgafoodApiApplication;
import com.joaolabs.algafood.domain.entity.Restaurante;
import com.joaolabs.algafood.domain.repository.RestauranteRepository;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

import java.math.BigDecimal;

public class InclusaoRestaurante {

    public static void main(String[] args) {
        ApplicationContext context = new SpringApplicationBuilder(AlgafoodApiApplication.class)
                .web(WebApplicationType.NONE)
                .run(args);

        RestauranteRepository repository = context.getBean(RestauranteRepository.class);

        Restaurante restaurante = new Restaurante();
        restaurante.setNome("Corujao");
        restaurante.setTaxaFrete(new BigDecimal(0.99));

        restaurante = repository.adicionar(restaurante);

        System.out.println(restaurante.getId());
    }
}
