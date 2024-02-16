package com.study.examples.schildt;


public class PrintPoint {
    public static void printPoints(Point[] points) {
        for (int i = 0; i < points.length; i++) {
            points[i].printPoint();
        }
    }

    public static void main(String[] args) {
        Point[] points = new Point[100];
        for (int i = 0; i < points.length; i++) {
            points[i] = new Point();
        }
        printPoints(points);
    }
}