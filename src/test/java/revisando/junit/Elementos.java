package revisando.junit;

import org.openqa.selenium.By;

public class Elementos {

	By elemento = By.xpath("//*[@name='q']");
	By texto = By.xpath("//*[@id=\"_p0ljYqaMDem35OUP---L8Aw23\"]/div[1]/div[2]/div[2]/div/div[2]/h2/span");
	By validaTexto = By.xpath("//*[text()='Alameda Araguaia - Tamboré, Barueri - SP, 06455-906']");

	public By getTexto() {
		// TODO Auto-generated method stub
		return validaTexto;
	}

}
