package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        /*char letter = 'E' ;
        int number = letterToNumber(letter);
        System.out.printf("Bogstaver %c bliver til %d", letter, number);*/
        String plainText = "ADAM";
        int[] cipher = textToListOfNumbers(plainText);

        System.out.println(Arrays.toString(cipher));
    }
    public static int[] textToListOfNumbers(String text){
     int[] numbers = new int[text.length()];
     char[] letters = text.toCharArray();

     for ( int i = 0; i < text.length(); i++){
         numbers[i] = letterToNumber(letters[i]);
     }
     return numbers;
    }
    public static int letterToNumber( char letter ) {
        String alfabetet = " ABCDEFGHIJKLMNOPQRSTUVWXYZÆØÅ";
        int num = alfabetet.indexOf( letter );
        return num;

    }

}
