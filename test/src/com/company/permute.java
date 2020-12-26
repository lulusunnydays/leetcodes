package com.company;

import java.util.LinkedList;
import java.util.List;


public class permute {
    static List<List<Integer>> res = new LinkedList<>() ;
    static int k=0;
    static List<List<Integer>> permute(int [] nums){
        LinkedList<Integer> track = new LinkedList<>();
        backtrack(nums,track);
        return res;
    }

    static void backtrack(int[] nums,LinkedList<Integer> track){
        if(track.size() == nums.length){
            res.add(new LinkedList<>(track));
            return;
        }
        for (int i = 0;i<nums.length;i++){
            System.out.println("k:"+(k++)+", i:"+i);
            if (track.contains(nums[i]))
                continue;;
            track.add(nums[i]);
            backtrack(nums,track);
            track.removeLast();
        }
    }
}
