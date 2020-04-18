package brush;

import color.palette.Palette;

public class BrushFactory {
	
	static final String PREFIX = "brush.";
	
	public static Brush getSquareBrush() {
		return new SquareBrush();
	}
	
	public static Brush getSquareBrush(int width, int height) {
		return new SquareBrush(width, height);
	}
	
	public static Brush getBrush(String brushName) {
		try {
			return (Brush) Class.forName(PREFIX+brushName).newInstance();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
		
	}

}
