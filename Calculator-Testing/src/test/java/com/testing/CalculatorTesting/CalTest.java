package com.testing.CalculatorTesting;

import com.testing.CalculatorTesting.service.Calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CalTest {
    @Autowired
    Calculator calculator;
    @Test
    public void add1()
    {
        int result=calculator.add(1,2);
        int expected=3;
        Assertions.assertEquals(expected,result);
    }
    @Test
    public void sub1()
    {
        int result=calculator.sub(5,3);
        int expected=2;
        Assertions.assertEquals(expected,result);
    }
    @Test
    public void addMany()
    {
        int result=calculator.addManyNumbers(1,2,3,4);
        int expected=10;
        Assertions.assertEquals(expected,result);
    }

}
