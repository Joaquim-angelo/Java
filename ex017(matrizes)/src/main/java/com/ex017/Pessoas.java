package com.ex017;
import java.util.Scanner;
public class Pessoas {
    public static void main(String[]args){
        String nome[]=new String[3];
        int idade[]=new int[3];
        System.out.println("Registraremos o nome e a idade de 3 pessoas");
        for(int i=0;i<3;i++){
            Scanner x=new Scanner(System.in);
            System.out.println("Nome da "+(i+1)+"° pessoa: ");
            nome[i]=x.nextLine();
            Scanner y=new Scanner(System.in);
            System.out.println("Sua idade: ");
            idade[i]=y.nextInt();
        }
        for(int i=0;i<3;i++){
            System.out.println((i+1)+"° Pessoa: "+nome[i]+", "+idade[i]);
        }
    }
}
