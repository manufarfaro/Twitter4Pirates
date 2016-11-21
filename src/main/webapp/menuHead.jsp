<%@page import="ar.edu.unlam.t4p.model.User" %>
<%@page import="ar.edu.unlam.t4p.acciones.SessionConstants" %>
<nav>
			<ul>
				<%  User usuario = (User)request.getSession().getAttribute(SessionConstants.USER);%>
				<li id="inicio">
                    <a href="timeline.do">Inicio</a>
                </li>
                
                 <li id="profile">
                    <a href="profile.do">Perfil</a>
                </li>
                
                <li id="signup">
                    <a href="logout.do">Abandonar el barco</a>
                </li>
			</ul>
</nav>	