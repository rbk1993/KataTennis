package org.accenture.katatennis;

public class Player {

	private String name;

	private int score;
	private int gamesWon;
	private int gamesLost;
	
	public Player(String name) {
		this.name = name;
		this.gamesWon = 0;
		this.gamesLost = 0;
		this.score = 0;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getScore() {
		return score;
	}

	public void setNewScore() {
		this.score = 0;
	}
	
	public void increaseScore() {
		this.score++;
	}
	
	public int getGamesWon() {
		return gamesWon;
	}

	public void increaseGamesWon() {
		this.gamesWon++;
	}

	public int getGamesLost() {
		return gamesLost;
	}

	public void increaseGamesLost() {
		this.gamesLost++;
	}
	
}
