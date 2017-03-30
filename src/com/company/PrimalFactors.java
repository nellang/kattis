package com.company;

import java.util.HashMap;

/**
 * Created by nguyetnguyen on 30.03.2017.
 */
public class PrimalFactors {

    HashMap<Integer, Integer> findFactors(int n) {
        HashMap<Integer, Integer> factors = new HashMap<>();
        for (int i = 2; i <= n; i++) {
            int count = 0;
            while (n % i == 0) {
                n /= i;
                count++;
                factors.put( i, count );
            }
        }
        return factors;
    }

}
