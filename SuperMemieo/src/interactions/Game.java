package interactions;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

import javax.imageio.ImageIO;

public class Game extends Canvas {
	BufferedImage img;
	Random a;
	int GAME_NUMBER;
	int HEIGHT, WIDTH;

	public Game(int width, int height) {
		WIDTH = width;
		HEIGHT = height;
		a = new Random();
		GAME_NUMBER = a.nextInt(4) + 1;
		try {
			switch (GAME_NUMBER) {

			case 1:
				img = ImageIO.read(new File("wp.jpg"));
				break;

			case 2:
				img = ImageIO.read(new File("wp2.jpg"));
				break;

			case 3:
				img = ImageIO.read(new File("wp3.jpg"));
				break;

			case 4:
				img = ImageIO.read(new File("wp4.jpg"));
				break;
			}

		} catch (IOException e) {

		}
	}

	public void start() {
		Dimension size = new Dimension(WIDTH, HEIGHT);
		setPreferredSize(size);
		paint(null);
	}

	public void paint(Graphics g) {
		g.drawImage(img, 0, 0, new UselessImage());
	}

}
