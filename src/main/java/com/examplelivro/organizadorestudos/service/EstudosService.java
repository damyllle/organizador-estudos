package com.examplelivro.organizadorestudos.service;
import com.examplelivro.organizadorestudos.model.EstudosModel;
import com.examplelivro.organizadorestudos.repository.EstudosRepository;
import org.springframework.stereotype.Service;

@Service
public class EstudosService {
    private final EstudosRepository repository;
    public EstudosService(EstudosRepository repository) {
        this.repository = repository;
    }

    public void validarNome(String nome) {
        if (nome == null || nome.isBlank()) {
            throw new RuntimeException("O nome da materia é obrigatorio>");
        }
    }
    public EstudosModel editarMateria(Long id, EstudosModel dadosNovos) {
        EstudosModel estudosModel = repository.findById(id).orElseThrow(() -> new RuntimeException("Materia não encontrada"));

        validarNome(dadosNovos.getNome());

        estudosModel.setNome(dadosNovos.getNome());
        estudosModel.setPrioridade(dadosNovos.getPrioridade());
        estudosModel.setHoras(dadosNovos.getHoras());
        estudosModel.setDescricao(dadosNovos.getDescricao());

        return repository.save(estudosModel);
}
}
