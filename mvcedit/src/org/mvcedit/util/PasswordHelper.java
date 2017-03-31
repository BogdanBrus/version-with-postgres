package org.mvcedit.util;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import javax.inject.Named;

import org.springframework.security.crypto.password.PasswordEncoder;


//Шыфрует пароли
@Named("passwordHelper")
public class PasswordHelper implements PasswordEncoder{

	private MessageDigest md;
	
	public PasswordHelper(){
		try {
			md = MessageDigest.getInstance("MD5");
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
	}
	//do
	@Override
	public String encode(CharSequence rawPassword) {
		if(md == null){
			return rawPassword.toString();
		}
		
		md.update(rawPassword.toString().getBytes());
		
		byte byteData[] = md.digest();
		StringBuffer hexString = new StringBuffer();
		for(int i = 0; i<byteData.length;i++){
			String hex = Integer.toHexString(0xff & byteData[i]);
			if (hex.length() == 1)
				hexString.append('0');
			hexString.append(hex);
		}
		return hexString.toString();
	}

	//check
	@Override
	public boolean matches(CharSequence rawPassword, String encodedPassword) {
		return encode(rawPassword).equals(encodedPassword);
	}

	

}
