package ex050;
import java.io.File;
import java.io.IOException;
public class Arquivos {
    public static void main(String[] args) {
        File file= new File("c:\\Users\\Oem\\OneDrive\\Documentos\\BackEnd\\Java\\ex047(Java IO)\\file.txt");
        try {
            file.createNewFile();
            System.out.println("Documento Criado");
        } catch (IOException exception) {
            exception.printStackTrace();
            System.out.println("Erro na criação");
        }
    }
}
