package com.ebay.interview;

public class StringUtils {
    public static String shiftString(String s, int times) {
        if (s==null || s.isEmpty()) {
            return s;
        }
        int n = s.length();
        times = times % n;

        if (times > 0) {
            return s.substring(n - times) + s.substring(0, n - times);
        } else {
            times = -times;
            return s.substring(times) + s.substring(0, times);
        }
    }

    public static void main(String[] args) {
        String s = "abcdefghijklmnopqrstuvwxyz";
        System.out.println(shiftString(s, 2));
    }
}
