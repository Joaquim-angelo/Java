package com.ex017;
import java.util.Scanner;
public class Bidimensional {
    public static void main(String[]args){
        /*podemos fazer com quantas dimensões precisarmos*/
        int n[][]=new int[3][3];
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                Scanner x = new Scanner(System.in);
                System.out.println("Digite o valor da linha " + (i+1)+ " coluna " + (j+1)+": ");
                n[i][j]=x.nextInt();
            }
        }
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.println("linha "+(i+1)+" coluna "+(j+1)+" :  "+n[i][j]);
            }
        }
    }
}
