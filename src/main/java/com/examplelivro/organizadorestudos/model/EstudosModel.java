package com.examplelivro.organizadorestudos.model;

import com.examplelivro.organizadorestudos.enuns.EstudosEnuns;
import jakarta.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Table(name="estudos")
public class EstudosModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private LocalTime horas;
    private EstudosEnuns prioridade;
    private String descricao;
public EstudosModel(){

}
    public EstudosModel(String nome, LocalTime horas, String descricao, EstudosEnuns prioridade) {
        this.nome = nome;
        this.horas = horas;
        this.descricao = descricao;
        this.prioridade = prioridade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalTime getHoras() {
        return horas;
    }

    public void setHoras(LocalTime horas) {
        this.horas = horas;
    }

    public EstudosEnuns getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(EstudosEnuns prioridade) {
        this.prioridade = prioridade;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
