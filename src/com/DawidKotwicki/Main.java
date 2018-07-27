package com.DawidKotwicki;

public class Main {

    public static void main(String[] args) {

        // unicode-table.com/en/#control-character
        //Width of a char is 16(2 bytes)
        char myChar = '\u00A9';
        System.out.println("Copyright symbol: " + myChar);
        //Width of a boolean is 4(1 byte)
        boolean myBool = false;
        boolean isMale = true;

        char registeredSymbol = '\u00AE';
        System.out.println("Registered symbol: " + registeredSymbol);
    }
}
