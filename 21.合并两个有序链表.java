/*
 * @lc app=leetcode.cn id=21 lang=java
 *
 * [21] 合并两个有序链表
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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        //递归
        if(list1 == null) return list2;
        if(list2 == null) return list1;
        if(list1.val <= list2.val)
        {
            list1.next = mergeTwoLists(list1.next, list2);
            return list1;
        }
        else
        {
            list2.next = mergeTwoLists(list1, list2.next);
            return list2;
        }



        //循环+双指针
        // if(list1 == null) return list2;
        // if(list2 == null) return list1;
        // ListNode resultNode = new ListNode();
        // ListNode p = resultNode;
        // while(list1 != null && list2 != null)
        // {
        //     if(list1.val <= list2.val)
        //     {
        //         p.next = list1;
        //         list1 = list1.next;
        //     }
        //     else
        //     {
        //         p.next = list2;
        //         list2 = list2.next;
        //     }
        //     p = p.next;
        // }
        // if(list1 != null)
        // {
        //     p.next = list1;
        // }
        // else
        // p.next = list2;
        // return resultNode.next;

    }
}
// @lc code=end

