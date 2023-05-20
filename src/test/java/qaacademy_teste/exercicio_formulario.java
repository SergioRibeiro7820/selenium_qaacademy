package qaacademy_teste;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class exercicio_formulario {
    
    String preencherNome = "//*[@id='basicBootstrapForm']/div[1]/div[1]/input";
    String preencherSobrenome = "//*[@id='basicBootstrapForm']/div[1]/div[2]/input";
    String preencherEndereco = "//*[@id='basicBootstrapForm']/div[2]/div/textarea";
    String preencherEmail = "//*[@id='eid']/input";
    String preencherTelefone = "//*[@id='basicBootstrapForm']/div[4]/div/input";
    String selecionarBotao = "//*[@id='basicBootstrapForm']/div[5]/div/label[1]/input";
    String selecionarBotaoDois = "//*[@id='checkbox2']";

    @Test
    public void aberturaNavegador() throws InterruptedException{
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.automationtesting.in/Register.html");

        Thread.sleep(2000);
        driver.findElement(By.xpath(preencherNome)).click();
        driver.findElement(By.xpath(preencherNome)).sendKeys("Sergio");
        driver.findElement(By.xpath(preencherSobrenome)).click();
        driver.findElement(By.xpath(preencherSobrenome)).sendKeys("Ribeiro");
        driver.findElement(By.xpath(preencherEndereco)).click();
        driver.findElement(By.xpath(preencherEndereco)).sendKeys("Rua Sinfonia Italiana, 15");
        driver.findElement(By.xpath(preencherEmail)).click();
        driver.findElement(By.xpath(preencherEmail)).sendKeys("sergioribeiro782015@gmail.com");
        driver.findElement(By.xpath(preencherTelefone)).click();
        driver.findElement(By.xpath(preencherTelefone)).sendKeys("11 987933120");
        driver.findElement(By.xpath(selecionarBotao)).click();
        driver.findElement(By.xpath(selecionarBotaoDois)).click();
    }
}

//https://demo.automationtesting.in/Register.html site para realizar o teste.
