package Patterns.TwoPointers.Easy;

public class easy {

    //Problem1 -> LeetCode 485
    public int findMaxConsecutiveOnes(int[] nums) {
        int cnt = 0;
        int maxi = 0;

        for (int i : nums) {
            if (i == 1) {
                cnt++;
            } else {
                cnt = 0;
            }
            maxi = Math.max(cnt, maxi);
        }

        return maxi;
    }

    //Problem2 -> LeetCode 414
    public int thirdMax(int[] nums) {
        long first = Long.MIN_VALUE;
        long sec = Long.MIN_VALUE;
        long third = Long.MIN_VALUE;

        for(int i : nums){
            if(i > first ){
                third = sec;
                sec = first;
                first = i;
            }else if(first > i && i > sec){
                third = sec;
                sec = i;
            }
            else if(sec > i && i > third){
                third =i;
            }
        }
        return third != Long.MIN_VALUE ? (int) third : (int) first;

    }
    //Problem 3 -> LeetCode 283
    public void moveZeroes(int[] nums) {
        int k = 0;

        for(int i = 0; i < nums.length; i++){
            if(nums[i] != 0){
                int temp = nums[k];
                nums[k] = nums[i];
                nums[i] = temp;
                k++;
            }
        }
    }

    //Problem4 -> LeetCode 1470
    public int[] shuffle(int[] nums, int n) {
        int[] ans = new int[nums.length];
        int o = n,e = 0;
        for(int i = 0; i < nums.length; i++){
            if(i%2 != 0){
                ans[i] = nums[o];
                o++;
            }else{
                ans[i] = nums[e];
                e++;
            }
        }

        return ans;
    }

    
}
