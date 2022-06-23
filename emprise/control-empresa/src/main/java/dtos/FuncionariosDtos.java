package dtos;

import javax.validation.constraints.NotBlank;


public class FuncionariosDtos {
    @NotBlank
    private String name;
    @NotBlank
    private String cepNunber;
    @NotBlank
    private String idadeNunber;
    @NotBlank
    private String endereco;

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
