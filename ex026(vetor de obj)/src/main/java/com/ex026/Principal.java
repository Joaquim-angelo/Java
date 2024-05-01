package com.ex026;
import java.util.Scanner;
public class Principal {
    public static void main(String[] args) {
        Pessoa []p=new Pessoa[4];
        for(int i=0;i<4;i++){
            //criaremos um objeto em cada instância do for
            p[i]=new Pessoa();
            Scanner x=new Scanner(System.in);
            System.out.println("Nome da "+(i+1)+"° Pessoa: ");
            p[i].nome=x.nextLine();
            System.out.println("idade: ");
            p[i].idade=x.nextInt();
            System.out.println();
        }
        for(int i=0;i<4;i++){
            System.out.println("Nome da "+(i+1)+"° Pessoa: "+p[i].nome);
            System.out.println("idade: "+p[i].idade);
            System.out.println();
        }
    }
}
