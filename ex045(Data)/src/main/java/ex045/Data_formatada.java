package ex045;
import java.text.DateFormat;
import java.util.Calendar;
public class Data_formatada {
    public static void main(String[] args) {
        Calendar calendario= Calendar.getInstance();
        //criando vetor de Datas
        DateFormat[]df= new DateFormat[6];

        //data atual simplificada + hora
        df[0]=DateFormat.getInstance();
        //apenas data escrita
        df[1]=DateFormat.getDateInstance();
        //data escrita + hora
        df[2]=DateFormat.getDateTimeInstance();
        //data Simplificada
        df[3]=DateFormat.getDateInstance(DateFormat.SHORT);
        //data escrita
        df[4]=DateFormat.getDateInstance(DateFormat.MEDIUM);
        //data escrita+dia da semana
        df[5]=DateFormat.getDateInstance(DateFormat.FULL);

        for(DateFormat dateFormat: df){
            System.out.println(dateFormat.format(calendario.getTime()));
        }
    }
}
