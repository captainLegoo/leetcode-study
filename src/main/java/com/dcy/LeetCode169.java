package com.dcy;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * @author Kyle
 * @date 2023/10/16
 *
 * 169. 多数元素
 * 给定一个大小为 n 的数组 nums ，返回其中的多数元素。多数元素是指在数组中出现次数 大于 ⌊ n/2 ⌋ 的元素。
 * 你可以假设数组是非空的，并且给定的数组总是存在多数元素。
 *
 * 示例 1：
 * 输入：nums = [3,2,3]
 * 输出：3
 *
 * 示例 2：
 * 输入：nums = [2,2,1,1,1,2,2]
 * 输出：2
 */
public class LeetCode169 {
    public static void main(String[] args) {
        //int[] nums = {3,2,3};
        //int[] nums = {3,3,4};
        int[] nums = {2,2,1,1,1,2,2};

        int element = new LeetCode169().majorityElement(nums);
        System.out.println("element = " + element);
    }

    public int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            Integer integer = map.get(nums[i]);
            if (integer == null) {
                map.put(nums[i], 1);
            } else {
                map.put(nums[i], integer + 1);
            }
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > nums.length / 2) {
                return entry.getKey();
            }
        }
        return 0;
    }
}
