package t4p.persistence;

import java.util.List;

import org.apache.commons.collections.Predicate;

import t4p.model.Tweet;
import t4p.model.User;

public class AllTweetsPredicate implements Predicate {

	User usuario; 
	List<User> following;

	public AllTweetsPredicate (User usuario){
		this.usuario = usuario;
		this.following = usuario.getFollowing();
		
	}
	
	@Override
	public boolean evaluate(Object arg0) {

		Tweet unTweet = (Tweet) arg0;
		boolean retornar = false;
		
			if(unTweet.getAuthor().getUsername().equals(this.usuario.getUsername())){
				retornar = true;
			}else{
				
				for(User u: following){
					if(unTweet.getAuthor().getUsername().equals(u.getUsername())){
						retornar = true;
					}
					
				}
			}
	
			return retornar;
	}

}
