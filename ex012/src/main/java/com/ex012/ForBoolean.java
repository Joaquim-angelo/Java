package com.ex012;

public class ForBoolean{
    public static void main(String[]args){
        int i=0;
        boolean achou=false;
        System.out.println("Em busca do número 7");
        /*(!achou)=enquanto achou for falso*/
        for (i=0;(!achou);i++) {
            System.out.println(i);
            if(i==7) {
                achou=true;
                System.out.println("valor encontrado");
            }
      }
    }
}
