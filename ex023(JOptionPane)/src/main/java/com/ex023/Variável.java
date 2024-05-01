package com.ex023;
import javax.swing.JOptionPane;
public class Variável {
    public static void main(String[]args){
        String nome=JOptionPane.showInputDialog("Nome");
        JOptionPane.showMessageDialog(null, "Olá "+nome+" Seja bem vindo");
    }
}
