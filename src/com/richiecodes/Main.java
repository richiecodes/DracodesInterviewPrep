package com.richiecodes;

import com.richiecodes.test1.*;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int num = scanner.nextInt();
//        scanner.close();
//
//        System.out.println(CountingClosedPaths.closedPaths(num));

        PriceCheck.priceCheck(new String[]{"rice", "sugar", "wheat", "cheese"}, new double[]{16.89, 56.92, 20.89, 345.99},
                new String[]{"rice", "cheese"}, new double[]{16.89, 345.98});
    }

}
