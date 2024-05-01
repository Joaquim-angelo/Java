package com.ex010;

import java.util.Scanner;
public class shorthand {
    /*shorthand: abreviação de uma parte do Script*/
    public static void main(String[]args){
        Scanner x= new Scanner(System.in);
        System.out.println("Qual sua idade: ");
        int idade=x.nextInt();
        String resp=(idade>18)?"Maior de idade" : "Menor de idade";
        System.out.println(resp);
    }
}
