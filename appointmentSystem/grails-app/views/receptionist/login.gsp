<!doctype html> 
<html> 
<head>     
<meta name="layout" content="main"/>     
<title>Login to appointment system</title>     
<style>         
body{
background-color: #B0E0E6;
text-align: center;
font-family: monospace;
font-size:35px;
line-height: 1.5;}
</style> 
</head>  

<body>    
</br>
</br>
<g:if test="${session.user}">
<br/>
</g:if>
<g:else>
<g:form controller="receptionist" action="login" style="padding-left:200px">    
<div style="width:220px">        
<label>Username:</label> <input type="text" name="username"/> </br>       
<label>Password:</label> <input type="password" name="password"/>        
<label>&nbsp;</label> <input type="submit" value="Login"/>    
</div>    
</g:form> 
</g:else>
</body> 
</html>
