package algorithm;

import java.awt.image.BufferedImage;
import color.ColorManager;

import java.awt.Color;
import java.awt.Graphics2D;

public class Arches extends Algorithm {

    public Arches(ColorManager colm) {
        this.colorManager = colm;
    }
    

    @Override
    public BufferedImage paint(BufferedImage image) {
        // TODO Auto-generated method stub
        int height = image.getHeight();
        int width = image.getWidth();
        Graphics2D g2d = (Graphics2D) image.getGraphics();
        for(int i = 0; i<=height;i+=10){
            for( int j = 0;j<=width; j+=10){
                Color color = colorManager.getColorFromRandomPalette();
                g2d.setColor(color);
                g2d.drawArc(i,j, i+20, j+20, 0,90);
            }
        }
        
       
        return image;
    }


}
