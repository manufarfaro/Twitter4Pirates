package ar.edu.unlam.t4p.persistence;

import java.util.Collection;

import ar.edu.unlam.t4p.model.Tweet;


public class TweetDaoMock implements TweetDao {

	@Override
	public Collection<Tweet> findAll() {
		return MockDataBase.getInstance().tweets.values();
	}

	@Override
	public Tweet findById(Long id) {
		return MockDataBase.getInstance().tweets.get(id);
	}

	@Override
	public boolean delete(Tweet tweet) {
		if (MockDataBase.getInstance().tweets.containsValue(tweet)) {
			MockDataBase.getInstance().tweets.remove(tweet.getId());
			return true;
		}
		return false;
	}

	@Override
	public void insert(Tweet tweet) {
		MockDataBase.getInstance().tweets.put(tweet.getId(), tweet);
	}

	@Override
	public void update(Tweet tweet) {
		MockDataBase.getInstance().tweets.put(tweet.getId(), tweet);
	}

}
