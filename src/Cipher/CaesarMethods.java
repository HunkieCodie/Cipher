/**
 * A Caesar Cipher.
 *
 * @since 24th July, 2019 by Shittu Promise Aduragbemi.
 */

package Cipher;

public class CaesarMethods {

    /**
     * This method uses a Caesar's shift technique to encrypt a string passed into the function.
     * The character's value is shifted based on the key passed into the function.
     * It returns a string which is the result of encryption.
     *
     * @param string type String
     * @param key type int
     * @return type String
     */
    public static String encrypt(String string, int key) {
        String coded = "";
        for (int i = 0; i < string.length(); i++) {
            char sm = (char) (string.codePointAt(i) + key);
            coded += sm;
        }
        return coded;
    }

    /**
     * This method uses a Caesar's shift technique to decrypt a Caesar encrypted string passed into the function.
     * The character's value is shifted based on the key passed into the function.
     * It returns a string which is the result of decryption.
     *
     * @param coded type String
     * @param key type int
     * @return type String
     */
    public static String decrypt(String coded, int key) {
        String decoded = "";
        for (int i = 0; i < coded.length(); i++) {
            char sm = (char) (coded.codePointAt(i) - key);
            decoded += sm;
        }
        return decoded;
    }

}
