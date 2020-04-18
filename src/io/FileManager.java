package io;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.logging.*;

import javax.imageio.ImageIO;

public class FileManager {
	private static final Logger LOGGER = Logger.getLogger("");
	private static final String PROPERTY_FILE = "/home/chinmay/eclipse-workspace/RandomImageWriter/resources/rir.properties";
	
	// new file
	public File newFile() {
		return FileFactory.getOneFile();
	}
	
	// saveFile
	public void saveFile(File file, BufferedImage bufferedImage) {
		try {
			
			ImageIO.write(bufferedImage,"png",file);
			LOGGER.info("save successfull");
			LOGGER.info("location "+file.getAbsolutePath());
		}catch(Exception e) {
			LOGGER.info("save failed");
		}
	}
	//file on timestamp
	public File timestampFile() {
		return FileFactory.newTimestampFile();
	}
	
	public Properties loadPropertyFile() {
		Handler[] handlers = LOGGER.getGlobal().getHandlers();
		try {
			LOGGER.info("loading config file");
			File propertyFile = new File(PROPERTY_FILE);
			FileReader fileReader = new FileReader(propertyFile);
			Properties prop = new Properties();
			prop.load(fileReader);
			return prop;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			LOGGER.info("Error loading config file");
			
		}
		return null;
	}
//	
//	loadFile
//	
//	mergeFiles

}
