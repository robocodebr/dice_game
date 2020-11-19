package Game_OOP;

import java.awt.Color;

import acm.graphics.GArc;
import acm.graphics.GRoundRect;
import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;

public class Dice {
	
	private GraphicsProgram screen;
	public float positionX = 175;
	
	Dice(GraphicsProgram screen, float positionX) {
		this.screen = screen;
		this.positionX = positionX;
	}

	public void setDice(float y, int playerMove) {
		float x = (screen.getSize().width/2) + positionX;
		switch(playerMove) {
		case 1: diceWithOnePoint(x,y); break;
		case 2: diceWithTwoPoint(x,y);break;
		case 3: diceWithThreePoint(x,y);break;
		case 4: diceWithFourPoint(x,y);break;
		case 5: diceWithFivePoint(x,y);break;
		case 6: diceWithSixPoint(x,y);break;
		}
	}
	
	private void diceWithOnePoint(double x, double y) {
		int size = 75;
		GRoundRect dice = new GRoundRect(x, y, size, size, size/10);
		dice.setFilled(true);
		dice.setColor(Color.WHITE);
		GArc arc = new GArc(x+3*size/8, y+3*size/8, size/4, size/4, 0, 360);
		arc.setFilled(true);
		arc.setColor(Color.BLUE);
		screen.add(dice);
		screen.add(arc);
	}
	
	private void diceWithTwoPoint(double x, double y) {
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
		screen.add(dice);
		screen.add(arc1);
		screen.add(arc2);
	}
	
	private void diceWithThreePoint(double x, double y) {
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
		screen.add(dice);
		screen.add(arc1);
		screen.add(arc2);
		screen.add(arc3);
	}
	
	private void diceWithFourPoint(double x, double y) {
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
		screen.add(dice);
		screen.add(arc1);
		screen.add(arc2);
		screen.add(arc3);
		screen.add(arc4);
	}
	
	private void diceWithFivePoint(double x, double y) {
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
		screen.add(dice);
		screen.add(arc1);
		screen.add(arc2);
		screen.add(arc3);
		screen.add(arc4);
		screen.add(arc5);
	}
	
	private void diceWithSixPoint(double x, double y) {
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
		screen.add(dice);
		screen.add(arc1);
		screen.add(arc2);
		screen.add(arc3);
		screen.add(arc4);
		screen.add(arc5);
		screen.add(arc6);
	}
}
