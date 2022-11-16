package model;

import model.enuns.StatusDaTarefa;

import java.time.LocalDate;

public class Tarefa {

    private String titulo;
    private LocalDate data;
    private String descricao;
    private StatusDaTarefa statusDaTarefa;

    public Tarefa(String titulo, LocalDate data, String descicao) {
        setTitulo(titulo);
        setData(data);
        setDescricao(descicao);
    }

    public String getTitulo() {return titulo;}

    public void setTitulo(String titulo) {this.titulo = titulo;}

    public LocalDate getData() {return data;}

    public void setData(LocalDate data) {this.data = data;}

    public String getDescricao() {return descricao;}

    public void setDescricao(String descricao) {this.descricao = descricao;}

    public StatusDaTarefa getStatusDaTarefa() {return statusDaTarefa;}

    public void setStatusDaTarefa(StatusDaTarefa statusDaTarefa) {this.statusDaTarefa = statusDaTarefa;}

}
