/*Programação orientada a objetos*/
package com.ex025;
public class Computador {
    /*criando o objeto computador*/
        /*atributos*/
        String marca;
        String cor;
        int preco;
        boolean ligado;
        /*funções*/
        void ligar(){
            ligado=true;
            System.out.println("Pc ligado");
        }
        void desligar(){
            ligado=false;
            System.out.println("Pc desligado");
        }
        void status(){
            System.out.println("Pc "+marca+" "+cor+" que custou "+preco+" reais");
        }
}