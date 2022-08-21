package testegamemania;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class testelogin {
	private WebDriver driver;
	
	@Before
	public void abrirNavegador () {
		System.setProperty("webdriver.chrome.driver", "c:\\Arquivos de Programas\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	@Test
	public void testeNavegador() {
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.get("http://localhost:4200/login"); 
		
		WebElement inputEmail = driver.findElement(By.id("user"));
		WebElement inputSenha = driver.findElement(By.id("password"));
		WebElement botãoLogin = driver.findElement(By.id("enviar"));
		
		String[] listaSenhas = {"senha", "teste", "erro", "teste12", "teste123"};
		for (int tentativa = 0; tentativa < listaSenhas.length; tentativa++) {
			try {
			inputEmail.clear();
			inputSenha.clear();
		
		
		
			inputEmail.sendKeys("teste@email.com");
			inputSenha.sendKeys(listaSenhas[tentativa]);
			botãoLogin.click();
		
			Thread.sleep(3000);
		
	
		
			} catch (InterruptedException e ){
				e.printStackTrace();
	
	}
	}
	}		
}
	

