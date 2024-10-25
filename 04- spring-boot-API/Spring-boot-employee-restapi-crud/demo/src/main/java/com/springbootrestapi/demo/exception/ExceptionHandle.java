package com.springbootrestapi.demo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionHandle {

    @ExceptionHandler
    public ResponseEntity<EmployeeExceptionHandleResponse> excep(EmployeeException ex)
    {
        EmployeeExceptionHandleResponse e=new EmployeeExceptionHandleResponse();

       e.setMessage(ex.getMessage());
       e.setStatus(HttpStatus.NOT_IMPLEMENTED.value());

       return new ResponseEntity<>(e,HttpStatus.NOT_IMPLEMENTED);
    }
}
