package com.allstate.models;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class CoordinateTheoryTest {
    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void shouldReturnDistanceBetweenTwoPoints(){
        CoordinateTheory ct1 = new CoordinateTheory(3,4);
        CoordinateTheory ct2 = new CoordinateTheory(5,1);
        List<CoordinateTheory> coordinateTheory = new ArrayList<>();
        coordinateTheory.add(ct1);
        coordinateTheory.add(ct2);
        double distance = CoordinateTheory.distance(coordinateTheory);
        assertEquals(3.61,distance,0.1);
    }

    @Test
    public void shouldReturnSlopeBetweenTwoPoints(){
        CoordinateTheory ct1 = new CoordinateTheory(3,4);
        CoordinateTheory ct2 = new CoordinateTheory(5,1);
        List<CoordinateTheory> coordinateTheory = new ArrayList<>();
        coordinateTheory.add(ct1);
        coordinateTheory.add(ct2);
        double slope = CoordinateTheory.slope(coordinateTheory);
        assertEquals(-1.5,slope,0.1);
    }

    @Test
    public void shouldReturnYintercept(){
        CoordinateTheory ct1 = new CoordinateTheory(3,4);
        CoordinateTheory ct2 = new CoordinateTheory(5,1);
        List<CoordinateTheory> coordinateTheory = new ArrayList<>();
        coordinateTheory.add(ct1);
        coordinateTheory.add(ct2);
        double yIntercept = CoordinateTheory.yIntercept(coordinateTheory);
        assertEquals(8.5,yIntercept,0.1);
    }
}