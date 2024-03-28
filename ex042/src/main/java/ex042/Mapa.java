package ex042;
import java.util.*;
public class Mapa {
    public Mapa(){
        /*Criando o map e adicionado valores neles*/
        HashMap map=new HashMap ();
        map.put(1, "Angelo");
        map.put(2,"Maria");
        map.put(3, "Bia");
        System.out.println(map);
    }
    public static void main(String[] args) {
        new Mapa();
    }
}
