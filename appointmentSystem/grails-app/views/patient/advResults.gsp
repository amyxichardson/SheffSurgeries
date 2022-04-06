<!doctype html> 
<html> 
<head>     
<meta name="layout" content="main"/>     
<title>Receptionist | Adv Patient Search</title>     
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
            <h1> Patient Search </h1>
            <h3> Advanced Results </h3>
            <p> Searched for patients matching <em>${term}</em>. Found <strong>${patients.size()}</strong> patients.
            </p>
            <ul>
                <g:each var="patient" in="${patients}">
                    <li><g:link controller="patient" action="show" id="${patient.id}">${patient.patientName}</g:link></li>
                </g:each>
            </ul>
            <button type="button" class="btn">
            <g:link action='advSearch'>Search Again</g:link>
            </button>
        </div>
</body>
</html>

