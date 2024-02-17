package com.ex012;
public class For {
    public static void main(String[] args){
        /*Adicionando valores*/
        int i=0;
        for(i=0;i<=10;i++){
            System.out.println(i);
        }
        /*Removendo valores*/
        int x=10;
        System.out.println("Contando dias");
        for(x=10;x>0;x--){
            System.out.println("Faltam "+x+" dias");
        }
        System.out.println("É hoje");
    }
}
