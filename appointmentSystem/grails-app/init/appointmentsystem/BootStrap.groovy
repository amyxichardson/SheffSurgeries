package com.arichardson

class BootStrap {

    def init = { servletContext ->
// examples for data of all domain classes

      def appointment1=new com.arichardson.Appointment(
      appointmentID:1,
      appDate:new Date('11/04/2021'),
      appTime:'3:00pm',
      appDuration:30,
      roomNumber:'A-1111',
      doctor:'doctor',
      patient:'patient',
      surgery:'surgery'
      ).save()

      def doctor1=new com.arichardson.Doctor(
      doctorID:1,
      fullName:'Dr Sarah Macdonald',
      qualification:'MBChB(Sheffield)',
      position:'GP, Surgeon',
      doctorEmail:'s.macdonald@myemail.com',
      password:'secret222',
      doctorOffice:'D-9888',
      doctorPhone:'01111543860',
      bio:'Graduated from Sheffield Univerisity in 2008, specialises in dermatology',
      surgery:'surgery'
      ).save()

      def nurse1=new com.arichardson.Nurse(  
      nurseID:1, 
      nurseName:'Susan Peters',
      qualifications:'Registered General Nurse',
      nurseEmail:'s.peters@myemail.com',
      nurseOffice:'B-455',
      nursePhone:'01111964038',
      surgery:'surgery',
      doctor:'doctor'
      ).save()

      def patient1=new com.arichardson.Patient(
      patientID:'E25555',
      patientName:'Tom Rivers',
      patientAddress:'2 One Way Street, Eckington',
      patientResidence:'Sheffield',
      patientDob:new Date('20/09/1988'),
      dateRegistered:new Date('12/01/2021'),
      patientPhone:'07549743902',
      doctor:'doctor',
      surgery:'surgery'
      ).save()

      def prescription1=new com.arichardson.Prescription(
      prescripNumber:'56788',
      pharmacyName:'City Centre Pharmacy',
      medicine:'Paracetomol',
      totalCost:9.20,
      dateIssued:new Date('25/05/2021'),
      patientPaying:true,
      patient:'Patient',
      doctor:'doctor'
      ).save()

      def receptionist1=new com.arichardson.Receptionist(
      recepID:1,
      recepName:'Rob Kingston',
      recepEmail:'r.kingston@email.com',
      recepUsername:'rkiing',
      recepPassword:'secret2019',
      recepPhone:'01111764900',
      surgery:'surgery'
      ).save()

      def surgery1=new com.arichardson.Surgery(
      name:'City Health Centre',
      address:'21 Marble Street, Sheffield',
      postcode:'S11 5TY',
      telephone:'01111493000',
      numberOfPatients:50,
      description:'Specialises in dermatology, corrective surgery and new treatments for patients.',
      openingTime:'09:00-17:00hrs'
      ).save()


    }
    def destroy = {
    }
}
