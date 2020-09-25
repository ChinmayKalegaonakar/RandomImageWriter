package canvas;

import java.awt.image.BufferedImage;
import java.io.File;
import java.util.Properties;
import java.util.logging.Logger;

import algorithm.Algorithm;
import algorithm.Arches;
import algorithm.ConcentricCircles;
import algorithm.ConcentricSquares;
import algorithm.Noise;
import algorithm.RandomPixels;
import algorithm.RandomPolygon;
import algorithm.StraightLines;
import brush.Brush;
import brush.BrushFactory;
import color.ColorManager;
import color.palette.Palette;
import color.palette.PaletteFactory;
import io.FileManager;

public class CanvasWriter {
	
	public static int HEIGHT = 256;
	public static int WIDTH = 256;
	public static int COLOR_MODE = BufferedImage.TYPE_INT_ARGB;
//	public static final String FILENAME = "/home/chinmay/eclipse-workspace/RandomImageWriter/resources/output.png";
	private static final Logger LOGGER = Logger.getLogger("");
	
	Properties properties;
	FileManager fileManager;
	Brush brush;
	BufferedImage image;
	ColorManager colorManager;
	
	public CanvasWriter() {
		fileManager = new FileManager();
		properties = fileManager.loadPropertyFile();
		int height = Integer.parseInt((String) properties.getOrDefault("canvas.height",String.valueOf(HEIGHT)));
		int width = Integer.parseInt((String) properties.getOrDefault("canvas.width",String.valueOf(WIDTH)));
		String paletteName = properties.getProperty("canvas.palette");
		String brushName = properties.getProperty("canvas.brush");
		LOGGER.info("loaded configs items");
		brush = BrushFactory.getBrush(brushName);
		Palette palette = PaletteFactory.getPalette(paletteName);
		colorManager = new ColorManager(palette);
		image = new BufferedImage(width , height , COLOR_MODE);
	}
	
	public void clearBuffer() {
		image.flush();
		image = new BufferedImage(image.getWidth() , image.getHeight() , COLOR_MODE);
	}
	
	
	public BufferedImage createImage() {
		// replace with algo get image
		Algorithm painter = new Noise(colorManager);
		BufferedImage retImage =  painter.paint(image);
		clearBuffer();
		return retImage;
	}
	
	public void saveImage(BufferedImage image) {
		File file = fileManager.timestampFile();
		fileManager.saveFile(file, image);
	}
	
	
	public BufferedImage combineOnRight(BufferedImage bi1, BufferedImage bi2) {
		int bi1Height = bi1.getHeight();
		int bi2Height = bi2.getHeight();
		int bi1Width = bi1.getWidth();
		int bi2Width = bi2.getWidth();
		
		int height = bi1Height > bi2Height ? bi1Height: bi2Height;
		int width = bi1Width + bi2Width;
		
		BufferedImage image = new BufferedImage(width , height , COLOR_MODE);
		
		for(int i = 0; i < bi1Width; i++ ) {
			for(int j = 0; j < bi1Height; j++ ) {
				image.setRGB(i, j, bi1.getRGB(i, j));
			}
		}
		for(int i = bi1Width; i < width; i++ ) {
			for(int j = 0; j < bi2Height; j++ ) {
				image.setRGB(i, j, bi2.getRGB(i-bi1Width, j));
			}
		}
		
		return image;
	}
	
	public BufferedImage combineBelow(BufferedImage bi1, BufferedImage bi2) {
		int bi1Height = bi1.getHeight();
		int bi2Height = bi2.getHeight();
		int bi1Width = bi1.getWidth();
		int bi2Width = bi2.getWidth();
		
		int width = bi1Width > bi2Width ? bi1Width: bi2Width;
		int height = bi1Height + bi2Height;
		
		BufferedImage image = new BufferedImage(width , height , COLOR_MODE);
		
		for(int i = 0; i < bi1Width; i++ ) {
			for(int j = 0; j < bi1Height; j++ ) {
				image.setRGB(i, j, bi1.getRGB(i, j));
			}
		}
		for(int i = 0; i < width; i++ ) {
			for(int j = bi1Height; j < height; j++ ) {
				image.setRGB(i, j, bi2.getRGB(i, j-bi1Height));
			}
		}
		
		return image;
	}
	
	public BufferedImage combineDiagonal(BufferedImage bi1, BufferedImage bi2) {
		int bi1Height = bi1.getHeight();
		int bi2Height = bi2.getHeight();
		int bi1Width = bi1.getWidth();
		int bi2Width = bi2.getWidth();
		
		int width = bi1Width + bi2Width;
		int height = bi1Height + bi2Height;
		
		BufferedImage image = new BufferedImage(width , height , COLOR_MODE);
		
		for(int i = 0; i < bi1Width; i++ ) {
			for(int j = 0; j < bi1Height; j++ ) {
				image.setRGB(i, j, bi1.getRGB(i, j));
			}
		}
		for(int i = bi1Width; i < width; i++ ) {
			for(int j = bi1Height; j < height; j++ ) {
				image.setRGB(i, j, bi2.getRGB(i-bi1Width, j-bi1Height));
			}
		}
		
		return image;
	}
	
	public BufferedImage combine(BufferedImage bi1, BufferedImage bi2, String direction) {
		switch(direction) {
		case "RIGHT" : return combineOnRight(bi1,bi2);
		case "BELOW" : return combineBelow(bi1,bi2); 
		case "DIAGONAL" : return combineDiagonal(bi1,bi2); 
		default : return combineOnRight(bi1,bi2); 
		}
	}

}
