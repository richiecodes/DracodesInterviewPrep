package com.richiecodes.test1;

public class CountingClosedPaths {

    public static int closedPaths(int n) {
        int sum = 0;

        while (n != 0) {
            int curr = n % 10;
//            if (curr == 0 || curr == 4 || curr == 6 || curr == 9) {
//                sum += 1;
//            }
//
//            if (curr == 8) {
//                sum += 2;
//            }

            switch (curr) {
                case 0, 4, 6, 9 -> sum += 1;
                case 8 -> sum += 2;
            }

            n /= 10;
        }

        return sum;
    }
}
