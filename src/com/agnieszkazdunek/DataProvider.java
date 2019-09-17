package com.agnieszkazdunek;

import java.util.Scanner;

public class DataProvider {

    public String getPasswordFromUser(){
        Scanner scanner = new Scanner(System.in);
       return scanner.nextLine();
    }
}
