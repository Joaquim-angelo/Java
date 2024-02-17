package com.ex006;
public class OperadoresAritmeticos{
    public static void main(String[] args){
        /*adição*/
        int n1=2,n2=3;
        int soma=n1+n2;
        System.out.println(n1+"+"+n2+"="+soma);
        /*subtração*/
        int s1=2,s2=3;
        int sub=s1-s2;
        System.out.println(s1+"-"+s2+"="+sub);
        /*divisão*/
        float d1=10,d2=3;
        float div=d1/d2;
        System.out.println(d1+"/"+d2+"= "+div);
        /*resto de divisão*/
        float resto=d1%d2;
        System.out.println("Resto da divisão: "+resto);
    }
}
