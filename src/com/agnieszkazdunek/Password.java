package com.agnieszkazdunek;

public class Password extends Object {
    private char[] value;
    private char[] encryptedValue;

    public Password(){
        FromUser dataProvider = new FromUser();
        this.value= dataProvider.getPassword();
        encryptedValue = new char[value.length];
        encryptPassword();
    }

    public boolean areOthers(){
        for(int i=0; i<this.value.length; i++){
           if(this.value[i]!=this.encryptedValue[i]){
               return true;
           }
        }
        return false;
    }

    public void revealLetter(char letter){
        for( int i=0; i<this.value.length; i++){
            if (this.value[i]==letter){
               this.encryptedValue[i]=this.value[i];
            }
        }
    }


    private void encryptPassword() {
        for(int i=0; i<this.value.length; i++){
            this.encryptedValue[i]='_';
        }
    }

    public void displayEncryptedPassword(){
        for(int i=0; i<this.encryptedValue.length; i++){
            System.out.print(this.encryptedValue[i]+" ");
        }
        System.out.println();
    }

    boolean contains(char letter) {
        for(int i=0; i<this.value.length; i++){
            if(this.value[i]==letter){
                return true;
            }
        }
        return false;
    }

    public char[] getValue() {
        return value;
    }

    public char[] getEncryptedValue() {
        return encryptedValue;
    }


}
