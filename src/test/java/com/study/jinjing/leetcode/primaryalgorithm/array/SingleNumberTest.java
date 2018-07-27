package com.study.jinjing.leetcode.primaryalgorithm.array;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author jinjing
 * @date 2018/7/27 上午9:54
 */
public class SingleNumberTest {

    private SingleNumber singleNumber = new SingleNumber();

    @Test
    public void test() {
        Assert.assertEquals(1, singleNumber.singleNumber(new int[]{2, 2, 3, 1, 3}));
    }
}
