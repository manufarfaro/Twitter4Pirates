package t4p.test;

import org.junit.Assert;
import org.junit.Test;

import t4p.model.User;
import t4p.servicios.ServiceLocator;
import t4p.servicios.UserService;

public class SiguiendoTest {
			
		@Test
		public void siguiendoTest(){
			
			UserService userService = ServiceLocator.getInstance().getUserService();
			User usuario = userService.findByUsername("Blackbeard");
			int esperado = 2;
			Assert.assertEquals(esperado , usuario.getFollowing().size());
			
		}

	

}
