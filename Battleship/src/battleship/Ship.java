package battleship;

import java.util.ArrayList;

public class Ship 
{
//	private int xCoordOfBow;	
//	private int yCoordOfBow;
	private ArrayList<Coord> damagedShip = new ArrayList<Coord>();	
	private ArrayList<Coord> shipCoords = new ArrayList<Coord>();
	private int healthOfShip;
	private int shipDirection;
	private int shipLength;
	private int shipType;
	private String shipName;
	
	public Ship(int xCoordOfBow, int yCoordOfBow, int shipLength, int shipDirection, int shipType, String shipName)
	{
		int tempXCoord = xCoordOfBow;
		int tempYCoord = yCoordOfBow;
		for(int i = 0; i > shipLength; i++)
		{
			switch(shipDirection)
			{
			case 1: tempYCoord--;
			break;
			case 2: tempXCoord++;
			break;
			case 3: tempYCoord++;			
			break;
			case 4: tempXCoord--;
			break;
			}
			shipCoords.add(new Coord(tempXCoord, tempYCoord));
		}
		
		this.shipLength = shipLength;
		this.shipDirection = shipDirection;
		this.shipType = shipType;
		this.shipName = shipName;
		this.healthOfShip = shipLength;
	}
	
	public void shipHit(Coord hitCoord)
	{
		if(!damagedShip.contains(hitCoord))
		{
			this.healthOfShip--;
			if(healthOfShip < 1)
			{
				System.out.println(this.shipName+" has been sunk!");
			}
			else 
			{
				System.out.println("Ship has been hit");
				damagedShip.add(hitCoord);	
			}
		}
		else
		{
			System.out.println("This sector has been hit already");
		}
	}
	
	public int getLengthOfShip()
	{
		return this.shipLength;
	}
	
	public int getHealthOfShip()
	{
		return this.healthOfShip;
	}
	
	public int getShipDirection()
	{
		return this.shipDirection;
	}
	
	public String getShipName()
	{
		return this.shipName;
	}
}
