package br.com.Chronos_Academy.automacaoWeb;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TesteWeb {
    // criando o objeto driver
    ChromeDriver driver;

    @Before
    public void inicializaTeste(){
    // configura o driver para o navegador Chrome
     WebDriverManager.chromedriver().setup();

     //instancia da classe ChromeDriver para usar os metodos da classe
     driver = new ChromeDriver();
     driver.manage().window().maximize();

     //acessa uma página
     driver.get("https://www.chronosacademy.com.br");
    }

    @Test
    public void primeiroTeste(){
    // localizando elemento
    String xpathTitulo = "//section[2]//h4";
    WebElement txtTitulo = driver.findElement(By.xpath(xpathTitulo));
    //recuperando o texto do elemento
    String textoElementoTxtTitulo = txtTitulo.getText();

    //compara o texto do elemento com o esperado
    Assert.assertEquals("Porque Tempo É Conhecimento",textoElementoTxtTitulo);
    }

    @Test
    public void segundoTeste(){
        System.out.println("Teste dois");
    }

    @Test
    public void terceiroTeste(){
        System.out.println("Teste tres");
    }

    @After
    public void finalizaTeste(){
        driver.quit();
    }

}
