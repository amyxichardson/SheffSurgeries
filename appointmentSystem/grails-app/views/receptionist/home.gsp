<!doctype html> 
<html> 
<head>     
<meta name="layout" content="main"/>     
<title>Receptionist | Homepage</title>     
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
<h1>Receptionist | Homepage</h1>
<div id="content" role="main">


<div class="first">
<h3>Patients</h3>
<p>Add, view, assign, delete patients</p></br>
<button type="button" class="button">
<g:link controller="patient" action="index">Patient list</g:link>
</button>
<button type="button" class="button">
<g:link controller="patient" action="create">Add Patients</g:link>
</button>
<button type="button" class="button">
<g:link controller="patient" action="advSearch">Patient Search</g:link>
</button>
</div>
</br>

<div class="second">
<h3>Doctors</h3>
<p>Add, view, delete doctors</p></br>
<button type="button" class="button">
<g:link controller="doctor" action="index">Doctor list</g:link>
</button>
<button type="button" class="button">
<g:link controller="doctor" action="create">Add Doctors</g:link>
</button>
</div>
</br>

<div class="third">
<h3>Nurses</h3>
<p>Add, view, assign, delete nurses</p></br>
<button type="button" class="button">
<g:link controller="nurse" action="index">Nurse list</g:link>
</button>
<button type="button" class="button">
<g:link controller="nurse" action="create">Add nurses</g:link>
</button>
</div>
</br>

<div class="fourth">
<h3>Receptionists</h3>
<p>Add, view, delete receptionists</p></br>
<button type="button" class="button">
<g:link controller="receptionist" action="index">Receptionist list</g:link>
</button>
<button type="button" class="button">
<g:link controller="receptionist" action="create">Add receptionists</g:link>
</button>
</div>
</br>

<div class = "fifth">
<h3> File Upload </h3>
<g:form action="upload" enctype="multipart/form-data" useToken="true">
<span class="button">                   
<input type="file" name="filecsv"/>
<input type="submit" class="upload" value="upload"/>
</span>
</g:form>
</div>

</div>
</div>
</body>
</html>
