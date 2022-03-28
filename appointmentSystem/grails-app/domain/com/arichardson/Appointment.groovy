package com.arichardson

class Appointment {
// declaring variables...   
    int appointmentID
    Date appDate
    String appTime
    int appDuration
    String roomNumber
    Doctor doctor
    Patient patient
    Surgery surgery

    String toString(){
    return appDate
    }

    static constraints = {
// declaring constraints for entered data...
    appointmentID blank:false, nullable: false, unique: true, min:1
    appDate blank:false, nullable: false
    appTime blank:false, nullable: false
    appDuration blank:false, nullable: false, min:15
    roomNumber blank:false, nullable: false
    doctor blank:false, nullable: false
    patient blank:false, nullable: false
    surgery blank:false, nullable: false
    }

// defining the relationships
static belongsTo = [doctor:Doctor, patient:Patient]
static hasMany = [surgery:Surgery]

}
