//escrever datas em outras nacionalidades
package ex045;
import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;
public class Local {
    public static void main(String[]args){
        //datas em italiano
        Locale italiano= new Locale("it","IT");
        Calendar calendario=Calendar.getInstance();
        DateFormat df1=DateFormat.getDateInstance(DateFormat.FULL,italiano);
        System.out.println("Italia: "+df1.format(calendario.getTime()));
        //datas em holandês
        Locale holandes=new Locale("nl","NL");
        DateFormat df2=DateFormat.getDateInstance(DateFormat.FULL,holandes);
        System.out.println("Holanda: "+df2.format(calendario.getTime()));
        //datas em português
        Locale portugues=new Locale("pt","PT");
        DateFormat df3=DateFormat.getDateInstance(DateFormat.FULL,portugues);
        System.out.println("Brasil: "+df3.format(calendario.getTime()));
    }
}
