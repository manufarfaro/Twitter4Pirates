package ar.edu.unlam.t4p.persistence;

public class DaoFactory {

	private static DaoFactory instance = new DaoFactory();

	private DaoFactory() {

	}

	public static DaoFactory getInstance() {
		return instance;
	}

	public TweetDao getTweetDao() {
		return new TweetDaoMock();
	}

	public UserDao getUserDao() {
		return new UserDaoMock();
	}

}
