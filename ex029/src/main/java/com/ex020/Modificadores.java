/*Script demonstrativo de modificadores*/
package com.ex020;
/*classe abstrata: não pode ser instânciada apenas herdada*/
/*classes abstrata não podem ser private nem static*/
public abstract class Modificadores{
    /*Default: apenas o atributo*/
    String ex1;
    /*public: ultilizavel em qualquer lugar da classe*/
    public int ex2;
    /*private: ultilizavel apenas em sua própria classe*/
    private boolean ex3;
    /*Protected: funciona como publico apenas no seu própria pacote */
    /*fora dele apenas em caso de herança*/
    protected String ex4;
    /*static: garante que metodo\atributo seja alocada na memoria*/
    static int ex5;
    public static void main(String[] args) {
        /*ex2=3;*/
        ex5=4;
        /*como ex5 é estático vai funcionar, porem ex2 não*/
        System.out.println(ex5);
    }
}