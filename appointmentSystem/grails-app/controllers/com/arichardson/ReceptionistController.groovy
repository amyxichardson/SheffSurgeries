package com.arichardson

class ReceptionistController {

    def scaffold=Receptionist


    def login = {
 /*   def user = Receptionist.findrecepUsername(params.username)
    def password = Receptionist.findrecepPassword(params.password)*/
        if(params.username == "RKing" && params.password == "secret2019"){
        flash.message = "Login successful"
       /* session.user = user*/
        render view:'home'}
        else{
        flash.message = "Login failed"
        render view:'login'}
        }
   
    def logout = {
       session.user = null
       redirect(uri:'/')
    }

}

  /*  def validate(){
    def user = Receptionist.findbyUsernameAndPassword(params.recepUsername, params.recepPassword)
    if (user){
    session.user = user
    render view: 'home'}
    
    else {
    flash.message="Invalid try again"
    render view:'login'}   
    }*/


