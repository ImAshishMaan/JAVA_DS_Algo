class Solution {
    public int searchInsert(int[] nums, int target) {
        int p = 0;
        for(int i=0 ; i<nums.length ; i++){
            if(nums[i] == target){
                p = i;
                break;
            }
            if(target > nums[i]){
                p= i+1;
            }
        }
        return p;
    }
}