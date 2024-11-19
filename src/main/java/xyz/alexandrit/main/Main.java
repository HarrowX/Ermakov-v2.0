package xyz.alexandrit.main;

import xyz.alexandrit.birds.Bird;
import xyz.alexandrit.math.numbers.Fractions;

import static xyz.alexandrit.math.ariphmetic.Summator.*;
import xyz.alexandrit.math.geometry.points.Point2D;

import java.math.BigInteger;

import static java.lang.Math.pow;
import static java.lang.Integer.parseInt;
public class Main {
    public static void main(String[] args) {
        System.out.println(ofStringInt("13", "12", "25"));
        System.out.println();
        System.out.println(Point2D.class);
        System.out.println(java.awt.Point.class);
        System.out.println(powString("3", "3"));
    }

    public static double powString(String a, String b) {
        int intA = parseInt(a), intB = parseInt(b);
        return pow(intA, intB);
    }
}
