package com.richiecodes;

import com.richiecodes.test1.CountingClosedPaths;
import com.richiecodes.test1.FizzBuzz;
import com.richiecodes.test1.LastAndSecondLast;
import com.richiecodes.test1.ValidEmailAddresses;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String email = scanner.next();
        scanner.close();

        System.out.println(ValidEmailAddresses.validEmail(email));
    }

}
