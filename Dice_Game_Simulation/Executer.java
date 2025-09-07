package Dice_Game_Simulation;

import java.util.ArrayList;

import java.util.Scanner;



public class Executer {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("================================");
        System.out.println("      # Welcome to Dice Game # ");
        System.out.println("================================");


        System.out.println("Give the number of players : ");
        int n = sc.nextInt();
        sc.nextLine();

        ArrayList<Player>list = new ArrayList<>();
        for(int i=0;i<n;i++){
            System.out.println("player ~"+(i+1)+" name :");
            String name = sc.nextLine();
            list.add(new Player(name));

        }
        
        GameEngine ge = new GameEngine(list);

        while(true){
            System.out.println("You want to play the game ?(1 = yes , 0 = No) :");
            int ip = sc.nextInt();
            if(ip == 1){
                ge.playerRound();
                ge.showResults();
            } else {
                System.out.println("Game ended. Final results:");
                ge.showResults();
                break;
        }

    }
    sc.close();
}
    
}
