package com.ex002;
public class Numeros {
    public static void main(String[] args){
        /*numeros inteiros*/
        byte idade=20;
        short minutos=1440;
        long segundos=86400;
        System.out.println("Minha idade é: "+idade+" Anos");
        System.out.println("Um mês tem: "+minutos+" minutos");
        System.out.println("Um mês tem: "+segundos+" segundos");
        /*numeros reais*/
        float nota=8.5f;
        float altura=1.82f;
        double numero=1.5435252923726535;
        System.out.println("Sua nota é: "+nota);
        System.out.println("Sua altura é: "+altura);
        /*depois do nome colocamos a quantidade de casas decimais*/
        System.out.printf("Sua altura é: %.1f",altura);
        System.out.println("\nnumero double: "+numero);
        /*Números Booleanos*/
        boolean java=true;
        System.out.println("Estou programando em Java? "+java);
    }
}
