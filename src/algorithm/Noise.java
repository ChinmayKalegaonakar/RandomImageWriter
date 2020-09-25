package algorithm;


import java.awt.image.BufferedImage;

import color.ColorManager;

public class Noise extends Algorithm {
    public Noise(ColorManager colm){
        this.colorManager = colm;
    }

    @Override
    public BufferedImage paint(BufferedImage image) {
        int height = image.getHeight();
		int width = image.getWidth();
		int pixel = 0;
		for(int y = 0; y < height;){
	       for(int x = 0; x < width;){
               pixel = colorManager.getGrayFromPalette();
               int is = (int)Math.round(Math.random());
                if(is == 1){
                    image.setRGB( x,y, pixel );
                    x++;
                }
	    	   x += 8;
	       }
	       y +=1;
	    }
        return image;
    }
    
}
