package com.agnieszkazdunek;

public class Password extends Object {
    private String value;
    private String encryptedValue;

    public Password(){
        FromUser dataProvider = new FromUser();
        this.value= dataProvider.getPassword();
        encryptPassword();
    }

    public void revealLetter(String letter){
        for( int i=0; i<this.value.length(); i++){
            // !TODO: Implement this!
        }
    }

    private void encryptPassword() {
        String encrypted = "";

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
