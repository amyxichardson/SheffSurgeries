package com.arichardson
import grails.validation.ValidationException
import static org.springframework.http.HttpStatus.*

class ReceptionistController {

    ReceptionistService receptionistService

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def login(){}

    def validate(){

        def user = Receptionist.findByUsername(params.username)

        if (user && user.password == params.password){
            session.user = user
            render view:'home'
        }

        else{
               flash.message = "Invalid username and/or password. Please try again"
               render view:'login'
        }
    }

    def logout ={
        session.user = null
        redirect(uri:'/')
    }

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond receptionistService.list(params), model:[receptionistCount: receptionistService.count()]
    }

    def show(Long id) {
        respond receptionistService.get(id)
    }

    def create() {
        respond new Receptionist(params)
    }

    def save(Receptionist receptionist) {
        if (receptionist == null) {
            notFound()
            return
        }

        try {
            receptionistService.save(receptionist)
        } catch (ValidationException e) {
            respond receptionist.errors, view:'create'
            return
        }

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'receptionist.label', default: 'Receptionist'), receptionist.id])
                redirect receptionist
            }
            '*' { respond receptionist, [status: CREATED] }
        }
    }

    def edit(Long id) {
        respond receptionistService.get(id)
    }

    def update(Receptionist receptionist) {
        if (receptionist == null) {
            notFound()
            return
        }

        try {
            receptionistService.save(receptionist)
        } catch (ValidationException e) {
            respond receptionist.errors, view:'edit'
            return
        }

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'receptionist.label', default: 'Receptionist'), receptionist.id])
                redirect receptionist
            }
            '*'{ respond receptionist, [status: OK] }
        }
    }

    def delete(Long id) {
        if (id == null) {
            notFound()
            return
        }

        receptionistService.delete(id)

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'receptionist.label', default: 'Receptionist'), id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'receptionist.label', default: 'Receptionist'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
    def upload = {

    def f = request.getFile('filecsv')
    if (f.empty) {
        flash.message = 'file cannot be empty'
        render(view: 'list')
        return
    }

    File fileDest = new File("/home/labstudent/assignment2/sheffSurgeries/appointmentSystem/grails-app/assets/file_name.csv")
    f.transferTo(fileDest)
    response.sendError(200)}
}
