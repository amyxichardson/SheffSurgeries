package com.arichardson

class Surgery {
// declaring variables
    String name
    String address
    String postcode
    String telephone
    int numberOfPatients
    String description
    String openingTime

    static constraints = {
// declaring constraints
    name blank: false, nullable: false
    address blank: false, nullable: false
    postcode blank: false, nullable: false
    telephone blank: false, unique: true, nullable: false
    numberOfPatients blank: false, min: 1, nullable: false
    description blank: false, size: 10..250, nullable: false
    openingTime blank: false, nullable: false
    }
}
