package com.dev.DSA;

public class sudoku {
    //Determine if a 9 x 9 Sudoku board is valid. Only the filled cells need to be validated according to the following rules:
    //
    //Each row must contain the digits 1-9 without repetition.
    //Each column must contain the digits 1-9 without repetition.
    //Each of the nine 3 x 3 sub-boxes of the grid must contain the digits 1-9 without repetition.
    //Note:
    //
    //A Sudoku board (partially filled) could be valid but is not necessarily solvable.
    //Only the filled cells need to be validated according to the mentioned rules.
    //
    //
    //Example 1:
    //
    //
    //Input: board =
    //[["5","3",".",".","7",".",".",".","."]
    //,["6",".",".","1","9","5",".",".","."]
    //,[".","9","8",".",".",".",".","6","."]
    //,["8",".",".",".","6",".",".",".","3"]
    //,["4",".",".","8",".","3",".",".","1"]
    //,["7",".",".",".","2",".",".",".","6"]
    //,[".","6",".",".",".",".","2","8","."]
    //,[".",".",".","4","1","9",".",".","5"]
    //,[".",".",".",".","8",".",".","7","9"]]
    //Output: true
    //Example 2:
    //
    //Input: board =
    //[["8","3",".",".","7",".",".",".","."]
    //,["6",".",".","1","9","5",".",".","."]
    //,[".","9","8",".",".",".",".","6","."]
    //,["8",".",".",".","6",".",".",".","3"]
    //,["4",".",".","8",".","3",".",".","1"]
    //,["7",".",".",".","2",".",".",".","6"]
    //,[".","6",".",".",".",".","2","8","."]
    //,[".",".",".","4","1","9",".",".","5"]
    //,[".",".",".",".","8",".",".","7","9"]]
    //Output: false
    //Explanation: Same as Example 1, except with the 5 in the top left corner being modified to 8. Since there are two 8's in the top left 3x3 sub-box, it is invalid.
    //
    public static boolean isValidSudoku(char[][] board) {
        // Check rows
        for (int i = 0; i < 9; i++) {
            if (!isValid(board[i])) {
                return false;
            }
        }

        // Check columns
        for (int j = 0; j < 9; j++) {
            char[] column = new char[9];
            for (int i = 0; i < 9; i++) {
                column[i] = board[i][j];
            }
            if (!isValid(column)) {
                return false;
            }
        }

        // Check sub-boxes
        for (int i = 0; i < 9; i += 3) {
            for (int j = 0; j < 9; j += 3) {
                if (!isValidSubBox(board, i, j)) {
                    return false;
                }
            }
        }

        return true;
    }

    private static boolean isValid(char[] nums) {
        boolean[] seen = new boolean[10];
        for (char c : nums) {
            if (c != '.') {
                int num = c - '0';
                if (seen[num]) {
                    return false;
                }
                seen[num] = true;
            }
        }
        return true;
    }

    private static boolean isValidSubBox(char[][] board, int row, int col) {
        boolean[] seen = new boolean[10];
        for (int i = row; i < row + 3; i++) {
            for (int j = col; j < col + 3; j++) {
                char c = board[i][j];
                if (c != '.') {
                    int num = c - '0';
                    if (seen[num]) {
                        return false;
                    }
                    seen[num] = true;
                }
            }
        }
        return true;
    }
}
