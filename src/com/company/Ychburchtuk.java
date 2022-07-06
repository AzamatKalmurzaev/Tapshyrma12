package com.company;

import static java.lang.Math.sqrt;

public class Ychburchtuk {

    double a;
    double b;
    double c;

    void area (){
       double p = (a+b+c)/2;
       double q = Math.sqrt(p * (p - a) * (p - b) * (p - c));
       System.out.println(q);



    }
}
