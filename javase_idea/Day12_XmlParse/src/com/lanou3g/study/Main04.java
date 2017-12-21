package com.lanou3g.study;

public class Main04 {
    public static void main(String[] args) {

        System.out.println(rollBack("abcde"));
    }

    public static String rollBack(String target) {
        int length = target.length();
        char s = target.charAt(length - 1);
        if (length == 1) {
            return s + "";
        }
        String last = target.substring(0, length - 1);

        return s + rollBack(last);
    }

}
