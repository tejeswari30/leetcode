class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        int k = 0;
        HashSet<Integer> set = new HashSet<>();
        for(int num: nums) {
            if(!set.contains(num)) {
                set.add(num);
                nums[k] = num;
                k++;
            }
        }
        return k;
    }
}