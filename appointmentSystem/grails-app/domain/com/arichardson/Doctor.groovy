package com.arichardson

class Doctor {
// delcaring variables...
    int doctorID
    String fullName
    String qualification
    String position
    String doctorEmail
    String password
    String doctorOffice
    String doctorPhone
    String bio
    Surgery surgery

    String toString(){
    return fullName
    }

    static constraints = {
// declaring constraints...
    doctorID blank: false, nullable: false, unique: true, min:1
    fullName blank: false, nullable: false
    qualification blank: false, nullable: false
    position blank: false, nullable: false
    doctorEmail blank: false, nullable: false, email: true
    password size: 8..15, blank: false, nullable: false, password:true
    doctorOffice blank: false, nullable: false
    doctorPhone blank: false, nullable: false
    bio size: 25..250, blank: false, nullable: false
    surgery blank: false, nullable: false
    }

// defining the relationships
static belongsTo = [surgery:Surgery]
static hasMany = [nurse:Nurse, appointment:Appointment, prescription:Prescription, patient:Patient]
}
