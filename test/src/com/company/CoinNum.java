package com.company;

import java.util.HashMap;
import java.util.Map;

import static java.lang.Math.min;

public class CoinNum {
    private static final int[] coins = {1,3};
    static Map memo = new HashMap();

    static int coinNum(int amount){
        for(int i:coins)
            System.out.println(i);
        if (amount<=0)
            return 0;
        return dp(amount);
    }
    static int dp(int n){
        if(memo.containsKey(n)) return (int) memo.get(n);
        if(n==0) return 0;
        if(n<0) return -1;
        int num = Integer.MAX_VALUE;
        int subProblem;

        for(int coin : coins){
            subProblem = dp(n-coin);
            if(subProblem==-1)continue;
            num = min(num,1+subProblem);
        }
        if(num!=Integer.MAX_VALUE)
            memo.put(n,num);
        else
            memo.put(n,-1);
        for()
        System.out.println(memo.keySet());
        System.out.println(memo.values());
        return num>0?num:-1;
    }

}
