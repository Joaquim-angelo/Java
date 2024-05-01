/*Construtor com Sobrecarga*/
package com.ex037;
public class Pessoa {
    int codigo;
    String nome;
    String cpf;
    String endereco;
    public Pessoa(){
    }
    public Pessoa(int codigo,String nome,String cpf,String endereco){
        this.codigo=codigo;
        this.nome=nome;
        this.cpf=cpf;
        this.endereco=endereco;
    }
    public void exibir(){
        System.out.println("\nDados: "+"id: "+this.codigo+"\nnome: "+this.nome+
                "\nCPF: "+this.cpf+"\nendereco: "+this.endereco);
    }
}
