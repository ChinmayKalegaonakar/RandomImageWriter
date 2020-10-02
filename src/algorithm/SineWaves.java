package algorithm;

import java.awt.image.BufferedImage;
import color.ColorManager;
import util.Util;

import java.awt.Color;
import java.awt.Graphics2D;
public class SineWaves extends Algorithm {
    public SineWaves(ColorManager colm){
        this.colorManager = colm;
    }
    @Override
    public BufferedImage paint(BufferedImage image){
        int height = image.getHeight();
        int width = image.getWidth();
        int angle = 0;
        int y = 0;
        Graphics2D g2d = (Graphics2D) image.getGraphics();
        int color = colorManager.getRandomColorFromPalette();
        for(int i = 0; i<width;i+=1){
            y = (int)(50* Math.sin(angle*3.141/180));
            y = height/2 - y;
            angle += 1;
            image.setRGB(Util.ensureRange(i, 0, width),Util.ensureRange(y, 0, height),color);
        }
        
       
        return image;
    }
}
