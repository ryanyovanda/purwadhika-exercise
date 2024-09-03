package Exercise.Day1;

import java.time.LocalDate;
import java.time.Period;

public class Main {
    public static void main(String[] args) {
        // Find Area of Rectangle
        char rectangle;
        int rectangleLength;
        int rectangleWidth;

        rectangleLength = 5;
        rectangleWidth = 3;

        System.out.println("Rectangle Length is " + rectangleLength);
        System.out.println("Rectangle Width is " + rectangleWidth);
        System.out.println("The rectangle Area is " + rectangleLength*rectangleWidth);
        System.out.println("===============");


        // Find code to find diameter, circumference and area of a circle
        int circleRadius;
        double pi;
        circleRadius = 5;
        pi = 3.14159;

        System.out.println("The circle diameter is " + circleRadius*2);
        System.out.println("The circle circumference is " + pi*(circleRadius*2));
        System.out.println("The circle area is " + pi*circleRadius*circleRadius);
        System.out.println("===============");

        //Write a code to find angles of triangle if two angles are given
        int triangleAngleA;
        int triangleAngleB;


        triangleAngleA = 80;
        triangleAngleB = 65;

        System.out.println("Triangle Angle A is " + triangleAngleA);
        System.out.println("Triangle Angle B is " + triangleAngleB);
        System.out.println("so Triangle Angle C is " + (180-(triangleAngleA + triangleAngleB)));
        System.out.println("===============");


        //
        LocalDate Date1 = LocalDate.of(2024, 3, 19);
        LocalDate Date2 = LocalDate.of(2024, 3, 21);

        Period period = Period.between(Date1, Date2);
        int daysDifference = period.getDays();

        System.out.println(Date1);
        System.out.println(Date2);
        System.out.println("Difference between the two dates is: " + daysDifference + " days");
        System.out.println("===============");

    }

}

