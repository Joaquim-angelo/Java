package com.ex021;
public class Exceção {
    public static void main(String[] args) {
        try{
         int vetor[]=new int[4];
         vetor[4]=1;
         System.out.println(vetor[4]);
        }catch(ArrayIndexOutOfBoundsException exception){
            System.out.println("Excessão encontrada, indice do vetor não existe");
        }
    }
}
