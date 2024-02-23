package com.ex021;
import java.util.Scanner;
public class Finally {
    public static void main(String[]args){
        try{
          int numero;
          Scanner x=new Scanner(System.in);
          System.out.println("Digite um número inteiro");
          numero=x.nextInt();
        }catch(Exception e){
            System.out.println("Número inválido");
        }finally{
            System.out.println("Independente do try essa linha sempre vai ser impressa");
        }
    }
}
