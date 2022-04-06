package com.arichardson

class PrescriptionController {

    def scaffold=Prescription

    def advSearch(){
		render view: 'advSearch'
	}

	def advResults(){
		def prescriptionProps = Prescription.metaClass.properties*.name

		def prescriptions = Prescription.withCriteria{
			"${params.queryType}"{

					params.each {field, value ->
					if (prescriptionProps.grep(field) && value){
						ilike(field, value)
					}
				}
			}
		}
		return [prescriptions:prescriptions]
	}

}
