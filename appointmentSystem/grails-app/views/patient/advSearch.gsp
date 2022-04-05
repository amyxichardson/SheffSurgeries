<!doctype html> 
<html> 
<head>     
<meta name="layout" content="main"/>     
<title>Receptionist | Adv Search</title>     
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
<h1>Appointment System Adv Patient Search</h1>
<formset>
<legend>Advanced Search for Patients </legend>
<table>
<g:form action="advResults">
<tr>
<td>Name</td>
<td><g:textField name="name"/></td>
</tr>

<tr>
<td>PatientID</td>
<td><g:textField name="patientID"/></td>
</tr>

<tr>
<td>Patient Residence</td>
<td><g:textField name="patientResidence"/></td>
</tr>

<tr>
<td>Query Type:</td>
<td><g:radioGroup name="queryType" labels="['And','Or','Not']"
values="['And','Or','Not']"value="and">
${it.radio}${it.label}
</g:radioGroup>
</td>
</tr>

<tr>
<td/>
<td>
<g:submitButton name="search" value="Search"/></td>
</tr>
</g:form>
</table>
</formset>
</div>
</body>
</html>


