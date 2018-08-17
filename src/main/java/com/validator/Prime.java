package com.validator;

public class Prime {

    public String isNumberPrime (int number) {

        int j = 2;
        Boolean result = true;

        while (j <= number / 2)
        {
            if (number % j == 0)
            {
                result = false;
            }
            j++;
        }
        if (result == false)
        {
            return "Number " + number + "is NOT a Prime!";
        }
        else
        {
            return "Number " + number + "is a Prime!";
        }
    }
}
