package br.com.Chronos_Academy.automacaoWeb;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PortalCliente {
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
        driver.get("http://portalqa.tcp.com.br/");

    }
    @Test
    public void acessarCadastroVeiculo() throws InterruptedException {
        String xpathLinkCadastrarVeiculo = "//div/div[1]/div/a[1]";
        WebElement linkCadastrarVeiculo = driver.findElementByXPath(xpathLinkCadastrarVeiculo);
        linkCadastrarVeiculo.click();
        Thread.sleep(1000);
        String xpathTituloPaginaCadastro = "//tcp-h3/span";
        WebElement txtTituloPaginaCadastro = driver.findElementByXPath(xpathTituloPaginaCadastro);
        String textoEsperadoTituloPaginaCadastro = txtTituloPaginaCadastro.getText();
        Assert.assertEquals("Cadastro de Veículo", textoEsperadoTituloPaginaCadastro);
    }
}
