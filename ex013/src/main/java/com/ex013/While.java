package com.ex013;
public class While {
    public static void main(String[] args) {
        int i=0;
        while (i<10) {
            i++;
            System.out.println(i);
        }
        /*Continue*/
        int x=0;
        while (x<12){
            x++;
            if ((x>4) && (x<8)) {
                continue;
            }
            System.out.println("x= "+x);
        }        
    }
}
