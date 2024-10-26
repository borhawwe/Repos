
/*
 * Class: CMSC203 
 * Instructor: Khandan Vahabzadeh Monshi
 * Description: Programm used for encryption and decryption tasks
 * Due: 03/17/2023
 * Platform/compiler: Java Eclipse
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: cedric Dzobosse
*/

public class CryptoManager 
{
	private static final char LOWER_RANGE = ' ';
	private static final char UPPER_RANGE = '_';
	private static final int RANGE = UPPER_RANGE - LOWER_RANGE + 1;

	/*
	 * This method determines if a string is within the allowable bounds of ASCII codes 
	 * according to the LOWER_RANGE and UPPER_RANGE characters
	 * @param encryptedText a string to be encrypted, if it is within the allowable bounds
	 * @return true if all characters are within the allowable bounds, false if any character is outside
	 */
	public static boolean isStringInBounds (String encryptedText) {
		//throw new RuntimeException("method not implemented");
        
        for (int i = 0; i < encryptedText.length(); i++)
	    {
	        
	        if (encryptedText.charAt(i) > UPPER_RANGE || encryptedText.charAt(i) < LOWER_RANGE)	
	        return false;
	    }
	    
        return true;
	}

	/*
	 * Encrypts a string according to the Caesar Cipher.  The integer key specifies an bellasoStr
	 * and each character in encryptedText is replaced by the character \"bellasoStr\" away from it 
	 * @param encryptedText an uppercase string to be encrypted.
	 * @param key an integer that specifies the bellasoStr of each character
	 * @return the encrypted string
	 */
	public static String caesarEncryption(String encryptedText, int key) {
		//throw new RuntimeException("method not implemented");
        String encryptedPlainText = "";
        
        if (isStringInBounds(encryptedText))
        {
             for (int i = 0; i < encryptedText.length(); i++)
            {
                char plainChar = encryptedText.charAt(i);
                int encryptedCharint = (int)plainChar + key;
                
                while (encryptedCharint > UPPER_RANGE)
                {
                    encryptedCharint  -=  RANGE;
                }
                
                encryptedPlainText += (char)encryptedCharint;
            }
             return encryptedPlainText;
        }
        else return "The selected string is not in bounds, Try again." ;
         
	}
	
	/*
	 * Encrypts a string according the Bellaso Cipher.  Each character in encryptedText is bellasoStr 
	 * according to the ASCII value of the corresponding character in bellasoStr, which is repeated
	 * to correspond to the length of encryptedText
	 * @param encryptedText an uppercase string to be encrypted.
	 * @param bellasoStr an uppercase string that specifies the bellasoStrs, character by character.
	 * @return the encrypted string
	 */
	public static String bellasoEncryption (String encryptedText, String bellasoStr) {
		//throw new RuntimeException("method not implemented");
        
        String encryptedPlainText = "";
        int bellasoStrLength = bellasoStr.length();

        for (int i = 0; i < encryptedText.length(); i++)
        {
            char plainChar = encryptedText.charAt(i);
            int encryptedCharint = (int)plainChar + (int)bellasoStr.charAt(i % bellasoStrLength);
            
            while (encryptedCharint > (int)UPPER_RANGE)
            {
                encryptedCharint -= RANGE;
            }
            
            encryptedPlainText += (char)encryptedCharint;
        }

        return encryptedPlainText;
	}
	
	/*
	 * Decrypts a string according to the Caesar Cipher.  The integer key specifies an bellasoStr
	 * and each character in encryptedText is replaced by the character \"bellasoStr\" characters before it.
	 * This is the inverse of the encryptCaesar method.
	 * @param encryptedText an encrypted string to be decrypted.
	 * @param key an integer that specifies the bellasoStr of each character
	 * @return the plain text string
	 */
	public static String caesarDecryption (String encryptedText, int key) {
		//throw new RuntimeException("method not implemented");
        String decryptedPlainText = "";
        
        for (int i = 0; i < encryptedText.length(); i++)
        {
            char plainChar = encryptedText.charAt(i);
            int decryptedCharint = (int)plainChar-key;

            while (decryptedCharint < LOWER_RANGE)
            {
                decryptedCharint += RANGE;
            }

            decryptedPlainText += (char)decryptedCharint;
        }
        
        return decryptedPlainText;
	}
	
	/*
	 * Decrypts a string according the Bellaso Cipher.  Each character in encryptedText is replaced by
	 * the character corresponding to the character in bellasoStr, which is repeated
	 * to correspond to the length of encryptedText.  This is the inverse of the encryptBellaso method.
	 * @param encryptedText an uppercase string to be encrypted.
	 * @param bellasoStr an uppercase string that specifies the bellasoStrs, character by character.
	 * @return the decrypted string
	 */
	public static String bellasoDecryption(String encryptedText, String bellasoStr) {
		//throw new RuntimeException("method not implemented");
        
        String decryptedPlainText = "";
        int bellasoStrLength = bellasoStr.length();

        for (int i = 0; i < encryptedText.length(); i ++)
        {
            char plainChar = encryptedText.charAt(i);
            int decryptedCharint = (int)plainChar - (int)bellasoStr.charAt(i%bellasoStrLength);
            
            while (decryptedCharint < (int)LOWER_RANGE)
            {
                decryptedCharint += RANGE;
            }
            decryptedPlainText += (char)decryptedCharint;
        }
        
        return decryptedPlainText;
	}
}
