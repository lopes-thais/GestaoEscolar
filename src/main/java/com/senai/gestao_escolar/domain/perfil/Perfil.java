package com.senai.gestao_escolar.domain.perfil;

public class Perfil {
    private int id;
    private String nomePerfil;

    public Perfil(int id, String nomePerfil) {
        this.id = id;
        this.nomePerfil = nomePerfil;
    }

    public String getNomePerfil() {
        return nomePerfil;
    }

    public void setNomePerfil(String nomePerfil) {
        this.nomePerfil = nomePerfil;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
