package com.ex025;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Computador comp=new Computador(); 
        comp.marca="Samsung";
        comp.cor="Preto";
        comp.preco=3000;
        comp.status();
        byte esc=10;
        while (esc != 2) {
            Scanner teclado = new Scanner(System.in);
            System.out.println("Digite:\n0-Desligar\n1-Ligar\n2-fechar programa");
            esc = teclado.nextByte();
            switch (esc) {
                case 0:
                    comp.desligar();
                    break;
                case 1:
                    comp.ligar();
                    break;
                case 2:
                    System.out.println("Tchau");
        }
    }
  }
}
