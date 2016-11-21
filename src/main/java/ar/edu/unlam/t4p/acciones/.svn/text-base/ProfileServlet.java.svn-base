package t4p.acciones;

import java.io.IOException;
import java.util.Collection;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import t4p.model.Tweet;
import t4p.model.User;
import t4p.servicios.ServiceLocator;
import t4p.servicios.TweetService;
import t4p.servicios.UserService;

/**
 * Servlet implementation class ProfileServlet
 */
@WebServlet("/profile.do")
public class ProfileServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProfileServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		UserService userService =  ServiceLocator.getInstance().getUserService();
		User usuario = (User)request.getSession().getAttribute(SessionConstants.USER);
		
		List<User> followers = usuario.getFollowers();
		List<User> following = usuario.getFollowing();
		
	
		TweetService tweetService = ServiceLocator.getInstance().getTweetService();
		String username = usuario.getUsername();
		
		int numberOfTweets = tweetService.getNumberOfTweets(usuario);
		
		Collection<Tweet> allTweets = tweetService.getTweetByUser(usuario);

		request.setAttribute("siguiendo", following);
		request.setAttribute("seguidores", followers);
		request.setAttribute("improperios", numberOfTweets);
		request.setAttribute("tweetsUsuario", allTweets);

		
		RequestDispatcher ruta = request.getRequestDispatcher("profile.jsp");
		ruta.forward(request, response);
		
	}

}
