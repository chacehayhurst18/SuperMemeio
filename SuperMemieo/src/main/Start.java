package main;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import interactions.Game;
import interactions.LoadSave;
import interactions.StartButtonClicked;

public class Start {
	
	static int FRAME_WIDTH;
	static int FRAME_HEIGHT;
	static JFrame frame;
	static JButton start;
	public static JButton load;
	static String save;
	
	
	public static void main(String[] args) {
		frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		FRAME_WIDTH = 1200;
		FRAME_HEIGHT = 800;
		frame.setSize(200, 100);
		frame.setBackground(Color.blue);
		start = new JButton();
		start.setSize(100,100);
		start.addActionListener(new StartButtonClicked());
		load = new JButton();
		load.setSize(100,100);
		load.addActionListener(new LoadSave());
		frame.add(start);
		frame.add(load);
		frame.setVisible(true);
	}
	
	
	public static void gameStart(){
		load.setVisible(false);
		start.setVisible(false);
		frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
		Game g = new Game(FRAME_WIDTH, FRAME_HEIGHT);
		frame.add(g);
	}

}
