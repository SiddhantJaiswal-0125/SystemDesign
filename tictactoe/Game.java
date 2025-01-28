package tictactoe;

import tictactoe.models.Board;
import tictactoe.models.Player;
import tictactoe.models.PlayingPieceO;
import tictactoe.models.PlayingPieceX;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Game {
    public Scanner sc = new Scanner(System.in);

    public boolean startGame()
    {

        Player player1 =  new Player("Player 1", new PlayingPieceX());
        Player player2 = new Player("Player 2", new PlayingPieceO());
        System.out.println("Enter size of Board: ");
        int size = sc.nextInt();

        Board board = new Board(size);
        boolean noWinner = true;
        Deque<Player> players = new ArrayDeque<>();
        players.add(player1);
        players.add(player2);

        while(noWinner)
        {
            board.printBoard();
            Player playerTurn = players.removeFirst();

            boolean haveFreeCell = board.haveFreeCells();
            System.out.println("HAVE FREE CELL "+haveFreeCell);
            if(haveFreeCell == false)
                return false;

            System.out.println("Enter Row and Column index where you want to place");
            int i = sc.nextInt();
            int j = sc.nextInt();
            if(board.addPiece(playerTurn.getPlayingPiece(), i, j) == false)
            {
                System.out.println("Entered a wrong Place, please enter a different the Row and Column : ");
                players.addFirst(playerTurn);
                continue;
            }
            else if(board.checkWinner())
            {
                System.out.println(playerTurn.getuName()+" is the Winner !!");
                noWinner = false;
                break;
            }


            players.addLast(playerTurn);
        }


        return noWinner;
    }
}
