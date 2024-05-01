package com.ex018;
import java.util.Scanner;
public class Metodos {
    /*Criando o método dados*/
    public static void dados(String nome, int idade, String telefone){
        System.out.println(nome+" tem "+idade+" anos");
        System.out.println("Telefone para contato: "+telefone);
    }
    public static void main(String[] args) {
        Scanner x1=new Scanner(System.in);
        System.out.println("Nome: ");
        String nome=x1.nextLine();
        Scanner x2=new Scanner(System.in);
        System.out.println("Idade: ");
        int idade=x2.nextInt();
        Scanner x3=new Scanner(System.in);
        System.out.println("Telefone: ");
        String telefone=x3.nextLine();
        System.out.println("\n");
        /*Retonar os dados da pessoa*/
        dados(nome,idade,telefone);
    }
}
