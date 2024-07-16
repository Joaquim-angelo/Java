//expressões regulares usando bibliotecas
package ex046;
import java.util.regex.*;
public class Compilar_Regex {
    public static void main(String[] args) {
        String txt="(86)94521-2204";
        String regex="[(][0-9]{2}[)][0-9]{5}[-][0-9]{4}";
        Pattern pattern= Pattern.compile(regex);
        Matcher matcher=pattern.matcher(txt);
        System.out.println(matcher.find());
    }
}
