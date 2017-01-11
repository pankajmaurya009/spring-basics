package com.allstate.controllers;

import com.allstate.models.Math;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.InterceptorRegistration;

import java.util.HashMap;
import java.util.Map;

@RestController
public class MathController {
    @RequestMapping(value = "/math/square/{id}")
    public Map<String,Integer> square(@PathVariable int id){
        int result = Math.square(id);
        Map<String,Integer> map = new HashMap<>();
        map.put("square",result);
        return map;
    }
    @RequestMapping(value = "/math/factorial/{id}")
    public Map<String,Integer> factorial(@PathVariable int id){
        int result = Math.factorial(id);
        Map<String,Integer> map = new HashMap<>();
        map.put("original",id);
        map.put("factorial",result);
        return map;
    }
    @RequestMapping(value = "/math/fibonacci/{id}")
    public Map<String,Integer> fibonacci(@PathVariable int id){
        int result = Math.fibonacci(id);
        Map<String,Integer> map = new HashMap<>();
        map.put("fibonacci",result);
        map.put("n",id);
        return map;
    }
}
