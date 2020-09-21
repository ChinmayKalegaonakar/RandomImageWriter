import java.awt.image.BufferedImage;
import java.util.logging.Handler;
import java.util.logging.LogManager;
import java.util.logging.Logger;

import canvas.CanvasWriter;

public class RandomImageWriter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final Logger LOGGER = Logger.getLogger("");
		System.setProperty("java.util.logging.SimpleFormatter.format",
	              "[%1$tF %1$tT] [%4$-7s] %5$s %n");
		Handler[] handlers = LOGGER.getHandlers();
		for(Handler h: handlers) {
			
		}
		
		LOGGER.info("writing to file");
		CanvasWriter canvas = new CanvasWriter();
		BufferedImage image1 = canvas.createImage();
		canvas.saveImage(image1);
		LOGGER.info("wrote to file");
		// getfile
		// give to canvas
		// select color
		// select brush
		// select algo
		// give color to brush
		// give brush to algo
		// give algo to canvas
		// draw
		// save file
	}

}
