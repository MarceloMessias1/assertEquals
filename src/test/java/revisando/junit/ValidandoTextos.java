package revisando.junit;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidandoTextos {

	

	MetodosTestes metodos = new MetodosTestes();
	Elementos el = new Elementos();
	String prd = "https://www.google.com.br";
	
	@Before
	public void setUp() throws Exception {
		metodos.abrirNavegador(prd);
	}

	@After
	public void tearDown() throws Exception {

	}

	@Test
	public void test() {
		metodos.escrevert(el.elemento, "E2E treinamentos");
		metodos.submit(el.elemento);
		metodos.validaTexto(el.getTexto(), "Alameda Araguaia - Tamboré, Barueri - SP, 06455-906");
		metodos.fecharNavegador();
	}

}
