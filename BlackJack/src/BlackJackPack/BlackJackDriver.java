package BlackJackPack;

public class BlackJackDriver {

	public static void main(String[] args) {
		boolean gameIsOn = true;
		
		while(gameIsOn){
			Dealer bJDealer = new Dealer();
			bJDealer.deal();
			bJDealer.printHands();
			if(!bJDealer.hasBlackJack()){
				bJDealer.playersHit();
				bJDealer.dealerHit();
			}
			bJDealer.getWinners();
			gameIsOn = bJDealer.anotherRound();
		}
	}

}
