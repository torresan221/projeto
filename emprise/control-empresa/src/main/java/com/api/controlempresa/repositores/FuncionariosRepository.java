package com.api.controlempresa.repositores;

import com.api.controlempresa.models.FuncionariosModels;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface FuncionariosRepository extends JpaRepository<FuncionariosModels, UUID> {
}
