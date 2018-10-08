package battleship;

public class Board
{
	//Attributes Section
	private int boardLength;
	private int boardHeight;
	//End Attributes
	
	//Constructor Section
	public Board()
	{
		this.boardLength = 10;
		this.boardHeight = 10; 
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
	
	//End Method
}
