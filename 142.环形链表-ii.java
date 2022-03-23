import java.util.HashSet;

/*
 * @lc app=leetcode.cn id=142 lang=java
 *
 * [142] 环形链表 II
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        if(head == null) return null;
        ListNode slowPtr = head, fastPtr = head;
        while(fastPtr.next != null && fastPtr.next.next != null)
        {
            slowPtr = slowPtr.next;
            fastPtr = fastPtr.next.next;
            if(slowPtr == fastPtr)
            {
                slowPtr = head;
                while(slowPtr != fastPtr)
                {
                    slowPtr = slowPtr.next;
                    fastPtr = fastPtr.next;
                }
                return slowPtr;
            }
        }
        return null;



        //哈希表
        // if(head == null) return null;
        // Set<ListNode> set = new HashSet<>();
        // while(head.next != null)
        // {
        //     if(set.contains(head))
        //     {
        //         return head;
        //     }
        //     else
        //     {
        //         set.add(head);
        //     }
        //     head = head.next;
        // }
        // return null;
        
    }
}
// @lc code=end

