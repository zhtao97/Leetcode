import java.util.ArrayList;
import java.util.List;

/*
 * @lc app=leetcode.cn id=234 lang=java
 *
 * [234] 回文链表
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
    public boolean isPalindrome(ListNode head) {
        //双指针+后半段链表翻转
        ListNode slow = head, fast = head;
        while(fast != null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }
        if(fast != null)
        {
            slow = slow.next;
        }
        ListNode reverseSlow = reverse(slow);
        while(reverseSlow != null)
        {
            if(reverseSlow.val != head.val)
            {
                return false;
            }
            reverseSlow = reverseSlow.next;
            head = head.next;
        }
        return true;



        




        //用数组接收后判断
        // List<Integer> list = new ArrayList<>();
        // while(head != null)
        // {
        //     list.add(head.val);
        //     head = head.next;

        // }

        // int left = 0, right = list.size()-1;
        // while(left < right)
        // {
        //     if(list.get(left) != list.get(right))
        //     {
        //         return false;
        //     }
        //     left++;
        //     right--;
        // }
        // return true;

        //翻转链表错误思路
        // ListNode prev = null, curr = head, next = null;
        // while(curr != null)
        // {
        //     next = curr.next;
        //     curr.next = prev;
        //     prev = curr;
        //     curr = next;
        // }
        // while(head != null)
        // {
        //     if(head.val != prev.val)
        //     {
        //         return false;

        //     }
        //     head = head.next;
        //     prev = prev.next;
        // }
        // return true;

    }
    public ListNode reverse(ListNode head)
    {
        ListNode prev = null, curr = head, next = null;
        while(curr != null)
        {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

}
// @lc code=end

