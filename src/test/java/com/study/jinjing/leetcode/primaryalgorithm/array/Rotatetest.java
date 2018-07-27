package com.study.jinjing.leetcode.primaryalgorithm.array;

import com.alibaba.fastjson.JSON;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author jinjing
 * @date 2018/7/26 上午11:31
 */
public class Rotatetest {

    private Rotate rotate = new Rotate();

    @Test
    public void testRotate() {
        int[] nums = {1, 2, 3, 4};
        rotate.rotate(nums,1);
        Assert.assertEquals(JSON.toJSONString(new int[]{4,1,2,3}),JSON.toJSONString(nums));
    }

    @Test
    public void test() {
        int[] nums = {1, 2, 3, 4};
        rotate.test(nums,1);
        Assert.assertEquals(JSON.toJSONString(new int[]{4,1,2,3}),JSON.toJSONString(nums));
    }
}
