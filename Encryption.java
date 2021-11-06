package com.mycompany.encryption;
import java.util.Scanner;

/**
 * @author Shanmukh Iyer 
 * Student ID: 2152235
 */

public class Encryption {
    public static void main(String[] args) {
        //Take user input
        Scanner scan = new Scanner(System.in);
        System.out.print("Input message: ");
        String inputMessage = scan.nextLine();
        scan.close();
        
        //Repeat user input
        System.out.println("The input message was: " 
                + inputMessage);
        
        //Encrypt and print
        String outputMessage = EncryptionProcedures.periodicEncrypt(inputMessage.toLowerCase());
        System.out.println("The encrypted message is now: " 
                + outputMessage);
        
    }
}