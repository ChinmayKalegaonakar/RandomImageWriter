package algorithm;

import java.awt.image.BufferedImage;
import color.ColorManager;

import java.awt.Color;
import java.awt.Graphics2D;
public class RandomPolygon extends Algorithm {

    int xpoints[];
    int ypoints[];
    int npoints;

    public RandomPolygon(ColorManager colm,int _npoints){
        this.colorManager = colm;
        npoints = _npoints;
        this.xpoints = new int[npoints];
        this.ypoints = new int[npoints];
    }

    @Override
    public BufferedImage paint(BufferedImage image) {
        int height = image.getHeight();
        int width = image.getWidth();
        Graphics2D g2d = (Graphics2D) image.getGraphics();
        Color color = colorManager.getColorFromRandomPalette();
        for(int i = 0; i<npoints ;i++){
            xpoints[i] = (int)(Math.random()*width);
            ypoints[i] = (int)(Math.random()*height);
        }
        g2d.setColor(color);
        g2d.fillPolygon(xpoints, ypoints, npoints);
        return image;
    }
    
}
