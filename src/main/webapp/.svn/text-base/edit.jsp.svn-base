<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="java.util.List"%>
    <%@page import="java.util.Collection"%>
    <%@page import="t4p.model.Tweet" %>
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
    	
  	  	<div id="imgUser">
  	  		<img src="img/<%=usuario.getUsername()%>100.png">
  	  	</div>
		<div id="usuario">
           <form action="editprofile.do" method="post">
            <p>Usuario : <input type="text" id="fullName" name="fullName" value="<%=usuario.getFullName()%>" /></p>
            <p>Username: @<input type="text" id="userName" name="userName" value="<%=usuario.getUsername()%>"/> </p>
            <p>Descripcion: <input type="text" id="description" name="description" value="<%=usuario.getDescription() %>" /></p>
            <p><input type="submit" id="cambios" name="cambios" value="Guardar Cambios"><a href="profile.do"><input type="button" value="Cancelar"></a></p> 
            </form>
       	</div>
            
        
     </div>
</div>
</body>
</html>