package com.api.controlempresa.models;

import javax.persistence.*;
import java.io.Serializable;
import java.util.UUID;

@Entity
@Table (name= "ControlFuncionarios")


public class FuncionariosModels implements Serializable {
    private static final long serialVersionUID = 1L;
@Id
@GeneratedValue (strategy = GenerationType.AUTO)
    private UUID id;
@Column (nullable = false, length = 80)
    private String name;
@Column (nullable = false, length = 15)
    private String cepNunber;
@Column (nullable = false, length = 4)
    private String idadeNunber;
@Column (nullable = false, length = 80)
    private String endereco;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCepNunber() {
        return cepNunber;
    }

    public void setCepNunber(String cepNunber) {
        this.cepNunber = cepNunber;
    }

    public String getIdadeNunber() {
        return idadeNunber;
    }

    public void setIdadeNunber(String idadeNunber) {
        this.idadeNunber = idadeNunber;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}
