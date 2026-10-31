
package com.examplelivro.organizadorestudos.controller;

import com.examplelivro.organizadorestudos.model.EstudosModel;
import com.examplelivro.organizadorestudos.repository.EstudosRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/estudos")
@CrossOrigin("*")
public class EstudosController {

    private final EstudosRepository estudosRepository;

    public EstudosController(EstudosRepository estudosRepository) {
        this.estudosRepository = estudosRepository;
    }

    @GetMapping
    public List<EstudosModel> getEstudos() {
        return estudosRepository.findAll();
    }

    @PostMapping
    public EstudosModel adicionarEstudo(@RequestBody EstudosModel estudo) {
        return estudosRepository.save(estudo);
    }
}
