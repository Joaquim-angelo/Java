package com.ex016;
import java.util.Arrays;
public class VetorUtilidades{
    public static void main(String[]args){
        int n[]={5,8,17,21,3,4};
        /*ordenar vetores*/
        Arrays.sort(n);
        System.out.println("Valores em Ordem: ");
        for(int i=0;i<6;i++){
            System.out.println(n[i]);
        }

        /*Busca Binária*/
        int busca=Arrays.binarySearch(n, 7);
        System.out.println("\nValor encontrado na posição "+busca+" do vetor\n");

        /*Número Padrão*/
        /*Criando vetor com 20 valores em branco*/
        int x[]=new int[20];
        /*Definindo 1 como valor padrão*/
        Arrays.fill(x, 1);
        for(int i=0;i<=20;i++){
            System.out.println(x[i]);
        }
    }
}
