package tictactoe.models;

public class Board {
    int size;
    PlayingPiece [][] board;
    public Board(int size)
    {
        this.size= size;
        board = new PlayingPiece[size][size];
    }

    public boolean checkWinner()
    {

        //horizontal Check

        for(int i=0; i<size; i++)
        {

            boolean winner = true;
            for(int j =1; j<size; j++)
            {
                if( (board[i][j]  == null && board[i][j-1] == null) || board[i][j] != board[i][j-1])
                {
                    winner = false;
                    break;
                }
            }

            if(winner)
                return winner;
        }


        // Vertical Check

        for(int j=0; j<size; j++)
        {

            boolean winner = true;
            for(int i =1; i<size; i++)
            {
                if( (board[i][j]  == null && board[i-1][j] == null) || board[i][j] != board[i-1][j])
                {
                    winner = false;
                    break;
                }
            }

            if(winner) {
                printBoard();
                return winner;
            }
        }

        //check for diagonals


        return false;
    }

    public boolean addPiece(PlayingPiece playingPiece, int i , int j)
    {
        if(!checkPossiblity(i,j))
            return false;

        board[i][j] =  playingPiece;
        return true;
    }

    public boolean checkPossiblity(int i , int j)
    {
        if(i >= size || i<0 || j>=size || j<0)
            return false;

        return board[i][j] == null ? true: false;
    }

    public boolean haveFreeCells()
    {
        for(int i = 0; i<size; i++)
            for(int j = 0; j<size; j++)
                if(board [i][j] == null)
                    return true;

        return false;
    }

    public void printBoard()
    {

        for(int i = 0 ;i<size;i++)
        {
            for(int j = 0; j<size; j++)
            {
                System.out.print("| "+(board[i][j]==null ? " ": (board[i][j].piece == piece.X) ? "X" : "O")+ "\t"  );
            }
            System.out.println();
        }
    }


}
