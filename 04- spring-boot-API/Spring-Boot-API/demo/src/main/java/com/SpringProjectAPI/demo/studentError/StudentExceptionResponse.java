package com.SpringProjectAPI.demo.studentError;

public class StudentExceptionResponse {


    private int status;

    private String message;

    private long timelapse;

    public StudentExceptionResponse() {

    }

    public StudentExceptionResponse(int status, String message, long timelapse) {
        this.status = status;
        this.message = message;
        this.timelapse = timelapse;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public long getTimelapse() {
        return timelapse;
    }

    public void setTimelapse(long timelapse) {
        this.timelapse = timelapse;
    }
}
