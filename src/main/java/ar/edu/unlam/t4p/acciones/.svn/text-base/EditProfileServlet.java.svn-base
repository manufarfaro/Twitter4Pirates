package t4p.acciones;

import java.io.IOException;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import t4p.model.User;
import t4p.servicios.ServiceLocator;
import t4p.servicios.UserService;

/**
 * Servlet implementation class EditProfileServlet
 */
@WebServlet("/editprofile.do")
public class EditProfileServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EditProfileServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		UserService userService =  ServiceLocator.getInstance().getUserService();
	
		User usuario = (User)request.getSession().getAttribute(SessionConstants.USER);
		
		String fullName = request.getParameter("fullName");
		String userName = request.getParameter("userName");
		String description = request.getParameter("description");
		
		if(!fullName.equals(usuario.getFullName())){
			usuario.setFullName(fullName);
		}
		if(!userName.equals(usuario.getUsername())){
			usuario.setUsername(userName);
		}
		if(!description.equals(usuario.getDescription())){
			usuario.setDescription(description);
		}
		
		request.setAttribute("hola", userName);
		RequestDispatcher ruta = request.getRequestDispatcher("editOk.jsp");
		ruta.forward(request,response);
		
	}

}
