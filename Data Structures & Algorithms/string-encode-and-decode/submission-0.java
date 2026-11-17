class Solution {

    public String encode(List<String> strs) {
        // 5#hello5#world
        StringBuilder builder = new StringBuilder();

        for (String each : strs) {
            builder.append(each.length()).append("#").append(each);
        }
        System.out.println(builder.toString());
        return builder.toString();
    }

    public List<String> decode(String str) {
        List<String> finished = new ArrayList();
        int i = 0;

        while (i<str.length()) {
            int index = str.indexOf("#", i);
            int length = Integer.parseInt(str.substring(i, index));
            int start = index + 1;
            int end = length + start;

            finished.add(str.substring(start, end));
            i = end;

        }
        return finished;

    }
}
