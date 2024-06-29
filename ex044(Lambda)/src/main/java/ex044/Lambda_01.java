package ex044;
import java.util.ArrayList;
import java.util.function.Consumer;
public class Lambda_01 {
    public static void main(String[] args) {
        ArrayList<Integer>valores= new ArrayList<Integer>();
        ArrayList<Integer>dobro= new ArrayList<Integer>();
        ArrayList<Integer>triplo= new ArrayList<Integer>();
        
        valores.add(1);
        valores.add(2);
        valores.add(3);
        valores.add(4);

        //Variável Lambda
        valores.forEach((v)->{dobro.add(v*2);});

        //Criar função do  tipo lambda
        Consumer<Integer> triplicar= (v)->{triplo.add(v*3);}; 
        //chamar função lamba
        valores.forEach(triplicar);
        
        System.out.println(valores);
        System.out.println(dobro);
        System.out.println(triplo);
    }
}
