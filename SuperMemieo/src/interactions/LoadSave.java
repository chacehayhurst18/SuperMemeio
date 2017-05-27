package interactions;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileReader;
import java.io.IOException;

public class LoadSave implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		try{
			FileReader cat = new FileReader("save.txt");
		}
		catch(Exception a){
			
		}

	}

}
