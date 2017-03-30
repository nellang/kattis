package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created by nguyetnguyen on 29.03.2017.
 */
public class FundamentalNeighbors {

    private static int power(int e, int p) {
        if (p == 0) return 1;
        int temp = power( e, p / 2 );
        if (p % 2 == 0) return temp * temp;
        return e * temp * temp;
    }

    public static void main(String[] args) {

        Kattio io = new Kattio( System.in, System.out );
        PrimalFactors primalFactors = new PrimalFactors();
        while (io.hasMoreTokens()) {
            int n = io.getInt();
            HashMap<Integer, Integer> factors = primalFactors.findFactors( n );
            int neighbor = 1;
            for (int primeFactor : factors.keySet()) {
                neighbor *= power( factors.get( primeFactor ), primeFactor);
            }
            io.println( neighbor );
        }
        io.close();
    }
}
