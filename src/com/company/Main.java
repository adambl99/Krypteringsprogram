package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        /*char letter = 'E' ;
        int number = letterToNumber(letter);
        System.out.printf("Bogstaver %c bliver til %d", letter, number);*/
        /*String plainText = "ADAM";
        int[] cipher = textToListOfNumbers(plainText);

        System.out.println(Arrays.toString(cipher));*/
        /*int number = 5;
        char letter = numberToLetter( number );
        System.out.printf("Tallet %d bliver til bogstavet %c", number, letter);*/

        int[] cipher = {1, 2, 5};
        String plainText = listofNumbersToText(cipher);
        System.out.println("Den decryptede tekst er: ");
        System.out.println(plainText);
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
    public static String listofNumbersToText ( int[] numbers) {
        String text = "";
        for (int i = 0; i < numbers.length; ++i) {
            int number = numbers[i];

            char letter = numberToLetter(number);

            text = text + letter;
        }
        return text;
    }
    public static char numberToLetter( int number ){
        String alfabetet = " ABCDEFGHIJKLMNOPQRSTUVWXYZÆØÅ";
        char letter = alfabetet.charAt(number);
        return letter;
    }


}
