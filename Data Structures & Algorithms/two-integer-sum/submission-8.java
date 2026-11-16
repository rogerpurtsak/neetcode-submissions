class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hashikas = new HashMap();
        for (int i=0; i<nums.length; i++) {
            int getikas = target - nums[i];
            if (hashikas.containsKey(getikas)) {
                return new int[]{hashikas.get(getikas), i};
            } else {
                hashikas.put(nums[i], i);
            }
        }
        return new int[]{};
    }
}
