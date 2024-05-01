package com.ex017;
import java.util.Scanner;
public class Valores {
    public static void main(String[] args){
        int []n=new int[5];
        Scanner teclado= new Scanner(System.in);
        for(int i=0;i<=n.length-1;i++){
            System.out.println("Adicione um valor ao vetor "+i+" : ");
            n[i]=teclado.nextInt();
        }
        for(int i=0;i<=n.length-1;i++){
            System.out.println("Posição "+i+": "+n[i]);
        }
    }
}
