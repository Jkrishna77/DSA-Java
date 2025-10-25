package com.linear;

public class SearchInStrings {
    
    static boolean linearSearch(String str, char key){
        if (str.length() == 0){
            return false;
        }

        for (int i =0; i< str.length(); i++){
            if (str.charAt(i) == key){
                return true;
            }
        }

        
        return false; 
    }

    static boolean linearSearchEnhanced(String str, char key){
        if (str.length() == 0){
            return false;
        }

        for (char ch : str.toCharArray()){
            if (ch == key){
                return true;
            }
        }

        return false;
        
    }
    public static void main(String[] args) {
        String str = "HelloWorld";
        char key = 'W';

        // boolean result = linearSearch(str, key);
        boolean result = linearSearchEnhanced(str, key);
        if (result){
            System.out.println("Character found in the string");
        } else {
            System.out.println("Character not found in the string");
        }
    }


}
