package com.arichardson

class Doctor {
// delcaring variables...
    String fullName
    String qualification
    String position
    String doctorEmail
    String password
    String doctorOffice
    String doctorPhone
    String bio

    static constraints = {
// declaring constraints...
    fullName blank: false, nullable: false
    qualification blank: false, nullable: false
    position blank: false, nullable: false
    doctorEmail blank: false, nullable: false, email: true
    password size: 8..15, blank: false, nullable: false, password:true
    doctorOffice blank: false, nullable: false
    doctorPhone blank: false, nullable: false
    bio size: 25..250, blank: false, nullable: false
    }
}
