package ex045;
import java.util.Date;
public class Data {
    public static void main(String[] args) {
        //criando variável da data atual
        Date data= new Date();
        System.out.println(data);
        //Hora do dia
        System.out.println(data.getHours());
        //Mês do Ano
        System.out.println(data.getMonth()+1);
    }
}