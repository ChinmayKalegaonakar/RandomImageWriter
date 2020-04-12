package canvas;

import java.awt.image.BufferedImage;
import java.io.File;

import algorithm.RandomPixels;
import brush.Brush;
import brush.CrossBrush;
import brush.SquareBrush;
import color.ColorManager;
import color.palette.Palette;
import color.palette.PaletteFactory;
import color.palette.RedPalette;
import io.FileManager;

public class CanvasWriter {
	
	public static int HEIGHT = 256;
	public static int WIDTH = 256;
	public static int COLOR_MODE = BufferedImage.TYPE_INT_ARGB;
//	public static final String FILENAME = "/home/chinmay/eclipse-workspace/RandomImageWriter/resources/output.png";
	
	FileManager fileManager;
	RandomPixels randomPixels;
	BufferedImage image;
	ColorManager colorManager;
	File file;
	public CanvasWriter() {
		fileManager = new FileManager();
		Palette palette = PaletteFactory.getPalette("FullPalette");
		colorManager = new ColorManager(palette);
		Brush sqBrush = new SquareBrush(4,8);
		Brush crBrush = new CrossBrush(15,3);
		randomPixels = new RandomPixels(colorManager,sqBrush);
		image = new BufferedImage(WIDTH , HEIGHT , COLOR_MODE);
		file = fileManager.timestampFile();
		fileManager.saveFile(file, randomPixels.randomRandom(image));
	}
	
	// get height and width
	// get color mo
	// create BI
	// get newFile
	// get color
	// get brush
	// get algorithm
	// execute
	// saveFile
	

}
