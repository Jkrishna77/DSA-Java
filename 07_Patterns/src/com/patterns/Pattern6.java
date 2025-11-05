package com.patterns;

/*
* * * * *
  * * * *
    * * *
      * *
        *
*/
public class Pattern6 {
    public static void main(String[] args) {
        for(int i=5;i>0;i--){
            for(int j = 5-i;j>0;j--){
                System.out.print("  "); // double space
            }

            for(int col=i;col>0;col--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
