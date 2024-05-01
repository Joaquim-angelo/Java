package com.ex022;
public class ThrowGetMessage {
    public static void main(String[] args) {
        try{
            int []num=new int[6];
            for(int i = 0; i <= 10; i++){
                num[i] = i;
                System.out.println(i);
            }
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array fora do índice: "+e.getMessage());
        }
    }
}
