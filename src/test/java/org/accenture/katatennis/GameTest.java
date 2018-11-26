package org.accenture.katatennis;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

import org.accenture.katatennis.Game;
import org.accenture.katatennis.Player;
import org.junit.Before;
import org.junit.After;

public class GameTest {
	
	Game game;
	Player player1;
	Player player2;
	
	@Before
	public void initialize() throws Exception {
		
		System.out.println("--------\nNew Game Unit Test !\n--------");
		player1 = new Player("Reda");
		player2 = new Player("Rafael");
		game = new Game(player1, player2);
	}
	
	@Test
	public void LoveAllTest() {
		assertEquals("love all",game.getScore());
	}
	
	@Test
	public void FifteenLoveTest() {
		game.playerOneWinsBall();
		assertEquals("fifteen - love",game.getScore());
	}
	
	@Test
	public void FifteenAllTest() {
		game.playerOneWinsBall();
		game.playerTwoWinsBall();
		assertEquals("fifteen all",game.getScore());
	}
	
	@Test
	public void ThirtyFifteenTest() {
		game.playerOneWinsBall();
		game.playerTwoWinsBall();
		game.playerOneWinsBall();
		assertEquals("thirty - fifteen",game.getScore());
	}
	
	@Test
	public void ThirtyAllTest() {
		game.playerOneWinsBall();
		game.playerTwoWinsBall();
		game.playerOneWinsBall();
		game.playerTwoWinsBall();
		assertEquals("thirty all",game.getScore());
	}
	
	@Test
	public void ThirtyLoveTest() {
		game.playerOneWinsBall();
		game.playerOneWinsBall();
		assertEquals("thirty - love",(game.getScore()));
	}
	
	@Test
	public void FortyLoveTest() {
		game.playerOneWinsBall();
		game.playerOneWinsBall();
		game.playerOneWinsBall();
		assertEquals("forty - love",game.getScore());
	}
	
	@Test
	public void FortyFifteenTest() {
		game.playerOneWinsBall();
		game.playerOneWinsBall();
		game.playerOneWinsBall();
		game.playerTwoWinsBall();
		assertEquals("forty - fifteen",game.getScore());
	}
	
	@Test
	public void FortyThirtyTest() {
		game.playerOneWinsBall();
		game.playerOneWinsBall();
		game.playerTwoWinsBall();
		game.playerOneWinsBall();
		game.playerTwoWinsBall();
		assertEquals("forty - thirty",game.getScore());
	}
	
	@Test
	public void DeuceTest1() {
		game.playerOneWinsBall();
		game.playerTwoWinsBall();
		game.playerOneWinsBall();
		game.playerTwoWinsBall();
		game.playerOneWinsBall();
		game.playerTwoWinsBall();
		assertEquals("deuce",game.getScore());
	}
	
	@Test
	public void DeuceTest2() {
		game.playerOneWinsBall();
		game.playerTwoWinsBall();
		game.playerOneWinsBall();
		game.playerTwoWinsBall();
		game.playerOneWinsBall();
		game.playerTwoWinsBall();
		game.playerTwoWinsBall();
		game.playerOneWinsBall();
		assertEquals("deuce",game.getScore());
	}
	
	@Test
	public void DeuceTest3() {
		game.playerOneWinsBall();
		game.playerTwoWinsBall();
		game.playerOneWinsBall();
		game.playerTwoWinsBall();
		game.playerOneWinsBall();
		game.playerTwoWinsBall();
		game.playerTwoWinsBall();
		game.playerOneWinsBall();
		game.playerOneWinsBall();
		game.playerTwoWinsBall();
		assertEquals("deuce",game.getScore());
	}
	
	@Test
	public void AdvantagePlayerOneTest1() {
		game.playerOneWinsBall();
		game.playerTwoWinsBall();
		game.playerOneWinsBall();
		game.playerTwoWinsBall();
		game.playerOneWinsBall();
		game.playerTwoWinsBall();
		game.playerOneWinsBall();
		assertEquals("advantage Reda",game.getScore());
	}
	
	@Test
	public void AdvantagePlayerOneTest2() {
		game.playerOneWinsBall();
		game.playerTwoWinsBall();
		game.playerOneWinsBall();
		game.playerTwoWinsBall();
		game.playerOneWinsBall();
		game.playerTwoWinsBall();
		game.playerOneWinsBall();
		game.playerTwoWinsBall();
		game.playerOneWinsBall();
		assertEquals("advantage Reda",game.getScore());
	}
	
	@Test
	public void AdvantagePlayerOneTest3() {
		game.playerOneWinsBall();
		game.playerTwoWinsBall();
		game.playerOneWinsBall();
		game.playerTwoWinsBall();
		game.playerOneWinsBall();
		game.playerTwoWinsBall();
		game.playerOneWinsBall();
		game.playerTwoWinsBall();
		game.playerOneWinsBall();
		game.playerTwoWinsBall();
		game.playerOneWinsBall();
		assertEquals("advantage Reda",game.getScore());
	}
	
	@Test
	public void AdvantagePlayerTwoTest1() {
		game.playerOneWinsBall();
		game.playerTwoWinsBall();
		game.playerOneWinsBall();
		game.playerTwoWinsBall();
		game.playerOneWinsBall();
		game.playerTwoWinsBall();
		game.playerTwoWinsBall();
		assertEquals("advantage Rafael",game.getScore());
	}
	
	@Test
	public void AdvantagePlayerTwoTest2() {
		game.playerOneWinsBall();
		game.playerTwoWinsBall();
		game.playerOneWinsBall();
		game.playerTwoWinsBall();
		game.playerOneWinsBall();
		game.playerTwoWinsBall();
		game.playerOneWinsBall();
		game.playerTwoWinsBall();
		game.playerTwoWinsBall();
		assertEquals("advantage Rafael",game.getScore());
	}
	
	@Test
	public void AdvantagePlayerTwoTest3() {
		game.playerOneWinsBall();
		game.playerTwoWinsBall();
		game.playerOneWinsBall();
		game.playerTwoWinsBall();
		game.playerOneWinsBall();
		game.playerTwoWinsBall();
		game.playerOneWinsBall();
		game.playerTwoWinsBall();
		game.playerOneWinsBall();
		game.playerTwoWinsBall();
		game.playerTwoWinsBall();
		assertEquals("advantage Rafael",game.getScore());
	}
	
	@Test
	public void PlayerOneWinsTest1() {
		game.playerOneWinsBall();
		game.playerTwoWinsBall();
		game.playerOneWinsBall();
		game.playerTwoWinsBall();
		game.playerOneWinsBall();
		game.playerTwoWinsBall();
		game.playerOneWinsBall();
		game.playerOneWinsBall();
		assertEquals("Reda wins",game.getScore());
	}
	
	@Test
	public void PlayerOneWinsTest2() {
		game.playerOneWinsBall();
		game.playerTwoWinsBall();
		game.playerOneWinsBall();
		game.playerTwoWinsBall();
		game.playerOneWinsBall();
		game.playerOneWinsBall();
		assertEquals("Reda wins",game.getScore());
	}
	
	@Test
	public void PlayerOneWinsTest3() {
		game.playerOneWinsBall();
		game.playerTwoWinsBall();
		game.playerOneWinsBall();
		game.playerOneWinsBall();
		game.playerOneWinsBall();
		assertEquals("Reda wins",game.getScore());
	}
	
	@Test
	public void PlayerOneWinsTest4() {
		game.playerOneWinsBall();
		game.playerOneWinsBall();
		game.playerOneWinsBall();
		game.playerOneWinsBall();
		assertEquals("Reda wins",game.getScore());
	}
	
	@Test
	public void PlayerOneWinsTest5() {
		game.playerOneWinsBall();
		game.playerTwoWinsBall();
		game.playerOneWinsBall();
		game.playerTwoWinsBall();
		game.playerOneWinsBall();
		game.playerTwoWinsBall();
		game.playerOneWinsBall();
		game.playerTwoWinsBall();
		game.playerOneWinsBall();
		game.playerOneWinsBall();
		assertEquals("Reda wins",game.getScore());
	}
	
	@After
	public void end() {
		game = null;
	}

}
