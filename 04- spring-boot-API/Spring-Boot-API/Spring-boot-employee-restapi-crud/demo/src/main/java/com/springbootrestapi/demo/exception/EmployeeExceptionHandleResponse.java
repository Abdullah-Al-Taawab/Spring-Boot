package com.springbootrestapi.demo.exception;

public class EmployeeExceptionHandleResponse {

    private String Message;
    private int status;

    public EmployeeExceptionHandleResponse() {
    }

    public EmployeeExceptionHandleResponse(String message, int status) {
        Message = message;
        this.status = status;
    }

    public String getMessage() {
        return Message;
    }

    public void setMessage(String message) {
        Message = message;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
