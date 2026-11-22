class Solution {
    public boolean isPalindrome(String s) {

        StringBuilder builder = new StringBuilder();
        for (int i=0; i<s.length() ; i++) {
            char c = s.charAt(i);

            if (Character.isLetterOrDigit(c)) {
                builder.append(Character.toLowerCase(c));
            }
        }

        String string = builder.toString();
        StringBuilder builder2 = new StringBuilder();
        for (int i=string.length() - 1; i>=0; i--) {
            char ch = string.charAt(i);
            builder2.append(ch);
        }

        if (string.equals(builder2.toString())) {
            System.out.println(string + " " + builder2.toString());
            return true;
        } else {
            System.out.println(string + " " + builder2.toString());
            return false;
        }
    }
}
