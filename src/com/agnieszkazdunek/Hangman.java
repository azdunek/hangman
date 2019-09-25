package com.agnieszkazdunek;

import java.util.ArrayList;

public class Hangman {
     int mistakeCounter;

     void play() {
            // przenies do pól z czego będzie korzystało więcej metod
            ArrayList<Character> usedLetters = new ArrayList<>();
            char letter;
            System.out.println("Enter a word or phrase:");
            FromUser dataProvider = new FromUser();
            char[] passwordFromUser = dataProvider.getPassword();
            // gdzie wpisujesz? tworzysz tylko obiekt
            Password password = new Password(passwordFromUser);
            clearConsole();
            password.displayEncryptedPassword();
            mistakeCounter = 0;
            FromUser fromUser = new FromUser();

            while (password.notGuessed() && userDidNotReachedMistakesLimit()) {
                System.out.println("Enter a letter:");
                letter = fromUser.getLetter();

                if (usedLetters.contains(letter)) {
                    System.out.println("You have used that letter! Enter another letter:");
                } else {
                    usedLetters.add(letter);
                }

                if (password.contains(letter)) {
                    password.revealLetter(letter);
                    password.displayEncryptedPassword();
                } else {
                    printActualGallowsPicture();
                    mistakeCounter++;

                    System.out.println("Used letters:");
                    //co tu sie dzieje? jakas petla? ale jaka ? stworz metode z odpowiednia nazwa
                    for (Character usedLetter : usedLetters) {
                        System.out.print(usedLetter + " ");
                    }
                    System.out.println();
                }
            }

            // odpowiednio nazwij to porównanie i wyodrębnij do metody z samotłumaczącą się nazwą printGameResult ?
            if (mistakeCounter == Pictures.gallows.length) {
                System.out.println("You lost!");
            } else {
                System.out.println("You won!");
            }
        }


    public void printActualGallowsPicture() {
        System.out.println(Pictures.gallows[mistakeCounter]);
    }

    static void clearConsole() {
        for (int i = 0; i <= 10; i++) {
            System.out.println();
        }
    }

    boolean userDidNotReachedMistakesLimit (){
         return mistakeCounter!=Pictures.gallows.length;
    }
}

