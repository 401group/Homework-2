package src;
//
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

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
	int arrowheads;
	int jewels;
	int coin;
	
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
		arrowheads = 0;
		jewels = 0;
		coin = 0;
	}
		//This method assigns the inital 6 cards to the deck
		public void populateDeck() {
			
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
			
			
		}
		
}