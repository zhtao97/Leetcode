import java.util.HashSet;
import java.util.Map;

/*
 * @lc app=leetcode.cn id=141 lang=java
 *
 * [141] 环形链表
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
    public boolean hasCycle(ListNode head) {
        //哈希表
        if(head == null) return false;
        Set<ListNode> set = new HashSet<>();
        while(head.next != null)
        {
            if(set.contains(head))
            {
                return true;
            }
            else
            {
                set.add(head);
            }
            head = head.next;
        }
        return false;




        //快慢指针
        // if(head == null) return false;
        // ListNode slowPtr = head, fastPtr = head;
        // while(fastPtr.next != null && fastPtr.next.next != null)
        // {
        //     slowPtr = slowPtr.next;
        //     fastPtr = fastPtr.next.next;
        //     if(slowPtr == fastPtr)
        //     return true;
        // }
        // return false;
        
    }
}
// @lc code=end

