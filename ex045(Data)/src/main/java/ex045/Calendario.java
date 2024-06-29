package ex045;
import java.util.Calendar;
public class Calendario {
    public static void main(String[] args) {
        Calendar calendario= Calendar.getInstance();

        System.out.println(calendario.get(Calendar.DAY_OF_WEEK)+"° dia da Semana: ");
        System.out.println(calendario.get(Calendar.DAY_OF_MONTH)+"° dia do Mês: ");
        System.out.println(calendario.get(Calendar.DAY_OF_YEAR)+"° dia do Ano: ");

        //verificando 1° dia da Semana
        if(calendario.getFirstDayOfWeek()==Calendar.SUNDAY){
            System.out.println("Domingo");
        }

        if(calendario.DAY_OF_WEEK==7){
            System.out.println("Hoje é sabado");
        }else{
            System.out.println("Hoje não é sabado");
        }
    }
}
