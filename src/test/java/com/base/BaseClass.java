package com.base;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static WebDriver driver;
	static JavascriptExecutor executor;

	public static WebDriver getDriver() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		maximize();
		return driver;
	}

	public static void loadUrl(String data) {
		driver.get(data);
	}

	public static void maximize() {
		driver.manage().window().maximize();

	}

	public static void sendText(WebElement element, String data) {
		element.sendKeys(data);

	}

	public static void click(WebElement element) {
		element.click();

	}

	public static void closeBrowser() {
		driver.quit();

	}

	public static String getAttribute(WebElement element) {
		String name = element.getAttribute("value");
		return name;

	}

	public static String getText(WebElement element) {
		String text = element.getText();
		return text;

	}

	public static String getTitle() {
		String name = driver.getTitle();
		return name;

	}

	public static String getUrl() {
		String name = driver.getCurrentUrl();
		return name;

	}

	public static void closeWindow() {
		driver.close();

	}

	public static String prntWindowId() {
		String prntWin = driver.getWindowHandle();
		return prntWin;

	}

	public static Set<String> allWinId() {
		Set<String> allWin = driver.getWindowHandles();
		return allWin;

	}

	public static void switchWindow(String data) {
		driver.switchTo().window(data);

	}

	public static void forward() {
		driver.navigate().forward();
	}

	public static void backward() {
		driver.navigate().back();

	}

	public static void refresh() {
		driver.navigate().refresh();

	}

	public static boolean isDisplay(WebElement element) {
		boolean displayed = element.isDisplayed();
		return displayed;

	}

	public static boolean isEnable(WebElement element) {
		boolean enabled = element.isEnabled();
		return enabled;

	}

	public static boolean isSelect(WebElement element) {
		boolean selected = element.isSelected();
		return selected;

	}

	public static void mouseOver(WebElement element) {
		new Actions(driver).moveToElement(element);

	}

	public static void rightClick(WebElement element) {
		new Actions(driver).contextClick(element).perform();
	}

	public static void dragAndDrop(WebElement s, WebElement d) {
		new Actions(driver).dragAndDrop(s, d).perform();
	}

	public static void doubleClick(WebElement element) {
		new Actions(driver).doubleClick(element).perform();
	}

	public static void enterActions(WebElement element, String data) {
		element.sendKeys(data, Keys.ENTER);

	}

	public static void alertAccept() {
		driver.switchTo().alert().accept();

	}

	public static void alertDismiss() {
		driver.switchTo().alert().dismiss();

	}

	public static void alertTextAccept(String data) {
		driver.switchTo().alert().sendKeys(data);
		driver.switchTo().alert().accept();
	}

	public static void alertTextDismiss(String data) {
		driver.switchTo().alert().sendKeys(data);
		driver.switchTo().alert().dismiss();
	}

	public static Object javaScriptGetAttribute(WebElement element) {
		executor = (JavascriptExecutor) driver;
		Object executeScript = executor.executeScript("return arguments[0].getAttribute('value')", element);
		return executeScript;

	}

	public static Object javaScriptClick(WebElement element) {
		executor = (JavascriptExecutor) driver;
		Object script = executor.executeScript("arguments[0].click()", element);
		return script;

	}

	public static Object scrollUp(WebElement element) {
		executor = (JavascriptExecutor) driver;
		Object script = executor.executeScript("arguments[0].scrollIntoView(false)", element);
		return script;
	}

	public static Object scrollDown(WebElement element) {
		executor = (JavascriptExecutor) driver;
		Object script = executor.executeScript("arguments[0].scrollIntoView(true)", element);
		return script;
	}

	public static void frameIdAndName(String data) {
		driver.switchTo().frame(data);
	}

	public static void frameWebElement(WebElement element) {
		driver.switchTo().frame(element);

	}

	public static void frameInt(int index) {
		driver.switchTo().frame(index);

	}

	public static void innerFrame(String frameId) {
		driver.switchTo().frame(frameId);

	}

	public static void parentFrame() {
		driver.switchTo().parentFrame();

	}

	public static void mainWindow() {
		driver.switchTo().defaultContent();

	}

	public static void selectByIndex(WebElement element, int index) {

		new Select(element).selectByIndex(index);
	}

	public static void selectByValue(WebElement element, String value) {

		new Select(element).selectByValue(value);
	}

	public static void selectByVisibleText(WebElement element, String text) {

		new Select(element).selectByVisibleText(text);
	}

	public static void deSelectByValue(WebElement element, String value) {
		new Select(element).deselectByValue(value);

	}

	public static void deSelectByIndex(WebElement element, int index) {
		new Select(element).deselectByIndex(index);

	}

	public static void deSelectByVisibleText(WebElement element, String text) {
		new Select(element).deselectByVisibleText(text);

	}

	public static void deSelectAll(WebElement element) {
		new Select(element).deselectAll();

	}

	public static List<WebElement> getoptions(WebElement element) {
		List<WebElement> option = new Select(element).getOptions();
		return option;

	}

	public static WebElement getFirstSelectedOption(WebElement element) {
		WebElement firstSelectedOption = new Select(element).getFirstSelectedOption();
		return firstSelectedOption;

	}

	public static List<WebElement> getAllSelectedOptions(WebElement element) {
		List<WebElement> allSelectedOptions = new Select(element).getAllSelectedOptions();
		return allSelectedOptions;

	}

	public static boolean selectMultipleOptions(WebElement element) {
		boolean multiple = new Select(element).isMultiple();
		return multiple;

	}

	public static void screenShot(String fileName) throws IOException {
		TakesScreenshot screenshot = (TakesScreenshot) driver;
		File source = screenshot.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(source, new File(System.getProperty("user.dir") + "\\Screenshot\\" + fileName + ".png"));
	}

}
