package com.company;

public class SudokuSolver {

    public static void main(String[] args) {
        Sudoku s = new Sudoku(GRID_TO_SOLVE);
        s.displaySudoku();

        if(s.solveSudoku())
        {
            s.displaySudoku();
        }
        else
        {
            System.out.println("Unsuccessful");
        }
    }

    public static int[][] GRID_TO_SOLVE = {
            {0,0,0,0,0,0,0,0,1},
            {9,0,5,3,0,0,6,0,0},
            {0,0,3,1,0,0,0,4,0},
            {0,0,2,0,8,0,0,0,0},
            {0,0,0,0,0,0,1,0,6},
            {7,0,0,0,0,0,5,8,0},
            {0,0,0,0,0,3,0,0,0},
            {8,7,0,0,2,6,0,0,4},
            {0,4,0,0,0,0,7,0,0},
    };


}