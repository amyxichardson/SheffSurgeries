<!doctype html> 
<html> 
<head>     
<meta name="layout" content="main"/>     
<title>Receptionist | Search</title>     
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
<div clas="row">
 <h1>Appointment System</h1>
<h3>Search results</h3>
<p>
searched ${totalPatients} records
for items matching <em>${term}</em>
Found <strong>${patients.size()}</strong> patients.
</p>

<ul>
<g:each var="patient"in="${patients}">
<li><g:link controller="patient" action="show"
id="${patient.patientID}">${patient.patientName}</g:link></li>
</g:each>
</ul>

<button type="button" class="btn btn-success">
<g:link action='search'>Search Again</g:link>
</button>
</div>
</body>
</html>
