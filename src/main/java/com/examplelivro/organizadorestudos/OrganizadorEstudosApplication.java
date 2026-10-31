package com.examplelivro.organizadorestudos;

import com.examplelivro.organizadorestudos.enuns.EstudosEnuns;
import com.examplelivro.organizadorestudos.model.EstudosModel;
import com.examplelivro.organizadorestudos.repository.EstudosRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalTime;

@SpringBootApplication
public class OrganizadorEstudosApplication {

    public static void main(String[] args) {
        SpringApplication.run(OrganizadorEstudosApplication.class, args);
    }
        @Bean
        CommandLineRunner testarBanco(EstudosRepository repository) {
            return args -> {
                EstudosModel materia = new EstudosModel("Java", LocalTime.of(11,20) , "TESTE3", EstudosEnuns.BAIXA);

                repository.save(materia);

                System.out.println("Matéria salva com sucesso!");
            };
}}
