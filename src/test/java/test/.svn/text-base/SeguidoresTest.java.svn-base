package t4p.test;
import junit.framework.Assert;

import org.junit.Test;

import t4p.model.User;
import t4p.servicios.ServiceLocator;
import t4p.servicios.UserService;

public class SeguidoresTest {
	
	@Test
	public void seguidoresTest(){
		
		UserService userService = ServiceLocator.getInstance().getUserService();
		User usuario = userService.findByUsername("Blackbeard");
		int esperado = 2;
		Assert.assertEquals(esperado , usuario.getFollowers().size());
		
	}

}