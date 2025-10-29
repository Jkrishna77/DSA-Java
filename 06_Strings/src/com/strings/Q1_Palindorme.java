package com.strings;

public class Q1_Palindorme {
    public static void main(String[] args) {
        String str="madam";
        System.out.println(isPalindrome(str));
    }

    static boolean isPalindrome(String str){
        if(str == null || str.length() ==0){
            return false;
        }
        int end;
        for(int i=0;i<str.length()/2;i++){
            end=str.length()-1-i;
            if(str.charAt(i) != str.charAt(end)){
                return false;
            }

        }
        return true;
    }


}
