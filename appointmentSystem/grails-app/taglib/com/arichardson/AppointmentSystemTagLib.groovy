package com.arichardson

class AppointmentSystemTagLib {
   // static defaultEncodeAs = [taglib:'html']
    //static encodeAsForTags = [tagName: [taglib:'html'], otherTagName: [taglib:'none']]

    def receploginToggle = {out << "<div style='margin: 15px 0 40px;'>"
    
    if (request.getSession(false) && session.user){

        out << "<span style='float:left; margin-right: 15px'>"
        out << "Welcome ${session.user}."
        out << "</span><span style='float:left;margin-right:15px'>"
        out <<"<a href='${createLink(controller:'Receptionist', action:'logout')}'>"
        out << "Logout </a></span>"}

    else{
        out << "<span style='float:center;margin-right:10px'>"
        out << "<a href='${createLink(controller:'Receptionist', action:'login')}'>"
        out << "Login as a Receptionist</a></span>" 
    }
        out << "</div><br/>"}

    def docloginToggle = {out << "<div style='margin: 15px 0 40px;'>"
    
    if (request.getSession(false) && session.user){

        out << "<span style='float:right; margin-right: 15px'>"
        out << "Welcome ${session.user}."
        out << "</span><span style='float:right;margin-right:15px'>"
        out <<"<a href='${createLink(controller:'Doctor', action:'logout')}'>"
        out << "Logout </a></span>"}

    else{
        out << "<span style='float:center;margin-right:10px'>"
        out << "<a href='${createLink(controller:'Doctor', action:'login')}'>"
        out << "Login as a Doctor</a></span>" 
    }
        out << "</div><br/>"}

    def appointmentNumber = {
    out << "<div class='appointment-count'>"
    out << "<p>There are ${Appointment.count()} appointments in the system.</p>"
    out <<"</div>"}
}
