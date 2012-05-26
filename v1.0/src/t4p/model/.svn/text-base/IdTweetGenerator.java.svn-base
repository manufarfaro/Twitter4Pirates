package t4p.model;

import java.util.Collection;

import t4p.model.Tweet;

public class IdTweetGenerator {
	
	static IdTweetGenerator instance = new IdTweetGenerator();
	Collection<Tweet> BaseCollection = null;
	long ID = 1L;
	
	private IdTweetGenerator(){
		
	}
	
	public void setBaseCollection(Collection<Tweet> CollectionToInsert){
		this.BaseCollection = CollectionToInsert;
	}
	
	public Long GenerateId(){
		if(this.BaseCollection != null){
			this.ID = this.BaseCollection.size();
		}
		return(++this.ID);
	}

	public static IdTweetGenerator getInstance(){
		return (instance);
	}
	
}
