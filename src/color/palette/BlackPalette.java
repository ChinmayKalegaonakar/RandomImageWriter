package color.palette;

public class BlackPalette extends Palette {
    public BlackPalette() {
		red = new int[Palette.MAX_SIZE];
		blue = new int[Palette.MAX_SIZE];
		green = new int[Palette.MAX_SIZE];
		alpha = new int[Palette.MAX_SIZE];
		for(int i = 0 ; i < Palette.MAX_SIZE; i++) {
			red[i] = i;
			blue[i] = i;
			green[i] = i;
			alpha[i] = 255;
		}
		
	}
}
