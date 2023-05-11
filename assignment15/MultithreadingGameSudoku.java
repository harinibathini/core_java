package assignment15;
class SudokuGameDemo implements Runnable {
private final int[][] board;
private boolean solved;
public SudokuGameDemo(int[][] board) {
        this.board = board;
        }
@Override
public void run() {
        if (solve(0, 0)) {
        solved = true;
        System.out.println(Thread.currentThread().getName() + " solved the puzzle!");
        }
        }
public void startGame() {
        Thread t1 = new Thread(this);
        t1.setName("Solver 1");
        t1.start();
        Thread t2 = new Thread(this);
        t2.setName("Solver 2");
        t2.start();
        }
private boolean solve(int row, int col) {   //doubt
        if (row == board.length) {
        row = 0;
        if (++col == board[row].length) {   //doubt
        return true;
        }
        }
        if (board[row][col] != 0) {
        return solve(row + 1, col);
        }
        for (int num = 1; num <= board.length; num++) {
        if (isValid(row, col, num)) {
        board[row][col] = num;
        if (solve(row + 1, col)) {
        return true;
        }
        }
        }
        board[row][col] = 0;
        return false;
        }
private boolean isValid(int row, int col, int num) {
        for (int i = 0; i < board.length; i++) {
        if (board[row][i] == num || board[i][col] == num) {
        return false;
        }
        }
        int regionSize = (int) Math.sqrt(board.length);
        int regionRow = row / regionSize;
        int regionCol = col / regionSize;
        for (int i = 0; i < regionSize; i++) {
        for (int j = 0; j < regionSize; j++) {
        if (board[regionRow * regionSize + i][regionCol * regionSize + j] == num) {
        return false;
        }
        }
        }
        return true;
        }
public boolean isSolved() {
        return solved;
        }
public int[][] getBoard() {
        return board;
        }
        }
class Q5MultithreadingGameSudoku {
    public static void main(String[] args) {
        int[][] board = {
                {0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 7, 9, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0},
                {5, 0, 0, 0, 0, 0, 0, 0, 0}
        };

        SudokuGameDemo sudokuGameDemo=new SudokuGameDemo(board);
        sudokuGameDemo.startGame();
    }
}
