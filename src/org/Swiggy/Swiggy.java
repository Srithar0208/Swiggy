package org.Swiggy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Swiggy {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\eclipse-workspace\\swiggy\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.swiggy.com/?utm_source=Google-Sok&utm_medium=CPC&utm_campaign=google_search_sok_food_na_narm_order_web_m_web_clubbedcities_neev_brand_newuser_v1_v2_brand_em&gclid=EAIaIQobChMIidvCp7Gu9gIVmmSLCh0eHA-QEAAYASAAEgJGZ_D_BwE");
		Thread.sleep(2000);
		WebElement location= driver.findElement(By.xpath("//input[@class='_381fS _1oTLG _3BIgv']"));
		location.sendKeys("omr greens");
		
		
		
	}

}
