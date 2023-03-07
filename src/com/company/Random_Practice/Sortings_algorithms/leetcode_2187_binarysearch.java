package com.company.Random_Practice.Sortings_algorithms;

public class leetcode_2187_binarysearch {
    public long minimumTime(int[] time, int totalTrips){
        long lo=0, hi= Long.MAX_VALUE;
        while(lo<hi){
            long mid= lo+ (hi-lo)/2;
            long trips= 0;
            for(int t: time){
                trips= trips+ (mid/t);
            }
            if(trips< totalTrips){
                lo=mid+1;
            }else{
                hi=mid;
            }
        }
        return lo;

    }

}