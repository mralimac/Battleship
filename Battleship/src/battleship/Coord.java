package battleship;

public class Coord 
{
	private int xCoord;
	private int yCoord;
	public Coord(int xCoord, int yCoord)
	{
		this.xCoord = xCoord;
		this.yCoord = yCoord;
	}
	
	public int getXCoord()
	{
		return this.xCoord;		
	}
	
	public int getYCoord()
	{
		return this.yCoord;
	}
}
