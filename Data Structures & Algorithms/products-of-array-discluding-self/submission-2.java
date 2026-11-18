class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int[] left = new int[nums.length];
        left[0] = 1; //[1,0,0,0]
        int[] right = new int[nums.length];
        right[nums.length - 1] = 1; // [0,0,6,1]

        for (int i=1 ; i<nums.length ; i++) {
           left[i] = left[i - 1] * nums[i - 1];
        }

        for (int i=nums.length - 1 ; i>0 ; i--) {
           right[i - 1] = right[i] * nums[i]; // right[3-1] = right[3] * nums[3-1]
        }

        int[] result = new int[left.length];
        for (int i = 0 ; i<left.length; i++) {
            result[i] = right[i] * left[i];
        }



        return result;
        }
    }