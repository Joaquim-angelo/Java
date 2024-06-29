package ex044;
import java.util.*;
public class Lambda_02 {
    public static void main(String[] args){
        ArrayList<Integer>valores=new ArrayList<Integer>();
        ArrayList<Integer>dobro=new ArrayList<Integer>();
        ArrayList<Integer>impar=new ArrayList<Integer>();
        ArrayList<Integer>par=new ArrayList<Integer>();
        
        valores.add(1);
        valores.add(2);
        valores.add(3);
        valores.add(4);

        //Function Lamba é uma função normal
        valores.forEach((v)->{dobro.add(v*2);
            if(v%2==0){
                par.add(v);
            }else{
                impar.add(v);
            }
        });

        System.out.println(dobro);
        System.out.println(impar);
        System.out.println(par);
    }
}
