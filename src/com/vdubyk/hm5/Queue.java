package com.vdubyk.hm5;

import java.util.NoSuchElementException;

public class Queue<T> {

    private Node<T> first;
    private Node<T> last;
    private int size = 0;

    class Node<T> {
        T value;
        Node<T> next;
        Node<T> prev;

        public Node(T value, Node<T> next, Node<T> prev) {
            this.value = value;
            this.next = next;
            this.prev = prev;
        }
    }

    public void enqueue(T element) {
        if (size == 0) {
            last = new Node<>(element, null, last);
            first = last;
            System.out.println("Enqueue element: " + first.value);
        } else {
            last.next = new Node<>(element, null, last);
            last = last.next;
            System.out.println("Enqueue element: " + last.value);
        }
        size++;
    }

    public void dequeue() {
        if (size == 0) {
            throw new NoSuchElementException();
        }
        if (size == 1) {
            System.out.println("Dequeue element: " + first.value);
            last = null;
            first = null;
            size = 0;
        } else {
            System.out.println("Dequeue element: " + first.value);
            first = first.next;
            first.prev = null;
            size--;
        }
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("MyQueue {");
        Node<T> nextNode = last;
        for (int i = 0; i < size; i++) {
            if (i == size - 1) {
                stringBuilder.append(nextNode.value);
            } else {
                stringBuilder.append(nextNode.value).append(", ");
            }
            nextNode = nextNode.prev;
        }
        return stringBuilder.toString() + '}';
    }


}
