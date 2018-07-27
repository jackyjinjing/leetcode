package com.study.jinjing.leetcode.primaryalgorithm.array;

/**
 * @author jinjing
 * @date 2018/7/26 上午11:22
 */
public class Rotate {

    public void rotate(int[] nums, int k) {
        for (int i = 0; i < k; i++) {
            rotateOne(nums);
        }
    }

    private void rotateOne(int[] nums) {
        int tmp1 = 0;
        int tmp2 = 0;
        for (int index = 0; index < nums.length; index++) {
            if (index == 0) {
                tmp1 = nums[0];
                nums[0] = nums[nums.length - 1];
            } else {
                tmp2 = nums[index];
                nums[index] = tmp1;
                tmp1 = tmp2;
            }
        }
    }

    public void test (int[] nums,int k){
        if (nums.length == 0 || (k %= nums.length) == 0) {
            return;
        }
        int length = nums.length;
        int start = 0;
        int i = 0;
        int cur = nums[i];
        int cnt = 0;

        while (cnt++ < length) {
            i = (i + k) % length;
            int t = nums[i];
            nums[i] = cur;
            if (i == start) {
                ++start;
                ++i;
                cur = nums[i];
            } else {
                cur = t;
            }
        }
    }
}
