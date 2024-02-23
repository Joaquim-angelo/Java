package com.ex024;
import javax.swing.JOptionPane;
public class Option {
    public static void main(String[] args) {
        String[]opcoes={"Frango","Bife","Macarrão"};
        int x=JOptionPane.showOptionDialog(null, "Escolha um: ", "Inicio", 0, 3, null, opcoes, opcoes[0]);
        System.out.println(x);
    }
}
