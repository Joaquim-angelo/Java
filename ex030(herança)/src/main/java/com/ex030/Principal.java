package com.ex030;
import java.util.Date;
public class Principal {
    public static void main(String[] args) {
        /*Registrando aluno*/ /*new date(): data atual*/
        PessoaAluno i=new PessoaAluno("João Gabriel", new Date(), "097.425.381-15");
        i.matricula="443-227";
        System.out.println("Vejam como os dados do aluno foram preenchidos");
        System.out.println("Nome: "+i.nome+"\nCPF: "+i.cpf);
        System.out.println("Data de nascimento: "+i.nascimento.toString());
        System.out.println("N° da matrícula: "+i.matricula);

        /*Registrando professor*/
        PessoaProfessor j=new PessoaProfessor("Luan Silva", new Date(), "174.338.014-21");
        j.Salario=4200;
        j.disciplina="matemática";
        System.out.println("\nVejam como os dados do professor foram preenchidos");
        System.out.println("Nome: "+j.nome+"\nCPF: "+j.cpf);
        System.out.println("Data de nascimento: "+j.nascimento.toString());
        System.out.println("Salário: "+j.Salario);
        System.out.println("Disciplina: "+j.disciplina);
    }
}
