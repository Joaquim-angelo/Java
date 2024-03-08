package com.ex031;
import java.util.Scanner;
/*Cadastrar pessoa física*/
public class Fisica extends Cadastrar{
    private String CPF;
    /*para chamar o construtor de cadastrar preciso colocar o método Super()*/
    public void cadastrar(){
        super.cadastrar();
        Scanner x=new Scanner(System.in);
        System.out.println("CPF: ");
        CPF=x.nextLine();
    }
}
