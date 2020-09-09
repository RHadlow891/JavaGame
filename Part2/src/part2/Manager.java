package part2;

import java.awt.Graphics;
import java.util.LinkedList;

public class Manager {
	//Creates linked list of the game object
	LinkedList<MainObject> object = new LinkedList<MainObject>();
	
	
	public void tick()
	{
		//loops through object size from the current object and ticks through
		for (int i = 0; i < object.size(); i++)
		{
			MainObject tempObject = object.get(i);
			
			tempObject.tick();
		}
	}
	
	public void render(Graphics g)
	{
		//loops through object size from the current object and renders through
		for (int i = 0; i < object.size(); i++)
		{
			MainObject tempObject = object.get(i);
			
			tempObject.render(g);
		}
	}
	
	//Adds object to add to list
	public void addObject(MainObject object)
	{
		this.object.add(object);
	}
	//Removes object from list
	public void removeObject(MainObject object)
	{
		this.object.remove(object);
	}
	
	
}
