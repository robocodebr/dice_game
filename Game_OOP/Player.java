package Game_OOP;

import java.util.ArrayList;
import java.util.List;

import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;

public class Player {

	public List<Integer> playerMoves = new ArrayList<Integer>();
	private Game game;
	private Dice dice;
	
	public Player(Game screen, boolean isFirstPlayer) {
		this.game = screen;
		if(isFirstPlayer) {
			this.dice = new Dice(screen, -175);
		} else {
			this.dice = new Dice(screen, 100);
		}
	}
	
	

	public void rollDice(float y) {
		RandomGenerator rgen = RandomGenerator.getInstance();
		int turn  = rgen.nextInt(1, 6);
		playerMoves.add(turn);
		dice.setDice(y, turn);
	}
}
