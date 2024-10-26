package Crypto;
/*
 * Class: CMSC203 
 * Instructor: Khandan Vahabzadeh Monshi
 * Description: This program allows us to encrypt tasks as well as the opposite. 
 * Due: 10/25/2024
 * Platform/compiler: Java Eclipse
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Borhawwe Debelo 
*/
import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CryptoManagerTestStudent {

CryptoManager cryptoManager;
	
	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}
	
	@Test
	public void testStringInBounds() {
		assertTrue(CryptoManager.isStringInBounds("FVUIGTFIKEW"));
		assertTrue(CryptoManager.isStringInBounds("OWETHOWRNGN"));
		assertFalse(CryptoManager.isStringInBounds("ronaldo"));
		assertFalse(CryptoManager.isStringInBounds("maryland"));
		
	}

	@Test
	public void testEncryptCaesar() {
		assertEquals("9,0:+-2+-:", CryptoManager.caesarEncryption("REISDFKDFS", 487));
		assertEquals("DAHHK\\SKNH@", CryptoManager.caesarEncryption("HELLO WORLD", 444));
		
	}

	@Test
	public void testDecryptCaesar() {
		assertEquals("THIS IS ANOTHER TEST", CryptoManager.caesarDecryption("WKLV#LV#DQRWKHU#WHVW", 3));
		assertEquals("THIS TEST SHOULD SUCCEED", CryptoManager.caesarDecryption("RFGQ^RCQR^QFMSJB^QSAACCB", 190));

		
	}

	@Test
	public void testEncryptBellaso() {
		assertEquals("&J!U[RY", CryptoManager.bellasoEncryption("TESTING", "RENARD"));
		assertEquals("WU\\VR9F#N!RF88U-'HED", CryptoManager.bellasoEncryption("THIS IS ANOTHER TEST", "CMSC203"));


	}

	@Test
	public void testDecryptBellaso() {
		assertEquals("GMQS;P%", CryptoManager.bellasoDecryption("WN#\\N &", "PARIS"));
		assertEquals("MERRY CHRISTMAS", CryptoManager.bellasoDecryption("PR%UKP6K_\\VF=4V", "CMSC203"));
		

	}



}
