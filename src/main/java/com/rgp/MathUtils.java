package com.rgp;

public class MathUtils {

    public int add(int a, int b)
    {
        return a+b;
    }
    public int substract(int a, int b)
    {
        return a-b;
    }
    public int multiply(int a, int b)
    {
        return a*b;
    }
    public int divide(int a, int b)
    {
        return a/b;
    }

    public double computeCircleArea(Double radius)
    {
        return Math.PI*radius * radius;
    }

}
