package part2;

import java.awt.Graphics;

public abstract class MainObject {

	//Set variables
	protected int x, y;
	protected ID id;
	protected int velX, velY;
	
	public MainObject(int x, int y, ID id)
	{
		//find current attributes
		this.x = x;
		this.y = y;
		this.id = id;
	}
	//Create tick and render methods
	public abstract void tick();
	public abstract void render(Graphics g);
	
	//Set x coordinates
	public void setX(int x)
	{
		this.x = x;
	}
	//Set y coordinates
	public void setY(int y)
	{
		this.y = y;
	}
	//Get x coordinates
	public int getX()
	{
		return x;
	}
	//Get y coordinates
	public int getY()
	{
		return y;
	}
	//Set ID type
	public void setId(ID id)
	{
		this.id = id;
	}
	//Get ID type
	public ID getId()
	{
		return id;
	}
	//Set velocity of x
	public void setVelX(int velX)
	{
		this.velX = velX;
	}
	//Set velocity of y
	public void setVelY(int velY)
	{
		this.velY = velY;
	}
	//Get velocity of x
	public int getVelX()
	{
		return velX;
	}
	//Get velocity of y
	public int getVelY()
	{
		return velY;
	}
	
	
	
	
	
}
