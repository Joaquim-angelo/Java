/*criando construtor em outra classe com o método Super*/
package com.ex031;
import java.util.Scanner;
public class Cadastrar{
        public void cadastrar(){
        Scanner x=new Scanner(System.in);
        System.out.println("Nome: ");
        String nome=x.nextLine();
        System.out.println("Telefone: ");
        String tel=x.nextLine();
    }
}
