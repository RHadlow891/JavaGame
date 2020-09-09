package part2;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

import javax.swing.ImageIcon;


public class Player extends MainObject {
	//private ImageIcon images[];
	
	public Player(int x, int y, ID id) {
		
		super(x, y, id);
		//for(int i = 0; i <= 15; i++)
		//{
			//images[i] = new ImageIcon(getClass().getResource("/images/RaceCar"+ i +".png"));
		//}
	}
	@Override
	public void tick() {
		//
		x += velX;
		y += velY;
	}
	@Override
	public void render(Graphics g) {
		//Draw cars
		if(id == ID.Player) g.setColor(Color.red);
		else if(id == ID.Player2) g.setColor(Color.blue);
		g.fillRect(x, y, 30, 30);
		//images[1].paintIcon(this,g,32,32);
		
		
		//Draw race track
		Color c1 = Color.green;
		g.setColor( c1 );
		g.fillRect( 150, 200, 550, 300 );
		Color c2 = Color.black;
		g.setColor( c2 );
		g.drawRect(50, 100, 750, 500); // outer edge
		g.drawRect(150, 200, 550, 300); // inner edge
		 Color c3 = Color.yellow;
		g.setColor( c3 );
		g.drawRect( 100, 150, 650, 400 ); // mid-lane marker
		 Color c4 = Color.white;
		g.setColor( c4 );
		g.drawLine( 425, 500, 425, 600 ); // start line
	}

}
