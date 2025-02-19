package com.fys.leetcode.main;

/**
 * @author fys
 * @date 2025-02-19
 * @description 判断一个数字是否是回文数
 * 有以下几种特殊情况：
 * ①当该数字是负数时，不可能是回文数
 * ②当该数字是0时，是回文数
 * ③当该数字不为0，并且是0结尾时，不可能是回文数
 */
public class palindromeNumber {
    public static void main(String[] args) {
        System.out.println(judgeTheNumber(1221));
    }

    /**
     * 使用数字的方式判断
     * @param number
     * @return
     */
    public static boolean judgeTheNumber(int number){
        if(number < 0 || (number % 10 == 0 && number != 0)){
            return false;
        }
        if(number == 0){
            return true;
        }
        //将该数字进行反转
        int reverseNumber = 0;
        while(number > reverseNumber){
            reverseNumber = reverseNumber * 10 + number % 10;
            number /= 10;
        }
        //判断反转后的数字是否与原始数字相等
        return number == reverseNumber || number == reverseNumber/10 ;
    }
}
