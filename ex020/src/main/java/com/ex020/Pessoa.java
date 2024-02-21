package com.ex020;
import java.util.Scanner;
/*importando Dados e todos os seus métodos*/
import com.ex020.Dados;
public class Pessoa {
    public static void main(String[]args){
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
        /*invocaremos o método dados*/
        /*clase.Método(variáveis)*/
        Dados.dados(nome,idade,telefone);
    }
}
