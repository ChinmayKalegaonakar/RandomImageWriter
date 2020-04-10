package color.palette;

public class BluePalette extends Palette {
	public BluePalette() {
		red = new int[Palette.MAX_SIZE];
		blue = new int[Palette.MAX_SIZE];
		green = new int[Palette.MAX_SIZE];
		alpha = new int[Palette.MAX_SIZE];
		for(int i = 0 ; i < Palette.MAX_SIZE; i++) {
			red[i] = 0;
			blue[i] = i;
			green[i] = 0;
			alpha[i] = 255;
		}
		
	}
}
