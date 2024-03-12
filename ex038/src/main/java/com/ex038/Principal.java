package com.ex038;
import java.util.Scanner;
public class Principal {
    public static void main(String[] args) {
        Livraria objLivro=new Livraria();
        Livros objItem;
        while(true){
            objItem=new Livros();
            System.out.println("1-Cadastrar");
            System.out.println("2-Imprimir Lista");
            System.out.println("3-Cadastrar com desconto");
            System.out.println("4-Sair");
            Scanner x=new Scanner(System.in);
            int opc=x.nextInt();
            if(opc==4){
                break;
            }
            switch(opc){
                case 1:
                    objLivro.cadastrar(objItem);
                    objLivro.adicionar(objItem);
                break;
                case 2:
                    objLivro.imprimir();
                break;
                case 3:
                    objLivro.cadastrar(objItem);
                    System.out.println("Valor do livro com promoção de: "+Interface.promocao);
                    double desconto=objItem.getPreco()-(objItem.getPreco()*Interface.promocao)/100;
                    objItem.setPreco(desconto);
                    objLivro.adicionar(objItem);
                    System.out.println();
                break;
                default:
                    System.out.println("Opção inválida");
                break;
            }
        }   
    }
}
