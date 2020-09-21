package color;
import java.awt.*;
import color.palette.EmptyPalette;
import color.palette.Palette;

public class ColorManager {
	//managing colors using palettes
	
	private final Palette palette;
	private int P_SIZE;
	
	public ColorManager(final Palette palette) {
		this.palette = palette;
		this.P_SIZE = palette.getMAX_SIZE();
		
	}
	
	public ColorManager() {
		this.palette = new EmptyPalette();
		
	}
	public int getColor(final int start, final int end) {
		int r, g, b;
		if(start < 0 || end < 0) return 0;
		else if(start >= 255 || end >= 225) return 0;
		else {
			r = (int)(start + (Math.random()*(end-start)));
			g = (int)(start + (Math.random()*(end-start)));
			b = (int)(start + (Math.random()*(end-start)));
			return (r<<16) | (g<<8) | b;
		}
	}
	public int getColor(final int start, final int end, final boolean alpha) {
		int a, r, g, b;
		if(start < 0 || end < 0 ) return 0;
		else if(start >= 255 || end >= 225) return 0;
		else {
			a = 255;
			r = (int)(start + (Math.random()*(end-start)));
			g = (int)(start + (Math.random()*(end-start)));
			b = (int)(start + (Math.random()*(end-start)));
			if(alpha)return (a<<24)|(r<<16) | (g<<8) | b;
			else return (r<<16) | (g<<8) | b;
		}
	}
	public int getRandomColorFromPalette() {
		final int r = palette.getRed((int)(Math.random()*P_SIZE));
		final int g = palette.getGreen((int)(Math.random()*P_SIZE));
		final int b = palette.getBlue((int)(Math.random()*P_SIZE));
		final int a = 255;
		return (a<<24)|(r<<16) | (g<<8) | b;
	}

	public Color getColorFromRandomPalette() {
		final int r = palette.getRed((int)(Math.random()*P_SIZE));
		final int g = palette.getGreen((int)(Math.random()*P_SIZE));
		final int b = palette.getBlue((int)(Math.random()*P_SIZE));
		final int a = 255;
		return new Color(r,g,b,a);
	}

}
