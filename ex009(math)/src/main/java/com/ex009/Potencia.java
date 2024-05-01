package com.ex009;
import java.util.Scanner;
public class Potencia{
    public static void main(String[]args){
        Scanner x=new Scanner(System.in);
        System.out.println("Digite o valor da base: ");
        int base=x.nextInt();
        System.out.println("Digite o valor do expoente: ");
        int exp=x.nextInt();
        /*precisa ser um valor double*/
        double potencia=Math.pow(base,exp);
        System.out.println("Resulado da potenciação é de: "+potencia);
    }
}