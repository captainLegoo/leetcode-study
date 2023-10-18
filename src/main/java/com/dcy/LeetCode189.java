package com.dcy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Kyle
 * @date 2023/10/17
 *
 * 189. 轮转数组
 * 给定一个整数数组 nums，将数组中的元素向右轮转 k 个位置，其中 k 是非负数。
 *
 * 示例 1:
 * 输入: nums = [1,2,3,4,5,6,7], k = 3
 * 输出: [5,6,7,1,2,3,4]
 * 解释:
 * 向右轮转 1 步: [7,1,2,3,4,5,6]
 * 向右轮转 2 步: [6,7,1,2,3,4,5]
 * 向右轮转 3 步: [5,6,7,1,2,3,4]
 *
 * 示例 2:
 * 输入：nums = [-1,-100,3,99], k = 2
 * 输出：[3,99,-1,-100]
 * 解释:
 * 向右轮转 1 步: [99,-1,-100,3]
 * 向右轮转 2 步: [3,99,-1,-100]
 */
public class LeetCode189 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7};
        int k = 3;

        //int[] nums = {-1,-100,3,99};
        //int k = 2;

        //int[] nums = {-1};
        //int k = 2;

        //int[] nums = {1,2};
        //int k = 3;

        new LeetCode189().rotate(nums, k);
        System.out.println("nums = " + Arrays.toString(nums));
    }

    public void rotate(int[] nums, int k) {
        int[] tempArray = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            tempArray[(i + k) % nums.length] = nums[i];
        }

        System.arraycopy(tempArray, 0, nums, 0, nums.length);
    }
}
