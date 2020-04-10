package color.palette;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class PaletteFactory {
	static final String prefix = "color.palette.";
	String[] PALETTES = {
			"RedPalette",
			"GreenPalette",
			"BluePalette",
			"EmptyPalette"
			
	};
	
	public static Palette getPalette(String paletteName) {
		try {
			return (Palette) Class.forName(prefix+paletteName).newInstance();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
		
	}

}
