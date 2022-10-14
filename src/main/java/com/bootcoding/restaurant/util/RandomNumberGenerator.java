package com.bootcoding.restaurant.util;

import java.util.Random;

public class RandomNumberGenerator {
    public static int generateNumber(){
        Random random=new Random();

        int i = random.nextInt();

        return i;
    }

    public static void main(String[] args) {
        int i = RandomNumberGenerator.generateNumber();
        System.out.println(i);

    }
}
