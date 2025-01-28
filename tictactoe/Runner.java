package tictactoe;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
       Game game = new Game();

       boolean tie = game.startGame();

       if(tie )
           System.out.println("Game End with a TIE");
    }
}
