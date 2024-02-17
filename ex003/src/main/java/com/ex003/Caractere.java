package com.ex003;
public class Caractere {
    public static void main(String[] args) {
        String nome="Joaquim Angelo";
        System.out.println(nome);
        /*método length: comprimento da palavra*/
        String txt="Boa noite";
        System.out.println("A palavra "+txt+" tem: "+txt.length()+" letras");
        /*tudo maiusculo ou minuculo*/
        System.out.println(txt.toUpperCase());
        System.out.println(txt.toLowerCase()); 
        /*concatenação*/
        String Sobrenome="Oliveira";
        System.out.println(nome+Sobrenome);
        System.out.println(nome.concat(Sobrenome));
        /*Caracteres especiais*/
        System.out.println("Aspas: \"Aspas\", Barras: \\Uma Barra");
    }
}
