package com.cms.admin.application;


import com.cms.admin.service.model.Status;

public class ApplicationException extends RuntimeException {
    private final Status status;

    public ApplicationException(Status status, String msg) {
        super(msg);
        this.status = status;
    }

    @Override
    public String toString() {
        return "PEException{" +
                "status=" + status +
                "msg=" + this.getMessage() +
                '}';
    }
}
