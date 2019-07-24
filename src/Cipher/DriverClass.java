/**
 * A Caesar Cipher that takes a string of text as input and encrypts it.
 * A decryption implementation was also done.
 *
 * @since 24th July, 2019 by Shittu Promise Aduragbemi.
 */

package Cipher;

import java.util.Scanner;

public class DriverClass {
    public static void main(String[] args) {

        String string, encryptedString;
        int key;
        String estring, decryptedString;
        int dkey;


        Scanner input = new Scanner(System.in);

        //Encryption Implementation
        System.out.print("Enter the string you intend to encrypt: ");
        string = input.next();

        System.out.print("Enter your KEY for encryption: ");
        key = input.nextInt();

        encryptedString = CaesarMethods.encrypt(string, key);

        System.out.println("The encrypted string is: " + encryptedString);

        //Decryption Implementation
        System.out.print("Enter the string you intend to decrypt: ");
        estring = input.next();

        System.out.print("Enter your KEY for decryption: ");
        dkey = input.nextInt();

        decryptedString = CaesarMethods.decrypt(estring, dkey);

        System.out.println("The encrypted string is: " + decryptedString);

    }
}
