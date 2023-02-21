package com.GraphPractice;

import java.util.*;

public class DirectedGraph {
    HashMap<Character, Node> nodes = new HashMap<Character, Node>();

    public void addNode(char name, char... args){
       // ArrayList<Character> neighbors = new ArrayList<Character>();
        if(!nodes.containsKey(name)) {
            nodes.put(name, new Node(args[0]));
        }
        for (char arg : args) {
            if (!nodes.containsKey(arg)) {
                nodes.put(arg, new Node(arg));
                //neighbors.add(args[i]);
            } //else if(!nodes.get(name).neighbors.contains(args[i]))
            nodes.get(name).neighbors.add(arg);
        }

    }

    public void printGraph(){
        for(char c : nodes.keySet()){
            System.out.print(c + " --> ");
            for(char n : nodes.get(c).neighbors){
                System.out.print(n + " ");
            }
            System.out.println();
        }
    }

    public void depthFirstTraversal(char start){
        Stack<Character> stack = new Stack<Character>();
        stack.add(start);
        char current;
        while(stack.size()>0){
            current=stack.pop();
            stack.addAll(nodes.get(current).neighbors);
            if(stack.empty())
                System.out.print(current+"\n");
            else
                System.out.print(current+" --> ");
        }
    }

    public void breadthFirstTraversal(char start){
        Queue<Character> queue = new PriorityQueue<Character>();
        queue.offer(start);
        char current;
        while(!queue.isEmpty()){
            current= queue.poll();
            for(char c : nodes.get(current).neighbors)
                queue.offer(c);
            if(queue.isEmpty())
                System.out.print(current+"\n");
            else
                System.out.print(current+" --> ");
        }
    }

    public void depthFirstRecursive(char current, ArrayList<Character> isVisited){
        isVisited.add(current);
        if(isVisited.size()==nodes.size()){
            System.out.println(current);
            return;
        }
        System.out.print(current + " --> ");
        for(char c : nodes.get(current).neighbors){
            depthFirstRecursive(c,isVisited);
        }
    }

    public void breadthFirstRecursive(Queue<Character> queue, char current, ArrayList<Character> isVisited){
        isVisited.add(current);
        if(isVisited.size()==nodes.size()) {
            System.out.println(current);
            return;
        }
        else
            System.out.print(current + " --> ");
        buildQueue(queue,current);
        breadthFirstRecursive(queue, queue.poll(), isVisited);
    }

    public void buildQueue(Queue<Character> queue, char current){
        for(char c : nodes.get(current).neighbors)
            queue.offer(c);
    }

    public HashMap<Character, Node> getNodes() {
        return nodes;
    }

    public void setNodes(HashMap<Character, Node> nodes) {
        this.nodes = nodes;
    }
}
