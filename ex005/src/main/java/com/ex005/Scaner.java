package com.ex005;
import java.util.Scanner;
public class Scaner {
    public static void main(String[] args) {
        /*comando para escanear*/
        Scanner teclado=new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String nome=teclado.nextLine();
        System.out.println("Digite sua idade: ");
        byte idade=teclado.nextByte();
        System.out.println("Digite seu peso(Apenas numeros): ");
        float peso=teclado.nextFloat();
        System.out.println("Dados do usuário: "+nome+", "+idade+" Anos e pesa "+peso+" kilos");
    }
}
