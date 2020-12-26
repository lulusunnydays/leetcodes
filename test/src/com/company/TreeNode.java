package com.company;

import sun.awt.image.ImageWatched;

import java.util.ArrayList;
import java.util.LinkedList;

public class TreeNode {
    public TreeNode left;
    public TreeNode right;
    public TreeNode root;
    public Object data;
    public LinkedList <TreeNode>list = new LinkedList<TreeNode>();
    public LinkedList BSTList = new LinkedList();
    public LinkedList preList = new LinkedList();

    public TreeNode(TreeNode left,TreeNode right,Object data){
        this.left = left;
        this.right = right;
        this.data = data;

    }
    public TreeNode(Object data){
        //this(null,null,data);
        this.data = data;
    }
    public TreeNode(){
        //this(null,null,data);

    }

    public void create(Object[] objs){
        for(Object o: objs){
            list.add(new TreeNode(o));
        }
        //        第一个数为根节点
        root=list.get(0);
//        建立二叉树
        System.out.println(objs.length);
        for (int i = 0; i <objs.length/2; i++) {
//            左孩子
            list.get(i).left=list.get(i*2+1);
//            右孩子
            if(i*2+2<list.size()){//避免偶数的时候 下标越界
                list.get(i).right=list.get(i*2+2);
            }
        }

    }
    public void show(TreeNode root){
        if(root!=null){
            BSTList.add(root.data);
            System.out.println(BSTList);
            show(root.left);
            show(root.right);
        }


    }
    public void preorder(TreeNode root){
        if(root!=null){

            preList.add(root.data);
            System.out.println(preList);
            preorder(root.left);
            preorder(root.right);
        }
    }
}
