package Game_OOP;
import acm.program.*;
import acm.graphics.*;

public class Game extends GraphicsProgram {
	public Player player1;
	public Player player2;
	UI ui;
	
	public Game() {
		ui = new UI(this);
		player1 = new Player(this, true);
		player2 = new Player(this, false);
	}
	
	public static void main(String[] args) {
		new Game().main(args);
	}
	
	public void run() {
		this.setSize(800, 600);
		boolean isContinue=false;
		do {
			int diceQuantity = ui.dialog.readInt("Enter how many dices must be rolled");
			do {
				ui.clearScreen();
				if(diceQuantity<=6) { 
					ui.drawLabels(diceQuantity);
					ui.drawRound(diceQuantity);
				} else {
					ui.drawLabels(diceQuantity-6, diceQuantity);
					ui.drawRound(6);
					pause(1000l);
				}
				diceQuantity -=6;
				
				
			} while(diceQuantity>0);
			pause(5000l);
			isContinue = ui.dialog.readBoolean("Try again?");
		} while(isContinue);
	}

	public void getWinner() {
		int countPlayer1Wins = 0;
		int countPlayer2Wins = 0;
		for(int i=0; i<player1.playerMoves.size(); i++) {
			if(player1.playerMoves.get(i) > player2.playerMoves.get(i)) {
				countPlayer1Wins++;
			} else {
				countPlayer2Wins++;
			}
		}
		ui.drawWinnerLabel(countPlayer1Wins, countPlayer2Wins);
	}
}
