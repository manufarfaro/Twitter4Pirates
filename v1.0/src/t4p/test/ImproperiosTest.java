package t4p.test;

import java.util.Collection;

import junit.framework.Assert;

import org.junit.Test;

import t4p.model.Tweet;
import t4p.model.User;
import t4p.servicios.ServiceLocator;
import t4p.servicios.TweetService;
import t4p.servicios.UserService;

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
