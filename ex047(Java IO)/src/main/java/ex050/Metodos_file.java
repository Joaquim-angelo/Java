package ex050;
import java.io.*;
import java.util.Scanner;
public class Metodos_file {
    public static void main(String[] args) {
        File file=new File("c:\\Users\\Oem\\OneDrive\\Documentos\\BackEnd\\Java\\ex047(Java IO)\\arquivo.txt");
        Scanner x= new Scanner(System.in);
        System.out.println("O que você deseja: ");
        int esc=100;
        while(esc!=0){
            System.out.println("1-Criar arquivo \n2-Deletar arquivo\n3-Endereço\n0-Sair");
            esc= x.nextInt();
            switch (esc) {
                case 1:
                    try {
                        file.createNewFile();
                        System.out.println("Arquivo criado ou já existente\n");
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                break;
                case 2:
                    try {
                        file.delete();
                        System.out.println("Arquivo deletado\n");
                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }
                break;
                case 3:
                    try {
                        System.out.println(file.getAbsolutePath()+"\n");
                    } catch (Exception ex) {
                       ex.printStackTrace();
                    }
                break;
                case 0:
                   System.out.println("Saindo...");
                break;
                default:
                System.out.println("Opção inválida");
                break;
            }
        }
    }
}
