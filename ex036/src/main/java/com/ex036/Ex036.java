/*Sobrecarga: permite criar dois métodos com mesmo nome porém com parâmetros diferentes*/
package com.ex036;
public class Ex036 {
    public void comparar(double n1, double n2) {
        if (n1 == n2) {
            System.out.println("Números iguais");
        } else if (n1 > n2) {
            System.out.println("Maior: " + n1);
        } else if (n2 > n1) {
            System.out.println("Maior: " + n2);
        }
    }
    public void comparar(double n1,double n2,double n3){
        if (n1>n2 && n1>n3) {
            System.out.println("Maior: "+n1);
        }else if(n2>n1 && n2>n3){
            System.out.println("Maior: "+n2);
        }else if(n3>n1 && n3>n2){
            System.out.println("Maior: "+n3);
        }else{
            System.out.println("Números iguais");
        }
    }
}
