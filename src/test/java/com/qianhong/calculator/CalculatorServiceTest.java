package com.qianhong.calculator;

import org.junit.Test;

import static org.junit.Assert.*;

import static org.hamcrest.CoreMatchers.*;

public class CalculatorServiceTest {

    @Test
    public void testPing() {
        assertThat(new CalculatorService().ping(), containsString("Welcome to Java Maven Calculator Web App!!!"));
    }

    @Test
    public void testAdd() {
        assertEquals(34, new CalculatorService().Add(8, 26).getResult());
    }

    @Test
    public void testSub() {
        assertEquals(4, new CalculatorService().Sub(12, 8).getResult());
    }


}
