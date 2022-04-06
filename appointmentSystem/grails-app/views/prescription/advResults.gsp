<!doctype html> 
<html> 
<head>     
<meta name="layout" content="main"/>     
<title>Doctor | Adv Prescription Search</title>     
<style>         
.results{
text-align: center;
font-family: monospace;
font-size:35px;
line-height: 1.5;
padding-left: 50px}
</style> 
</head> 
<body>
 
        <div class="results">
            <h1> Prescription Search </h1>
            <h3> Advanced Results </h3>
            <p> Searched for prescriptions matching <em>${term}</em>. Found <strong>${prescriptions.size()}</strong> prescriptions.
            </p>
            <ul>
                <g:each var="prescription" in="${prescriptions}">
                    <li><g:link controller="prescription" action="show" id="${prescription.id}">${prescription.prescripNumber}</g:link></li>
                </g:each>
            </ul>
            <button type="button" class="btn">
            <g:link action='advSearch'>Search Again</g:link>
            </button>
        </div

</body>
</html>

