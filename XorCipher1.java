public class XorCipher1 {

    /**
     * Encrypts or decrypts a string using a XOR key.
     * The same function is used for both encryption and decryption.
     * 
     * @param inputString The string to encrypt or decrypt.
     * @param key The character key for XOR operation.
     * @return The encrypted or decrypted string.
     */
    static String xorEncryptDecrypt(String inputString, char key) {
        char[] output = new char[inputString.length()]; // Create a character array to store the result
        
        for (int i = 0; i < inputString.length(); i++) {
            // XOR each character of the input string with the key
            output[i] = (char) (inputString.charAt(i) ^ key); 
        }
        
        return new String(output); // Convert the character array back to a string and return
    }

    public static void main(String[] args) {
        String message = "Amar Raj"; // The original message
        char key = 'M'; // The XOR key

        System.out.println("Original message: " + message);

        // Encrypt the message
        String encrypted = xorEncryptDecrypt(message, key);
        System.out.println("Encrypted message: " + encrypted);

        // Decrypt the message
        String decrypted = xorEncryptDecrypt(encrypted, key);
        System.out.println("Decrypted message: " + decrypted);
    }
}
