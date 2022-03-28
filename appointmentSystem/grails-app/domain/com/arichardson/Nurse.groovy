package com.arichardson

class Nurse {
// declaring variables...
    int nurseID
    String nurseName
    String qualifications
    String nurseEmail
    String nurseOffice
    String nursePhone
    Surgery surgery
    Doctor doctor

    String toString(){
    return nurseName
    }

    static constraints = {
// declaring constraints...
    nurseID blank: false, nullable: false, unique: true
    nurseName blank: false, nullable: false
    qualifications blank: false, nullable: false
    nurseEmail blank: false, email: true, nullable: false
    nurseOffice blank: false, nullable: false
    nursePhone blank: false, nullable: false
    surgery blank: false, nullable: false
    doctor blank: false, nullable: false
    }

// defining the relationships
static belongsTo = [surgery:Surgery]
static hasMany = [doctor:Doctor]

}
