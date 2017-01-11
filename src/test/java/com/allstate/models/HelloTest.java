package com.allstate.models;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;


public class HelloTest {
    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }
    @Test
    public void shouldCreate() throws IOException {
        Hello h = new Hello("Hello Junit");
        Assert.assertEquals("Hello Junit",h.getMessage());
    }

}