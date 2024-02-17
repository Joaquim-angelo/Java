package com.ex012;
import java.util.Scanner;
public class Looping {
    public static void main(String[]args){
        Scanner n1=new Scanner(System.in);
        System.out.println("inicio: ");
        int inicio=n1.nextInt();
        Scanner n2=new Scanner(System.in);
        System.out.println("fim: ");
        int fim=n2.nextInt();
        Scanner n3=new Scanner(System.in);
        System.out.println("passar quantos por vez: ");
        int passo=n3.nextInt();
        for (int i=inicio; i <= fim;i+=passo) {
            System.out.println(i);
    }
  }
}
