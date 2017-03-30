package com.company;

public class ListGame {

    public static void main(String[] args) {

        Kattio io = new Kattio(System.in, System.out);
        int x = io.getInt();
        int count = 0;
        for (int i = 2; i * i <= x; i++) {
            while (x % i == 0) {
                count++;
                x = x / i;
            }
        }
        if (x != 1) {
            count++;
        }
        io.println(count);
        io.close();
    }
}
