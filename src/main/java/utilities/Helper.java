package utilities;

import java.io.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.FileHandler;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Helper {
	// Method to take screenshot when Test cases Fail
	//	public static void captureFAIL_Screenshot(WebDriver driver, String screenshotname) {
	//		// Save the capture screen shot into the destination created folder with the
	//		// name of the test case
	//		Path dest = Paths.get("./Fail_Screenshots", screenshotname + ".png");
	//		try {
	//			Files.createDirectories(dest.getParent());
	//			FileOutputStream out = new FileOutputStream(dest.toString());
	//			out.write(((org.openqa.selenium.TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES));
	//			out.close();
	//		} catch (IOException e) {
	//			System.out.print("Exception while taking screen shot" + e.getMessage());
	//		}
	//	}


	public static String captureScreenshot(WebDriver driver)
	{
		File src =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String screenshotpath =System.getProperty("user.dir")+"/Screenshot/"+GetCurrentTime()+".png";
		try 
		{



			org.openqa.selenium.io.FileHandler.copy(src, new File(screenshotpath));

			System.out.println("Screenshot taken");
		} 
		catch (Exception e)
		{

			System.out.println("Exception while taking screenshot "+e.getMessage());
		} 
		return screenshotpath;
	}



	public static String GetCurrentTime () {

		DateFormat format = new SimpleDateFormat("dd MMMM YYYY hh:mm:ss");
		Date date=new Date();
		return  format.format(date);

	}
}
