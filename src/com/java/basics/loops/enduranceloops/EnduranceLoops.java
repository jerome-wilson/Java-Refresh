package com.java.basics.loops.enduranceloops;

public class EnduranceLoops {
    public void selectiveNumberPrinting(int n){
        int i=1;
        while (i <= n) {
            if (i%5!=0) {
                System.out.print(i+" ");
            }
            i++;
        }
    }
}
//1 to n
// exclude div by 5
// pass n as parameter from main , scanner
// no return