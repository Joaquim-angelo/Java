package ex048;
import java.io.*;
public class Ler {
    public static void main(String[] args) {
        File file= new File("c:\\Users\\Oem\\OneDrive\\Documentos\\BackEnd\\Java\\ex048\\arquivo.txt");
        //Escrever no documento:
        try(FileReader fr= new FileReader(file)){
            int i;
            //-1: ultimo elemento do documento
            while((i=fr.read()) != -1){
                System.out.print((char)i);
            }
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
}
