package image;
import java.awt.Image;

import javax.swing.Icon;
import javax.swing.ImageIcon;
public class IconButton {

	public static Icon getIcon(String path) {
		ImageIcon icon = new ImageIcon(path);
		Image img = icon.getImage();
		Image newimg = img.getScaledInstance( 30, 30,  java.awt.Image.SCALE_SMOOTH ) ;  
		icon = new ImageIcon( newimg );
		return icon;
	}
}
