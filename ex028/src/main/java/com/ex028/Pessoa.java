/*Get e set*/
package com.ex028;
public class Pessoa {
    /*set: adiciona valor*/
    /*get: retorna valor*/
    /*por isso as variáveis serão privadas*/
    private String nome;
    private int idade;
    /*definiremos o método get e set de cada variável*/
    /*A primeira letra da variável deverá ser maiúscula mesmo*/
    public String getNome(){
        return this.nome;
    }
    public void setNome(String n){
        this.nome=n;
    }
    public int getIdade(){
        return this.idade;
    }
    public void setIdade(int i){
        this.idade=i;
    }
    public void status(){
        System.out.println(nome+" tem "+idade+" anos de idade");
    }
}
