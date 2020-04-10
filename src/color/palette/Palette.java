package color.palette;


public class Palette {
	 int[] red;
	 int[] blue;
	 int[] green;
	 int[] alpha;
	
	static final int MAX_SIZE = 255;
	
	public Palette() {
		red = new int[MAX_SIZE];
		blue = new int[MAX_SIZE];
		green = new int[MAX_SIZE];
		alpha = new int[MAX_SIZE];
	}
	public int getMAX_SIZE() {return MAX_SIZE;}
	public int getRed(int i) { return red[i]; }
	public int getBlue(int i) { return blue[i]; }
	public int getGreen(int i) { return green[i]; }
	public int getAlpha(int i) { return alpha[i]; }
	
	
}
