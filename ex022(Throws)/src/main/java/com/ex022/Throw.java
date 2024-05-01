/*Invocando excessões caso necessário*/
package com.ex022;
public class Throw {
    public static void saque(int valor){
        if(valor>500){
            /*invocando exceção*/
            IllegalArgumentException erro= new IllegalArgumentException();
            /*Throw: cria um novo objeto da exceção que é lançada*/
            throw erro;
        }else{
            System.out.println("valor retirado da conta: R$"+valor);
        }
    }
    public static void main(String[]args){
        int valor1=300;
        int valor2=600;
        saque(valor1);
        saque(valor2);
    }
}
