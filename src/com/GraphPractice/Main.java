package com.GraphPractice;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class Main {

    public static void main(String[] args) {
        DirectedGraph graph = new DirectedGraph();
        graph.addNode('a','b', 'c');
        graph.addNode('c','e');
        graph.addNode('b','d');
        graph.addNode('d','f');
        //graph.printGraph();
        //graph.depthFirstRecursive( 'a', new ArrayList<Character>());
        //graph.breadthFirstTraversal('a');
        graph.breadthFirstRecursive(new PriorityQueue<Character>(), 'a', new ArrayList<Character>());
    }
}
