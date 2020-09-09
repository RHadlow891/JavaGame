package part2;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;

public class Window extends Canvas{
	
	private static final long serialVersionUID = -240840600533728354L;
	
	public Window(int width, int height, String title, MainFrame mainframe)
	{
		//Creates JFrame
		JFrame frame = new JFrame(title);
		
		//Creates JFrame parameters
		frame.setPreferredSize(new Dimension(width, height));
		frame.setMaximumSize(new Dimension(width, height));
		frame.setMinimumSize(new Dimension(width, height));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.add(mainframe);
		frame.setVisible(true);
		mainframe.start();
	}
	
}
