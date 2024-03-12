package com.ex038;
import java.util.Scanner;
import java.util.Vector;
/*ao invés de extends usaremos implements em interfaces*/
public class Livraria implements Interface {
    /*Veremos mais sobre listas e vetores mais à frente*/
    private Vector<Livros>catalogo=new Vector<Livros>();
    /*deve-se implementar todos os métodos da interface*/
    @Override
    public void adicionar(Livros obj){
        this.catalogo.add(obj);
    }
    @Override
    public void imprimir(){
        System.out.println("catalogo: ");
        for(int i=0;i<this.catalogo.size();i++){
            System.out.println();
            System.out.println("Nome do cliente: "+this.catalogo.get(i).getCliente());
            System.out.println("Preço: "+this.catalogo.get(i).getPreco());
        }
        System.out.println("...........");
        System.out.println();
    }
    public void cadastrar(Livros obj){
        Scanner x=new Scanner(System.in);
        System.out.println("Nome do cliente: ");
        obj.setCliente(x.nextLine());
        System.out.println("valor do livro: ");
        obj.setPreco(x.nextDouble());
    }
}
