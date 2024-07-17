//maneira simples
package ex046;
public class Expressao {
    public static void main(String[] args) {
        String cpf_1="021.143.809-15";
        String cpf_2="15.143.809";
        //Expressão padrão
        String pattern="[0-9]{3}[.][0-9]{3}[.][0-9]{3}[-][0-9]{2}";
        System.out.println(cpf_1.matches(pattern));
        System.out.println(cpf_2.matches(pattern));
    }
}
