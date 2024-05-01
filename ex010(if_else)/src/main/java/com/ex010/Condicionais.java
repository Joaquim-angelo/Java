package com.ex010;
import java.util.Scanner;
public class Condicionais {
    public static void main(String[] args) {
        Scanner x= new Scanner(System.in);
        System.out.println("Qual sua nota de 0 a 10: ");
        double nota=x.nextDouble();
        if(nota>=7){
            System.out.println("Aprovado!!");
        }else if(nota<7 && nota>3){
            System.out.println("Prova final");
        }else{
            System.out.println("Reprovado");
    }
  }
}