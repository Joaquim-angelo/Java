package com.ex030;
import java.util.Date;
public class PessoaProfessor extends Pessoa {
    /*Construtor com os atributos herdados da classe Pessoa*/
    public PessoaProfessor(String nome, Date nascimento, String cpf){
        this.nome=nome;
        this.nascimento=nascimento;
        this.cpf=cpf;
    }
    /*atributos próprios para professores*/
    public double Salario;
    public String disciplina;
}
