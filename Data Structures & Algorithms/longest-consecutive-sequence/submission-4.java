class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> setikas = new HashSet<>(nums.length);

        for (int num : nums) {
            setikas.add(num);
        }

        int highest = 0;
        for (int num: setikas) {
            
            if (!setikas.contains(num - 1)) {
                int counter = 1;
                while (setikas.contains(num + 1)) {
                    counter++;
                    num++;
                }
                if (counter > highest) {
                    highest = counter;
                }
            }
        }
        System.out.println(setikas);
        return highest;

    }
}
