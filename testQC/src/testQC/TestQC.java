package testQC;

import org.openqa.selenium.support.ui.Select;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class TestQC {

	public static void main(String[] args) {
		 
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\omar.contreras\\testQC\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://toolsqa.com/automation-practice-form/");
 		driver.manage().window().maximize();
 		System.out.println("Sitio desplegado de forma correcta."+ driver.getCurrentUrl());
 		
 		
 		WebElement nombre = driver.findElement(By.name("firstname"));
 		nombre.sendKeys("Omar");
 		WebElement apellido = driver.findElement(By.name("lastname"));
 		apellido.sendKeys("Contreras");
 		WebElement sexo = driver.findElement(By.name("sex"));
 		sexo.click();
 		WebElement experiencia = driver.findElement(By.id("exp-4"));
 		experiencia.click();
 		WebElement fecha = driver.findElement(By.id("datepicker"));
 		fecha.sendKeys("16/08/1989");
 		WebElement profesion1 = driver.findElement(By.id("profession-0"));
 		profesion1.click();
 		WebElement profesion2 = driver.findElement(By.id("profession-1"));
 		profesion2.click();
 		//WebElement subirFoto = driSver.findElement(By.id("photo"));
 		//subirFoto.click();
 		WebElement herramienta = driver.findElement(By.id("tool-2"));
 		herramienta.click();
 		Select continentes = new Select(driver.findElement(By.id("continents")));
 		continentes.selectByVisibleText("South America");
 		Select commands = new Select(driver.findElement(By.id("selenium_commands")));
 		commands.deselectAll();
 		commands.selectByVisibleText("WebElement Commands");
 		commands.selectByVisibleText("Switch Commands");

 		 
 		//WebElement enviar = driver.findElement(By.id("submit"));
 		//enviar.submit();
 		
 	 				
        }
}