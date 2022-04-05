package com.fjgonmir.fizzBuzz.fizzBuzz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

 class FizzBuzzTest {


    @Test
     void sendNumberReturnFizz(){
        Assertions.assertEquals("Fizz",FizzBuzz.getString(3));
    }

    @Test
     void sendNumberReturnBuzz(){
        Assertions.assertEquals("Buzz",FizzBuzz.getString(5));
    }

    @Test
     void sendNumberReturnFizzBuzz(){
        Assertions.assertEquals("FizzBuzz",FizzBuzz.getString(15));
    }

    @Test
    void sendNumberReturnEmpty(){
        Assertions.assertEquals("14",FizzBuzz.getString(14));
    }
}
