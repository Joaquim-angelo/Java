package com.ex035;
public class Cachorro extends Animal {
    /*Get e Set no construtor usando Super()*/
    public Cachorro(String n, int id) {
        super.setNome(n);
        super.setIdade(id);   
    }
    @Override
    public void seLocomove(){
       System.out.println("Cachorro: "+super.getNome());
       System.out.println("Idade: "+super.getIdade());
        System.out.println("Cachorro correndo, com suas 4 patas");
    }
    @Override
    public void emiteSom(){
       System.out.println("Au Au !");
    }
}
