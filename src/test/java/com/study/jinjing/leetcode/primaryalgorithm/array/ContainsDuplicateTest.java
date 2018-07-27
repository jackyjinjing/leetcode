package com.study.jinjing.leetcode.primaryalgorithm.array;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author jinjing
 * @date 2018/7/27 上午9:37
 */
public class ContainsDuplicateTest {

    private ContainsDuplicate containsDuplicate = new ContainsDuplicate();

    @Test
    public void test() {
        Assert.assertTrue(containsDuplicate.containsDuplicate(new int[]{1,2,3,1}));
    }
}
