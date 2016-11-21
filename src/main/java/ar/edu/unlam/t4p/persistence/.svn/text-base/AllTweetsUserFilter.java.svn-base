package t4p.persistence;

import org.apache.commons.collections.Predicate;

import t4p.model.Tweet;
import t4p.model.User;

public class AllTweetsUserFilter implements Predicate{
	
	private User user;
	
	
	
	public AllTweetsUserFilter(User username) {
		this.user= username;
	}



	@Override
	public boolean evaluate(Object arg0) {
		
		Tweet unTweet = (Tweet)arg0;
		
		
		return unTweet.getAuthor().getUsername().equals(this.user.getUsername());
	}
	
}
