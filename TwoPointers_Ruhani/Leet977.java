class Leet977 {
    public int[] sortedSquare(int[] nums, int n) {
        int[] ans = new int[n];
        int l = 0;
        int r = nums.length - 1;
        int i = nums.length - 1;
        while (l <= r) {
            int ls = nums[l] * nums[l];
            int rs = nums[r] * nums[r];
            if (ls > rs) {
                ans[i] = ls;
                l++;
            } else {
                ans[i] = rs;
                r--;
            }
            i--;
        }
        return ans;
    }
}