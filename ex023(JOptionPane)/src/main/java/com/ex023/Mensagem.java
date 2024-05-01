package com.ex023;
import javax.swing.JOptionPane;
public class Mensagem {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null,"Olá mundo");
        /*Mensagem de Erro*/
        JOptionPane.showMessageDialog(null,"Erro!!!","msg",JOptionPane.ERROR_MESSAGE);
        /*Aviso*/
        JOptionPane.showMessageDialog(null,"Aviso","msg",JOptionPane.WARNING_MESSAGE);
        /*Informação*/
        JOptionPane.showMessageDialog(null,"Observação","msg",JOptionPane.INFORMATION_MESSAGE);
    }
}
