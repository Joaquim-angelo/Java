package com.ex007;
import java.util.Scanner;
public class Operacoes {
    public static void main(String[] args) {
        float n1=0,n2=0,soma,sub,div,resto;
        Scanner x= new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        n1=x.nextInt();
        System.out.println("Digite o segundo número: ");
        n2=x.nextInt();
        soma=n1+n2;
        sub=n1-n2;
        div=n1/n2;
        resto=n1%n2;
        System.out.println(n1+"+"+n2+"="+soma);
        System.out.println(n1+"-"+n2+"="+sub);
        System.out.println(n1+"/"+n2+"="+div);
        System.out.println("Resto da divisão="+resto);
    }
}
