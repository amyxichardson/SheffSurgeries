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

    static constraints = {
// declaring constraints
    patientID blank:false, unique:true, nullable: false
    patientName blank: false, nullable: false
    patientAddress blank: false, nullable: false
    patientResidence blank:false, nullable: false
    patientDob blank: false, nullable: false
    dateRegistered blank: false, nullable: false
    patientPhone blank: false, nullable: false
    }
}
