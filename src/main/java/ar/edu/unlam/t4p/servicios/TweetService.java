package ar.edu.unlam.t4p.servicios;

import java.util.Collection;
import java.util.List;

import ar.edu.unlam.t4p.model.Tweet;
import ar.edu.unlam.t4p.model.User;
import ar.edu.unlam.t4p.persistence.DaoFactory;
import ar.edu.unlam.t4p.persistence.OurTweetDao;
import ar.edu.unlam.t4p.persistence.OurUserDao;
import ar.edu.unlam.t4p.persistence.TweetDao;

public class TweetService {
	private static TweetService instance = new TweetService();
	
	private TweetService(){
		
	}

	public static TweetService getInstance(){
		return instance;
	}
	public Collection<Tweet> getTweetByUser(User usuario){
		return (OurTweetDao.getInstance().getAllTweetsByUsername(usuario));
	}
	
	public Collection<Tweet> getAllTweets(User usuario){
		return (OurTweetDao.getInstance().getAllTweets(usuario));
		
	}
	
	public int getNumberOfTweets(User usuario){
		return (OurTweetDao.getInstance().getNumerOfTweets(usuario));
		
	}
}
