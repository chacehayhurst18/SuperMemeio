package interactions;

import java.awt.Image;
import java.awt.image.ImageObserver;

public class UselessImage implements ImageObserver {

	@Override
	public boolean imageUpdate(Image img, int infoflags, int x, int y, int width, int height) {
		return false;
	}

}
