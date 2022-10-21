package com.bootcoding.restaurant.util;

import java.util.Random;

public class OrderStatusGenerator {
    private static final String[] statuses = {"NEW", "ACCEPTED", "DELIVERED", "DISPATCHED", "CANCELLED"};
    public static String getStatus() {
        Random random = new Random();
        int randomIndex = random.nextInt(statuses.length);
        return statuses[randomIndex];
    }
}
