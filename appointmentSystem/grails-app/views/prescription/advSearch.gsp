<!doctype html> 
<html> 
<head>     
<meta name="layout" content="main"/>     
<title>Doctor | Adv Search</title>     
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
    <h1>Prescription Search</h1>
        <formset>
                <legend> Advanced Search for Prescription</legend>
                <table>
                    <g:form action="advResults">
                        <tr>
                            <td>Medicine: </td>
                            <td><g:textField name="medicine"/></td>
                        </tr
                        <tr>
                            <td>Total Cost: </td>
                            <td><g:textField name="totalCost"/></td>
                        </tr>
                        <tr>
                            <td>Days of Supply: </td>
                            <td><g:textField name="daysOfSupply"/></td>
                        </tr>
                        <tr>
                            <td>Query Type: </td>
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
