package com.vdubyk.hm5;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(3);
        stack.push(7);
        stack.push(1);
        System.out.println(stack.toString());
        System.out.println("Stack empty: " + stack.isEmpty());
        System.out.println("Stack size: " + stack.size());
        stack.pop();
        System.out.println(stack.toString());
        System.out.println("Element stack top: " + stack.top());
        
        Queue<Integer> queue = new Queue<>();
        queue.enqueue(1);
        queue.enqueue(4);
        queue.enqueue(7);
        queue.enqueue(11);
        System.out.println(queue.toString());
        queue.dequeue();
        queue.dequeue();
        System.out.println(queue.toString());
        System.out.println("Queue empty: " + queue.isEmpty());
        System.out.println("Queue size: " + queue.size());

        DoublyLinkedList<Integer> doublyLinkedList = new DoublyLinkedList<>();
        doublyLinkedList.addFirst(2);
        doublyLinkedList.addFirst(5);
        doublyLinkedList.addFirst(22);
        doublyLinkedList.addLast(11);
        doublyLinkedList.addIndex(23, 3);
        System.out.println(doublyLinkedList.toString());
        doublyLinkedList.removeFirst();
        doublyLinkedList.removeLast();
        System.out.println(doublyLinkedList.toString());
        System.out.println("DoublyLinkedList empty: " + doublyLinkedList.isEmpty());
        System.out.println("DoublyLinkedList size: " + doublyLinkedList.size());

    }
}
