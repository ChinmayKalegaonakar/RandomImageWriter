package color.palette;

public class EmptyPalette extends Palette{
	public EmptyPalette() {
		for(int i = 0; i < MAX_SIZE;i++) {
			red[i] = 0;
			blue[i] = 0; 
			green[i] = 0; 
			alpha[i] = 255; 
		}
		
	}

}
