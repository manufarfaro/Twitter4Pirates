package t4p.acciones;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import t4p.model.User;
import t4p.persistence.DaoFactory;
import t4p.servicios.ServiceLocator;
import t4p.servicios.UserService;

/**
 * Servlet implementation class FollowServlet
 */
@WebServlet("/follow.do")
public class FollowServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FollowServlet() {
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
		
		String datoUsuario = request.getParameter("datoUsuario");
		User nuevoUsuario = userService.findByUsername(datoUsuario);
		String idUser = String.valueOf(nuevoUsuario.getId());
		
		
		usuario.addFollowing(nuevoUsuario);
		nuevoUsuario.addFollower(usuario);
		
		
		
		request.setAttribute("usuarioPerfil", nuevoUsuario);
		
		String dispatcherPage = "others.do?profile=".concat(idUser);

		
		RequestDispatcher ruta = request.getRequestDispatcher(dispatcherPage);
		ruta.forward(request, response);
	}

}
