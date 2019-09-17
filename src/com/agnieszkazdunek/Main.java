package com.agnieszkazdunek;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        //do {
           System.out.println("Podaj hasło:");
           Password password = new Password();
        System.out.println(Pictures.szubienica[0]);
        System.out.println(password.getEncryptedValue());
        System.out.println("Podaj literę:");
        FromUser fromUser = new FromUser();
        ArrayList<String> usedLetters = new ArrayList<>();
        String letter;

        letter= fromUser.getLetter();
        usedLetters.add(letter);
        if(password.getValue().contains(letter)){
            password.revealLetter();
        }




      // }
    }




}
