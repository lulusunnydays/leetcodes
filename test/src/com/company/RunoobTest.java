package com.company;

public class RunoobTest {
    public static void main(String[] args) {
//        int money = 13;
//        int [] nums ={1,2,3};
//
//        System.out.println("The RES:"+permute.permute(nums));

 /*       bintree bintree=new bintree();
        Object []a={2,4,5,7,1,6,12,32,51,22};
        bintree.create(a);
        bintree.preorder(bintree.root);*/


        TreeNode tree = new TreeNode();
        Object []a={3,9,20,null,null,15,7};
        tree.create(a);
        tree.show(tree.root);
        System.out.println(depth.minDepth(tree));




    }
}
