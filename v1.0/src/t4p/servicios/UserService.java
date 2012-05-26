package t4p.servicios;

import java.util.Collection;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.collections.Predicate;

import t4p.model.Tweet;
import t4p.model.User;
import t4p.persistence.DaoFactory;
import t4p.persistence.MockDataBase;
import t4p.persistence.OurUserDao;

public class UserService {
	private static UserService instance = new UserService();
	
	private UserService(){
		
	}

	public static UserService getInstance(){
		return instance;
	}

	public boolean verifyUser(String user, String pass) {
		
		return (OurUserDao.getInstance().verifyUser(user, pass));
	}
	
	public User findByUsername(String user){
		return (OurUserDao.getInstance().findByUsername(user));
	}

	public User findById(Long id) {
		return(OurUserDao.getInstance().findById(id));
		
	}

	public boolean removeFollowing(User nuevoUsuario, User usuario) {
		return (OurUserDao.getInstance().removeFollowing(nuevoUsuario,usuario));
		
	}

	public boolean removeFollower(User nuevoUsuario, User usuario) {
		return(OurUserDao.getInstance().removeFollower(nuevoUsuario,usuario));
		
	}
	


}
