import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class PanelImagen extends JPanel {

	public PanelImagen(int w, int h) {
		setSize(w, h);
	}

	@Override
	protected void paintComponent(Graphics g) {
		Dimension tam = getSize();
		ImageIcon ii = new ImageIcon(getClass().getResource("/img/images.jpg"));
		g.drawImage(ii.getImage(), 0, 0, tam.width, tam.height, null);
		setOpaque(false);
		super.paintComponent(g);
	}	
	
	

}
