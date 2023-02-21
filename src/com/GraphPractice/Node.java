package com.GraphPractice;

import java.util.ArrayList;

public class Node {
    char value;
    ArrayList<Character> neighbors;

    public Node(char value, ArrayList<Character> neighbors) {
        this.value = value;
        this.neighbors = neighbors;
    }

    public Node(char value) {
        this.value = value;
        this.neighbors= new ArrayList<Character>();
    }


    public int getValue() {
        return value;
    }

    public void setValue(char value) {
        this.value = value;
    }

    public ArrayList<Character> getNeighbors() {
        return neighbors;
    }

    public void setNeighbors(ArrayList<Character> neighbors) {
        this.neighbors = neighbors;
    }
}
