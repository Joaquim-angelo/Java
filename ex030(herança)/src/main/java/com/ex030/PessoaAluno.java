package com.ex030;
import java.util.Date;
/*extends Pessoa: será herdado atributos da classe pessoa*/
public class PessoaAluno extends Pessoa {
    /*Construtor com os atributos herdados da classe Pessoa*/
    public PessoaAluno(String nome, Date nascimento, String cpf){
        this.nome=nome;
        this.nascimento=nascimento;
        this.cpf=cpf;
    }
    /*atributos próprios para os alunos*/
    public String matricula;
}
