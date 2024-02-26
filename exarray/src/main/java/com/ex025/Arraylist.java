/*Trabalharamos com Framework Collection*/
package com.ex025;
import java.util.*;
import javax.swing.*;
public class Arraylist {
    public static void main(String[] args) {
        /*Criando uma lista do tipo String*/
        List<String>carros=new ArrayList<String>();
        String x="Siena";
        /*adicionando carro na lista com variável*/
        carros.add(x);
        /*adicionando carro na lista sem variável*/
        carros.add("Gol");
        carros.add("Audi A6");
        /*saida que será exibida na tela*/
        String saida="";
        saida+="Lista de carros"+carros.toString();
        saida+="\nTotal de carros"+carros.size();
        saida+="\nA listra possui corsa? "+carros.contains("Corsa");
        System.out.println("Hello World!");
        /*Remover elemento da lista*/
        carros.remove("Gol");
        saida+="\nTotal de carros após remover o Gol: "+carros.size();
        saida+="\nPosição do Audi A6 na lista"+carros.indexOf("Audi A6");
        /*Exibindo frases acima*/
        JTextArea texto=new JTextArea();
        texto.setText(saida);
        JOptionPane.showMessageDialog(null,texto,"Trabalhando com Arraylist",JOptionPane.INFORMATION_MESSAGE);
    }
}
