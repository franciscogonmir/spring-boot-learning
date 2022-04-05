package com.fjgonmir.fizzBuzz.fizzBuzz;

public class FizzBuzz {

    private FizzBuzz(){
        throw new IllegalStateException("Utility class");
    }

    public static String getString(Integer number){
        StringBuilder result = new StringBuilder();
        if(number % 3 == 0){
            result.append("Fizz");
        }
        if(number % 5 == 0){
            result.append("Buzz");
        }
        return result.toString().isEmpty()?number.toString(): result.toString();
    }


}
