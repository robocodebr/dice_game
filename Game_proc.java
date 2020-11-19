
import java.awt.Color;

import java.util.ArrayList;
import java.util.List;
import acm.graphics.*;
import acm.io.*;
import acm.program.*;
import acm.util.RandomGenerator;



public class Game_proc extends GraphicsProgram {

	private List<Integer> player1Moves = new ArrayList<Integer>();
	private List<Integer> player2Moves = new ArrayList<Integer>();
	
	public static void main(String[] args) {
			new Game_proc().main(args);
		
	}
	public void run() {
		this.setSize(800, 600);
		clearScreen();
		IODialog dialog = getDialog();
		boolean isContinue=false;
	
		
		do {
			int diceQuantity = dialog.readInt("Enter how many dices must be rolled");
			do {
				clearScreen();
				if(diceQuantity<=6) { 
					drawLabels(diceQuantity);
					drawRound(diceQuantity);
				} else {
					drawLabels(diceQuantity-6, diceQuantity);
					drawRound(6);
					pause(1000l);
				}
				diceQuantity -=6;
				
				
			} while(diceQuantity>0);
			pause(5000l);
			isContinue = dialog.readBoolean("Try again?");
		} while(isContinue);
	}
	
	public void getWinner() {
		int countPlayer1Wins = 0;
		int countPlayer2Wins = 0;
		for(int i=0; i<player1Moves.size(); i++) {
			if(player1Moves.get(i) > player2Moves.get(i)) {
				countPlayer1Wins++;
			} else {
				countPlayer2Wins++;
			}
		}
		GLabel label = new GLabel("dead heat");
		if(countPlayer1Wins>countPlayer2Wins) {
			label = new GLabel("player1 win");
		} else if(countPlayer1Wins<countPlayer2Wins) {
			label = new GLabel("player2 win");
		}
		add(label, getWidth()/2-label.getWidth()/2, 60);
	}
	
	public void drawLabels(int count) {
		GLabel label = new GLabel("roll dices "+count+" times");
		add(label, getWidth()/2-label.getWidth()/2, 20);
		drawPlayerLabels(count);
	}
	
	public void drawLabels(int from, int to) {
		GLabel label = new GLabel("from "+from+" to "+to);
		add(label, getWidth()/2-label.getWidth()/2, 40);
		drawLabels(to-from);
	}
	
	public void drawPlayerLabels(int count) {
		float y = getSize().height/2 - count*85/2 - 10;
		GLabel label = new GLabel("player1");
		add(label, getWidth()/2-137.5-label.getWidth()/2, y);
		label = new GLabel("player2");
		add(label, getWidth()/2+137.5-label.getWidth()/2, y);
	}

	public void drawRound(int diceQuantity) {
		float y = getSize().height/2 - diceQuantity*85/2;
		for(int i=0;i<diceQuantity;i++) {
			rollDices(y);
			y += 85;
		}
		getWinner();
	}
	
	public void rollDices(float y) {
		RandomGenerator rgen = RandomGenerator.getInstance();
		int player1Dice =  rgen.nextInt(1, 6);
		int player2Dice =  rgen.nextInt(1, 6);
		player1Moves.add(player1Dice);
		player2Moves.add(player2Dice);
		float x= getSize().width/2;
		
		setDice(x-175, y, player1Dice);
		setDice(x+100, y, player2Dice);
		
	}

	public void setDice(float x, float y, int playerMove) {
		switch(playerMove) {
		case 1: diceWithOnePoint(x,y); break;
		case 2: diceWithTwoPoint(x,y);break;
		case 3: diceWithThreePoint(x,y);break;
		case 4: diceWithFourPoint(x,y);break;
		case 5: diceWithFivePoint(x,y);break;
		case 6: diceWithSixPoint(x,y);break;
		}
	}
	
	public void diceWithOnePoint(double x, double y) {
		int size = 75;
		GRoundRect dice = new GRoundRect(x, y, size, size, size/10);
		dice.setFilled(true);
		dice.setColor(Color.WHITE);
		GArc arc = new GArc(x+3*size/8, y+3*size/8, size/4, size/4, 0, 360);
		arc.setFilled(true);
		arc.setColor(Color.BLUE);
		add(dice);
		add(arc);
	}
	
	public void diceWithTwoPoint(double x, double y) {
		int size = 75;
		GRoundRect dice = new GRoundRect(x, y, size, size, size/10);
		dice.setFilled(true);
		dice.setColor(Color.WHITE);
		GArc arc1 = new GArc(x+size/10, y+13*size/20, size/4, size/4, 0, 360);
		arc1.setFilled(true);
		arc1.setColor(Color.BLUE);
		GArc arc2 = new GArc(x+13*size/20, y+size/10, size/4, size/4, 0, 360);
		arc2.setFilled(true);
		arc2.setColor(Color.BLUE);
		add(dice);
		add(arc1);
		add(arc2);
	}
	
	public void diceWithThreePoint(double x, double y) {
		int size = 75;
		GRoundRect dice = new GRoundRect(x, y, size, size, size/10);
		dice.setFilled(true);
		dice.setColor(Color.WHITE);
		GArc arc1 = new GArc(x+size/10, y+13*size/20, size/4, size/4, 0, 360);
		arc1.setFilled(true);
		arc1.setColor(Color.BLUE);
		GArc arc2 = new GArc(x+13*size/20, y+size/10, size/4, size/4, 0, 360);
		arc2.setFilled(true);
		arc2.setColor(Color.BLUE);
		GArc arc3 = new GArc(x+3*size/8, y+3*size/8, size/4, size/4, 0, 360);
		arc3.setFilled(true);
		arc3.setColor(Color.BLUE);
		add(dice);
		add(arc1);
		add(arc2);
		add(arc3);
	}
	
	public void diceWithFourPoint(double x, double y) {
		int size = 75;
		GRoundRect dice = new GRoundRect(x, y, size, size, size/10);
		dice.setFilled(true);
		dice.setColor(Color.WHITE);
		GArc arc1 = new GArc(x+size/10, y+13*size/20, size/4, size/4, 0, 360);
		arc1.setFilled(true);
		arc1.setColor(Color.BLUE);
		GArc arc2 = new GArc(x+13*size/20, y+size/10, size/4, size/4, 0, 360);
		arc2.setFilled(true);
		arc2.setColor(Color.BLUE);
		GArc arc3 = new GArc(x+13*size/20, y+13*size/20, size/4, size/4, 0, 360);
		arc3.setFilled(true);
		arc3.setColor(Color.BLUE);
		GArc arc4 = new GArc(x+size/10, y+size/10, size/4, size/4, 0, 360);
		arc4.setFilled(true);
		arc4.setColor(Color.BLUE);
		add(dice);
		add(arc1);
		add(arc2);
		add(arc3);
		add(arc4);
	}
	
	public void diceWithFivePoint(double x, double y) {
		int size = 75;
		GRoundRect dice = new GRoundRect(x, y, size, size, size/10);
		dice.setFilled(true);
		dice.setColor(Color.WHITE);
		GArc arc1 = new GArc(x+size/10, y+13*size/20, size/4, size/4, 0, 360);
		arc1.setFilled(true);
		arc1.setColor(Color.BLUE);
		GArc arc2 = new GArc(x+13*size/20, y+size/10, size/4, size/4, 0, 360);
		arc2.setFilled(true);
		arc2.setColor(Color.BLUE);
		GArc arc3 = new GArc(x+13*size/20, y+13*size/20, size/4, size/4, 0, 360);
		arc3.setFilled(true);
		arc3.setColor(Color.BLUE);
		GArc arc4 = new GArc(x+size/10, y+size/10, size/4, size/4, 0, 360);
		arc4.setFilled(true);
		arc4.setColor(Color.BLUE);
		GArc arc5 = new GArc(x+3*size/8, y+3*size/8, size/4, size/4, 0, 360);
		arc5.setFilled(true);
		arc5.setColor(Color.BLUE);
		add(dice);
		add(arc1);
		add(arc2);
		add(arc3);
		add(arc4);
		add(arc5);
	}
	
	public void diceWithSixPoint(double x, double y) {
		int size = 75;
		GRoundRect dice = new GRoundRect(x, y, size, size, size/10);
		dice.setFilled(true);
		dice.setColor(Color.WHITE);
		GArc arc1 = new GArc(x+size/10, y+13*size/20, size/4, size/4, 0, 360);
		arc1.setFilled(true);
		arc1.setColor(Color.BLUE);
		GArc arc2 = new GArc(x+13*size/20, y+size/10, size/4, size/4, 0, 360);
		arc2.setFilled(true);
		arc2.setColor(Color.BLUE);
		GArc arc3 = new GArc(x+13*size/20, y+13*size/20, size/4, size/4, 0, 360);
		arc3.setFilled(true);
		arc3.setColor(Color.BLUE);
		GArc arc4 = new GArc(x+size/10, y+size/10, size/4, size/4, 0, 360);
		arc4.setFilled(true);
		arc4.setColor(Color.BLUE);
		GArc arc5 = new GArc(x+2.9*size/8, y+13*size/20, size/4, size/4, 0, 360);
		arc5.setFilled(true);
		arc5.setColor(Color.BLUE);
		GArc arc6 = new GArc(x+2.9*size/8, y+size/10, size/4, size/4, 0, 360);
		arc6.setFilled(true);
		arc6.setColor(Color.BLUE);
		add(dice);
		add(arc1);
		add(arc2);
		add(arc3);
		add(arc4);
		add(arc5);
		add(arc6);
	}
	
	public void clearScreen() {
		Color bckgColor = new Color(58, 168, 50);
		GRect bckg = new GRect(0,0, getSize().width, getSize().height);
		bckg.setFilled(true);;
		bckg.setColor(bckgColor);
		add(bckg);
	}
	
}
