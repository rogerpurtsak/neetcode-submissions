class Solution {
    public boolean hasDuplicate(int[] nums) {
        ArrayList<Integer> listikas = new ArrayList<>();

        for (int i : nums) {
            if (!listikas.contains(i)) {
                listikas.add(i);
            } else {
                return true;
            }
        }
        return false;
    } 
}