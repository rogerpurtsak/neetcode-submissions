class Solution {
    public int[] twoSum(int[] numbers, int target) {

        int[] intekas = new int[2];

        int leftIndex = 0;
        int rightIndex = numbers.length - 1;

        while (leftIndex < rightIndex) {

            int left = numbers[leftIndex]; //1
            int right = numbers[rightIndex]; //2
            int sum = left + right; //3

            if (sum > target) {
                rightIndex -= 1;
            }
            if (sum < target) {
                leftIndex += 1;
            }
            if (sum == target) {
                return new int[]{leftIndex + 1, rightIndex + 1};
            }
        }
        return new int[]{leftIndex + 1, rightIndex + 1};


    } 

        
}

