package com.example;

public class BinaryConverter {
    public static void main(String args[]){
        String[] binary = {"00110000", "00110001", "00110010", "00110011", "00110100", "00110101",
                "00110110", "00110111", "00111000", "00111001"};
        String myNumber = "8675309";
        /*  Jenny, I got your number
            I need to make you mine
            Jenny, don't change your number
         */
        int myLength = myNumber.length();
        char[] myNumbers = myNumber.toCharArray();
        for(int i = 0; i < myLength; i++){
            int c = Character.getNumericValue(myNumbers[i]);
            System.out.print(binary[c] + " ");
        }


    }
}
