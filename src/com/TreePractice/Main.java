package com.TreePractice;

public class Main {
    public static void main(String[] args){
        Tree tree= new Tree(5);
        tree.AddLeaf(6);
        tree.AddLeaf(8);
        tree.PrintTree(tree.root,tree.leafCount/2);
    }
}
