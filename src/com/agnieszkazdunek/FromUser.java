package com.agnieszkazdunek;

import java.util.Scanner;

public class FromUser {
    private Scanner scanner = new Scanner(System.in);

    public char[] getPassword(){
       return scanner.nextLine().toCharArray();
    }

    public char getLetter(){
        return scanner.next().charAt(0);
    }
}
