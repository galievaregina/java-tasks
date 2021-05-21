package ru.mail.polis.homework.io.objects;

import java.util.Random;

public class Utils {
    public static final long SEED = 1337;

    public static String getRandomString(Random RANDOM, int max) {
        final String alphabet = "abcdefghijklmnopqrstuvwxyz";
        final int N = alphabet.length();
        StringBuilder builder = new StringBuilder();
        int end = RANDOM.nextInt(max);
        for (int i = 0; i < end; i++) {
            builder.append(alphabet.charAt(RANDOM.nextInt(N)));
        }
        return builder.toString();

    }
}
