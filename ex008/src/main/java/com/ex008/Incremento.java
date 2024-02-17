package com.ex008;
public class Incremento {
    public static void main(String[] args) {
        /*operadores de incremento(++) e decremento(--)*/
        byte numero=2;
        numero++;
        System.out.println(numero);
        numero--;
        System.out.println(numero);
        /*posições do operador*/
        /*posição 1*/
        int num1=2;
        int valor1= 5 + ++num1;
        System.out.println(valor1);
        /*posição 2*/
        int num2=2;
        int valor2= 5 + num2++;
        System.out.println(valor2);
    }
}
