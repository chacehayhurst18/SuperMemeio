package interactions;

import java.awt.event.ActionEvent;
import main.Start;
import java.awt.event.ActionListener;

public class StartButtonClicked implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		Start.gameStart();

	}

}
