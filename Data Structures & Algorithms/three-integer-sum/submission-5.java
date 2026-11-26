class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        // -2, 0, 1, 1, 2
        Arrays.sort(nums);
        List<List<Integer>> listikas = new ArrayList<>();
        for (int i=0; i<nums.length ; i++) { // -2
            if (i != 0 && nums[i - 1] == nums[i]) {
                continue;
            }
            int left = i + 1; // nums[2] ehk 1
            int right = (nums.length - 1); // nums[4] ehk 1
            while (left < right) {
                int arvutus = nums[i] + nums[left] + nums[right]; // 0
                if ((arvutus) == 0) {
                    listikas.add(List.of(nums[i], nums[left], nums[right])); 
                    left ++;
                    right --;
                    while (left < right && nums[left] == nums[left - 1]) {
                        left ++;
                    }
                    while (left < right && nums[right] == nums[right + 1]) {
                        right --;
                    }

                }
                if (arvutus < 0) {
                    left += 1;
                }
                if (arvutus > 0) {
                    right -= 1;
                }
            }

        }
        return listikas;
    }
}
