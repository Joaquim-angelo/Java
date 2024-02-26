package com.ex025;
import java.util.*;
import javax.swing.*;
public class ListaOrdenada {
    public static void main(String[]args){
        List<String>nomes=new ArrayList<String>();
        nomes.add("Joaquim");
        nomes.add("Marcia");
        nomes.add("Gabrielly");
        nomes.add("Antônio");
        String saida="";
        saida+="Lista desordenada: "+nomes;
        //Organizar lista
        Collections.sort(nomes);
        saida+="\nLista ordenada: "+nomes;
        JTextArea texto=new JTextArea();
        texto.setText(saida);
        JOptionPane.showMessageDialog(null,texto,"Arraylist",JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
}
