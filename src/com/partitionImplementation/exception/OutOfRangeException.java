package com.partitionImplementation.exception;

/**
 * @author Mohamed ouokki on 9/15/22
 * @project positive-thinking
 */
public class OutOfRangeException extends IllegalArgumentException{
    private static final long serialVersionUID = 4664456874499611218L;

    private String errorCode="OUT OF RANGE EXCEPTION";

    public OutOfRangeException(String message, String errorCode){
        super(message);
        this.errorCode=errorCode;
    }

    public String getErrorCode(){
        return this.errorCode;
    }
}
