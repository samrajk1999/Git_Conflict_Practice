package utils;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BaseClass {

public static WebDriver driver;
	
	public static void browser() {

		driver = new ChromeDriver();
	}

	public static void url(String url) {

		driver.get(url);
	}

	public static void max() {

		driver.manage().window().maximize();
	}

	public static void shot(String element) throws IOException {

		TakesScreenshot screenshot = (TakesScreenshot) driver;
		File snap = screenshot.getScreenshotAs(OutputType.FILE);
		String destination = "C:\\Users\\rajsa\\eclipse-workspace\\poc_final\\screenshots\\" + element + ".png";
		File imgpath = new File(destination);
		FileUtils.copyFile(snap, imgpath);

	}

	public static void shot1(Boolean element) throws IOException {

		TakesScreenshot screenshot = (TakesScreenshot) driver;
		File snap = screenshot.getScreenshotAs(OutputType.FILE);
		String destination = "C:\\Users\\rajsa\\eclipse-workspace\\poc_final\\screenshots\\" + element + ".png";
		File imgpath = new File(destination);
		FileUtils.copyFile(snap, imgpath);

	}

	public static void mousehover(WebElement element) {

		Actions action = new Actions(driver);
		action.moveToElement(element).perform();
	}

	public static void scroll(WebElement element) {

		JavascriptExecutor Js = (JavascriptExecutor) driver;
		Js.executeScript("arguments[0].scrollIntoView(true);", element);
	}

	public static void scroll_bottom() {

		JavascriptExecutor Js = (JavascriptExecutor) driver;
		Js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	}

	public static void scroll_top() {

		JavascriptExecutor Js = (JavascriptExecutor) driver;
		Js.executeScript("window.scrollTo(0,0)");
	}

	public static void implicitywait() {

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	public static void handle(int index) {

		Set<String> windowHandles = driver.getWindowHandles();
		implicitywait();
		List<String> list = new ArrayList<String>(windowHandles);
		driver.switchTo().window(list.get(index));

	}

	public static void quit() throws InterruptedException {

		Thread.sleep(4000);
		driver.quit();

	}
}
