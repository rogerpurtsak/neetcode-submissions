class Solution {
    public boolean isValidSudoku(char[][] board) {

        Set<Character>[] rows = new HashSet[9];
        Set<Character>[] columns = new HashSet[9];
        Set<Character>[] boxes = new HashSet[9];

        for (int i=0 ; i<9 ; i++) {
            rows[i] = new HashSet<>();
            columns[i] = new HashSet<>();
            boxes[i] = new HashSet<>();
        }

        for (int i=0 ; i<9 ; i++) {
            for (int j=0 ; j<9; j++) {
                char c = board[i][j];
                int boxesIndex = (i / 3) * 3 + (j / 3);
                if (c == '.') {
                    continue;
                }
                if ((rows[i].add(c)) == false) {
                    return false;
                }
                if ((columns[j].add(c)) == false) {
                    return false;
                }
                if ((boxes[boxesIndex].add(c)) == false) {
                    return false;
                }
            }

        }
        

        return true;
    }
}
