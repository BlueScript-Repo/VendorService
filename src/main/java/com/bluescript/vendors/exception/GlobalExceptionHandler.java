package com.bluescript.vendors.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

import java.util.Date;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(NoRecordFoundException.class)
    public ResponseEntity<?> handleNoRecordFoundException(NoRecordFoundException exception, WebRequest request){

        ErrorDetails errorDetails=new ErrorDetails(new Date(), exception.getMessage(),request.getDescription(false));
        return new ResponseEntity(errorDetails, HttpStatus.NOT_FOUND);
    }

    //handle Global Exception
    @ExceptionHandler(Exception.class)
    public ResponseEntity<?>handleException(Exception exception, WebRequest request){

        ErrorDetails errorDetails=new ErrorDetails(new Date(), exception.getMessage(),request.getDescription(false));
        return new ResponseEntity(errorDetails, HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
