package project.sample;
import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ChildProcess extends Base_Class{
	public static void main(String[] args) throws AWTException, InterruptedException, IOException {
		openbrowser("chrome");
		geturl("http://automationpractice.com/index.php");
		
		
		findkeys(By.xpath("//a[@class='login']"));
		
		WebElement login = driver.findElement(By.xpath("(//h3[@class='page-subheading'])[1]"));
		scrolldown(login);
		WebElement emid = driver.findElement(By.id("email"));
		clickelement(emid);
		sendkeys(emid, "jeyprakash1992@gmail.com");
		WebElement pass = driver.findElement(By.id("passwd"));
		sendkeys(pass,"9876543210");
		findkeys(By.id("SubmitLogin"));
		findkeys(By.xpath("(//a[@title='T-shirts'])[2]"));
		sleep();
		WebElement scroldown = driver.findElement(By.xpath("(//span[@class='layered_subtitle'])[5]"));
		scrolldown(scroldown);
		WebElement sele = driver.findElement(By.xpath("(//a[@class='color_pick'])[2]"));
		mouseover(sele);
		clickelement(sele);
		WebElement add = driver.findElement(By.id("add_to_cart"));
		mouseover(add);
		clickelement(add);
		driver.findElement(By.xpath("//a[@title='View my shopping cart']")).click();
		WebElement chek = driver.findElement(By.xpath("(//a[@title='Proceed to checkout'])[2]")); 
		scrolldown(chek);
		mouseover(chek);
		clickelement(chek);
		WebElement adrchk = driver.findElement(By.xpath("//button[@name='processAddress']"));
		scrolldown(adrchk);
		mouseover(adrchk);
		clickelement(adrchk);
		WebElement shipchk = driver.findElement(By.xpath("//button[@name='processCarrier']"));
		scrolldown(shipchk);
		findkeys(By.xpath("//input[@type='checkbox']"));
		mouseover(shipchk);
		clickelement(shipchk);
		findkeys(By.xpath("//a[@class='cheque']"));
		WebElement finish = driver.findElement(By.xpath("//button[@class='button btn btn-default button-medium']"));
		scrolldown(finish);
		mouseover(finish);
		clickelement(finish);
		WebElement finish1 = driver.findElement(By.xpath("//span[@class='price']"));
		scrolldown(finish1);
		mouseover(finish1);
		screenshot();
		//quit();
			
	}	


}
