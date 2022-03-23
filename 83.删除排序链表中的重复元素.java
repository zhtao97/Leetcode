/*
 * @lc app=leetcode.cn id=83 lang=java
 *
 * [83] 删除排序链表中的重复元素
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        //递归
        if(head == null || head.next == null) return head;
        head.next = deleteDuplicates(head.next);
        return head.val == head.next.val ? head.next : head;


        //----------------------
        // if(head == null) return head;
        // ListNode p = head;
        // while(p.next != null)
        // {
        //     if(p.next.val == p.val)
        //     {
        //         p.next = p.next.next;

        //     }
        //     else
        //     p = p.next;
        // }
        // return head;

    }
}
// @lc code=end

