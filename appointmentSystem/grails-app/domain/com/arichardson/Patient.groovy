package com.arichardson

class Patient {
// declaring variables
    String patientID
    String patientName
    String patientAddress
    String patientResidence
    Date patientDob
    Date dateRegistered
    String patientPhone
    Doctor doctor
    Surgery surgery

    String toString(){
    return patientName
    }

    static constraints = {
// declaring constraints
    patientID blank:false, unique:true, nullable: false
    patientName blank: false, nullable: false
    patientAddress blank: false, nullable: false
    patientResidence blank:false, nullable: false
    patientDob blank: false, nullable: false
    dateRegistered blank: false, nullable: false
    patientPhone blank: false, nullable: false
    doctor blank: false, nullable: false
    surgery blank: false, nullable: false
    }

// defining the relationships
static hasMany = [prescription:Prescription, surgery:Surgery, doctor:Doctor]

}
