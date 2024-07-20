package ex048;
import java.io.*;
public class Escrever {
    public static void main(String[] args) {
        File file= new File("c:\\Users\\Oem\\OneDrive\\Documentos\\BackEnd\\Java\\ex048\\arquivo.txt");
        //Escrever no documento:
        try(FileWriter fw= new FileWriter(file)){
            fw.write("Escrevendo....");
            fw.flush();
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
}
