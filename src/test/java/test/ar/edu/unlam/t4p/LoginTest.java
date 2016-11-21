package test.ar.edu.unlam.t4p;

import org.junit.Assert;
import org.junit.Test;

import ar.edu.unlam.t4p.servicios.ServiceLocator;
import ar.edu.unlam.t4p.servicios.UserService;

public class LoginTest {
	
	
	
	@Test
	public void loginTest(){
		String user = "JackSparrow";
		String pass = "clave";
		UserService userService = ServiceLocator.getInstance().getUserService();
		
		
		Assert.assertTrue(userService.verifyUser(user, pass));
	}
		
}
