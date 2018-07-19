package com.study.jinjing.leetcode.primaryalgorithm.array;

/**
 * @author qilong.jj
 * @date 2018/7/19 上午10:39
 */
public class RemoveDuplicates {

    public int removeDuplicates(int[] nums) {

        if(nums.length == 0) {
            return 0;
        }

        int size = 0;
        for (int index = 0; index < nums.length; index++) {
            if(nums[index] != nums[size]){
                size ++;
                nums[size] = nums[index];
            }
        }

        return size+1;
    }
}
