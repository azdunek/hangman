package com.agnieszkazdunek;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        // !TODO: Dowiedz sie jak ignorowac wielkosc znakow dla char (ANSCII CODES)
        // !TODO: Zrobic szubienice
        // !TODO: Znajdz odpowiednie miejsce na clearConsole. Obrazki nie maja nic do czyszczenia konsoli
        // !TODO: Ta sama litera kilka razy -> Komunikat: Litera juz uzyta! + wyświetl użyte litery
        // !TODO: Nie działają zdania, bo nie da się wpisać spacji!

        char playAgain ='Y';
        while(playAgain=='Y'){

        ArrayList<Character> usedLetters = new ArrayList<>();
        char letter;
        System.out.println("Podaj hasło:");
           Password password = new Password();
           Pictures.clearConsole();
        System.out.println(Pictures.szubienica[0]);
        password.displayEncryptedPassword();
        int mistake=0;

        while(password.areOthers()){
            System.out.println("Podaj literę:");
            FromUser fromUser = new FromUser();

            letter= fromUser.getLetter();
            usedLetters.add(letter);
            if(password.contains(letter)){
                password.revealLetter(letter);
                password.displayEncryptedPassword();
            } else {
                mistake++;
                System.out.println(Pictures.szubienica[mistake]);
                System.out.println("Zużyte litery:");
                for (Character usedLetter : usedLetters) {
                    System.out.print(usedLetter+" "); }
                System.out.println();
                }
            }
            if(mistake==Pictures.szubienica.length){
                System.out.println("You lost!");
            } else {
                System.out.println("You won!");
            }
            System.out.println("Do you want to play again? Y/N");
            FromUser answer = new FromUser();
             playAgain = answer.getLetter();
        }
    }




}
