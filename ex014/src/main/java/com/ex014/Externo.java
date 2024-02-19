package com.ex014;
import java.util.Scanner;
public class Externo {
    public static void main(String[] args) {
        int x=0;
        externo:
        for(int i=0;i<15;i++){
            /*loop externo*/
            while(x<100){
                x++;
                System.out.println("Dentro do loop pela "+x+" vez");
                Scanner teclado= new Scanner(System.in);
                System.out.println("Digite 1 para sair do loop");
                System.out.println("Para continuar aperte outro número\n");
                int y=teclado.nextInt();
                if(y==1){
                    break externo;
                }else{
                    continue externo;
                }
            }
            System.out.println("Fora do loop");
        }
        System.out.println("Fora do programa");
    }
}
