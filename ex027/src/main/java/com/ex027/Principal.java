package com.ex027;
public class Principal {
    public static void main(String[] args) {
        Carro carro=new Carro("preto", 80000,"ford");
        System.out.println("Temos um carro "+carro.cor+" da marca "+carro.marca+" que custa "+carro.preco+" reais");
    }
}
