package com.company;

/**
 * Created by nguyetnguyen on 29.03.2017.
 */
public class RationalArithmetic {

    private static int gcd(int y1, int y2) {
        if ( y1 == 0 || y2 == 0 ) return 0;
        if (y1 == y2) return y1;
        if (y1 > y2) return gcd( y1 - y2, y2 );
        return gcd( y1, y2 - y1 );
    }

    private static int lcm(int y1, int y2) {
        return (y1 * y2 / gcd( y1, y2 ));
    }

    public static void main(String[] args) {

        Kattio io = new Kattio( System.in, System.out );
        int n = io.getInt();
        for (int i = 0; i < n; i++) {
            int x1 = io.getInt();
            int y1 = io.getInt();
            String op = io.getWord();
            int x2 = io.getInt();
            int y2 = io.getInt();
            int lcm;
            if (y1 > 0 && y2 > 0) lcm = lcm( y1, y2 );
            else if (y1 < 0) lcm = lcm( (-y1), y2 );
            else lcm = lcm( y1, (-y2) );
            int f1 = lcm / y1;
            int f2 = lcm / y2;
            switch (op) {
                case "+": {
                    io.println( (f1 + f2) + " / " + lcm );
                    break;
                }
                case "-": {
                    io.println( (f1 - f2) + " / " + lcm );
                    break;
                }
                case "/": {
                    int numerator = x1 * y2;
                    int denominator = x2 * y1;
                    int a;
                    if (numerator > 0 && denominator > 0) a = gcd( numerator, denominator );
                    else if (numerator < 0) a = gcd( (-numerator), denominator );
                    else a = gcd( numerator, (-denominator) );
                    numerator /= a;
                    denominator /= a;
                    io.println(numerator + " / " + denominator);
                    break;
                }
                case "*": {
                    int numerator = x1 * x2;
                    int denominator = y1 * y2;
                    int a;
                    if (numerator > 0 && denominator > 0) a = gcd( numerator, denominator );
                    else if (numerator < 0) a = gcd( (-numerator), denominator );
                    else a = gcd( numerator, (-denominator) );
                    numerator /= a;
                    denominator /= a;
                    io.println(numerator + " / " + denominator);
                    break;
                }
            }
        }
    }
}
