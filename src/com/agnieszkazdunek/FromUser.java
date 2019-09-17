package com.agnieszkazdunek;

import java.util.Scanner;

public class FromUser {
    private Scanner scanner = new Scanner(System.in);

    public String getPassword(){
       return scanner.nextLine();
    }

    public String getLetter(){
        return scanner.next();
    }
}
