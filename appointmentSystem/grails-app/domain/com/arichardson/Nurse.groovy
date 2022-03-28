package com.arichardson

class Nurse {
// declaring variables...
    String nurseName
    String qualifications
    String nurseEmail
    String nurseOffice
    String nursePhone

    static constraints = {
// declaring constraints...
    nurseName blank: false, nullable: false
    qualifications blank: false, nullable: false
    nurseEmail blank: false, email: true, nullable: false
    nurseOffice blank: false, nullable: false
    nursePhone blank: false, nullable: false
    }
}
