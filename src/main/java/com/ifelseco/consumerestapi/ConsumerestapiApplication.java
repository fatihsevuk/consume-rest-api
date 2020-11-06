package com.ifelseco.consumerestapi;

import com.ifelseco.consumerestapi.model.Post;
import com.ifelseco.consumerestapi.service.PostService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class ConsumerestapiApplication{

    public static void main(String[] args) {
        SpringApplication.run(ConsumerestapiApplication.class, args);
    }


}
