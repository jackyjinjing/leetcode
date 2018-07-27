package com.study.jinjing.leetcode.primaryalgorithm.array;

import com.alibaba.fastjson.JSON;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author jinjing
 * @date 2018/7/27 上午10:53
 */
public class MoveZeroesTest {

    private MoveZeroes moveZeroes = new MoveZeroes();

    @Test
    public void test() {
        int[] nums = {0, 0, 1, 2, 3};
        moveZeroes.moveZeroes(nums);
        Assert.assertEquals(JSON.toJSONString(new int[]{1,2,3,0,0}),JSON.toJSONString(nums));
    }
}
