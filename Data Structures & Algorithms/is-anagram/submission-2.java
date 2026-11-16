class Solution {
    public boolean isAnagram(String s, String t) {
        StringBuilder builder = new StringBuilder();

        //for (int i=s.length(); i<s.length(); i--) {
          //  builder.append()
        //}

        builder.append(s);
        if (builder.reverse().toString().equals(t)) {
            return true;
        } else {
            char[] chars = s.toCharArray();
            char[] chars1 = t.toCharArray();
            Arrays.sort(chars);
            Arrays.sort(chars1);
            String sorted1 = new String(chars);
            String sorted2 = new String(chars1);
            if (sorted1.equals(sorted2)) {
                return true;
            } else {
                return false;
            }
        }
    }
}
