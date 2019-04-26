import java.io.*;
import java.util.*;

public class RPS{
	public static void main(String[]args){
		int x = 0;
		while(x == 0){
		int play = 0;
		String ene = "";
		String result = "";
		Scanner input = new Scanner(System.in);
		System.out.println("Rock, Paper, or Scissors? ");
		String player = input.nextLine();
		double com = Math.floor((Math.random())*3)+1;
		//System.out.println(com);
		if(player.toLowerCase().equals("rock")){
			play = 1;
		}else if(player.toLowerCase().equals("paper")){
			play = 2;
		}else if(player.toLowerCase().equals("scissors")){
			play = 3;
		}
		if(com == 1){
			ene = "rock";
		}else if(com == 2){
			ene = "paper";
		}else if(com == 3){
			ene = "scissors";
		}
		if(play == 1){
			if(com == 1){
				result = "Tie";
			}else if(com == 2){
				result = "You Lose";
				x++;
			}else if(com == 3){
				result = "You Win";
				x++;
			}
		}else if(play == 2){
			if(com == 1){
				result = "You Win";
				x++;
			}else if(com == 2){
				result = "Tie";
			}else if(com == 3){
				result = "You Lose";
				x++;
			}
		}else if(play == 3){
			if(com == 1){
				result = "You Lose";
				x++;
			}else if(com == 2){
				result = "You Win";
				x++;
			}else if(com == 3){
				result = "Tie";
			}
		}
		System.out.println("You chose " + player.toLowerCase() + ". Com chose " + ene + ". " + result + ".");
	}
	}
}