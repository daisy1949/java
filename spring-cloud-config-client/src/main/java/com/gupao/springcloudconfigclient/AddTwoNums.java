package com.gupao.springcloudconfigclient;

/**
 * TODO:daisy,写点注释吧！
 * 广告资源位...
 *
 * @author daisy
 * @date 2020/05/11
 */
public class AddTwoNums {

    static  class ListNode {
        public int val;
        public ListNode next;
        public ListNode(int x){
            this.val = x;
        }
    }

    public static void main(String[] args){
        ListNode l1 = new ListNode(5);
        ListNode l2 = new ListNode(5);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);
        l2.next.next.next = new ListNode(1);
        l2.next.next.next.next = new ListNode(2);
        print(l1);
        print(reverseList(l1));
     //   print(l2);
        AddTwoNums addTwoNums = new AddTwoNums();

        print(addTwoNums.addTwoNumbers(l1,l2));

    }

    public static ListNode reverseList(ListNode node) {
        ListNode pre = null;
        ListNode next = null;
        while (node != null) {
            next = node.next;
            node.next = pre;
            pre = node;
            node = next;
        }
        return pre;
    }


    public ListNode addTwoNumbers(ListNode l1,ListNode l2){
        ListNode targetList = new ListNode(0);
        ListNode p = l1;
        ListNode q = l2;
        ListNode current = targetList;
        while(p != null || q != null){
            int x = 0,y = 0,sum;
            if (p != null) {
                x = p.val;
                p = p.next;
            }
            if (q != null) {
                y = q.val;
                q = q.next;
            }
            sum = x+y+current.val;
            int carry = sum/10;
            int reminder = sum%10;
            current.val = reminder;
            current.next = new ListNode(carry);
            current = current.next;
        }
//        current  = targetList;
//        while (current.next.next != null){
//            current = current.next;
//        }
//        if (current.next.val == 0)
//            current.next = null;
        return targetList;
    }

    /**
     * 遍历list
     * @param listNode
     * @return
     */
    public static void print(ListNode listNode){
        if (listNode != null) {
            System.out.print(listNode.val +"->");
            print(listNode.next);
        }
//        else{
//            System.out.println("NULL");
//            return null;
//        }

    }
}

