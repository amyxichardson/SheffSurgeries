package com.arichardson

class Receptionist {
//declaring variables
    String recepName
    String recepEmail
    String recepUsername
    String recepPassword
    String recepPhone

    static constraints = {
// declaring constraints
    recepName blank: false, nullable: false
    recepEmail blank: false, email: true, nullable: false
    recepUsername blank: false, unique: true, nullable: false
    recepPassword blank: false, size: 8..15, nullable: false, password: true
    recepPhone blank: false, unique: true, nullable: false
    }
}
