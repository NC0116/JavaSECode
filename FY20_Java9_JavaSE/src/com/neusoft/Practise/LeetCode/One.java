package com.neusoft.Practise.LeetCode;

import java.util.Arrays;
import java.util.HashMap;

public class One{
    //两数之和
    public static void main(String[] args) {
        int[] nums={2,7,8,9};
        int target=9;
        System.out.println(Arrays.toString(new One().twoSum(nums,target)));
    }
    public int[] twoSum(int[] nums,int target){
//        for (int i = 0; i <nums.length; i++) {
//            for (int j =i+1; j <nums.length ; j++) {
//                if (nums[i]+nums[j] == target){
//                    return new int[]{i,j} ;
//                }
//            }
//        }
//

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i <nums.length; i++) {
            int num=target-nums[i];
            if (map.containsKey(num)){
                return new int[]{map.get(num),i};
            }
            map.put(nums[i],i);
        }
        return null;
    }

}
