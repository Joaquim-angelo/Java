package com.ex009;
import java.util.Scanner;
/*a classe math não será declarada aqui*/
public class Raizes {
    public static void main(String[] args) {
        Scanner x=new Scanner(System.in);
        System.out.println("Digite um número");
        /*lendo raiz quadrada de um número: */
        double numero=x.nextDouble();
        double raizquadrada=Math.sqrt(numero);
        System.out.println("A raiz quadrado de "+numero+" é: "+raizquadrada);
        /*raiz cúbica*/
        double raizcubica=Math.cbrt(numero);
        System.out.println("A raiz cúbica de "+numero+" é: "+raizcubica);
    }
}
