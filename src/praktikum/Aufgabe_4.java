package praktikum;

import java.awt.*;
import java.awt.image.*;
import java.io.IOException;
import javax.swing.*;

public class Aufgabe_4 {
	public static void main(String[] args) throws IOException {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		Image srcImage1 = toolkit.getImage("river.gif");
		Image srcImage2 = toolkit.getImage("fki_start.jpg");
		Image srcImage3 = toolkit.getImage("farbenkreis_b.gif");

		ImageFilter colorfilter = new TestFilter();
		Image filteredImage1 = toolkit.createImage(new FilteredImageSource(srcImage1.getSource(), colorfilter));
		Image filteredImage2 = toolkit.createImage(new FilteredImageSource(srcImage2.getSource(), colorfilter));
		Image filteredImage3 = toolkit.createImage(new FilteredImageSource(srcImage3.getSource(), colorfilter));

		JFrame frame = new JFrame("Images and pixelwise filtering");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBackground(Color.RED);
		Panel allImagesPanel = new Panel();
		allImagesPanel.setLayout(new GridLayout(0, 3));
		allImagesPanel.add(new ImagePanel(srcImage1));
		allImagesPanel.add(new ImagePanel(srcImage2));
		allImagesPanel.add(new ImagePanel(srcImage3));
		allImagesPanel.add(new ImagePanel(filteredImage1));
		allImagesPanel.add(new ImagePanel(filteredImage2));
		allImagesPanel.add(new ImagePanel(filteredImage3));
		frame.getContentPane().add(allImagesPanel);
		frame.setBounds(50, 50, 1000, 500);
		frame.setVisible(true);
	}
}

class ImagePanel extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Image image;

	public ImagePanel(Image image) {
		this.image = image;
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		// System.out.println("paintComponent" + this + image.getWidth(this) + " " +
		// image.getHeight(this));
		g.drawImage(image, 10, 10, image.getWidth(this), image.getHeight(this), this);
	}
}

class TestFilter extends RGBImageFilter {

	public int filterRGB(int x, int y, int pixel) {

		int a = ((0xFF << 8 * 3) & pixel) >> 8 * 3;
		int r = ((0xFF << 8 * 2) & pixel) >> 8 * 2;
		int g = ((0xFF << 8 * 1) & pixel) >> 8 * 1;
		int b = ((0xFF << 8 * 0) & pixel) >> 8 * 0;
		int filteredPixel = 0;

		switch ('a') {
		case 'a':
			a =0x11111111;
			r =0b10000000;
			g =0b01111110;
			b =0b00000011;
			break;
		case 'b':
			switch ('r') {
			default:
			case 'r':
				b = g = 0;
				break;
			case 'g':
				r = b = 0;
				break;
			case 'b':
				g = r = 0;
				break;
			}
			break;
		case 'c':
			int q = r;
			r = b;
			b = q;
			break;

		case 'd':
			int rgb = r + g + b;
			if (rgb < (255 * 3) && rgb > (255 * 3) / 2) {
				a = 255;
				r = g = b = 255;
			} else {
				r = g = b = 0;
				a = 255;
			}
			break;
		case 'e':
			a = 0x7F; // verändert die Transparenz

		case 'f':
			if(r < 235) {
				r = r + 20;
			}
			if(b < 235) {
				b = b + 20;
			}
			if(g < 235) {
				g = g + 20;
			}
			break;

		case 'g':
			switch ('b') {
			default:
			case 'g':
				// die RGB-Werte müssen gleich groß sein und
				// den Wert des Durchschnitts der ursprünglichen RGB-Werte haben.
				r = g = b = (r + g + b) / 3;
				break;

			case 'b':
				// berechnung der Helligkeit
				rgb = (r + g + b) / 3;

				// falls die Helligkeit größer als die Hälfte des Maximalwerts ist, dann ist es
				// weiß
				// ansonsten sind die Pixel schwarz.
				r = g = b = (rgb > (0xFF / 2)) ? 0xFF : 0x00;
				break;

			}
			break;
		case 'h':
			// Der ~-Operator negiert die Farbwerte
			r = ~r;
			g = ~g;
			b = ~b;
			break;
		case 'i':
			// nur die oberen 100x100 Pixel werden angezeigt
			if (x > 100 || y > 100) {
				r = g = b = 0;
				a = 255;
				break;
			}
		}
		return (a << 8 * 3) + (r << 8 * 2) + (g << 8 * 1) + (b << 8 * 0);
	}
}
