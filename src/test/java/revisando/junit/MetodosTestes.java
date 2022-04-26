package revisando.junit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MetodosTestes {
	WebDriver driver;

	public void abrirNavegador(String prd) {

		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(prd);

	}

	public void escrevert(By elemento, String Texto) {
		driver.findElement(elemento).sendKeys(Texto);

	}

	public void submit(By elemento) {
		driver.findElement(elemento).submit();
	}

	public void validaTexto(By elemento, String textoEsperado) {
		String texto = driver.findElement(elemento).getText();
	//	assertTrue(texto.equals(textoEsperado));
		assertEquals(textoEsperado, texto);

//		assertTrue(textoEsperado.contains(texto));

	}

	public void fecharNavegador() {
		driver.quit();
		System.out.println("Finalizando Teste");
	}
}
