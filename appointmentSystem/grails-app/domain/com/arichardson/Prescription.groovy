package com.arichardson

class Prescription {
// declaring variables
    String pharmacyName
    String prescripNumber
    String medicine
    float totalCost
    Date dateIssued
    Boolean patientPaying

    static constraints = {
//declaring constraints
    pharmacyName blank: false, nullable: false
    prescripNumber blank: false, unique: true, nullable: false
    medicine blank: false, nullable: false
    totalCost blank: false, scale: 2, nullable: false
    dateIssued blank: false, nullable: false
    patientPaying blank: false, nullable: false
    }
}
