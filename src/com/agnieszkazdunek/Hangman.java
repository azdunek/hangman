package com.agnieszkazdunek;

import java.util.ArrayList;

class Hangman {
    private int mistakeCounter;
    private FromUser fromUser = new FromUser();
    private Password password;
    private ArrayList<Character> usedLetters = new ArrayList<>();
    private char letter;

    void play() {
        getPasswordFromUser();
        clearConsole();
        password.displayEncryptedPassword();
        mistakeCounter = 0;

        while (password.notGuessed() && userDidNotReachedMistakesLimit()) {
            getLetterFromUser();

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

                displayUsedLetters();
            }
        }
        printGameResult();
    }

    private void getPasswordFromUser() {
        System.out.println("Enter a word or phrase:");
        char[] passwordFromUser = fromUser.getPassword();
        password = new Password(passwordFromUser);
    }

    private void getLetterFromUser() {
        System.out.println("Enter a letter:");
        letter = fromUser.getLetter();
    }

    private void displayUsedLetters() {
        System.out.println("Used letters:");
        for (Character usedLetter : usedLetters) {
            System.out.print(usedLetter + " ");
        }
        System.out.println();
    }

    private void printGameResult() {
        if (userDidNotReachedMistakesLimit()) {
            System.out.println("You won!");
        } else {
            System.out.println("You lost!");
        }
    }

    private void printActualGallowsPicture() {
        System.out.println(Pictures.gallows[mistakeCounter]);
    }

    private static void clearConsole() {
        for (int i = 0; i <= 10; i++) {
            System.out.println();
        }
    }

    private boolean userDidNotReachedMistakesLimit() {
        return mistakeCounter != Pictures.gallows.length;
    }


}

