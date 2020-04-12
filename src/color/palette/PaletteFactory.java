package color.palette;


public class PaletteFactory {
	static final String PREFIX = "color.palette.";
	String[] PALETTES = {
			"RedPalette",
			"GreenPalette",
			"BluePalette",
			"FullPalette",
			"EmptyPalette"
			
	};
	
	public static Palette getPalette(String paletteName) {
		try {
			return (Palette) Class.forName(PREFIX+paletteName).newInstance();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
		
	}

}
