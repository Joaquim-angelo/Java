package com.ex035;
public class Preguica extends Animal{
    public Preguica(String n, int id) {
        super.setNome(n);
        super.setIdade(id); 
    }
    @Override
     public void seLocomove(){
        System.out.println("Bicho Preguiça: "+super.getNome());
        System.out.println("Idade: "+super.getIdade());
        System.out.println("Subindo na Árvore");
    }
        @Override
        public void emiteSom(){
        System.out.println("GRRRRRRRrrrrrr");
    }
}
