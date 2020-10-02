package Model;

import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Paulo Marne
 */
public class Pessoa{

    private int id;
    private String nome;
    private String nascimento;
    private String rg;
    private String cpf;
    
    ArrayList<Pessoa> listaAmigos;

    public Pessoa() {
        listaAmigos = new ArrayList();
	
    }

    public Pessoa (int id, String Nome, int Nascimento) {
	this.id = id;
	this.nome = Nome;
	listaAmigos = new ArrayList();
    }

    public Pessoa(int id_, String nome, String nasc, String rg, String cpf) {
        this.id = id_;
        this.nome = nome;
        this.nascimento = nasc;
        this.rg = rg;
        this.cpf = cpf;
    }

   
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNascimento() {
        return nascimento;
    }

    public void setNascimento(String nascimento) {
        this.nascimento = nascimento;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public ArrayList<Pessoa> getListaAmigos() {
        return listaAmigos;
    }

    public void setListaAmigos(ArrayList<Pessoa> listaAmigos) {
        this.listaAmigos = listaAmigos;
    }

    
}

