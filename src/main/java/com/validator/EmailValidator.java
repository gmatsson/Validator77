package com.validator;

public class EmailValidator {

    public boolean emailValidation( String email){
        int rightDotIndex = email.indexOf(".");
        int atIndex = email.indexOf("@");

        if(email==null){
            return false;
        }
        if(email.contains("@") && email.contains(".")){
            if(rightDotIndex > atIndex){
                return  true;
            }
        }
        return false;
    }
}

