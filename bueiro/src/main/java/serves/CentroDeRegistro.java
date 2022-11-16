package serves;

import model.Tarefa;
import model.dates.ManipulandoDatas;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;

public class CentroDeRegistro {

    private ArrayList<Tarefa> listaDeAfazeres;
    private Scanner leitor = new Scanner(System.in);

    public void registroDeAtividade(String titulo, String data, String descicao) throws ParseException {
        System.out.println("Resistrar Tarefa\n");
        if (listaDeAfazeres==null) listaDeAfazeres = new ArrayList<>();
        if (listaDeAfazeres.isEmpty()) System.out.println("Lista vazia");
        listaDeAfazeres.add(new Tarefa(titulo,ManipulandoDatas.convertendoDeStringParaLocalDateExistente(data),descicao));
        System.out.println("Tarefa registrada");
    }

    public void vizualizacaoDeAtividade(){

        if (listaDeAfazeres==null|| listaDeAfazeres.isEmpty()) {
            System.out.println("Lista vazia");
        } else {
            System.out.println("Visualizar Tarefa");
            int posicao =  Integer.parseInt(selecionarTarefa());
            System.out.println(listaDeAfazeres.get(posicao).getTitulo() + "\n" + listaDeAfazeres.get(posicao).getData() + "\n" + listaDeAfazeres.get(posicao).getDescricao());
        }
    }

    public void alterarAtividade() throws ParseException {
        System.out.println("Alterar Tarefa");
        int posicao = Integer.parseInt(selecionarTarefa());
        System.out.println("O que deseja editar? \n1º Titulo \n2º Data \n3º Descrição \nOpção: ");
        String opcao = leitor.nextLine();

        if (opcao.equals("1")){
            System.out.println("if");
            String titulo = leitor.nextLine();
            listaDeAfazeres.get(posicao).setTitulo(titulo);
        }
        else if (opcao.equals("2")){
            listaDeAfazeres.get(posicao).setData(ManipulandoDatas.convertendoDeStringParaLocalDateInexistente(leitor));
        }
        else {
            listaDeAfazeres.get(posicao).setDescricao(leitor.nextLine());
        }
    }

    public void deletarAtividade(){
        System.out.println("Deletar Tarefa");
        int posicao = Integer.parseInt(selecionarTarefa());
        listaDeAfazeres.remove(posicao);
    }

    private String selecionarTarefa(){
        listaDeAfazeres.forEach(afazer -> System.out.println(listaDeAfazeres.indexOf(afazer) + "º " + afazer.getTitulo()));
        System.out.println("Qual a numeração da tarefa que deseja ? \nOpção: ");
        return leitor.nextLine();
    }
}
