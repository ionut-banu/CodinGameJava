package com.ionut;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int a = in.nextInt();
        int prev = in.nextInt();
        int min = a;
        int max = a;
        int dist = Math.abs(a - prev);
        for (int i = 2; i < N; i++) {
            int pi = in.nextInt();
            int newDist1 = Math.abs(pi - a);
            int newDist2 = Math.abs(pi - prev);
            int newDist3 = Math.abs(pi - min);
            int newDist4 = Math.abs(pi - max);
            if(newDist1 < dist) {
                dist = newDist1;
                a = pi;
            }
            if(newDist2 < dist) {
                dist = newDist2;
            }
            if(newDist3 < dist) {
                dist = newDist3;
            }
            if(newDist4 < dist) {
                dist = newDist4;
            }
            if(prev < min) min = prev;
            else if(prev > max) max = prev;

            prev = pi;
        }

        System.out.println(dist);
    }
}
