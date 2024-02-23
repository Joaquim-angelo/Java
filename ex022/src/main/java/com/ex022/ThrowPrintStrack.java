package com.ex022;
import java.util.InputMismatchException;
import java.util.Scanner;
public class ThrowPrintStrack {
    public static void main(String[] args){
        Scanner teclado= new Scanner(System.in);
        try{
            System.out.println("Digite sua idade");
            int idade= teclado.nextInt();
            System.out.println(idade);
        }catch(InputMismatchException e){
            /*printStrackTrace: escreve na tela a exceção detectada*/
            e.printStackTrace();
        }
    }
}
