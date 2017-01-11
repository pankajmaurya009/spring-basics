package com.allstate.models;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by localadmin on 11/01/17.
 */
public class MathTest {
    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void shouldSquareAnInteger() throws Exception {
        int result = Math.square(4);
        assertEquals(16,result);
    }
    @Test
    public void shouldGiveFactorailOfAnInteger() throws Exception {
        int result = Math.factorial(4);
        assertEquals(24,result);
    }

    @Test
    public void shouldGiveNthTermOfFibonacci() throws Exception {
        int result = Math.fibonacci(15);
        assertEquals(610,result);
    }
}