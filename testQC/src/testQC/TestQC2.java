package testQC;

import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestQC2 {

	public static void main(String[] args) {
		 
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\omar.contreras\\testQC\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.google.com");
 		driver.manage().window().maximize();
 		System.out.println("Sitio desplegado de forma correcta."+ driver.getCurrentUrl());
 		
 		WebElement element = driver.findElement(By.name("q"));
 		element.sendKeys("Cheese!");
 		element.submit();
 		// t�tulo de la p�gina
 		System.out.println("T�tulo de p�gina: " + driver.getTitle());
 		// esperar 10 segundos la b�squeda
 		(new WebDriverWait(driver, 10)).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver d) {
                return d.getTitle().toLowerCase().startsWith("cheese!");
            }
        });
 		
 		// el t�tulo ahora debe ser "cheese! - Google Search"
 		System.out.println("Nuevo t�tulo de p�gina: " + driver.getTitle());
 				
        }
}