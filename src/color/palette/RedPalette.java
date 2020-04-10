package color.palette;

public class RedPalette extends Palette{
	
	public RedPalette() {
		red = new int[Palette.MAX_SIZE];
		blue = new int[Palette.MAX_SIZE];
		green = new int[Palette.MAX_SIZE];
		alpha = new int[Palette.MAX_SIZE];
		for(int i = 0 ; i < Palette.MAX_SIZE; i++) {
			red[i] = i;
			blue[i] = 0;
			green[i] = 0;
			alpha[i] = 255;
		}
		
	}

}
