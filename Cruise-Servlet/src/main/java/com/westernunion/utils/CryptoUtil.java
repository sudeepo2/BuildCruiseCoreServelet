package com.westernunion.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.security.GeneralSecurityException;
import java.security.Key;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.Security;
import java.security.KeyStore;
import java.security.cert.Certificate;

import javax.crypto.Cipher;

import org.apache.commons.codec.binary.Base64;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.westernunion.constants.WebConstants;

/**
 * Contains Utilities that communicates with encryption tool.
 * 
 * @author Vipul.Zadoo
 */
public class CryptoUtil {

	/** The LOG constant. */
	final private static Logger LOG = LoggerFactory.getLogger(CryptoUtil.class);
	
	//Move to a better place.
	final private static String propertiesPath = "D:/Western_Union/Bundles_Code/WUCOMBASE_1003/wu/web/wubase/Source/AppProperties/";
	final private static String jkskeyStorePath = propertiesPath+"cruisecerts/cruise.jks";
	final private static String keystorePassword = "wucruise";

	/**
	 * Decodes String of Base64 format.
	 * 
	 * @param value String to be decoded.
	 * @return Base64 decoded Str.
	 */
	public static String decodeAsBase64(String value) {
		if (value == null) {
			return value;
		}
		final byte[] decodedValue = Base64.decodeBase64(value.getBytes());
		try {
			return URLDecoder.decode(new String(decodedValue), "UTF-8");
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			LOG.error("Could not decode WUDATA", e.getMessage());
		}		
		if (LOG.isDebugEnabled()) {
			LOG.debug("Encoded Value: " + value + ", Decoded Value: " + decodedValue);
		}
		System.out.println("Encoded Value: " + value + ", Decoded Value: " + decodedValue);
		return decodedValue.toString();
	}

	/**
	 * Encodes String of Base64 format.
	 * 
	 * @param value String to be encoded.
	 * @return Base64 encoded Str.
	 */
	public static String encodeAsBase64(String value) {
		if (value == null) {
			return value;
		}
		final byte[] encodedValue = Base64.encodeBase64(value.getBytes());
		if (LOG.isDebugEnabled()) {
			LOG.debug("Value to be decoded: " + value + ", Encoded Value: " + encodedValue);
		}
		return encodedValue.toString();
	}

	/**
	 * Encrypts plainData using public key based on provider.
	 * 
	 * @param plainData Text to be encrypted
	 * @param providerId provider
	 * @return Encrypted String for plain data
	 */
	public static String encryptRequest(String plainData, String providerId)throws GeneralSecurityException, IOException {
		byte[] cipherRawData = null;
		byte[] cipherRawBase64EncodedData = null;
		String encryptedString = null;
		Key publicKey = getPublicKey(providerId);
		try {
			Security.addProvider(new BouncyCastleProvider());
			Cipher cipher = null;
			if (WebConstants.PROVIDER_CITI.equalsIgnoreCase(providerId)) {
				cipher = Cipher.getInstance(WebConstants.RSA_ALGORITHM_CITI, WebConstants.PROVIDER_BC);
			} else {
				cipher = Cipher.getInstance(WebConstants.RSA_ALGORITHM_BRIGHTWELL, WebConstants.PROVIDER_BC);
			}
			cipher.init(Cipher.ENCRYPT_MODE, publicKey);
			byte[] input = plainData.getBytes();
			cipherRawData = cipher.doFinal(input);
			cipherRawBase64EncodedData = Base64.encodeBase64(cipherRawData);
			encryptedString = new String(cipherRawBase64EncodedData);
		} catch (Exception exception) {
			LOG.error("Exception occured. " + exception);
		}
		return encryptedString;
	}

	/**
	 * Decrypts ciperText to plain text.
	 * 
	 * @param cipherText cipherText
	 * @param providerId provider
	 * @return Plain Text for ciper data.
	 */
	public static String decryptRequest(byte[] cipherText, String providerId)throws GeneralSecurityException,IOException {
		String decryptedString = null;
		Key privateKey = getPrivateKey(providerId);
		try {
			Security.addProvider(new BouncyCastleProvider());
			Cipher cipher = null;
			if (WebConstants.PROVIDER_CITI.equalsIgnoreCase(providerId)) {
				cipher = Cipher.getInstance(WebConstants.RSA_ALGORITHM_CITI, WebConstants.PROVIDER_BC);
			} else {
				cipher = Cipher.getInstance(WebConstants.RSA_ALGORITHM_BRIGHTWELL, WebConstants.PROVIDER_BC);
			}
			cipher.init(Cipher.DECRYPT_MODE, privateKey);
			byte[] decryptedData = cipher.doFinal(cipherText);
			decryptedString = new String(decryptedData);
		} catch (Exception exception) {
			LOG.error("Exception occured. " + exception);
		}

		return decryptedString;
	}

	/**
	 * Returns private key for specific provider.
	 * @param providerId provider 
	 * @return Key private key.
	 */
	private static Key getPrivateKey(String providerId) throws GeneralSecurityException,IOException{
		String alias = null;
		String privateKeyPwd = null;
		if (WebConstants.PROVIDER_CITI.equalsIgnoreCase(providerId)) {
			privateKeyPwd = "citi44";
			alias = "citi";
		} else {
			privateKeyPwd = "bright6";
			alias = "bright";
		}
		File file = new File(jkskeyStorePath);
		return getPrivateKey(file, keystorePassword, alias, privateKeyPwd);
	}
	
	/**
	 * Returns Public key for specific provider.
	 * @param providerId provider 
	 * @return Key Public key.
	 */
	private static Key getPublicKey(String providerId)throws GeneralSecurityException, IOException {
		String crtPath = null;
		String alias = null;
		String privateKeyPwd = null;
		KeyStore keyStore = KeyStore.getInstance(KeyStore.getDefaultType()); 
		if (WebConstants.PROVIDER_CITI.equalsIgnoreCase(providerId)) {
			crtPath = propertiesPath+"cruisecerts/citi.crt";
			privateKeyPwd = "citi44";
			alias = "citi";
		} else {
			crtPath = propertiesPath+"cruisecerts/bright.crt";
			privateKeyPwd = "bright6";
			alias = "bright";
		}
		//KeyStoreUtil.
		getPublicKey(keyStore,alias,privateKeyPwd.toCharArray());
		return null;
	}
	
	  /**      
		*  Get a private key out of a keystore     
		*     
		*  @param ks path to the keystore     
		*  @param ksPW the keystore password, may be null     
		*  @param alias the name of the key     
		*  @param keyPW the key password, must be at least 6 characters     
		*  @return the key or null if not found     
		*/    

	public static PrivateKey getPrivateKey(File ks, String ksPW, String alias, String keyPW)
			throws GeneralSecurityException, IOException {        
			InputStream fis = null; 
	try {            
			KeyStore keyStore = KeyStore.getInstance(KeyStore.getDefaultType()); 
		    fis = new FileInputStream(ks); 
		    char[] pwchars = ksPW != null ? ksPW.toCharArray() : null; 
		    keyStore.load(fis, pwchars); 
		    char[] keypwchars = keyPW.toCharArray(); 
		    return (PrivateKey) keyStore.getKey(alias, keypwchars); 
			} finally {
					if (fis != null) try { fis.close(); 
			} catch (IOException ioe) {}        
		}    
	}
	
	/**     
	* Get the Public Key from the keystore     
	*     
	* @param ks     
	* @param alias     
	* @param password     
	* @return     
	* @throws GeneralSecurityException     
	*/    
	public static PublicKey getPublicKey(KeyStore ks, String alias, char[] password) throws KeyStoreException,NoSuchAlgorithmException, GeneralSecurityException {        
			PublicKey publicKey = null; 
	        // Get private key        
			Key key = ks.getKey(alias, password); 
	        if (key instanceof PrivateKey) {            
			// Get certificate of public key            
			Certificate cert = ks.getCertificate(alias); 
	        // Get public key            
			publicKey = cert.getPublicKey(); 
	        }        
			// if alias is a certificate alias, get the public key from the certificate.        
			if (publicKey == null) {            
				Certificate cert = ks.getCertificate(alias); 
	            if (cert != null)                
					publicKey = cert.getPublicKey(); 
	        }    
			return publicKey;
	}
}
