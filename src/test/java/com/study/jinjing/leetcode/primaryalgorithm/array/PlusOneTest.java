package com.study.jinjing.leetcode.primaryalgorithm.array;

import com.alibaba.fastjson.JSON;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author jinjing
 * @date 2018/7/27 上午10:31
 */
public class PlusOneTest {

    private PlusOne plusOne = new PlusOne();

    @Test
    public void test() {
        Assert.assertEquals(JSON.toJSONString(new int[]{1, 2, 3, 5}), JSON.toJSONString(plusOne.plusOne(new int[]{1, 2, 3, 4})));
        Assert.assertEquals(JSON.toJSONString(new int[]{1, 2, 4, 0}), JSON.toJSONString(plusOne.plusOne(new int[]{1, 2, 3, 9})));
        Assert.assertEquals(JSON.toJSONString(new int[]{1,0}), JSON.toJSONString(plusOne.plusOne(new int[]{9})));
    }
}
