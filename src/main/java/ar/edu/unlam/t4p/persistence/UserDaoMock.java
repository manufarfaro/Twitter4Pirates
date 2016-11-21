package ar.edu.unlam.t4p.persistence;

import java.util.Collection;

import ar.edu.unlam.t4p.model.User;


public class UserDaoMock implements UserDao {

	@Override
	public Collection<User> findAll() {
		return MockDataBase.getInstance().users.values();
	}

	@Override
	public User findById(Long id) {
		return MockDataBase.getInstance().users.get(id);
	}

	@Override
	public boolean delete(User user) {
		if (MockDataBase.getInstance().users.containsValue(user)) {
			MockDataBase.getInstance().users.remove(user.getId());
			return true;
		}
		return false;
	}

	@Override
	public void insert(User user) {
		MockDataBase.getInstance().users.put(user.getId(), user);
	}

	@Override
	public void update(User user) {
		MockDataBase.getInstance().users.put(user.getId(), user);
	}

}
