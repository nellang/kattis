package com.company;

import java.util.ArrayList;

public class Test {

    public static void main(String[] args) {
        Kattio io = new Kattio( System.in, System.out );
        //while (io.hasMoreTokens()) {
            int n = io.getInt();
            Factorial factorial = new Factorial();
            io.println( factorial.findDigits( n ) );
        //}
        io.close();
    }

}