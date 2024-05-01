package com.ex035;
import java.util.Scanner;
public class Principal {
    Animal vetAni[] = new Animal[30];
    static int tam=0;
    public static void main(String[] args){
        int opcao=0;
        Scanner scan = new Scanner(System.in);
        Principal ap = new Principal();
        while(opcao!=3){
        System.out.println("Digite a opcao desejada:");
        System.out.println("1 - Cadastrar");
        System.out.println("2 - Listar");
        System.out.println("3 - Sair");
        opcao = scan.nextInt();
        scan.nextLine();

        switch(opcao){
        case 1:
           ap.cadastraAnimal(); 
        break;
        case 2:
           ap.imprimeAnimais();
        break;
        case 3:
           System.out.println("Saindo.");
        break;
        default:
           System.out.println("Opção inválida");
        break;
        }
    }
    }

    public void cadastraAnimal(){
            Scanner scan = new Scanner(System.in);
            System.out.println("Digite o tipo de animal:");
            System.out.println("1 - Cachorro");
            System.out.println("2 - Cavalo");
            System.out.println("3 - Preguica");
            int i = scan.nextInt();
            scan.nextLine();
            if (i==1 || i==3 || i==2){
              System.out.println("Digite o nome do animal");
              String n = scan.nextLine();
              System.out.println("Digite a idade do animal");
              int id = scan.nextInt();
              scan.nextLine();
              if (i==1)
                vetAni[tam]= new Cachorro(n,id);
              else if(i==2)
                 vetAni[tam]= new Cavalo(n,id);
              else if(i==3)
                  vetAni[tam]= new Preguica(n,id);
            tam++;
        }
    }
    public void imprimeAnimais(){
            Scanner scan = new Scanner(System.in);
            for (int i=0;i<tam;i++){
            System.out.println("Codigo do Animal: "+i);
            vetAni[i].seLocomove();
            }
            System.out.println("Digite o código do animal que deseja ver");
            int cod = scan.nextInt();
            scan.nextLine();
            vetAni[cod].seLocomove();
            vetAni[cod].emiteSom();
    }
}
