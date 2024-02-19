package com.ex015;

import java.util.Scanner;

public class Equals {
    public static void main(String[]args){
        int n,total=0;
        String resp;
        Scanner teclado=new Scanner(System.in);
        do{
            System.out.println("Digite um número: ");
            n=teclado.nextInt();
            /*total+=n é o mesmo que: total=n+total*/
            total+=n;
            System.out.println("Deseja continuar?[s/n] ");
            resp=teclado.next();
            /*para ler (S) maiusculo e (s) Minusculo*/
            resp.toLowerCase();
        }while(resp.equals("s"));
        System.out.println("soma dos números adicionados: "+total);
    }
}
