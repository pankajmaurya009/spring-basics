package com.allstate.controllers;

import com.allstate.models.Triangle;
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

import static org.junit.Assert.*;
import static org.hamcrest.Matchers.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;

@RunWith(SpringRunner.class)
@WebMvcTest(TriangleController.class)
public class TriangleControllerTest {
    @Autowired
    private MockMvc mvc;

    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void shouldComputeTheAreaForAListOfTriangles() throws Exception {
        MockHttpServletRequestBuilder request = post("/triangle/area")
                .contentType(MediaType.APPLICATION_JSON)
                .content("[{\"width\":3, \"height\":4},{\"width\":5, \"height\":6}]");

        this.mvc.perform(request)
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.area", is(closeTo(21, 0.1))));
    }
}
