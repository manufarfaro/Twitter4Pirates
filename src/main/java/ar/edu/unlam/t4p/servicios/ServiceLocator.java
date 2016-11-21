package ar.edu.unlam.t4p.servicios;


public class ServiceLocator {

private static ServiceLocator instance = new ServiceLocator();
	
	private ServiceLocator(){
		
	}
	
	
	public static ServiceLocator getInstance(){
		return instance;
	}
	
	public UserService getUserService(){
		return UserService.getInstance();
	}
	
	public TweetService getTweetService(){
		return TweetService.getInstance();
	}
}
