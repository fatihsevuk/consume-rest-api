package com.ifelseco.consumerestapi.rest;

import com.ifelseco.consumerestapi.model.Config;
import org.springframework.context.annotation.Bean;
import org.springframework.hateoas.MediaTypes;
import org.springframework.hateoas.client.Traverson;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.net.URI;

@Component
public class RestUtility {

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

    @Bean
    public Traverson traverson() {
       return new Traverson(
                URI.create(Config.baseUrl), MediaTypes.HAL_JSON);
    }
}
