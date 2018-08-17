package com.validator;


public class Validator {

    public String isNumber(String str) {

        if(Character.isDigit(str.charAt(0)))
            return "True";
        else
            return "False";
    }

}
