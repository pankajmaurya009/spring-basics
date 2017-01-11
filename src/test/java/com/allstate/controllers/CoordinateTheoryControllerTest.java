package com.allstate.controllers;

import com.allstate.models.CoordinateTheory;
import org.hamcrest.number.IsCloseTo;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.junit.Assert.*;
import static org.hamcrest.Matchers.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;

@RunWith(SpringRunner.class)
@WebMvcTest(CoordinateTheoryController.class)
public class CoordinateTheoryControllerTest {
    @Autowired
    private MockMvc mvc;
    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void shouldReturnDistance() throws Exception{
        MockHttpServletRequestBuilder request = post("/coordinateTheory/operations")
                .contentType(MediaType.APPLICATION_JSON)
                .content("[{\"x\":3, \"y\":4},{\"x\":5, \"y\":1}]");

        this.mvc.perform(request)
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.distance", is(closeTo(3.6, 0.1))))
                .andExpect(jsonPath("$.slope", is(closeTo(-1.5, 0.1))))
                .andExpect(jsonPath("$.yIntercept", is(closeTo(8.5, 0.1))));
        }
//    @Test
//    public void shouldReturnSlope() throws Exception{
//        MockHttpServletRequestBuilder request = post("/coordinateTheory/slope")
//                .contentType(MediaType.APPLICATION_JSON)
//                .content("[{\"x\":3, \"y\":4},{\"x\":5, \"y\":1}]");
//
//        this.mvc.perform(request)
//                .andExpect(status().isOk())
//                .andExpect(jsonPath("$.slope", is(closeTo(-1.5, 0.1))));
//    }
//
//    @Test
//    public void shouldReturnYintercept() throws Exception{
//        MockHttpServletRequestBuilder request = post("/coordinateTheory/yintercept")
//                .contentType(MediaType.APPLICATION_JSON)
//                .content("[{\"x\":3, \"y\":4},{\"x\":5, \"y\":1}]");
//
//        this.mvc.perform(request)
//                .andExpect(status().isOk())
//                .andExpect(jsonPath("$.yIntercept", is(closeTo(8.5, 0.1))));
//    }
}
