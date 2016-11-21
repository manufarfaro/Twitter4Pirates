package t4p.persistence;

import org.apache.commons.collections.Predicate;

import t4p.model.User;

public class UserPredicate implements Predicate {
	
	private String user;
	
	public UserPredicate(String user2) {
		this.user = user2;

	}
	
	
	@Override
	public boolean evaluate(Object arg0) {
		User u = (User) arg0;
		return (u.getUsername().equals(user));
		
	}

}
