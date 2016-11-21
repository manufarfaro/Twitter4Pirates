package ar.edu.unlam.t4p.persistence;

import java.util.Collection;

import ar.edu.unlam.t4p.model.Tweet;


public interface TweetDao {

	public abstract Collection<Tweet> findAll();

	public abstract Tweet findById(Long id);

	public abstract boolean delete(Tweet tweet);

	public abstract void insert(Tweet tweet);

	public abstract void update(Tweet tweet);

}