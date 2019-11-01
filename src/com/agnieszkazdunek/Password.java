package com.agnieszkazdunek;

public class Password  {
    private char[] value;
    private char[] encryptedValue;

    public Password(char[] value) {
        this.value = value;
        encryptedValue = new char[value.length];
        encryptPassword();
    }

    boolean notGuessed() {
        for (int i = 0; i < this.value.length; i++) {
            if (this.value[i] != this.encryptedValue[i]) {
                return true;
            }
        }
        return false;
    }

    public void revealLetter(char letter) {
        for (int i = 0; i < this.value.length; i++) {
            if (this.value[i] == letter) {
                this.encryptedValue[i] = this.value[i];
            }
        }
    }

    private void encryptPassword() {
        for (int i = 0; i < this.value.length; i++) {
            this.encryptedValue[i] = '_';
        }
    }

    void displayEncryptedPassword() {
        for (char c : this.encryptedValue) {
            System.out.print(c + " ");
        }
        System.out.println();
    }

    public boolean contains(char letter) {
        for (char c : this.value) {
            if (c == letter) {
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
