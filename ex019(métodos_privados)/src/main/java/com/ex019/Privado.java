package com.ex019;
import java.util.Scanner;
public class Privado {
    /*desejo retornar um valor lógico*/
    /*private: metodo executável apenas na classe de origem*/
    /*no caso na classe Privado*/
    private static boolean idade(int idade){
        if(idade>18){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        int idade=teclado.nextInt();
        /*o método apenas retorna o valor, não escreve eles na tela*/
        idade(idade);
    }
}
