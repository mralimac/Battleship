package battleship;

import java.util.ArrayList;


public class Board extends Main
{
	//Attributes Section
	private ArrayList<Ship> allShipsOnBoard = new ArrayList<Ship>();
	private ArrayList<Coord> allOccupiedTiles = new ArrayList<Coord>();
	private ArrayList<Coord> alreadyFiredAt = new ArrayList<Coord>();
	
	private int boardLength;
	private int boardHeight;
	//End Attributes
	
	//Constructor Section
	public Board()
	{
		this.boardLength = 7;
		this.boardHeight = 7; 
	}
	public Board(int boardLength, int boardHeight)
	{
		this.boardLength = boardLength;
		this.boardHeight = boardHeight; 
	}
	//End Constructor
	
	//Method Section
	public int getBoardLength()
	{
		return this.boardLength;
	}
	
	public int getBoardHeight()
	{
		return this.boardHeight;
	}
	
	public void placeNewShip()
	{
		System.out.println("Please enter a ship name");
		String shipName = getUserStringInput();
		
		System.out.println("Please enter a ship type");
		System.out.println("1 - Minesweeper");
		System.out.println("2 - Corvette");
		System.out.println("3 - Submarine");
		System.out.println("4 - Battleship");
		System.out.println("5 - Aircraft Carrier");
		int shipType = getUserIntInput();
		int shipLength = 0;
		switch(shipType)
		{
		case 1: shipLength = 1;
		break;
		case 2: shipLength = 3;
		break;
		case 3: shipLength = 3;
		break;
		case 4: shipLength = 4;
		break;
		case 5: shipLength = 5;
		break;
		}
		
		System.out.println("Which direction is in the ship facing?");
		System.out.println("1 - North");
		System.out.println("2 - East");
		System.out.println("3 - South");
		System.out.println("4 - West");
		int shipDirection = getUserIntInput();
		
		System.out.println("What is the XCoord of the ship's bow?");
		int shipBowXCoord = getUserIntInput();		
		
		System.out.println("What is the YCoord of the ship's bow?");
		int shipBowYCoord = getUserIntInput();
		
		Coord compressedToCoord = new Coord(shipBowXCoord, shipBowYCoord);
		
		
	}
	
	public boolean checkIfSpaceIsOccupied(Coord coordToCheck)
	{
		return allOccupiedTiles.contains(coordToCheck);	
	}
	
	
	public boolean isOutOfBounds(Coord coordToCheck)
	{
		int exportedXCoord = coordToCheck.getXCoord();
		int exportedYCoord = coordToCheck.getYCoord();
		
		if(exportedXCoord < 0 || exportedYCoord < 0 || exportedXCoord > this.boardLength || exportedYCoord > this.boardHeight)
		{
			System.out.println("Warning - Out of bounds");
			return true;
		}
		else
		{
			return false;
		}
		
	}
	//End Method
}
