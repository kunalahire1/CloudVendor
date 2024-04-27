package com.testing.CalculatorTesting.service;

import org.springframework.stereotype.Component;

@Component
public class Calculator {
    public int add(int x,int y){
        return x+y;
    }
    public int sub(int x,int y){
        return x-y;
    }
    public int mul(int x,int y){
        return x*y;
    }
    public int  addManyNumbers(int ...a){
        int sum=0;
        for(int i:a)
        {
            sum+=i;
        }
        return sum;
    }

}
