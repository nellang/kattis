package com.company;

import java.util.ArrayList;

/**
 * Created by nguyetnguyen on 28.03.2017.
 */
public class Goldbach2 {

    static int[] primeNumbers = new int[40000];

    private static void findPrimeNumber(int n) {
        for (int i = 2; i <= n; i++) {
            primeNumbers[i] = i;
        }

        for (int i = 2; i * i <= n; i++) {
            if (primeNumbers[i] != 0) {
                for (int j = 2 * i; j <= n; j += i) {
                    primeNumbers[j] = 0;
                }
            }
        }

    }

    private static boolean contains(int n) {
        for (int i = 2; i < primeNumbers.length; i++) {
            if (primeNumbers[i] == n) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        Kattio io = new Kattio( System.in, System.out );
        int n = io.getInt();
        for (int i = 0; i < n; i++) {
            int x = io.getInt();
            findPrimeNumber( x );
            ArrayList<Integer> representations = new ArrayList<>();
            for (int j = 2; j <= x / 2; j++) {
                if (primeNumbers[j] != 0 && contains( x - primeNumbers[j] )) {
                    representations.add( primeNumbers[j] );
                }
            }
            io.println( x + " has " + representations.size() + " representation(s)" );
            for (int j = 0; j < representations.size(); j++) {
                io.println( representations.get( j ) + " + " + (x - representations.get( j )) );
            }
        }
        io.close();
    }
}
