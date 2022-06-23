package com.api.controlempresa.services;

import com.api.controlempresa.models.FuncionariosModels;
import com.api.controlempresa.repositores.FuncionariosRepository;

import dtos.FuncionariosDtos;
import org.aspectj.weaver.ast.Var;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import javax.transaction.Transactional;
import javax.validation.Valid;
import java.util.Optional;
import java.util.UUID;

@Service


public class FuncionariosService {

    final FuncionariosRepository funcionariosRepository;


    public FuncionariosService(FuncionariosRepository funcionariosRepository) {
        this.funcionariosRepository = funcionariosRepository;
    }

    public static list<FuncionariosModels> findOne() {
        return FuncionariosRepository.findAll();
    }

    @Transactional
    public FuncionariosModels save(FuncionariosModels funcionariosModels) {
        return FuncionariosRepository.save(funcionariosModels);
    }

@Transactional
    public void delete(FuncionariosModels funcionariosModels) {
        FuncionariosRepository.delete(funcionariosModels);
    }



    }




