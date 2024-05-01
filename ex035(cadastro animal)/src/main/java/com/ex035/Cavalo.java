package com.ex035;
public class Cavalo  extends Animal {
    public Cavalo(String n, int id) {
      super.setNome(n);
      super.setIdade(id);
  }
    @Override
    public void seLocomove(){
      System.out.println("Cavalo: "+super.getNome());
      System.out.println("Idade: "+super.getIdade());
      System.out.println("Cavalga, Marcha, Trota");
    }
     
    @Override
    public void emiteSom(){
      System.out.println("Nhiiiiiiiiii ri ri rin !");
    }
}
