<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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
		<nav>
			<ul>
			   <li id="login">
                    <a id="login-trigger" href="#">
                         Inicie Sesi&oacute;n<span>&#x25BC;</span>
                    </a>
                    <div id="login-content">
                        <form action="${pageContext.servletContext.contextPath}/login.do" method="post">
                            <fieldset id="inputs">
                                <input id="username" type="text" name="username" placeholder="Usuario" required>
                                <input id="password" type="password" name="password" placeholder="Password" required>
                            </fieldset>
                            <fieldset id="actions">
                                <input type="submit" id="submit" value="Login">
                            </fieldset>
                        </form>
                    </div>
                </li>
              
			</ul>
		</nav>	
		</div> 
  </div>	
    
    <div id="contenido">
    	<img src="img/welcome.png" id="home"/>
	</div>



</div>
</body>
</html>