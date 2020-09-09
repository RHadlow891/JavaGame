package part2;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferStrategy;
import java.util.Random;


public class MainFrame extends Canvas implements Runnable{
	//Create canvas size
	public static final int WIDTH = 1000, HEIGHT = WIDTH / 12 * 9;
	//Creates thread
	private Thread thread;
	//Checks if program is running
	private boolean running = false;
	
	//Instantiate objects
	private Random r;
	private Manager manager;
	
	public MainFrame()
	{
		//Create new manager
		manager = new Manager();
		//Finds current key input
		this.addKeyListener(new KeyInputs(manager));
		
		//Creates window with chosen name
		new Window(WIDTH, HEIGHT, "Race game!", this);
		
		
		r = new Random();
		
		//Creates manager for both players
			manager.addObject(new Player(WIDTH/2-64, HEIGHT/2+140, ID.Player));	
			manager.addObject(new Player(WIDTH/2-64, HEIGHT/2+190, ID.Player2));		
	}
	
	public synchronized void start()
	{
		//Finds current thread
		thread = new Thread(this);
		thread.start();
		running = true;
	}
	
	public synchronized void stop()
	{
		//Method to stop game from running in background
		try {
			thread.join();
			running = false;
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void run()
	{
		//Run methods
		long endTime = System.nanoTime();
		double tickNumber = 60.0;
		double ns = 1000000000 / tickNumber;
		double delta = 0;
		long timer = System.currentTimeMillis();
		int framerate = 0;
		while(running) {
			long now = System.nanoTime();
			delta += (now - endTime) / ns;
			endTime = now;
			while(delta >= 1) {
				tick();
				delta--;
			}
			if(running)
				render();
			framerate++;
			
			if(System.currentTimeMillis() - timer > 1000) {
				timer += 1000;
				framerate = 0;
			}
		}
		stop();
	}
	
	private void tick()
	{
		manager.tick();
	}
	
	private void render()
	{
		BufferStrategy bs = this.getBufferStrategy();
		if(bs == null)
		{
			this.createBufferStrategy(3);
			return;
		}
		
		Graphics g = bs.getDrawGraphics();
		
		//Creates gray background
		g.setColor(Color.LIGHT_GRAY);
		g.fillRect(0, 0, WIDTH, HEIGHT);
		
		manager.render(g);
		
		g.dispose();
		bs.show();
	}
	
	public static void main(String args[])
	{
		new MainFrame();
	}
}
