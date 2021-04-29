package com.vdubyk.hm5;

public class DoublyLinkedList<T> {

    private Node<T> head;
    private Node<T> tail;
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

    void addFirst(T element) {
        if (size == 0) {
            head = new Node<>(element, null, null);
            tail = head;
        } else {
            head.prev = new Node<>(element, head, null);
            head = head.prev;
        }
        System.out.println("Add firs element: " + head.value);
        size++;
    }

    void addLast(T element) {
        if (size == 0) {
            head = new Node<>(element, null, null);
            tail = head;
        } else {
            tail.next = new Node<>(element, null, tail);
            tail = tail.next;
        }
        System.out.println("Add firs element: " + tail.value);
        size++;

    }

    void addIndex(T element, int index) {
        if ((index == 0) || (index == size) || (index > size)) {
            throw new NullPointerException();
        }
        Node<T> nodeNext = head;
        Node<T> nodePrev;
        for (int i = 0; i < index; i++) {
            nodeNext = nodeNext.next;
        }
        nodePrev = nodeNext.prev;
        nodeNext.prev = new Node<>(element, nodeNext, nodePrev);
        nodePrev.next = nodeNext.prev;
        System.out.println("Add index " + index + " element: " + nodeNext.prev.value);
        size++;
    }

    boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    void removeFirst() {
        if (isEmpty()) {
            throw new EmptyLinkedListException();
        }
        System.out.println("Remove firs element: " + head.value);
        head = head.next;
        head.prev = null;
        size--;
    }

    void removeLast() {
        if (isEmpty())
            throw new EmptyLinkedListException();
        System.out.println("Remove last element: " + tail.value);
        tail = tail.prev;
        tail.next = null;
        size--;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("MyDoublyLinkedList {");
        Node<T> nextNode = head;
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
