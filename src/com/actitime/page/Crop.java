package com.actitime.page;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Crop 
{
	public static void main(String[] args) throws IOException 
	{
		BufferedImage originalImg = ImageIO.read(new File("./screenshot/testInvalidLogin.png"));
		BufferedImage subImg = originalImg.getSubimage(100, 100, 200, 200);
		ImageIO.write(subImg, "png", new File("./data"));
	}

}
