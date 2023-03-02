package com.LinkedListPractice;

public class Main {

    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.AddNodeBeginning(new Node(1));
        list.AddNodeBeginning(new Node(2));
        list.AddNodeBeginning(new Node(3));
        list.AddNodeBeginning(new Node(4));
        list.AddNodeBeginning(new Node(5));
        list.AddNodeBeginning(new Node(6));
        list.AddNodeBeginning(new Node(7));
        list.AddNodeEnd(new Node(8));
        list.AddNodeEnd(new Node(9));
        list.AddNodeBeginning(new Node(10));
        list.PrintLinkedList();
    }
}
