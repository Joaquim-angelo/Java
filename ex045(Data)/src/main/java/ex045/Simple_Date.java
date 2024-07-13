//criar um modelo de data
package ex045;
import java.text.SimpleDateFormat;
import java.util.Date;
public class Simple_Date {
    public static void main(String[]args){
        //dd=dia MMMM=mês YYYY=ano//
        String expressao="'Amsterdan' dd 'de' MMMM 'de' yyyy";
        //criar modelo de data da expressão//
        SimpleDateFormat sdf=new SimpleDateFormat(expressao);
        System.out.println(sdf.format(new Date()));
    }
}
