package com.agnieszkazdunek;


import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        // !TODO: Dowiedz sie jak ignorowac wielkosc znakow dla char (ANSCII CODES)
        // !TODO: Nie działają zdania, bo nie da się wpisać spacji!

        char answer;
        FromUser fromUser = new FromUser();

        do {
            Hangman hangman = new Hangman();
            hangman.play();

            System.out.println("Do you want to play again? (Y/N)");
            answer = fromUser.getLetter();

        } while (answer == 'Y');
    }
}
