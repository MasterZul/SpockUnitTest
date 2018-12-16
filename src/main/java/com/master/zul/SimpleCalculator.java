package com.master.zul;

public class SimpleCalculator {

    public int rate;


    public int calculate(int number, int multi){

        return (number*multi)/rate;
    }

    public float calculateFloat(int number, int multi){

        float result = 0;

        try{
            result = number/multi;
        }
        catch(ArithmeticException e){
            throw new ArithmeticException("it Occur");
        }

        return result;
    }
}
