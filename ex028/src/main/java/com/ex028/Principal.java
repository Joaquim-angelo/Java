package com.ex028;
import java.util.Scanner;
public class Principal {
    public static void main(String[] args) {
        Pessoa p=new Pessoa();
        Scanner x=new Scanner(System.in);
        System.out.println("Digite o nome: ");
        String nome=x.nextLine();
        System.out.println("Digite a idade: ");
        int idade=x.nextInt();
        p.setNome(nome);
        p.setIdade(idade);
        p.status();
    }
}
