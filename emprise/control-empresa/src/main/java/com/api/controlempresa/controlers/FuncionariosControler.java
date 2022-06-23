package com.api.controlempresa.controlers;

import com.api.controlempresa.models.FuncionariosModels;
import com.api.controlempresa.services.FuncionariosService;
import dtos.FuncionariosDtos;
import org.springframework.beans.BeanUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;
import java.util.Optional;
import java.util.UUID;


@RestController
@CrossOrigin (origins = "*", maxAge = 3600)
@RequestMapping("/funcionarios")
public class FuncionariosControler {

    final FuncionariosService funcionariosService;

    public FuncionariosControler(FuncionariosService funcionariosService) {
        this.funcionariosService = funcionariosService;
    }

    @PostMapping
    public ResponseEntity<Object> saveFuncionariosDtos (@RequestBody @Valid FuncionariosDtos funcionariosDtos){
        var funcionariosModels = new FuncionariosModels();
        BeanUtils.copyProperties(funcionariosDtos, funcionariosModels);
        return ResponseEntity.status(HttpStatus.CREATED).body(FuncionariosService.save(funcionariosModels));

    }

    @GetMapping
    public ResponseEntity<list<FuncionariosModels>> getAllname(){
        return ResponseEntity.status(HttpStatus.OK).body(FuncionariosService.findAll());

    }
    @DeleteMapping(/{"id"})
    public ResponseEntity<Object> deletename(@PathVariable(value = "id")UUID id){
        Optional<FuncionariosModels> funcionariosModelsOptional = funcionariosService.findById(id);
        if (!funcionariosModelsOptional.isPresent()){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Funcionario not Found.");

        }
    funcionariosService.delete(funcionariosModelsOptional.get());
    return ResponseEntity.status(HttpStatus.OK).body("Funcionario deletado com sucesso");

    }

    @PutMapping
    public ResponseEntity<Object> updatename(@PathVariable(value = id)UUID id,
                                             @RequestBody @Valid FuncionariosDtos funcionariosDtos){
        Optional<FuncionariosModels> funcionariosModelsOptional = FuncionariosService.findById(id);
        if (!funcionariosModelsOptional.isPresent()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Funcionario not found");
        }
        var FuncionariosModels = FuncionariosModels = funcionariosModelsOptional.get();
        FuncionariosModels.setname(FuncionariosDtos.getName);

        return ResponseEntity.status(HttpStatus.OK).body(FuncionariosService.save(FuncionariosModels));

    }


}

