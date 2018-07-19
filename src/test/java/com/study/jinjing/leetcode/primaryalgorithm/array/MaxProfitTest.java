package com.study.jinjing.leetcode.primaryalgorithm.array;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author qilong.jj
 * @date 2018/7/19 上午10:42
 */
public class MaxProfitTest {

    private MaxProfit maxProfit = new MaxProfit();


    @Test
    public void test() throws Exception {
        Assert.assertEquals(7,maxProfit.maxProfit(new int[]{6,1,3,2,4,7}));
    }
}
