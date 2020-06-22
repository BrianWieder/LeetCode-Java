package NumSubarraysAboveThreshold;

public class NumSubArraysWithAvgAboveThreshold {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.numOfSubarrays(new int[]{2,2,2,2,5,5,5,8}, 3, 4));
        System.out.println(s.numOfSubarrays(new int[]{1,1,1,1,1}, 1, 0));
        System.out.println(s.numOfSubarrays(new int[]{11,13,17,23,29,31,7,5,2,3}, 3, 5));
        System.out.println(s.numOfSubarrays(new int[]{7,7,7,7,7,7,7}, 7, 7));
        System.out.println(s.numOfSubarrays(new int[]{4,4,4,4}, 4, 1));
    }
}

class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int num = 0;
        float currSum = 0;
        for(int i = 0; i < k; i++) {
            currSum += arr[i];
        }
        if(currSum / k >= threshold) {
            num++;
        }
        for(int i = k; i < arr.length; i++) {
            currSum -= arr[i - k];
            currSum += arr[i];
            if(currSum / k >= threshold) {
                num++;
            }
        }
        return num;
    }
}
