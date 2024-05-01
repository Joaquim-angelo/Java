/*exemplo de herança usando get e set*/
package com.ex034;
public class Caixa {
    public static void main(String[] args) {
        Fisica p1=new Fisica();
        Fisica p2 = new Fisica("Joaquim");
        System.out.println(p2.getNomePessoa());
       }
}
