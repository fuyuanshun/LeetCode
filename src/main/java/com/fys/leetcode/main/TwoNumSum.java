package com.fys.leetcode.main;

/**
 * @author fys
 * @date 2024/9/25
 * @description 1. 两数之和
 * 给定一个整数数组 nums和一个整数目标值 target，请你在该数组中找出 和为目标值 的那两个整数，并返回它们的数组下标。
 * 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素在答案里不能重复出现。
 * 你可以按任意顺序返回答案。
 *
 */
public class TwoNumSum {

    public static void main(String[] args) {
        int[] arr = new int[]{2, 7, 11, 15};
        int[] res = twoSum(arr, 13);
        System.out.println("第一个下标为：" + res[0]);
        System.out.println("第二个下标为：" + res[1]);
    }

    /**
     * hash解法
     *
     * @param arr 参数数组
     * @param target 和
     * @return 下标数组
     */
    public static int[] twoSum(int[] arr, int target){
        int[] result = new int[2];
        flag:for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    result[0] = i;
                    result[1] = j;
                    break flag;
                }
            }
        }
        return result;
    }
}
