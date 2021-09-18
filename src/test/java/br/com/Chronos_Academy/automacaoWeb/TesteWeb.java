package br.com.Chronos_Academy.automacaoWeb;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TesteWeb {
    @Test
    public void primeiroTeste(){
        // configura o driver para o navegador Chrome
        WebDriverManager.chromedriver().setup();
        // criando o objeto driver
        ChromeDriver driver;

        //instancia da classe ChromeDriver para usar os metodos da classe
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        //acessa uma página
        driver.get("https://www.chronosacademy.com.br");

        // localizando elemento
        String xpathTitulo = "/html/body/div/div/div/div/div/section[2]/div[3]/div/div/div/div/div[1]/div/h4";
        WebElement txtTitulo = driver.findElement(By.xpath(xpathTitulo));
        //recuperando o texto do elemento
        String textoElementoTxtTitulo = txtTitulo.getText();

        //compara o texto do elemento com o esperado
        Assert.assertEquals("Porque Tempo É Conhecimento",textoElementoTxtTitulo);

        driver.quit();

    }

}
