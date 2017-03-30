package com.company;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by nguyetnguyen on 30.03.2017.
 */
public class DigitsOfFactorial {

    ArrayList<Integer> factorial(int n) {
        ArrayList<Integer> res = new ArrayList<>( Arrays.asList( 1 ) );
        for (int i = 2; i <= n; i++) {
            res = multiply( res, i );
        }
        return res;
    }

    ArrayList<Integer> multiply(ArrayList<Integer> res, int x) {

        return res;
    }

    public static void main(String[] args) {
    }
}
