package com.richiecodes.test1;

public class ValidEmailAddresses {
    public static boolean validEmail(String email) {
        String regex = "[a-z]{1,6}(_)?[0-9]{0,4}@hackerrank.com";

        return email.matches(regex);
    }
}
