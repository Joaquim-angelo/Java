/*Disparando excessões em erros de valores do usuário*/
package com.ex022;
/*importar todas funções java.util*/
import java.util.*;
public class Throws {
    /*trows: deixa explicito o erro que pode ocorrer no código*/
    public static int div(int n1,int n2) throws ArithmeticException{
        return n1/n2;
    }
    public static void main(String[]args){
        Scanner teclado= new Scanner(System.in);
        boolean continuar=true;
        do{
            try{
                System.out.println("Digite o dividendo: ");
                int dividendo=teclado.nextInt();
                System.out.println("Digite o divisor: ");
                int divisor=teclado.nextInt();
                int resultado=div(dividendo, divisor);
                System.out.println("Resultado: "+resultado);
                continuar=false;
            }catch(InputMismatchException erro1){
                System.err.println("Não é permitido inserir letras, informe apenas números inteiros!");
                /*apagar entrada errada do usuário*/
                teclado.nextLine();
            }catch(ArithmeticException erro2){
                System.err.println("O número do divisor deve ser diferente de 0!");
            }finally{
                System.out.println("Execução final");
            }
        }while(continuar);
    }
}
