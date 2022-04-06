package com.arichardson

class Prescription {
// declaring variables
    String prescripNumber
    String pharmacyName
    String medicine
    String totalCost
    Date dateIssued
    Boolean patientPaying
    Patient patient
    Doctor doctor
    String daysOfSupply

    String toString(){
    return prescripNumber
    }

    static constraints = {
//declaring constraints
    prescripNumber blank: false, unique: true, nullable: false
    pharmacyName blank: false, nullable: false
    medicine blank: false, nullable: false
    totalCost blank: false, scale: 2, nullable: false
    dateIssued blank: false, nullable: false
    patientPaying blank: false, nullable: false
    patient blank:false, nullable: false
    doctor blank:false, nullable: false    
    daysOfSupply blank:false, nullable: false    
} 

// defining the relationships
static belongsTo = [doctor:Doctor, patient:Patient]
}
