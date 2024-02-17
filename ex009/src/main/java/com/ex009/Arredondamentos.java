package com.ex009;
public class Arredondamentos {
    public static void main(String[]args){
        /*modulo de um número inteiro*/
        int num=-5;
        System.out.println("O valor absoluto de -5 é: "+(Math.abs(num)));
        /*Arredondamentos*/
        double numero=3.6;
        System.out.println("Arredondar para baixo: "+Math.floor(numero));
        System.out.println("Arredondar para cima: "+Math.ceil(numero));
        /*máximo e mínimo*/
        int maximo=Math.max(5,23);
        int minimo=Math.min(5,23);
        System.out.println("Maior valor: "+maximo+"\nMenor valor: "+minimo);
    }
}
