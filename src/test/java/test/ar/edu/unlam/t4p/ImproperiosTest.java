package test.ar.edu.unlam.t4p;

import junit.framework.Assert;

import org.junit.Test;

import ar.edu.unlam.t4p.model.Tweet;
import ar.edu.unlam.t4p.model.User;
import ar.edu.unlam.t4p.servicios.ServiceLocator;
import ar.edu.unlam.t4p.servicios.TweetService;
import ar.edu.unlam.t4p.servicios.UserService;

public class ImproperiosTest {
	@Test
	public void siguiendoTest(){
				
		UserService userService = ServiceLocator.getInstance().getUserService();
		User usuario = userService.findByUsername("Blackbeard");
		
		TweetService tweetService = ServiceLocator.getInstance().getTweetService();
		int esperado = 3;
		
		Assert.assertEquals(esperado , tweetService.getNumberOfTweets(usuario));
		
	}

}
