class Leet581 {
    public int findUnsortedSubarray(int[] nums) {
        int[] sorted = nums.clone();
        Arrays.sort(sorted);
        int l = 0;
        while (l < nums.length && nums[l] == sorted[l]) {
            l++;
        }
        if (l == nums.length) {
            return 0;
        }
        int r = nums.length - 1;
        while (r >= 0 && nums[r] == sorted[r]) {
            r--;
        }
        return r - l + 1;
    }
}
