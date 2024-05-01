/*Fila: onde os primeiros alimentos adicioandos são os primeiros a serem removidos*/
package ex043;
import java.util.*;
import javax.swing.*;
public class Fila {
    String saida="";
    public Fila(){
        Queue<Integer> queue= new LinkedList<Integer>();
        this.adicionarElemento(queue);
        saida+="\n";
        this.removerElemento(queue);

        JTextArea saidaArea= new JTextArea();
        saidaArea.setText(saida);
        JOptionPane.showMessageDialog(null,saidaArea,"Trabalhando com Queues",JOptionPane.INFORMATION_MESSAGE);
    }
    private void adicionarElemento(Queue qe) {
        int elemento=10;
        for(int i=elemento;i>=0;i--){
            saida+="Adicionando elemento : "+i+" na fila\n";
            qe.add(i);
        }
    }
    private void removerElemento(Queue qe) {
        /*Enquanto a fila qe não for vázia*/
        while(!qe.isEmpty()){
            saida+="Removendo o elemento: "+qe.remove()+"da fila\n";
        }
    }
    public static void main(String[]args){
        new Fila();
    }
}
