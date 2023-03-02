package com.TreePractice;

public class Tree {
    Leaf root;
    int leafCount;

    public Tree(int value){
        root=new Leaf(value);
        leafCount=0;
    }

    public Tree(Leaf root){
        this.root=root;
        leafCount=0;
    }

    public void AddLeaf(int value){
        Leaf leaf = new Leaf(value);
        Leaf current = root;
        while(current.right!=null){
            current=current.right;
        }
        current.right=leaf;
        leafCount++;
    }

    public void BalanceTree(){
        int left=GetHeight(root.left,0);
        int right=GetHeight(root.right,0);
        if(Math.max(left,right)-Math.min(left,right)<2)
            return;

    }

    public void RotateLeft(Leaf leaf){

    }

    public int GetHeight(Leaf leaf, int num){
        if(leaf==null){
            return num;
        }
        int left = GetHeight(leaf.left,num+1);
        int right = GetHeight(leaf.right,num+1);
        return Math.max(left, right);
    }

    public void PrintTree(Leaf current, int count){
        if(current==null){
            return;
        }
        PrintTree(current.left,count-1);
        for(int i=0;i<count;i++)
            System.out.print("\t");
        System.out.println(current.value);
        PrintTree(current.right,count+1);
    }
}
