package model;

import model.enuns.StatusDeUsuario;

public class Usuario {
    private int idade;
    private String nome;
    private String bio;
    private StatusDeUsuario statusDeUsuario;

    public int getIdade() {return idade;}

    public void setIdade(int idade) {this.idade = idade;}

    public String getNome() {return nome;}

    public void setNome(String nome) {this.nome = nome;}

    public String getBio() {return bio;}

    public void setBio(String bio) {this.bio = bio;}

    public StatusDeUsuario getStatusDeUsuario() {return statusDeUsuario;}

    public void setStatusDeUsuario(StatusDeUsuario statusDeUsuario) {this.statusDeUsuario = statusDeUsuario;}
}
