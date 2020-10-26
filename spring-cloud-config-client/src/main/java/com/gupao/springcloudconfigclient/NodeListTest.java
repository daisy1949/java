package com.gupao.springcloudconfigclient;

import jdk.internal.org.objectweb.asm.Handle;

/**
 * TODO:daisy,写点注释吧！
 * 广告资源位...
 *
 * @author daisy
 * @date 2020/05/12
 */
public class NodeListTest {
    
    static class Node{
        
        Integer val;
        
        Node next;
        
        Node(int val){
            this.val = val;
        }
    }

    public static void main(String[] args) {
        Node l1 = new Node(5);
        Node l2 = new Node(5);
        l1.next = new Node(4);
        l1.next.next = new Node(3);
        l2.next = new Node(6);
        l2.next.next = new Node(4);
        l2.next.next.next = new Node(1);
        l2.next.next.next.next = new Node(2);
        Node node =reverse1(l1);
    }

    public static Node reverse(Node node){
        if (node == null || node.next == null){
            return node;
        }
        Node next = node.next;
        Node newNode = reverse(node.next);
        next.next = node;
        node.next = null;
        return newNode;
    }
    public static Node reverse1(Node head) {
        if (head == null || head.next == null)
            return head;
        Node temp = head.next;
        Node newHead = reverse(head.next);
        temp.next = head;
        head.next = null;
        return newHead;
    }
}
