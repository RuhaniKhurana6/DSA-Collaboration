class Solution {
    public int removeDuplicates(int[] nums) {
        
        int k=nums.length;
        int u=1;
        int l=0;
        int r=1;
        while(r<k){
            if(nums[r]==nums[r-1]){
                r++;
                continue;
            }
            u++;
            nums[l+1]=nums[r];
            l++;
            r++;
        }
        return u;
    }
}