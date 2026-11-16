

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> hashikas = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            hashikas.put(nums[i], hashikas.getOrDefault(nums[i], 0) + 1);
        }

        List<Map.Entry<Integer, Integer>> mapikas =
            new ArrayList<>(hashikas.entrySet());

        mapikas.sort((a, b) -> Integer.compare(b.getValue(), a.getValue()));

        int[] listikas = new int[k];

        for (int i = 0; i < k; i++) {
            listikas[i] = mapikas.get(i).getKey();
        }

        return listikas;
    }
}