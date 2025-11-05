package com.pm.patient_service.exceptions;

//For debugging
public class EmailAlreadyExistsException extends RuntimeException {

    public EmailAlreadyExistsException(String message){
        super(message);
    }
    
}
