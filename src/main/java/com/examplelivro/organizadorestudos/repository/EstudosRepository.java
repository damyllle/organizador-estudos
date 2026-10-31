package com.examplelivro.organizadorestudos.repository;

import com.examplelivro.organizadorestudos.model.EstudosModel;
import jakarta.persistence.Entity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstudosRepository extends JpaRepository<EstudosModel, Long> {
}
