package com.company;

//Implementer metoderne i nedenstående stak-klasse efter stak-princippet, og test klassen i et main.

public class Stack {
    private int[] elements;
    private int size;
    public static final int DEFAULT_CAPACITY = 16;

    /**
     * Construct a stack with the default capacity 16
     */
    public Stack() {
        this(DEFAULT_CAPACITY);
    }

    /**
     * Construct a stack with the specified maximum capacity
     */
    public Stack(int capacity) {
        elements = new int[capacity];
        size = 0;
    }

    /**
     * Push a new integer into the top of the stack
     */
    public void push(int value) {
        elements[size] = value;
        size++;
    }

    public void printStack() {
        for (int i = 0; i < size; i++) {
            System.out.println(elements[i]);
        }
    }

    /**
     * Return and remove the top element from the stack
     */
    public int pop() {
        size--;
        return elements[size];
    }

    /**
     * Return the top element from the stack
     */
    public int peek() {
        return elements[size - 1];
    }

    /**
     * Test whether the stack is empty
     */
    public boolean empty() {
        if (size >= 0) return false;
        return true;
    }

    /**
     * Return the number of elements in the stack
     */
    public int getSize() {
        return elements[size];
    }

}
