class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        int n = nums.length;
        Arrays.sort(nums);

        List<Integer> res = new ArrayList<>();

        int low = 0;
        int high = n - 1;

        int first = -1;
        while(low <= high) {
            int mid = low + (high - low) / 2;
            if(nums[mid] == target) {
                first = mid;
                high = mid - 1; 
            }
            else if(nums[mid] < target) {
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }

        if(first == -1) {
            return res;
        }

        while(first < n && nums[first] == target) {
            res.add(first);
            first++;
        }
       return res;
    }
}