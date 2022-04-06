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
<div class="search-form">
    <h1>Patient Search</h1>
        <formset>
                <legend> Advanced Search for Patients</legend>
                <table>
                    <g:form action="advResults">
                        <tr>
                            <td>Patient Name: </td>
                            <td><g:textField name="patientName"/></td>
                        </tr>
                        <tr>
                            <td>Patient ID: </td>
                            <td><g:textField name="patientID"/></td>
                        </tr>
                        <tr>
                            <td>Patient residence</td>
                            <td><g:textField name="patientResidence"/></td>
                        </tr>
                        <tr>
                            <td>Query Type:</td>
                            <td><g:radioGroup name="queryType" labels="['And', 'Or', 'Not']" values="['and', 'or', 'not']" value="and"> ${it.radio} ${it.label}</g:radioGroup>
                            </td>
                        </tr>
                        <tr>
                            <td> <g:submitButton name="search" value="Search"/></td>
                        </tr>
                    </g:form>
                </table>
            </formset>
</div>

</body>
</html>
