package com.study.jinjing.leetcode.primaryalgorithm.array;

/**
 * @author jinjing
 * @date 2018/7/27 上午10:46
 */
public class MoveZeroes {

    public void moveZeroes(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if(nums[i] == 0){
                    int tmp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = tmp;
                }
            }
        }
    }
}
