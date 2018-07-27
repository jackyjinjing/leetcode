package com.study.jinjing.leetcode.primaryalgorithm.array;

/**
 * @author jinjing
 * @date 2018/7/27 上午9:45
 */
public class SingleNumber {

    public int singleNumber(int[] nums) {
        int res = 0;
        for (int num : nums) {
            res ^= num;
        }
        return res;
    }
}
