package ar.edu.unlam.t4p.persistence;

import java.util.Date;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

import ar.edu.unlam.t4p.model.Tweet;
import ar.edu.unlam.t4p.model.User;


public class MockDataBase {

	private static final String PASSWORD = "clave";

	private static MockDataBase instance = new MockDataBase();

	Map<Long, User> users = new HashMap<Long, User>();
	Long userId = 1L;
	Map<Long, Tweet> tweets = new HashMap<Long, Tweet>();
	Long tweetId = 1L;
	
	private MockDataBase(){
		
		User capKidd = buildUser("CapitanKidd", "Capitan Kidd", "Navegando por la web, porque el mar ya me quedó chico");
		User redbeard = buildUser("Redbeard", "Capitán Barbarossa", "No, no soy el de la película");
		User blackbeard = buildUser("Blackbeard", "Barba Negra", "Más negra que la noche en el oceáno");
		User jack = buildUser("JackSparrow", "Capitán Jack Sparrow", "Yo jooo, yo jooo... pirata siempre ser!");
		
		prepareFollowings(capKidd, redbeard, blackbeard, jack);
		insertAll(capKidd, redbeard, blackbeard, jack);

		Tweet tw1 = buildTweet(blackbeard, "Ahoy! Alguien deme ron!!");
		Tweet tw2 = buildTweet(jack, "@Blackbeard Ahoy!");
		Tweet tw3 = buildTweet(blackbeard, "@JackSparrow vos no sos un pirata, perro con escorbuto!");
		Tweet tw4 = buildTweet(jack, ":(");
		Tweet tw5 = buildTweet(redbeard, "99 cervezas de ron en la pared...");
		Tweet tw6 = buildTweet(blackbeard, "@Redbeard bajá una y pasala!");
		Tweet tw7 = buildTweet(capKidd, "Me harté del FB para piratas... a ver este invento!");
		
		prepareMentionsAndPrevious(redbeard, blackbeard, jack, tw1, tw2, tw3,
				tw4, tw5, tw6);
		insertAll(tw1, tw2, tw3, tw4, tw5, tw6, tw7);
		
	}

	private void insertAll(Tweet tw1, Tweet tw2, Tweet tw3, Tweet tw4,
			Tweet tw5, Tweet tw6, Tweet tw7) {
		inserTweet(tw1);
		inserTweet(tw2);
		inserTweet(tw3);
		inserTweet(tw4);
		inserTweet(tw5);
		inserTweet(tw6);
		inserTweet(tw7);
	}
	
	private void inserTweet(Tweet tweet){
		tweets.put(tweet.getId(), tweet);
	}

	private void prepareMentionsAndPrevious(User redbeard, User blackbeard,
			User jack, Tweet tw1, Tweet tw2, Tweet tw3, Tweet tw4, Tweet tw5,
			Tweet tw6) {
		tw2.addMentions(blackbeard);
		tw2.setPrevious(tw1);
		tw3.addMentions(jack);
		tw3.setPrevious(tw2);
		tw4.setPrevious(tw3);
		tw6.addMentions(redbeard);
		tw6.setPrevious(tw5);
	}

	private Tweet buildTweet(User author, String text) {
		Tweet tweet = new Tweet();
		tweet.setId(tweetId++);
		tweet.setAuthor(author);
		tweet.setText(text);
		tweet.setTimestamp(new Date());
		tweet.setMentions(new LinkedList<User>());
		return tweet;
	}

	private void insertAll(User capKidd, User redbeard, User blackbeard,
			User jack) {
//		UserDao udao = new UserDaoMock();
		users.put(capKidd.getId(), capKidd);
		users.put(capKidd.getId(),capKidd);
		users.put(jack.getId(),jack);
		users.put(blackbeard.getId(),blackbeard);
		users.put(redbeard.getId(),redbeard);
	}

	private void prepareFollowings(User capKidd, User redbeard, User blackbeard,
			User jack) {
		capKidd.addFollower(redbeard);
		capKidd.addFollower(blackbeard);
		capKidd.addFollower(jack);

		capKidd.addFollowing(redbeard);
		capKidd.addFollowing(blackbeard);
		capKidd.addFollowing(jack);
		
		redbeard.addFollower(blackbeard);
		
		jack.addFollowing(blackbeard);
		jack.addFollowing(redbeard);
	}

	private User buildUser(String username, String name, String description) {
		User user = new User();
		user.setId(userId++);
		user.setUsername(username);
		user.setPassword(PASSWORD);
		user.setFullName(name);
		user.setDescription(description);
		user.setFollowers(new LinkedList());
		user.setFollowing(new LinkedList());
		return user;
	}
	
	public static MockDataBase getInstance(){
		
		return instance;
	}
	
}
