package com.allstate.models;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class TriangleTest {
    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void shouldComputeAreaOfTriangle() throws Exception {
        Triangle t1 = new Triangle(3, 2);
        double result = t1.getArea();
        assertEquals(3, result, 0.1);
    }
    @Test
    public void shouldComputeAreaOfAListOfTriangles() throws Exception {
        Triangle t1 = new Triangle(3, 4);
        Triangle t2 = new Triangle(5, 6);
        List<Triangle> triangles = new ArrayList<>();
        triangles.add(t1);
        triangles.add(t2);
        double result = Triangle.area(triangles);
        assertEquals(21, result, 0.1);
    }
}