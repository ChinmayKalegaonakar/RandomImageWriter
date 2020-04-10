package algorithm;

import java.awt.image.BufferedImage;

import color.ColorManager;

public class RandomPixels implements Algorithm {
	public ColorManager colorManager;
	public RandomPixels(ColorManager colm){
		this.colorManager = colm;
	}
	
	public BufferedImage randomRandom(BufferedImage image) {
		int height = image.getHeight();
		int width = image.getWidth();
		int pixel = 0;
		for(int y = 0; y < height; y++){
	       for(int x = 0; x < width; x++){
	    	   pixel = colorManager.getRandomColorFromPalette();
	        image.setRGB(x, y, pixel);
	       }
	    }
		return image;
	}
}
