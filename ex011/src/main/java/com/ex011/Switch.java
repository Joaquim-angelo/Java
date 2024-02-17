package com.ex011;
import java.util.Scanner;
public class Switch {
    public static void main(String[] args) {
        System.out.println("Digite o número da sua resposta!");
        System.out.println("Quem nasce em Goiás é: ");
        System.out.println("1-Goianiense\n2-Goiano\n3-Goianense");
        Scanner teclado=new Scanner(System.in);
        int resposta=teclado.nextInt();
        switch(resposta){
            case 1:
                System.out.println("Resposta Errada");
                break;
            case 2:
                System.out.println("Resposta Certa");
                break;
            case 3:
                System.out.println("Resposta Errada");
                break;
            /*caso não seja escolhido nenhum das opções*/
            default:
                System.out.println("Deveria escolher uma das opções acima!!");
                break;
        }
    }
}
