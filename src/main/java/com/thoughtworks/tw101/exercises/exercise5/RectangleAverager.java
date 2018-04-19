package com.thoughtworks.tw101.exercises.exercise5;

public class RectangleAverager {

    public float averageArea(Rectangle[] rectangles) {
        int totalArea = 0;
        int numOfRectangles = 0; // Refactor this... don't know why I can't call size() on rectangles

        for(Rectangle rectangle : rectangles) {
            totalArea += rectangle.area();
            numOfRectangles++;
        }
        float averageSize = (float) totalArea / numOfRectangles;

        return averageSize;
    }
}
