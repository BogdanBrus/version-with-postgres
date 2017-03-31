package javaTest;



import org.mvcedit.util.PasswordHelper;

public class EncodePassword {

	public static void main(String[] args) {
		PasswordHelper pasHelp = new PasswordHelper();
		
		String admin = "user";
		String res = pasHelp.encode(admin);
		System.out.println(res);
	}

}
