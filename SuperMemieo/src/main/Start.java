package main;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import interactions.Game;
import interactions.StartButtonClicked;

public class Start {
	
	static int FRAME_WIDTH;
	static int FRAME_HEIGHT;
	static JFrame frame;
	static JButton button;
	
	public static void main(String[] args) {
		frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		FRAME_WIDTH = 1200;
		FRAME_HEIGHT = 800;
		frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
		frame.setBackground(Color.blue);
		button = new JButton();
		button.setSize(100,100);
		button.addActionListener(new StartButtonClicked());
		frame.add(button);
		frame.setVisible(true);
	}
	
	
	public static void gameStart(){
		button.setVisible(false);
		Game g = new Game(FRAME_WIDTH, FRAME_HEIGHT);
		frame.add(g);
	}

}
