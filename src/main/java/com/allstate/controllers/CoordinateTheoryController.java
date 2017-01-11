package com.allstate.controllers;


import com.allstate.models.CoordinateTheory;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class CoordinateTheoryController {
    @RequestMapping(value = "/coordinateTheory/operations", method = RequestMethod.POST)
    public Map<String, Double> distance(@RequestBody List<CoordinateTheory> coordinates){
        double result1 = CoordinateTheory.distance(coordinates);
        double result2 = CoordinateTheory.slope(coordinates);
        double result3 = CoordinateTheory.yIntercept(coordinates);
        Map<String, Double> map = new HashMap<>();
        map.put("distance", result1);
        map.put("slope", result2);
        map.put("yIntercept", result3);
        return map;
    }
//
//    @RequestMapping(value = "/coordinateTheory/slope", method = RequestMethod.POST)
//    public Map<String, Double> slope(@RequestBody List<CoordinateTheory> coordinates){
//        double result = CoordinateTheory.slope(coordinates);
//        Map<String, Double> map = new HashMap<>();
//        map.put("slope", result);
//        return map;
//    }
//    @RequestMapping(value = "/coordinateTheory/yintercept", method = RequestMethod.POST)
//    public Map<String, Double> yIntercept(@RequestBody List<CoordinateTheory> coordinates){
//        double result = CoordinateTheory.yIntercept(coordinates);
//        Map<String, Double> map = new HashMap<>();
//        map.put("yIntercept", result);
//        return map;
//    }


}