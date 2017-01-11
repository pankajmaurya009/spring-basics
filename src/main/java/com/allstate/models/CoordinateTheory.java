package com.allstate.models;

import java.lang.*;
import java.util.ArrayList;
import java.util.List;

public class CoordinateTheory {
    private int x, y;

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public CoordinateTheory(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public CoordinateTheory() {
    }
    public static double distance(List<CoordinateTheory> coordinate) {
        int x1 = coordinate.get(0).getX();
        int y1 = coordinate.get(0).getY();
        int x2 = coordinate.get(1).getX();
        int y2 = coordinate.get(1).getY();
        return java.lang.Math.sqrt((y2-y1)*(y2-y1) + (x2-x1)*(x2-x1));
    }

    public static double slope(List<CoordinateTheory> coordinate) {
        int x1 = coordinate.get(0).getX();
        int y1 = coordinate.get(0).getY();
        int x2 = coordinate.get(1).getX();
        int y2 = coordinate.get(1).getY();
        return ((double)(y2-y1)/(double)(x2-x1));
    }
    public static double yIntercept(List<CoordinateTheory> coordinate) {
        int x1 = coordinate.get(0).getX();
        int y1 = coordinate.get(0).getY();
        double slope = CoordinateTheory.slope(coordinate);
        return (y1- (slope * x1));
    }
}
