package com.arichardson

class Appointment {
// declaring variables...   
    int appointmentID
    Date appDate
    String appTime
    int appDuration
    String roomNumber
    String patient

    static constraints = {
// declaring constraints for entered data...
    appointmentID blank:false, nullable: false, unique: true
    appDate blank:false, nullable: false
    appTime blank:false, nullable: false
    appDuration blank:false, nullable: false, min:15
    roomNumber blank:false, nullable: false
    patient blank:false, nullable: false
    }
}
