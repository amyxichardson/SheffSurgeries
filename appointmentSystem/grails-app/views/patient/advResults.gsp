<!doctype html> 
<html> 
<head>     
<meta name="layout" content="main"/>     
<title>Receptionist | Adv Patient Search</title>     
<style>         
body{
text-align: center;
font-family: monospace;
font-size:35px;
line-height: 1.5;
padding-left: 50px}
</style> 
</head>  

<body>
<div class="row">
<h1>Adv Patient Search</h1>
<p>Searched 
for patients matching <em>${term}</em>.
Found <strong>${patients.size()}</strong> patients.
</p>
<ul>
<g:each var="patient" in="${patients}">
<li><g:link controller="patient" action="show"
id="${patient.id}">${patient.patientName}</g:link></li>
</g:each>
</ul>

<g:link action='advSearch'>Search Again</g:link>
</div>
</body>
</html>

