// package com.mycompany.encryption;
import java.util.Arrays;

/**
 * @author Shanmukh Iyer 
 * Student ID: 2152235
 */

public class EncryptionProcedures {

    private static String encryptedString = "";
    private static final String[] arrPeriodicTableValues = {
        "h", "he", "li", "be", "b", "c", "n", "o", "f", "ne",
        "na", "mg", "al", "si", "p", "s", "cl", "ar", "k",
        "ca", "sc", "ti", "v", "cr", "mn", "fe", "co", "ni",
        "cu", "zn", "ga", "ge", "as", "se", "br", "kr", "rb",
        "sr", "y", "zr", "nb", "mo", "tc", "ru", "rh", "pd",
        "ag", "cd", "in", "sn", "sb", "te", "i", "xe", "cs",
        "ba", "la", "ce", "pr", "nd", "pm", "sm", "eu", "gd",
        "tb", "dy", "ho", "er", "tm", "yb", "lu", "hf", "ta",
        "w", "re", "os", "ir", "pt", "au", "hg", "tl", "pb",
        "bi", "po", "at", "rn", "fr", "ra", "ac", "th", "pa",
        "u", "np", "pu", "am", "cm", "bk", "cf", "es", "fm",
        "md", "no", "lr", "rf", "db", "sg", "bh", "hs", "mt",
        "ds", "rg", "cn", "nh", "fl", "mc", "lv", "ts", "og"
    };
 
    public static String periodicEncrypt(String input) {
        int counter = 0, tableVal = 0;
        while(counter < input.length()) {

            String focus = focusString(input, counter);

            tableVal = isInTable(focus);
            
            counter += 1 + buildEncryption(focus, tableVal);
        
        }
        return encryptedString;
    }

    private static int isInTable(String inp) {
        return Arrays.asList(arrPeriodicTableValues).indexOf(inp);
    }

    private static String focusString(String inp, int ctr) {
        
        if(ctr == inp.length() - 1) {
            return inp.substring(ctr, ctr + 1);
        }
        else {
            return inp.substring(ctr, ctr + 2);
        }

    }

    private static int buildEncryption(String focus, int tVal) {
        
        if(tVal == -1) {
            
            String stringHead = String.valueOf(focus.charAt(0));
            int tmpVar = isInTable(stringHead);
            
            if(tmpVar != -1) {
                encryptedString += String.valueOf(tmpVar + 1);
            }
            else {
                encryptedString += stringHead;
            }

        }
        else {
            encryptedString += String.valueOf(tVal + 1);
            return 1;

        }
        
        return 0;

    }

}