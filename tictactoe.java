public class tictactoe{
    public static void main(String[] args){
        boolean WinOrLose = false;
        
    }
    public static char[][] getGameBoard(){
        char[][] board = new char[3][3];
        for(int i = 0; i<3; i++){
            for(int j = 0; j<3; j++){
                board[i][j] = '-';
            }
        }
        return board;
    }
    public static boolean Validate(char[][] gameBoard, int row, int col){
        if(gameBoard[row][col]=='-'){
            return true;
        }
        else{
            return false;
        }
    }
    public static boolean isComplete(char[][] gameBoard, int row, int col){
        
    }
}