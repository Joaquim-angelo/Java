/*TreeSet: sem elementos repetidos e de forma mais organizada que o HashSet*/
package ex041;
import java.util.*;
import javax.swing.JOptionPane;
public class treeSet {
    static String saida="";
    private String cores[]={"verde","verde","roxo","azul"};

    public treeSet(){
        TreeSet set=new TreeSet(Arrays.asList(cores));
        saida+="Elementos não duplicados e ordenados: \n";
        this.mostrar(set);
        saida+="\nPrimeiro elmento do treeSet: "+set.first();
        saida+="\nÚltimo elmento do treeSet: "+set.last();
        saida+="\nElementos após o  \"roxo\": ";
        this.mostrar(set.headSet("roxo"));
        saida+="Elementos antes o  \"roxo\": ";
        this.mostrar(set.tailSet("roxo"));
    }

    public void mostrar(SortedSet set){
        Iterator iterator=set.iterator();
        while (iterator.hasNext()){
            saida+=iterator.next()+"\n";
        }
    }

    public static void main(String[] args) {
        new treeSet();
        JOptionPane.showMessageDialog(null, saida);
    }
}
