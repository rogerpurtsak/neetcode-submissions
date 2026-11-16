class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> main = new HashMap();
        for (String each : strs) {
            char[] chars = each.toCharArray();

            Arrays.sort(chars);
            StringBuilder builder = new StringBuilder();
            builder.append(new String(chars));
            String stringikas = new String(builder.toString());

            if (main.containsKey(stringikas)) {
                main.get(stringikas).add(each);
            } else {
                main.put(stringikas, new ArrayList<>(List.of(each)));
            }            
            
        }
        return new ArrayList<>(main.values());
    }
}
