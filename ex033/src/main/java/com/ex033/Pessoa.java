/*toString: serve para escrever todos os dados de um objeto*/
package com.ex033;
public class Pessoa {
    int id;
    String nome;
    @Override
    public String toString(){
        return "Codigo: "+id+"\nNome: "+nome;
    }
}
