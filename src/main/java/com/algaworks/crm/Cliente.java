package com.algaworks.crm;

public class Cliente {
    private String nome;
    private int idade;

    public Cliente(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Cliente{");
        sb.append("nome='").append(this.nome).append('\'');
        sb.append(", idade=").append(this.idade);
        sb.append('}');
        return sb.toString();
    }
}