package ar.edu.unlam.t4p.acciones;

import java.io.IOException;
import java.util.Collection;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ar.edu.unlam.t4p.model.IdTweetGenerator;
import ar.edu.unlam.t4p.model.Tweet;
import ar.edu.unlam.t4p.model.User;
import ar.edu.unlam.t4p.servicios.ServiceLocator;
import ar.edu.unlam.t4p.servicios.TweetService;
import ar.edu.unlam.t4p.persistence.DaoFactory;



/**
 * Servlet implementation class NewTweetServlet
 */
@WebServlet("/newTweet.do")
public class NewTweetServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public NewTweetServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doPost(request,response);
	}

	/**import ar.edu.unlam.t4p.servicios.ServiceLocator;
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String dispatcherPage = "timeline.do";
		String tweetText = request.getParameter("newTweet");
		String userName = request.getParameter("userName");
		User tweetAuthor = ServiceLocator.getInstance().getUserService().findByUsername(userName); 
		
		TweetService tweetService = ServiceLocator.getInstance().getTweetService();
		Collection<Tweet> allTweets = tweetService.getAllTweets(tweetAuthor);
		
		IdTweetGenerator IdTweetGenerated = IdTweetGenerator.getInstance();
		IdTweetGenerated.setBaseCollection(allTweets);
		
		Long IdTweet = IdTweetGenerated.GenerateId();
		
		Tweet newTweet = new Tweet();
		
		newTweet.setAuthor(tweetAuthor);
		newTweet.setText(tweetText);
		newTweet.setTimestamp(new Date());
		newTweet.setId(IdTweet);
		
		DaoFactory.getInstance().getTweetDao().insert(newTweet);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(dispatcherPage);
		dispatcher.forward(request, response);
	}

}
