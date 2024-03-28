/*HashSet: coleção que não permite elementos duplicados*/
package ex041;
import java.util.*;
public class hashSet {
    String saida;
    private String frutas[]={"Uva","Maça","Banana","Banana","kiwi","Uva"};
    public static void main(String[] args) {
        new hashSet();
    }
    
    /*Criando um Arraylist*/
    public hashSet(){
        /*Adicionando todos os elementos no Arraylist*/
        List lista;
        lista=new ArrayList<>(Arrays.asList(frutas));
        System.out.println("Lista com elementos repetidos: \n"+lista);
        this.Collection_set(lista);
        System.out.println("Lista sem elementos repetidos: \n"+saida);
    }

    /*Criando um HashSet*/
    public void Collection_set(Collection collection){
        Set set= new HashSet (collection);
        /*Iterator: serve para acessarmos qualquer elemento do HashSet*/
        Iterator iterator= set.iterator();
        while (iterator.hasNext()){
            saida+=iterator.next()+" ";
        }
    }
}
