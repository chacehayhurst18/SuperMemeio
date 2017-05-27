package interactions;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import main.Start;

public class WKeyPressed implements KeyListener {

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyPressed(KeyEvent e) {
		Start.load.setVisible(false);

	}

	@Override
	public void keyReleased(KeyEvent e) {
		Start.load.setVisible(true);
	}

}
