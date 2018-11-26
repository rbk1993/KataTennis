package org.accenture.katatennis;

public class Game {
	
	public Player playerOne;
	public Player playerTwo;
	public Player winner;
	
	public Game(Player playerOne, Player playerTwo) throws Exception {
		
		if(playerOne != null && playerTwo != null) {
			
			if(!playerOne.getName().equals(playerTwo.getName())) {
				this.playerOne = playerOne;
				this.playerTwo = playerTwo;
				this.playerOne.setNewScore();
				this.playerTwo.setNewScore();
			} else {
				throw new IllegalArgumentException("The two players must have a valid and different name");
			}
			
		} else {
			throw new IllegalArgumentException("Cannot create a game with a null player");
		}

	}
	
	public String getScore() {
			
		if(this.hasWinner()) {
			return winner.getName()+" wins";
		}
		
		if(hasAdvantage()) {
			return "advantage "+this.getLeader().getName();
		}
			
		if(isDeuce()) {
			return "deuce";
		}
		
		if(playerOne.getScore() == playerTwo.getScore()) {
			return this.scoreToString(playerOne.getScore())+" all";
		}
		
		return 	this.scoreToString(playerOne.getScore())+" - "+this.scoreToString(playerTwo.getScore());
		
	}
	
	public void playerOneWinsBall() {
		if(playerOne != null && playerTwo != null) {
				System.out.println("Player "+playerOne.getName()+" wins the ball !");
				playerOne.increaseScore();
				if(this.hasWinner()) {
					winner = playerOne;
					playerOne.increaseGamesWon();
					playerTwo.increaseGamesLost();
				}
				System.out.println("Score : "+this.getScore());
		}
	}

	public void playerTwoWinsBall() {
		if(playerOne != null && playerTwo != null) {
				System.out.println("Player "+playerTwo.getName()+" wins the ball !");
				playerTwo.increaseScore();
				if(this.hasWinner()) {
					winner = playerTwo;
					playerTwo.increaseGamesWon();
					playerOne.increaseGamesLost();
				}
				System.out.println("Score : "+this.getScore());
		}
	}
	
	public boolean hasWinner() {
		
		if(playerOne != null && playerTwo != null) {
			if( playerOne.getScore() >= 4 && playerOne.getScore() >= playerTwo.getScore() + 2 
				|| playerTwo.getScore() >= 4 && playerTwo.getScore() >= playerOne.getScore() + 2) {
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
			
	}
	
	public boolean hasAdvantage() {
		
		if(playerOne != null && playerTwo != null) {
			if( playerOne.getScore() >= 3 && playerTwo.getScore() >= 3 
				&& (playerOne.getScore() == playerTwo.getScore() + 1 || playerTwo.getScore() == playerOne.getScore() + 1)
			) {
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}
	
	public boolean isDeuce() {
		
		if(playerOne != null && playerTwo != null) {
			if( playerOne.getScore() >= 3 && playerTwo.getScore() >= 3 && playerOne.getScore() == playerTwo.getScore()) {
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}
	
	public Player getLeader() {
		
		if(playerOne != null && playerTwo != null) {
			if( playerOne.getScore() > playerTwo.getScore() ) {
				return playerOne;
			} else if (playerOne.getScore() < playerTwo.getScore()){
				return playerTwo;
			} else {
				return null;
			}
		} else {
			return null;
		}
	}
	
	public String scoreToString(int score) {
		if(score >= 0) {
			switch(score) {
				case 0: return "love";
				case 1: return "fifteen";
				case 2: return "thirty";
				case 3: return "forty";
				default: return "forty";
			}
		} else {
			return "Invalid score";
		}
	}
	
}
