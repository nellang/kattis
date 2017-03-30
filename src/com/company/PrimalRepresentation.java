package com.company;

import java.util.HashMap;

/**
 * Created by nguyetnguyen on 30.03.2017.
 */
public class PrimalRepresentation {

    public static void main(String[] args) {
        Kattio io = new Kattio( System.in, System.out );
        while (io.hasMoreTokens()) {
            int x = io.getInt();
            String result = "";
            if (x < 0) {
                result = "-1 ";
                x = -x;
            }
            PrimalFactors primalFactors = new PrimalFactors();
            HashMap<Integer, Integer> factors = primalFactors.findFactors( x );
            for (int prime : factors.keySet()) {
                if (factors.get( prime ) != 1) result += prime + "^" + factors.get( prime ) + " ";
                else result += prime + " ";
            }
            io.println( result );
        }
        io.close();
    }
}
