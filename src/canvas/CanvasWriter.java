package canvas;

import java.awt.image.BufferedImage;
import java.io.File;

import algorithm.RandomPixels;
import color.ColorManager;
import color.palette.Palette;
import color.palette.PaletteFactory;
import color.palette.RedPalette;
import io.FileManager;

public class CanvasWriter {
	
	public static int HEIGHT = 16;
	public static int WIDTH = 16;
	public static int COLOR_MODE = BufferedImage.TYPE_INT_ARGB;
	public static final String FILENAME = "/home/chinmay/eclipse-workspace/RandomImageWriter/resources/output.png";
	
	FileManager fileManager;
	RandomPixels randomPixels;
	BufferedImage image;
	ColorManager colorManager;
	File file;
	public CanvasWriter() {
		fileManager = new FileManager();
		Palette redPallete = PaletteFactory.getPalette("GreenPalette");
		colorManager = new ColorManager(redPallete);
		randomPixels = new RandomPixels(colorManager);
		image = new BufferedImage(WIDTH , HEIGHT , COLOR_MODE);
		file = fileManager.newFile(FILENAME);
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
