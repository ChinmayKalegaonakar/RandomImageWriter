package color.palette;

public class GreenPalette extends Palette {
	public GreenPalette() {
		red = new int[Palette.MAX_SIZE];
		blue = new int[Palette.MAX_SIZE];
		green = new int[Palette.MAX_SIZE];
		alpha = new int[Palette.MAX_SIZE];
		for(int i = 0 ; i < Palette.MAX_SIZE; i++) {
			red[i] = 0;
			blue[i] = 0;
			green[i] = i;
			alpha[i] = 255;
		}
		
	}
}
