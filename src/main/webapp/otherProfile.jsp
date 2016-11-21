<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="java.util.List"%>
    <%@page import="java.util.Collection"%>
    <%@page import="ar.edu.unlam.t4p.model.Tweet" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Aaarrgh!</title>

<link rel="stylesheet" href="css/style-tabs.css" type="text/css" />
<link rel="stylesheet" href="css/styles.css" />
<script type="text/javascript" src="js/jquery-1.5.1.min.js"></script>
<script type="text/javascript" src="js/functions.js"></script>
<script type="text/javascript" src="js/tabs.js"></script>

</head>
<body>
<div id="contenedor">
	<div id="navegacion">
    <div id="imgLogo">
			<img src="img/t4p.png" height ="50"id="logo"/>
		</div>  
		<div class="titulos">
<!-- Inicio de Elementos de Menu  -->
			<%@ include file="menuHead.jsp" %>
<!-- Fin de Elementos de Menu -->
		</div> 
  </div>	
    
    <div id="contenido">
    	<%	
  			User usuarioPerfil = (User)request.getAttribute("usuarioPerfil");
    		List <User> following = (List<User>) request.getAttribute("siguiendo");
    		List <User> followers = (List<User>) request.getAttribute("seguidores");
  	  	%>
  	  	<div id="imgUser">
  	  		<img src="img/<%=usuarioPerfil.getUsername()%>100.png">
  	  	</div>
		<div id="usuario">
            <p class="username"><%=usuarioPerfil.getFullName()%> (@<%=usuarioPerfil.getUsername()%>)</p>
            <p><%=usuarioPerfil.getDescription() %> </p>
			
			<!-- Follow / UnFollow -->	            
            <p><% List <User> followingMe = usuario.getFollowing();
	 				for(User u : followingMe){	
	 					if(u.getUsername().equals(usuarioPerfil.getUsername())){
	 						%><span>
	 						<form  action="unfollow.do" method="post">
	 						<input type="hidden" value="<%=usuarioPerfil.getUsername()%>" id="datoUsuario" name="datoUsuario">
	 						<input type="submit" value="Dejar de seguir!" id="noSeguir" name="noSeguir" />
	 						</span>
	 						</form><%
	 					}else{%>
	 						<form  action="follow.do" method="post">
	 						<span>
	 						<input type="hidden" value="<%=usuarioPerfil.getUsername()%>" id="datoUsuario" name="datoUsuario">
	 						<input type="submit" value="Aye,seguir!" id="seguir" name="seguir" />
	 						</span>
	 						</form>
	 					<%
	 					}
	 				}
            	%>	
            
            <span>Improperios <%=request.getAttribute("improperios") %></span>
            <span>Seguidores <%=following.size() %></span>
            <span>Siguiendo <%=followers.size() %></span>
            </p>
       	</div>
       	
       	<!-- Pestañas -->
       	<ul class="tabs">
	        <li><a href="#improperios">Improperios</a></li>
	        <li><a href="#siguiendo">Siguiendo</a></li>
	        <li><a href="#seguidores">Seguidores</a></li>
	        
	    </ul>
        <div id="pestañas" class="tab_container"> 
      	 	<div id="improperios" class="tab_content">
        		<div id="datos">
        		<%Collection<Tweet> tweets = (Collection<Tweet>) request.getAttribute("tweetsUsuario");
        
			        for(Tweet unTweet: tweets){
			        	%>
			        	<div><%= unTweet.getText()%><br>
			        		<%=unTweet.getTimestamp() %><br>
			        		
			        	</div>
			        	<% 
       				 }
        		%>
        		</div>
        	</div>
        	<div id="siguiendo" class="tab_content">
        		<div id="datos">
	        		<%
	    	 			for(User u : following){%>
		 				<p><img src="img/<%=u.getUsername()%>40.png"/>
		 					<a href="others.do?profile=<%=u.getId()%>">@<%=u.getUsername() %></a><br>
		 					<%=u.getDescription() %>
		 				</p>
		 				<%} 
	        		%> 
        		</div>
        	</div>
        	<div id="seguidores" class="tab_content">
        		<div id="datos">
	        		<%
	    	 			for(User u : followers){%>
		 				<p><img src="img/<%=u.getUsername()%>40.png"/>
		 					<a href="others.do?profile=<%=u.getId()%>">@<%=u.getUsername() %></a><br>
		 					<%=u.getDescription() %>
		 				</p>
		 				<%} 
	        		%> 
        		</div>
        	</div>
        	           
        </div>
        	
      </div>
</div>
</body>
</html>