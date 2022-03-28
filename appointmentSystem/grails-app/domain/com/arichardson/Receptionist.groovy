package com.arichardson

class Receptionist {
//declaring variables
    int recepID
    String recepName
    String recepEmail
    String recepUsername
    String recepPassword
    String recepPhone
    Surgery surgery

    String toString(){
    return recepName
    }

    static constraints = {
// declaring constraints
    recepID blank: false, nullable: false, unique: true, min:1
    recepName blank: false, nullable: false
    recepEmail blank: false, email: true, nullable: false
    recepUsername blank: false, unique: true, nullable: false
    recepPassword blank: false, size: 8..15, nullable: false, password: true
    recepPhone blank: false, unique: true, nullable: false
    surgery blank: false, nullable: false
    }

// defining the relationships
static belongsTo = [surgery:Surgery]

}
