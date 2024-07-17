package ex046;
import java.util.*;
public class Validador {
    public static void main(String[] args) {
        Scanner x=new Scanner(System.in);
        System.out.println("Digite um número de telefone (Ex: xxxx-xxxx): ");
        String nome=x.nextLine();
        if(nome.matches("[0-9]{5}[-][0-9]{4}")==true){
            System.out.println("Número valido");
        }else{
            System.out.println("Número inválido");
        }
    }
}
