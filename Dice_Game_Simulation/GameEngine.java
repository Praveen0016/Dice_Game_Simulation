package Dice_Game_Simulation;

import java.util.ArrayList;


public class GameEngine {
    ArrayList<Player>arr;
    Dice dice;

    public GameEngine(ArrayList<Player>list){
        arr = list;
        dice = new Dice();
    }

    public void playerRound(){
        int highestOp = 0;
        Player winPlayer = null;
        
        for(Player P : arr){
            int n = dice.roll();
            System.out.println(P.showName() + " rolled " + n);
            if(n > highestOp){
                highestOp = n;
                winPlayer = P;
            }
            else if(n == highestOp){
                winPlayer = null;
            }
        }
        if(winPlayer != null){
            System.out.println("The Player who won this round is "+winPlayer.showName()+" , the output we got is "+highestOp);
            winPlayer.incrementWin();
        }else {
            System.out.println("It's a tie! No winner this round.");
        }
    }

    public void showResults(){
        System.out.println("\nCurrent Scores:");
        for(Player P : arr){
            System.out.println(P.showName()+" have won "+P.showWins()+" round");
        }
         System.out.println();
    }
}
