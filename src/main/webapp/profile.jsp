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
  			String username = usuario.getUsername();
    		List <User> following = (List<User>) request.getAttribute("siguiendo");
    		List <User> followers = (List<User>) request.getAttribute("seguidores");
    	
  	  	%>
  	  	<div id="imgUser">
  	  		<img src="img/<%=username%>100.png">
  	  	</div>
		<div id="usuario">
            <p class="username"><%=usuario.getFullName()%> (@<%=username%>)</p>
            <p><%=usuario.getDescription() %> </p>
            <p><span><a href="edit.jsp?user=<%=usuario.getId()%>">Editar Perfil</a></span>
            <span>Improperios <%=request.getAttribute("improperios") %></span>
            <span>Seguidores <%=followers.size() %></span>
            <span>Siguiendo <%=following.size() %></span>
            </p>
       	</div>
       	
       	<!-- Pestañas -->
       	<ul class="tabs">
	        <li><a href="#improperios">Improperios</a></li>
	        <li><a href="#siguiendo">Siguiendo</a></li>
	        <li><a href="#seguidores">Seguidores</a></li>
	        <li><a href="#menciones">Menciones</a></li>
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
        	<div id="menciones" class="tab_content">
        		<div id="datos">
        		</div>
        	</div>

            
        </div>
        	
      </div>
</div>
</body>
</html>