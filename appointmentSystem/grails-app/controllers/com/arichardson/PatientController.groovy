package com.arichardson

class PatientController {

	def scaffold=Patient

	def advSearch(){
		render view: 'advSearch'
	}

	def advResults(){
		def patientProps = Patient.metaClass.properties*.name

		def patients = Patient.withCriteria{
			"${params.queryType}"{

					params.each {field, value ->
					if (patientProps.grep(field) && value){
						ilike(field, value)
					}
				}
			}
		}
		return [patients:patients]
	}
	
    
}

