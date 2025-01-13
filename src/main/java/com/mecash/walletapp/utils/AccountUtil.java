package com.mecash.walletapp.utils;

import java.util.Random;

public class AccountUtil {
    public static String generateRandomStringAccount() {
        Random random = new Random();

        long number = 10000000L + random.nextLong(90000000L);

        return "27" + number;
    }

}
