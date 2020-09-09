package part2;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class KeyInputs extends KeyAdapter{
//Initialise manager
	private Manager manager;
	
	//Manage key inputs
	public KeyInputs(Manager manager)
	{
		this.manager = manager;
	}
	//when key is pressed
	public void keyPressed(KeyEvent e)
	{
		//get entered key
		int key = e.getKeyCode();
		
		//loop through handler of objects
		for(int i = 0; i < manager.object.size(); i++)
		{
			MainObject tempObject = manager.object.get(i);
			
			if(tempObject.getId() == ID.Player)
			{
				//Key events for player 1
				
				if(key == KeyEvent.VK_W)
				{
					tempObject.setVelY(-5);
				}
				if(key == KeyEvent.VK_S)
				{
					tempObject.setVelY(5);
				}
				if(key == KeyEvent.VK_D)
				{
					tempObject.setVelX(5);
				}
				if(key == KeyEvent.VK_A)
				{
					tempObject.setVelX(-5);
				}
			}
			if(tempObject.getId() == ID.Player2)
			{
				//Key events for player 2
				
				if(key == KeyEvent.VK_UP)
				{
					tempObject.setVelY(-5);
				}
				if(key == KeyEvent.VK_DOWN)
				{
					tempObject.setVelY(5);
				}
				if(key == KeyEvent.VK_RIGHT)
				{
					tempObject.setVelX(5);
				}
				if(key == KeyEvent.VK_LEFT)
				{
					tempObject.setVelX(-5);
				}
			}
		}
	}
	//Events for when key is released
	public void keyReleased(KeyEvent e)
	{
		//get entered key
		int key = e.getKeyCode();
		
		//loop through handler of objects
		for(int i = 0; i < manager.object.size(); i++)
		{
			MainObject tempObject = manager.object.get(i);
			
			if(tempObject.getId() == ID.Player)
			{
				//Key events for p1
				
				if(key == KeyEvent.VK_W)
				{
					tempObject.setVelY(0);
				}
				if(key == KeyEvent.VK_S)
				{
					tempObject.setVelY(0);
				}
				if(key == KeyEvent.VK_D)
				{
					tempObject.setVelX(0);
				}
				if(key == KeyEvent.VK_A)
				{
					tempObject.setVelX(0);
				}
			}
			if(tempObject.getId() == ID.Player2)
			{
				//Key events for p2
				
				if(key == KeyEvent.VK_UP)
				{
					tempObject.setVelY(0);
				}
				if(key == KeyEvent.VK_DOWN)
				{
					tempObject.setVelY(0);
				}
				if(key == KeyEvent.VK_RIGHT)
				{
					tempObject.setVelX(0);
				}
				if(key == KeyEvent.VK_LEFT)
				{
					tempObject.setVelX(0);
				}
			}
		}
	}
}
