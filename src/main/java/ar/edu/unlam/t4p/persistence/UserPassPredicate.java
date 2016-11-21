package ar.edu.unlam.t4p.persistence;

import org.apache.commons.collections.Predicate;

import ar.edu.unlam.t4p.model.User;

public class UserPassPredicate implements Predicate {

	private String user;
	private String pass;

	public UserPassPredicate(String user, String pass) {
		this.user = user;
		this.pass = pass;
	}

	@Override
	public boolean evaluate(Object arg0) {
		User u = (User) arg0;
		return (u.getUsername().equals(user) && u.getPassword().equals(pass));
	}

}
