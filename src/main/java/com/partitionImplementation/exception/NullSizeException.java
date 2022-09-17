package com.partitionImplementation.exception;

/**
 * @author Mohamed ouokki on 9/15/22
 * @project positive-thinking
 */
public class NullSizeException extends IllegalArgumentException{
    private static final long serialVersionUID = 4664456874499611218L;

    private String errorCode="Size of sub lists should be greater than 0";

    public NullSizeException(String message){
        super();
        this.errorCode=message;
    }

    public String getErrorCode(){
        return this.errorCode;
    }
}

