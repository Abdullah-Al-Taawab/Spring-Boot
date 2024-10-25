package com.SpringProjectAPI.demo.studentError;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class Exception {


    @ExceptionHandler
    public ResponseEntity<StudentExceptionResponse> errorhandle(StudentNotFoundException exc)
    {

        StudentExceptionResponse error = new StudentExceptionResponse();

        error.setStatus(HttpStatus.NOT_FOUND.value());
        error.setMessage(exc.getMessage());
        error.setTimelapse(System.currentTimeMillis());
        return new ResponseEntity<>(error,HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler
    public ResponseEntity<StudentExceptionResponse> allerror(java.lang.Exception e)

    {
        StudentExceptionResponse error=new StudentExceptionResponse();

        error.setStatus(HttpStatus.BAD_REQUEST.value());
        error.setMessage(" Wrong Request ");
        return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
    }


}
