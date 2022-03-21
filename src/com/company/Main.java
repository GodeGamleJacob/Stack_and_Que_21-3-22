package com.company;

public class Main {

    public static void main(String[] args) {
        Stack myStack = new Stack(20);
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        myStack.push(96);
        myStack.push(5);
        System.out.println("\nDet pushede:\n");
        myStack.printStack();
        myStack.pop();
        System.out.println("\nDet poppede:\n");
        myStack.printStack();
        System.out.println("\nTop of the stack: " + myStack.peek() + "\n");
        System.out.println("Is the stack empty: " + myStack.empty() + "\n");
        System.out.println("The number of elements in the stack: " + myStack.getSize() + "\n");

        Que myQue = new Que(20);
        myQue.offer(1);
        myQue.offer(2);
        myQue.offer(3);
        myQue.offer(69);
        myQue.offer(5);
        System.out.println("\nWhat is offered: \n");
        myQue.printQue();
        myQue.remove();
        myQue.printQue();
        System.out.println("\nTop of the que: " + myQue.peek() + "\n");
        System.out.println("Is the que empty: " + myQue.empty() + "\n");
        System.out.println("The number of elements in the que: " + myQue.getSize() + "\n");
    }
}
