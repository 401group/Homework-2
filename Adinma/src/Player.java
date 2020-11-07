package src;
/*
 * THE LOST RUINS OF ARNAK
 * This is the player class for the Games.
 * Contained in this class are the 
 * components which a player uses to play the game.
 * 
 */
import java.util.*;


public class Player {
	
	String name;
	//The septre tracks the passage of rounds, might be an item for the board class
	public int septer;
	//The game starts with 1 artifact and five items
	public int artifact;
	public int items;
	
	/*The market is a collection of artifacts and items
    * As the game goes on the market will have more 
    * artifacts and less items
	*/
	public List<Card> Market;
    //possible locations to visit
	public List<String> Location;
	
	int steamBoat;
	int jeep;
	int assistants;
	int compass;
	int gold;
	int worker;
	int tablets;
	int arrowHeads;
	int jewels;
	int coin;
	boolean myTurn;
	
	public List<Cards> deck; // players cards in hand
	
	Map<String, Integer> Food;
	
	public Player(String _name, int _playerNum)
	{
		deck = new ArrayList<Cards>();
		market = new ArrayList<Cards>();
		location = ArrayList<String>();
		
		steamBoat = 0;
		jeep = 0;
		assistants = 0;
		compass = 0;
		gold = 0;
		worker = 0;
		tablets = 0;
		arrowHeads = 0;
		jewels = 0;
		coin = 0;
		myTurn = false;
	}
		//This method assigns the inital 6 cards to the deck
		//Yet to make cards class
		public void populateDeck() {
			
		}
		
		//Setters for class variables
		 public void setSteamBoat(int steamBoat) {
			    this.steamBoat = steamBoat;
			  }
		 public void setJeep(int jeep) {
			    this.jeep = jeep;
			  }
		 public void setAssistants(int assistants) {
			    this.assistants = assistants;
			  }
		 public void setCompass(int compass) {
			    this.compass = compass;
			  }
		 public void setGold(int gold) {
			    this.gold = gold;
			  }
		 public void setWorker(int worker) {
			    this.worker = worker;
			  }
		 public void setTablets(int tablets) {
			    this.tablets = tablets;
			  }
		 public void setFArrowheads(int arrowHeads) {
			    this.arrowHeads = arrowHeads;
			  }
		 public void setJewels(int jewels) {
			    this.jewels = jewels;
			  }
		 public void setCoin(int coin) {
			    this.coin = coin;
			  }
		 
		 
		 //Getters for class variables
		 public int getSteamBoat() {
			    return steamBoat;
			  }
		 public int getJeep() {
			    return jeep;
			  }
		 public int getAssistants() {
			    return assistants;
			  }
		 public int getCompass() {
			    return compass;
			  }
		 public int getGold() {
			    return gold;
			  }
		 public int getWorker() {
			    return worker;
			  }
		 public int getTablets() {
			    return tablets;
			  }
		 public int getArrowHeads() {
			    return arrowHeads;
			  }
		 public int getJewels() {
			    return jewels;
			  }
		 public int getCoin() {
			    return coin;
			  }		
		
		public void displayPlayerDash() {
			System.out.println("You have " + deck.toString() + "cards");
			System.out.println("You have " + gold + " Gold");
			System.out.println("You have " + steamBoat + " Steam Boat");
			System.out.println("You have " + jeep + " Jeeps");
			System.out.println("You have " + assistants + " Assistants");
			System.out.println("You have " + worker + " Workers");
			System.out.println("You have " + tablets + " Tablets");
			System.out.println("You have " + arrowheads + " Arrowheads");
			System.out.println("You have " + jewels + " Jewels");
			System.out.println("You have " + coin + " Coins");
			System.out.println("You have " + compass + " Compass");
			
			
		}
		
}