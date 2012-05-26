package t4p.persistence;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.collections.Predicate;

import t4p.model.Tweet;
import t4p.model.User;

public class OurTweetDao {
	
	private static OurTweetDao instance = new OurTweetDao();
	
	private OurTweetDao(){
		
	}
	
	public static OurTweetDao getInstance(){
		return instance;
	}
	
	public Collection<Tweet> getAllTweetsByUsername(User username){
		
		Collection<Tweet> allTweets = DaoFactory.getInstance().getTweetDao().findAll();
		Predicate allUserTweetsFilter = new AllTweetsUserFilter(username);
		Collection<Tweet> allUserTweets = (Collection<Tweet>)CollectionUtils.select(allTweets, allUserTweetsFilter);
		Collections.sort((List<Tweet>) allUserTweets, new Comparator<Tweet>(){

			@Override
			public int compare(Tweet t1, Tweet t2) {
				return t1.getTimestamp().compareTo(t2.getTimestamp());
			}
			
		});
		return allUserTweets;
	}

	public Collection<Tweet> getAllTweets(User usuario) {
		
		
		Collection<Tweet> allTweets = DaoFactory.getInstance().getTweetDao().findAll();
		Predicate AllTweetsPredicate = new AllTweetsPredicate(usuario);
		Collection<Tweet> allUserTweets = (List<Tweet>)CollectionUtils.select(allTweets, AllTweetsPredicate);
		Collections.sort((List<Tweet>) allUserTweets, new Comparator<Tweet>(){
		
			@Override
			public int compare(Tweet t1, Tweet t2) {
				return t1.getTimestamp().compareTo(t2.getTimestamp());
			}
			
		});
		return allUserTweets;
	}

	

	public int getNumerOfTweets(User usuario){
		Collection<Tweet> allTweets = DaoFactory.getInstance().getTweetDao().findAll();
		Predicate allUserTweetsFilter = new AllTweetsUserFilter(usuario);
		return (CollectionUtils.countMatches(allTweets, allUserTweetsFilter));
		
	
	}
}
	