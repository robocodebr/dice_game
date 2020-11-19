package Game_OOP;

import java.awt.Color;
import acm.program.*;
import acm.graphics.*;
import acm.io.*;

public class UI {
	private Game screen;
	IODialog dialog;
	
	public UI(Game screen) {
		this.dialog = screen.getDialog();
		this.screen = screen;
		
		this.clearScreen();
	}
	
	public void clearScreen() {
		Color bckgColor = new Color(58, 168, 50);
		GRect bckg = new GRect(0,0, screen.getSize().width, screen.getSize().height);
		bckg.setFilled(true);
		bckg.setColor(bckgColor);
		screen.add(bckg);
	}
	
	public void drawLabels(int count) {
		GLabel label = new GLabel("roll dices "+count+" times");
		screen.add(label, screen.getWidth()/2-label.getWidth()/2, 20);
		drawPlayerLabels(count);
	}
	
	public void drawLabels(int from, int to) {
		GLabel label = new GLabel("from "+from+" to "+to);
		screen.add(label, screen.getWidth()/2-label.getWidth()/2, 40);
		drawLabels(to-from);
	}
	
	public void drawPlayerLabels(int count) {
		float y = screen.getSize().height/2 - count*85/2 - 10;
		GLabel label = new GLabel("player1");
		screen.add(label, screen.getWidth()/2-137.5-label.getWidth()/2, y);
		label = new GLabel("player2");
		screen.add(label, screen.getWidth()/2+137.5-label.getWidth()/2, y);
	}

	public void drawRound(int diceQuantity) {
		float y = screen.getSize().height/2 - diceQuantity*85/2;
		
		for(int i=0;i<diceQuantity;i++) {
			screen.player1.rollDice(y);
			screen.player2.rollDice(y);
			y += 85;
		}
		screen.getWinner();
	}
	
	public void drawWinnerLabel(int countPlayer1Wins, int countPlayer2Wins) {
		GLabel label = new GLabel("dead heat");
		if(countPlayer1Wins>countPlayer2Wins) {
			label = new GLabel("player1 win");
		} else if(countPlayer1Wins<countPlayer2Wins) {
			label = new GLabel("player2 win");
		}
		screen.add(label, screen.getWidth()/2-label.getWidth()/2, 60);
	}
}
