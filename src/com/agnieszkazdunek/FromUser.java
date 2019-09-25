package com.agnieszkazdunek;

import java.util.Scanner;

 class FromUser {
    private Scanner scanner = new Scanner(System.in);

     char[] getPassword() {
        return scanner.nextLine().toCharArray();
    }

     char getLetter() {
        return scanner.next().charAt(0);
    }
}
