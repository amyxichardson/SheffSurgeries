<!doctype html> 
<html> 
<head>     
<meta name="layout" content="main"/>     
<title>Doctor | Homepage</title>     
<style>         
body{
text-align: center;
font-family: monospace;
font-size:35px;
line-height: 1.5;
padding-left: 50px}
.button{
background-color: #B0E0E6;
color: black;
padding: 15px 32px;
text-align: center;
font-size: 25px;}
</style> 
</head>  

<body>
<h1>Doctor | Homepage</h1>
<div id="content" role="main">


<div class="first">
<h3>Prescriptions</h3>
<p>Add, view, delete prescriptions</p></br>
<button type="button" class="button">
<g:link controller="prescription" action="index">Prescription list</g:link>
</button>
<button type="button" class="button">
<g:link controller="prescription" action="create">Add Prescription</g:link>
</button>

</div>
</br>

<div class="second">
<h3>Patients</h3>
<p>View patients</p></br>
<button type="button" class="button">
<g:link controller="patient" action="index">Patient list</g:link>
</button>
</div>
</br>

<div class="third">
<h3>Appointments</h3>
<p>AView Appointments</p></br>
<button type="button" class="button">
<g:link controller="appointments" action="index">Appointment list</g:link>
</button>
</div>
</br>

</div>
</div>
</body>
</html>
