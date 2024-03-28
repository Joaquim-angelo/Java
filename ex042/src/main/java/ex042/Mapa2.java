package ex042;
import java.util.*;
public class Mapa2 {
    private static String[]nomes={"Ana","Maria","Angelo","José"};
    public Mapa2(){
        /*Adicionado valores de uma lista em um map*/
        HashMap map= new HashMap();
        for(int i=0;i<nomes.length;i++){
            map.put(i+1,nomes[i]);
        }
        System.out.println(map);
    }
    public static void main(String[] args) {
        new Mapa2();
    }
}
