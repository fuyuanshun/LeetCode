package com.fys.leetcode.main;

import com.fys.leetcode.common.ListNode;

/**
 * @author fys
 * @date 2024/9/25
 * @description 83. 删除排序链表中的重复元素
 * 给定一个已排序的链表的头 head ， 删除所有重复的元素，使每个元素只出现一次 。返回 已排序的链表 。
 */
public class RemoveRepeatSortLinked {
    public static void main(String[] args) {

        ListNode l5 = new ListNode(23);
        ListNode l4 = new ListNode(23, l5);
        ListNode l3 = new ListNode(20, l4);
        ListNode l2 = new ListNode(10, l3);
        ListNode head = new ListNode(10, l2);
        ListNode listNode = deleteDuplicates(head);
        System.out.println(listNode);
    }

    public static ListNode deleteDuplicates(ListNode head) {
        if(head == null) return null;
        ListNode temp = head;
        while(temp.next != null) {
            if(temp.val == temp.next.val) {
                temp.next = temp.next.next;
            } else {
                temp = temp.next;
            }
        }

        return head;
    }
}
