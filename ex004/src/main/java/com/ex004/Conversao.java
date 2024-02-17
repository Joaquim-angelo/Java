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
    }
}
