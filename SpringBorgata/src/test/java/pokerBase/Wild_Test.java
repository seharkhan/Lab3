package pokerBase;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Collections;

import org.junit.Test;

import pokerEnums.eCardNo;
import pokerEnums.eHandStrength;
import pokerEnums.eRank;
import pokerEnums.eSuit;

public class Wild_Test {
	
	@Test
	public void FiveOfAKind() {

		ArrayList<Card> Wilds = new ArrayList<Card>();

		Wilds.add(new Card(eSuit.CLUBS, eRank.TWO, 0));
		Wilds.add(new Card(eSuit.SPADES, eRank.TWO, 0));
		Wilds.add(new Card(eSuit.HEARTS, eRank.TWO, 0));
		Wilds.add(new Card(eSuit.DIAMONDS, eRank.TWO, 0));

		int NbrOfJokers = 0;
		
		Deck d = new Deck(NbrOfJokers,Wilds);
		Hand h = new Hand();
		
		h.AddCardToHand(new Card(eSuit.CLUBS, eRank.TWO, true));
		h.AddCardToHand(new Card(eSuit.DIAMONDS, eRank.FIVE, true));
		h.AddCardToHand(new Card(eSuit.SPADES, eRank.TEN, 0));
		h.AddCardToHand(new Card(eSuit.HEARTS, eRank.TEN, 0));
		h.AddCardToHand(new Card(eSuit.CLUBS, eRank.TEN, 0));
		h = Hand.EvalHand(h);


		System.out.println(h.getHandStrength());
		
		assertTrue(h.getHandStrength() == eHandStrength.FiveOfAKind.getHandStrength());
		assertTrue(h.getHighPairStrength() == eRank.TEN.getRank());
		assertTrue(h.getLowPairStrength() == 0);
		assertTrue(h.getKicker() == null);
	}
	
	@Test
	public void RoyalFlush() {

		ArrayList<Card> Wilds = new ArrayList<Card>();

		Wilds.add(new Card(eSuit.CLUBS, eRank.TWO, 0));
		Wilds.add(new Card(eSuit.SPADES, eRank.TWO, 0));
		Wilds.add(new Card(eSuit.HEARTS, eRank.TWO, 0));
		Wilds.add(new Card(eSuit.DIAMONDS, eRank.TWO, 0));

		int NbrOfJokers = 0;
		
		Deck d = new Deck(NbrOfJokers,Wilds);
		Hand h = new Hand();
		
		h.AddCardToHand(new Card(eSuit.CLUBS, eRank.TWO, true));
		h.AddCardToHand(new Card(eSuit.SPADES, eRank.TEN, true));
		h.AddCardToHand(new Card(eSuit.CLUBS, eRank.QUEEN, 0));
		h.AddCardToHand(new Card(eSuit.CLUBS, eRank.KING, 0));
		h.AddCardToHand(new Card(eSuit.CLUBS, eRank.ACE, 0));
		h = Hand.EvalHand(h);


		System.out.println(h.getHandStrength());
		
		assertTrue(h.getHandStrength() == eHandStrength.RoyalFlush.getHandStrength());
		assertTrue(h.getHighPairStrength() == 0);
		assertTrue(h.getLowPairStrength() == 0);
		assertTrue(h.getKicker() == null);
	}
	
	@Test
	public void StraightFlush() {

		ArrayList<Card> Wilds = new ArrayList<Card>();

		Wilds.add(new Card(eSuit.CLUBS, eRank.TWO, 0));
		Wilds.add(new Card(eSuit.SPADES, eRank.TWO, 0));
		Wilds.add(new Card(eSuit.HEARTS, eRank.TWO, 0));
		Wilds.add(new Card(eSuit.DIAMONDS, eRank.TWO, 0));

		int NbrOfJokers = 0;
		
		Deck d = new Deck(NbrOfJokers,Wilds);
		Hand h = new Hand();
		
		h.AddCardToHand(new Card(eSuit.CLUBS, eRank.TWO, true));
		h.AddCardToHand(new Card(eSuit.DIAMONDS, eRank.TWO, true));
		h.AddCardToHand(new Card(eSuit.CLUBS, eRank.FOUR, 0));
		h.AddCardToHand(new Card(eSuit.CLUBS, eRank.FIVE, 0));
		h.AddCardToHand(new Card(eSuit.CLUBS, eRank.SIX, 0));
		h = Hand.EvalHand(h);


		System.out.println(h.getHandStrength());
		
		assertTrue(h.getHandStrength() == eHandStrength.StraightFlush.getHandStrength());
		assertTrue(h.getHighPairStrength() == eRank.EIGHT.getRank());
		assertTrue(h.getLowPairStrength() == 0);
		assertTrue(h.getKicker() == null);
	}

	@Test
	public void Flush() {

		ArrayList<Card> Wilds = new ArrayList<Card>();

		Wilds.add(new Card(eSuit.CLUBS, eRank.TWO, 0));
		Wilds.add(new Card(eSuit.SPADES, eRank.TWO, 0));
		Wilds.add(new Card(eSuit.HEARTS, eRank.TWO, 0));
		Wilds.add(new Card(eSuit.DIAMONDS, eRank.TWO, 0));

		int NbrOfJokers = 0;
		
		Deck d = new Deck(NbrOfJokers,Wilds);
		Hand h = new Hand();
		
		h.AddCardToHand(new Card(eSuit.CLUBS, eRank.TWO, true));
		h.AddCardToHand(new Card(eSuit.HEARTS, eRank.TWO, true));
		h.AddCardToHand(new Card(eSuit.DIAMONDS, eRank.QUEEN, 0));
		h.AddCardToHand(new Card(eSuit.DIAMONDS, eRank.TEN, 0));
		h.AddCardToHand(new Card(eSuit.DIAMONDS, eRank.SEVEN, 0));
		h = Hand.EvalHand(h);


		System.out.println(h.getHandStrength());
		
		assertTrue(h.getHandStrength() == eHandStrength.Flush.getHandStrength());
		assertTrue(h.getHighPairStrength() == eRank.ACE.getRank());
		assertTrue(h.getLowPairStrength() == 0);
		assertTrue(h.getKicker() == null);
	}
	
	@Test
	public void Straight() {

		ArrayList<Card> Wilds = new ArrayList<Card>();

		Wilds.add(new Card(eSuit.CLUBS, eRank.TWO, 0));
		Wilds.add(new Card(eSuit.SPADES, eRank.TWO, 0));
		Wilds.add(new Card(eSuit.HEARTS, eRank.TWO, 0));
		Wilds.add(new Card(eSuit.DIAMONDS, eRank.TWO, 0));

		int NbrOfJokers = 0;
		
		Deck d = new Deck(NbrOfJokers,Wilds);
		Hand h = new Hand();
		
		h.AddCardToHand(new Card(eSuit.CLUBS, eRank.TWO, true));
		h.AddCardToHand(new Card(eSuit.DIAMONDS, eRank.TWO, true));
		h.AddCardToHand(new Card(eSuit.SPADES, eRank.QUEEN, 0));
		h.AddCardToHand(new Card(eSuit.HEARTS, eRank.KING, 0));
		h.AddCardToHand(new Card(eSuit.CLUBS, eRank.ACE, 0));
		h = Hand.EvalHand(h);


		System.out.println(h.getHandStrength());
		
		assertTrue(h.getHandStrength() == eHandStrength.Straight.getHandStrength());
		assertTrue(h.getHighPairStrength() == eRank.ACE.getRank());
		assertTrue(h.getLowPairStrength() == 0);
		assertTrue(h.getKicker() == null);
	}
	
	@Test
	public void ThreeOfAKind() {

		ArrayList<Card> Wilds = new ArrayList<Card>();

		Wilds.add(new Card(eSuit.CLUBS, eRank.TWO, 0));
		Wilds.add(new Card(eSuit.SPADES, eRank.TWO, 0));
		Wilds.add(new Card(eSuit.HEARTS, eRank.TWO, 0));
		Wilds.add(new Card(eSuit.DIAMONDS, eRank.TWO, 0));

		int NbrOfJokers = 0;
		
		Deck d = new Deck(NbrOfJokers,Wilds);
		Hand h = new Hand();
		
		h.AddCardToHand(new Card(eSuit.CLUBS, eRank.TWO, true));
		h.AddCardToHand(new Card(eSuit.DIAMONDS, eRank.FIVE, 0));
		h.AddCardToHand(new Card(eSuit.SPADES, eRank.TEN, 0));
		h.AddCardToHand(new Card(eSuit.HEARTS, eRank.ACE, 0));
		h.AddCardToHand(new Card(eSuit.CLUBS, eRank.ACE, 0));
		h = Hand.EvalHand(h);


		System.out.println(h.getHandStrength());
		
		assertTrue(h.getHandStrength() == eHandStrength.ThreeOfAKind.getHandStrength());
		assertTrue(h.getHighPairStrength() == eRank.ACE.getRank());
		assertTrue(h.getLowPairStrength() == 0);
		assertTrue(h.getKicker().size() == 2);
	}
	
	@Test
	public void FullHouse() {

		ArrayList<Card> Wilds = new ArrayList<Card>();

		Wilds.add(new Card(eSuit.CLUBS, eRank.TWO, 0));
		Wilds.add(new Card(eSuit.SPADES, eRank.TWO, 0));
		Wilds.add(new Card(eSuit.HEARTS, eRank.TWO, 0));
		Wilds.add(new Card(eSuit.DIAMONDS, eRank.TWO, 0));

		int NbrOfJokers = 0;
		
		Deck d = new Deck(NbrOfJokers,Wilds);
		Hand h = new Hand();
		
		h.AddCardToHand(new Card(eSuit.CLUBS, eRank.TWO, true));
		h.AddCardToHand(new Card(eSuit.DIAMONDS, eRank.TEN, 0));
		h.AddCardToHand(new Card(eSuit.SPADES, eRank.TEN, 0));
		h.AddCardToHand(new Card(eSuit.HEARTS, eRank.NINE, 0));
		h.AddCardToHand(new Card(eSuit.CLUBS, eRank.NINE, 0));
		h = Hand.EvalHand(h);


		System.out.println(h.getHandStrength());
		
		assertTrue(h.getHandStrength() == eHandStrength.FullHouse.getHandStrength());
		assertTrue(h.getHighPairStrength() == eRank.TEN.getRank());
		assertTrue(h.getLowPairStrength() == eRank.NINE.getRank());
		assertTrue(h.getKicker() == null);
	}
	
	@Test
	public void FourOfAKind_1() {

		ArrayList<Card> Wilds = new ArrayList<Card>();

		Wilds.add(new Card(eSuit.CLUBS, eRank.TWO, 0));
		Wilds.add(new Card(eSuit.SPADES, eRank.TWO, 0));
		Wilds.add(new Card(eSuit.HEARTS, eRank.TWO, 0));
		Wilds.add(new Card(eSuit.DIAMONDS, eRank.TWO, 0));

		int NbrOfJokers = 0;
		
		Deck d = new Deck(NbrOfJokers,Wilds);
		Hand h = new Hand();
		
		h.AddCardToHand(new Card(eSuit.CLUBS, eRank.TWO, true));
		h.AddCardToHand(new Card(eSuit.DIAMONDS, eRank.TEN, 0));
		h.AddCardToHand(new Card(eSuit.SPADES, eRank.TEN, 0));
		h.AddCardToHand(new Card(eSuit.HEARTS, eRank.TEN, 0));
		h.AddCardToHand(new Card(eSuit.CLUBS, eRank.NINE, 0));
		h = Hand.EvalHand(h);


		System.out.println(h.getHandStrength());
		
		assertTrue(h.getHandStrength() == eHandStrength.FourOfAKind.getHandStrength());
		assertTrue(h.getHighPairStrength() == eRank.TEN.getRank());
		assertTrue(h.getLowPairStrength() == 0);
		assertTrue(h.getKicker().size() == 1);

		Card c1 = h.getKicker().get(eCardNo.FirstCard.getCardNo());

		// Check to see if the kicker is a NINE
		assertTrue(c1.getRank().getRank() == eRank.NINE.getRank());

	}

	@Test
	public void FourOfAKind_2() {
		Deck d = new Deck();
		Hand h = new Hand();
		h.AddCardToHand(new Card(eSuit.CLUBS, eRank.TEN, 0));
		h.AddCardToHand(new Card(eSuit.DIAMONDS, eRank.TEN, 0));
		h.AddCardToHand(new Card(eSuit.SPADES, eRank.TEN, 0));
		h.AddCardToHand(new Card(eSuit.HEARTS, eRank.TEN, 0));
		h.AddCardToHand(new Card(eSuit.CLUBS, eRank.KING, 0));
		h = Hand.EvalHand(h);
		;

		assertTrue(h.getHandStrength() == eHandStrength.FourOfAKind.getHandStrength());
		assertTrue(h.getHighPairStrength() == eRank.TEN.getRank());
		assertTrue(h.getLowPairStrength() == 0);
		assertTrue(h.getKicker().size() == 1);
	}
	
	@Test
	public void Pair() {
		Deck d = new Deck();
		Hand h = new Hand();
		h.AddCardToHand(new Card(eSuit.CLUBS,eRank.TEN,0));
		h.AddCardToHand(new Card(eSuit.DIAMONDS,eRank.TEN, true));
		h.AddCardToHand(new Card(eSuit.SPADES,eRank.THREE,0));
		h.AddCardToHand(new Card(eSuit.HEARTS,eRank.TWO,0));
		h.AddCardToHand(new Card(eSuit.CLUBS,eRank.ACE,0));
		h = Hand.EvalHand(h);;
		
		assertTrue(h.getHandStrength() == eHandStrength.Pair.getHandStrength());
		assertTrue(h.getHighPairStrength() == eRank.ACE.getRank());
		assertTrue(h.getLowPairStrength() == 0);
		assertTrue(h.getKicker().size() == 3);
		
		Card c1 = h.getKicker().get(eCardNo.FirstCard.getCardNo());
		Card c2 = h.getKicker().get(eCardNo.SecondCard.getCardNo());
		Card c3 = h.getKicker().get(eCardNo.ThirdCard.getCardNo());
		
		//	Check value of kicker
		assertTrue(c1.getRank().getRank() == eRank.TEN.getRank());

		//	Check value of kicker
		assertTrue(c2.getRank().getRank() == eRank.THREE.getRank());

		//	Check value of kicker
		assertTrue(c3.getRank().getRank() == eRank.TWO.getRank());

	}	

	@Test
	public void CompareTwoHands() {
		Deck d = new Deck();
		Hand h1 = new Hand();
		h1.AddCardToHand(new Card(eSuit.CLUBS,eRank.TEN,0));
		h1.AddCardToHand(new Card(eSuit.DIAMONDS,eRank.TEN,0));
		h1.AddCardToHand(new Card(eSuit.SPADES,eRank.TEN, true));
		h1.AddCardToHand(new Card(eSuit.HEARTS,eRank.TWO,0));
		h1.AddCardToHand(new Card(eSuit.CLUBS,eRank.ACE,0));
		
		h1 = Hand.EvalHand(h1);
		
		
		Hand h2 = new Hand();
		h2.AddCardToHand(new Card(eSuit.CLUBS,eRank.NINE,0));
		h2.AddCardToHand(new Card(eSuit.DIAMONDS,eRank.NINE,0));
		h2.AddCardToHand(new Card(eSuit.SPADES,eRank.NINE,0));
		h2.AddCardToHand(new Card(eSuit.HEARTS,eRank.NINE,0));
		h2.AddCardToHand(new Card(eSuit.CLUBS,eRank.ACE,0));
		
		h2 = Hand.EvalHand(h2);
		
		
		ArrayList<Hand> TwoHands = new ArrayList<Hand>();
		TwoHands.add(h1);
		TwoHands.add(h2);
		
		Collections.sort(TwoHands,Hand.HandRank);
		
		Hand winningHand = new Hand();
		
		winningHand = TwoHands.get(0);
		
		assertTrue(winningHand.getHandStrength() == eHandStrength.FourOfAKind.getHandStrength());
		assertTrue(winningHand.getHighPairStrength() == eRank.NINE.getRank());
		
	}	
	
}