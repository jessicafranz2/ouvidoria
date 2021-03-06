package com.betha.ouvidoria.ouvidoria.model;

import com.betha.ouvidoria.ouvidoria.enterprise.AbstractEntity;

import javax.persistence.Entity;

@Entity
public class Usuario extends AbstractEntity {
    //private Integer id;
    private String nome;
    private String CPF;
    private String RG;
    private String Telefone;
    private String login;
    private String senha;

    public Usuario(String nome, String CPF, String RG, String telefone, String login, String senha) {
        this.nome = nome;
        this.CPF = CPF;
        this.RG = RG;
        Telefone = telefone;
        this.login = login;
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getRG() {
        return RG;
    }

    public void setRG(String RG) {
        this.RG = RG;
    }

    public String getTelefone() {
        return Telefone;
    }

    public void setTelefone(String telefone) {
        Telefone = telefone;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
