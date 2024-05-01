package com.ex024;
import javax.swing.JOptionPane;
public class Escolha {
    public static void main(String[] args) {
        int resp=JOptionPane.showConfirmDialog(null, "Deseja continuar");
        if(resp==0) {
            JOptionPane.showMessageDialog(null,"Sua resposta foi Sim");
        }else if (resp==1) {
            JOptionPane.showMessageDialog(null,"Sua respota foi Não");
        }else{
            JOptionPane.showMessageDialog(null,"Resposta cancelada");
        }
    }
}
