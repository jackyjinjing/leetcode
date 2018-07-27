package com.study.jinjing.leetcode.primaryalgorithm.array;

/**
 * @author jinjing
 * @date 2018/7/27 上午10:22
 */
public class PlusOne {

    public int[] plusOne(int[] digits) {

        int length = digits.length;

        for (int index = length - 1; index >= 0; index--) {
            if (digits[index] != 9) {
                digits[index] += 1;
                break;
            }
            int tmp = digits[index];
            digits[index] = 0;

            if (index == 0 && tmp == 9) {
                int[] a = new int[digits.length + 1];
                a[0] = 1;
                for (int i = 0; i < digits.length; i++) {
                    a[i+1] = digits[i];
                }
                return a;
            }

        }

        return digits;
    }
}
