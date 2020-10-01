package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String a = br.readLine().trim();
        String b = br.readLine().trim();
        int[] as = convertToInts(a);
        int[] bs = convertToInts(b);
        IntersectArrays intersectArrays = new IntersectArrays();
        long start = 0;
        long end = 0;
        System.out.println("The first way: ");
        start = System.currentTimeMillis();
        printf(intersectArrays.intersectArrays1(as, bs));
        end = System.currentTimeMillis();
        System.out.println("Period: " + (end-start) + "\nThe second way: ");
        start = System.currentTimeMillis();
        printf(intersectArrays.intersectArrays2(as, bs));
        end = System.currentTimeMillis();
        System.out.println("Period: " + (end-start) + "\nThe third way: ");
        start = System.currentTimeMillis();
        printf(intersectArrays.intersectArrays3(as, bs));
        end = System.currentTimeMillis();
        System.out.println("Period: " + (end-start));
    }

    private static int[] convertToInts(String input) {
        return Arrays.stream(input.split(" ")).mapToInt(Integer::parseInt).toArray();
    }

    private static void printf(List<Integer> integers){
        integers.forEach(x -> System.out.print(x + " "));
        System.out.println();
    }

}
