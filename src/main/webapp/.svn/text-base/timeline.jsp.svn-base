<%@page import="java.util.Collection"%>
<%@page import="java.util.Collections"%>
<%@page import="java.util.Map" %>
<%@page import="java.util.List"%>
<%@page import="t4p.model.Tweet" %>
<%@page import="t4p.model.User" %>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%
    
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Aaarrgh!</title>
<link rel="stylesheet" href="css/styles.css" />
<script type="text/javascript" src="js/jquery-1.5.1.min.js"></script>
<script type="text/javascript" src="js/functions.js"></script>

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
    	<div id="tweet">
    	  <form id="comentario" action="newTweet.do" method="post">
    	  <textarea placeholder="Que ocurre, marinero?" id="tw" name="newTweet"></textarea><br /><br />
    	  <!--<input type="text" placeholder="Que ocurre, marinero?" id="tw" />-->
    	  <input type="hidden" value="<%=(String)request.getAttribute("usuario")  %>" id="userName" name="userName" />
    	  <input type="submit" value="Aaarrghh!" id="postear" name="postear" />
    	  </form>
        </div>
        <div id="perfil" class="texto"> 
            <p><span class="username"><%=(String)request.getAttribute("usuario")%></span></p>
            <p><span>Improperios </span><span style="float:right;"><%=request.getAttribute("improperios") %></span></p>
           <p><span>Piratas que sigues</span></p>
            <p>
	            <% List <User> following = (List<User>) request.getAttribute("siguiendo");
	        	 		for(User u : following){%>
	        	 			<span><a href="others.do?profile=<%=u.getId()%>"><img src="img/<%=u.getUsername()%>25.png"/></a></span>
	        	 <%		}
	        	 %>
        	</p>
            <p><span>Piratas que te siguen</span></p>
            <p>
	            <% List <User> followers = (List<User>) request.getAttribute("seguidores");
	        	 		for(User u : followers){%>
	        	 			<span><a href="others.do?profile=<%=u.getId()%>"><img src="img/<%=u.getUsername()%>25.png"/></a></span>
	        	 <%		}
	        	 %>
            </p>
          </div>
        <div id="timeline">
         	<%  Collection<Tweet> tweets = (List<Tweet>) request.getAttribute("allUserTweets");
				for(Tweet unTweet: tweets){
		        	%>
		        	
		        	<div id="tweetItem">
		        		<div id="itemPicture">
		        			<img src="img/<%=unTweet.getAuthor().getUsername()%>40.png"/>
		        			<a class="infoLink" href="others.do?profile=<%=unTweet.getAuthor().getId()%>"><%=unTweet.getAuthor().getUsername()%></a>
		        		</div>
		        		<div class="separator"></div>
		        		<div id="itemInfo">
		        			<div class="infoText"><%= unTweet.getText()%></div>
		        			<div class="infoDate"><%= unTweet.getTimestamp()%></div>
		        		</div>
		        	</div>
		        	<% 
       			 }
        	%> 
        </div>	
      </div>
</div>
</body>
</html>
