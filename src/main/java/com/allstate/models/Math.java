package com.allstate.models;

import org.apache.tomcat.util.http.fileupload.util.Streams;

import java.util.List;
import java.util.stream.Stream;

/**
 * Created by localadmin on 11/01/17.
 */
public class Math {
    public static int square(int num) {
        return num * num;
    }
    public static int factorial(int num) {
       return Stream.iterate(1,n -> n+1).limit(num).reduce(1,(a,b) -> a*b);
     }
    public static int fibonacci(int term) {
        if(term == 0 || term == 1)
            return term;
        return (fibonacci(term - 1) + fibonacci(term - 2));
    }
}
