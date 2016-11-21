package test.ar.edu.unlam.t4p;

import org.junit.Assert;
import org.junit.Test;

import ar.edu.unlam.t4p.model.User;
import ar.edu.unlam.t4p.servicios.ServiceLocator;
import ar.edu.unlam.t4p.servicios.UserService;

public class SiguiendoTest {
			
		@Test
		public void siguiendoTest(){
			
			UserService userService = ServiceLocator.getInstance().getUserService();
			User usuario = userService.findByUsername("Blackbeard");
			int esperado = 2;
			Assert.assertEquals(esperado , usuario.getFollowing().size());
			
		}

	

}
