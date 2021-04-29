package com.vdubyk.hm5;

import java.util.EmptyStackException;
import java.util.NoSuchElementException;

public class Stack<T> {

    private Node top;
    private int size;

    private class Node {
        T value;
        Node next;
    }

    public Stack() {
        top = null;
        size = 0;
    }

    public void pop() {
        if (size == 0) {
            throw new NoSuchElementException();
        }
        T value = top.value;
        top = top.next;
        System.out.println("Delete element(pop): " + value);
        size--;
    }

    void push(T element) {
        Node oldTop = top;
        Node newTop = new Node();
        newTop.value = element;
        newTop.next = oldTop;
        top = newTop;
        size++;
        System.out.println("Add element in stack: " + top.value);
    }

    T top() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return top.value;
    }

    int size() {
        return size;
    }

    boolean isEmpty() {
        return size == 0;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("MyStack {");
        Node nextNode = top;
        for (int i = 0; i < size; i++) {
            if (i == size - 1) {
                stringBuilder.append(nextNode.value);
            } else {
                stringBuilder.append(nextNode.value).append(", ");
            }
            nextNode = nextNode.next;
        }
        return stringBuilder.toString() + '}';
    }
}
