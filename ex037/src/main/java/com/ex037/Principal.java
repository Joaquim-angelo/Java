package com.ex037;
public class Principal {
    public static void main(String[]args) {
        int codigo=01;
        String nome="Matias Freitas da Silva";
        String cpf="000.124.791-33";
        String endereco="Teresina";
        Pessoa p1=new Pessoa();
        p1.codigo=codigo;
        p1.nome=nome;
        p1.cpf=cpf;
        p1.endereco=endereco;
        p1.exibir();
        Pessoa p2=new Pessoa(codigo,nome,cpf,endereco);
        p2.exibir();
    }
}
