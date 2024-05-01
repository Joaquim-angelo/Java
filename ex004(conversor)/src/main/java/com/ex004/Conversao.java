package com.ex004;
public class Conversao {
    public static void main(String[] args) {
        /*converter int para string*/
        int num=25;
        String textnum=Integer.toString(num);
        System.out.println(textnum);
        /*converter string para int*/
        String texto="50";
        int intext=Integer.parseInt(texto);
        System.out.println(intext);

        /*convertendo double em int*/
        int inteiro=9;
        double real= inteiro;
        System.out.println(real);
        /*Convertendo int em double*/
        double real2=9.78d;
        int inteiro2=(int)real2;
        System.out.println(inteiro2);
    }
}
