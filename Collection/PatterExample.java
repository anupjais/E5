import java.io.*;
import java.util.*;
import java.awt.image.*;
import java.awt.*;
import javax.imageio.*;
class PatterExample
{
	 public static void main(String[] args) {
	 	// System.out.println("\033[J\033[2H");
	 	try
	 	{
	 		File file = new File("/Users/anupjaiswal/Downloads/IMG-20240219-WA0005.jpg");
	 		BufferedImage image = ImageIO.read(file);
	 		for(int i=0; i<image.getHeight(); i++)
	 		{
	 			tabs(65);
	 			for(int j=0; j<image.getWidth(); j++)
	 			{
	 				Color color = new Color(image.getRGB(j,i));
	 				if(color.getRed()==0 && color.getGreen()==0 && color.getBlue()==0)
	 					System.out.print("#");
	 				else
	 					System.out.print(" ");
	 			}
	 			System.out.println();
	 		}
	 	}catch(Exception e)
	 	{
	 		System.out.println("Something went wrong.");
	 	}
	 }
	 public static void tabs(int num)
	 {
	 	for(int i=0; i<=num; i++)
	 		System.out.print("\t");
	 }
}


/*

// import java.util.*;
import java.io.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;

class MaharajPattern{
	public static void main(String [] args)
	{
		File file = new File("/Users/anupjaiswal/Downloads/IMG-20240219-WA0005.jpg");
//		File file = new File("/Users/anupjaiswal/Downloads/shivaji-maharaj-png-10.png");
//		File file = new File("/Users/anupjaiswal/Downloads/Maharaj2.jpeg");
//		File file = new File("/Users/anupjaiswal/Downloads/Maharaj3.png");
//		File file = new File("/Users/anupjaiswal/Downloads/Maharaj4.png");
		try{
			BufferedImage image = ImageIO.read(file);
			for(int i=0; i<image.getHeight(); i++)
			{
//				System.out.print("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\033[5;91m");
				System.out.print("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t");
				for(int j=0; j<image.getWidth(); j++)
				{
					Color clr = new Color(image.getRGB(j,i));
					if((clr.getRed()==0) && (clr.getGreen()==0) && (clr.getBlue() == 0)){
//						if(j==(image.getWidth())-1){
//							System.out.print("\033[5;101m* \033[0m");
//						}
						System.out.print("\033[105;5;1m@  \033[0m");
						// System.out.print("*   ");
					}else{
						System.out.print("  ");
						// System.out.print("\033[47m   \033[0m");
						// System.out.print("\033[105m   \033[0m");
					}
				}
				System.out.println();
			}
		}catch(Exception e){
			System.out.println("Exception Occured");
		}
	}
}
*/