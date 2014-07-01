import org.springframework.security.authentication.encoding.Md5PasswordEncoder;

import junit.framework.TestCase;


public class PasswordHash extends TestCase {
	
	public void testMD5Hash() {
		Md5PasswordEncoder passwordEncoder = new Md5PasswordEncoder();
		System.out.println("PasswordHash.testMD5Hash()");
		System.out.println(passwordEncoder.encodePassword("secret", null));
	}
	
}
