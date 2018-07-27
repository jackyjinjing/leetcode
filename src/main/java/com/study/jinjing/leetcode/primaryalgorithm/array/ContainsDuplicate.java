package com.study.jinjing.leetcode.primaryalgorithm.array;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @author jinjing
 * @date 2018/7/26 下午8:55
 */
public class ContainsDuplicate {

    public boolean containsDuplicate(int[] nums) {
        Set<Integer> sets = new HashSet<Integer>();
        for (int num : nums) {
            sets.add(num);
        }
        return sets.size() != nums.length;
    }
}
