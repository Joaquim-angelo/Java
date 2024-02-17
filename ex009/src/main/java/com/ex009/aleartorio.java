package com.ex009;
public class aleartorio {
    public static void main(String[]args){
        /*no java o random gera apenas números 0 entre 1*/
        double aleartorio=Math.random();
        System.out.println(aleartorio);

        /*escolhendo intervalo de números aleartórios*/
        /*(x-y) intervalo entre x e y*/
        /*somar 1 com o número do intervalo no caso 1+Math.random*/
        int positivo=(int)(1+Math.random()*25-1);
        int negativo=(int)(1+Math.random()*(1-25));
        System.out.println(positivo+"\n"+negativo);
    }
}
