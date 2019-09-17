package com.agnieszkazdunek;

public class Password extends Object {
    private String value;
    private String encryptedValue;

    public Password(){
        DataProvider scanner = new DataProvider();
        this.value= scanner.getPasswordFromUser();
        encryptPassword();
    }

    private void encryptPassword() {
        String encrypted = "";

        System.out.println("sth");
        for( int i=0; i<this.value.length(); i++) {
            if (this.value.charAt(i) != ' ') {
                encrypted = encrypted + "_ ";
            } else {
                encrypted = encrypted + "  ";
            }
        }

        this.encryptedValue = encrypted;

    }

    public String getValue() {
        return value;
    }

    public String getEncryptedValue() {
        return encryptedValue;
    }


}
