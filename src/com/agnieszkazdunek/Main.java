package com.agnieszkazdunek;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        // !TODO: Dowiedz sie jak ignorowac wielkosc znakow dla char (ANSCII CODES)
        // !TODO: Nie działają zdania, bo nie da się wpisać spacji!

        char playAgain ='Y';
        while(playAgain=='Y'){

        ArrayList<Character> usedLetters = new ArrayList<>();
        char letter;
        System.out.println("Podaj hasło:");
           Password password = new Password();
           clearConsole();
        System.out.println(Pictures.szubienica[0]);
        password.displayEncryptedPassword();
        int mistake=0;

        while(password.areOthers()){
            System.out.println("Podaj literę:");
            FromUser fromUser = new FromUser();

            letter= fromUser.getLetter();
            if(usedLetters.contains(letter)){
                System.out.println("Użyłeś już tej litery! Podaj inną literę:");
            } else{
            usedLetters.add(letter);}

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
            if(mistake==Pictures.szubienica.length-1){
                System.out.println("You lost!");
            } else {
                System.out.println("You won!");
            }
            System.out.println("Do you want to play again? Y/N");
            FromUser answer = new FromUser();
             playAgain = answer.getLetter();
        }
    }
public static void clearConsole(){
        for(int i=0; i<=10; i++){
            System.out.println();
        }
}



}
