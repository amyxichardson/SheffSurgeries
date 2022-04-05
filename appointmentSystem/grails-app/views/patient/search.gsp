<!doctype html> 
<html> 
<head>     
<meta name="layout" content="main"/>     
<title>Receptionist | Patient Search</title>     
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
<h1>Patient Search</h1>
</br>
<formset>
<legend>Search for Patients(Simple)</legend></br>
<g:form action="results">
<label for="name">Patient Name</label>
<g:textField name="name"/></br>
<g:submitButton name="search" value="Search"/>
</g:form>
</formset>
</div>
</body>
</html>


