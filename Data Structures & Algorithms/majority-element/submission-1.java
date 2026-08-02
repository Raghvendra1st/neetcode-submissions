class Solution {
    public int majorityElement(int[] nums) {
        java.util.Arrays.sort(nums);
        int k=nums[nums.length/2];
        for(int i=0;i<nums.length/2;i++){
            if(nums[i]==nums[nums.length/2]){
                k=nums[i];
                break;
            }
        }
        return k;
    }
}