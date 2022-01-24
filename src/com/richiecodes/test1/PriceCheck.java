package com.richiecodes.test1;

import java.util.*;

public class PriceCheck {

    public static void priceCheck(String[] products, double[] productPrices, String[] productsSold, double[] soldPrice) {
        int errors = 0;

        for (int i = 0; i < productsSold.length; i++) {
            int index = Arrays.asList(products).indexOf(productsSold[i]);

            if (soldPrice[i] != productPrices[index]) errors++;
        }

        System.out.println(errors);
    }
}
