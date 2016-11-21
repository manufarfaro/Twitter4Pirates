package t4p.persistence;

import java.util.List;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.collections.Predicate;

import t4p.model.User;

public class OurUserDao {
	
	private static OurUserDao instance = new OurUserDao();
	
	private OurUserDao(){
		
	}
	
	public static OurUserDao getInstance(){
		return instance;
	}
	
	public boolean verifyUser(final String user, final String pass){
		
		Predicate predicate = new UserPassPredicate(user,pass);
		
		User anUser = (User)CollectionUtils.find(MockDataBase.getInstance().users.values(),predicate);
		
		if (anUser == null)
			return false;
		
		return true;
			
		}
	
	public User findByUsername(String user){
		
	Predicate predicate = new UserPredicate(user);	
		User  a = (User) CollectionUtils.find(MockDataBase.getInstance().users.values(), predicate);
				
		return a;
		
	}

	public User findById(Long id) {
		
		
		return( DaoFactory.getInstance().getUserDao().findById(id));
		
	}

	public boolean removeFollowing	(User nuevoUsuario, User usuario) {

		List<User> following = usuario.getFollowing();
		
			if (following.contains(nuevoUsuario)) {
				following.remove(nuevoUsuario);
				return true;
			} 
			return false;
		}

	public boolean removeFollower(User nuevoUsuario, User usuario) {
		List<User> follower = nuevoUsuario.getFollowers();
		
		if (follower.contains(usuario)) {
			follower.remove(usuario);
			return true;
		} 
		return false;
	}	
		
	

	
}
