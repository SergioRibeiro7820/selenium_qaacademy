package qaacademy_teste;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
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

    String inserirFerramentas = "//*[@id='Skills']";

    String abrirListaPais = "//*[@id='basicBootstrapForm']/div[10]/div/span/span[1]";
    String selecionarIndia = "//*[@id='select2-country-results']/li[6]";

    String selecionarAno = "//*[@id='yearbox']/option[64]";
    String selecionarMes = "//*[@id='basicBootstrapForm']/div[11]/div[2]/select/option[5]";
    String selecionarDia = "//*[@id='daybox']/option[25]";

    String inserirPassword = "//*[@id='firstpassword']";
    String confirmarPassword = "//*[@id='secondpassword']";

    String refreshNaPagina = "//*[@id='Button1']";

    @Test
    public void aberturaNavegador() throws InterruptedException{
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
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

        driver.findElement(By.xpath(inserirFerramentas)).click();
        driver.findElement(By.xpath(inserirFerramentas)).sendKeys("Java");
        driver.findElement(By.xpath(inserirFerramentas)).click();

        driver.findElement(By.xpath(abrirListaPais)).click();
        driver.findElement(By.xpath(selecionarIndia)).click();

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,400)", "");

        driver.findElement(By.xpath(selecionarAno)).click();
        driver.findElement(By.xpath(selecionarMes)).click();
        driver.findElement(By.xpath(selecionarDia)).click();

        driver.findElement(By.xpath(inserirPassword)).click();
        driver.findElement(By.xpath(inserirPassword)).sendKeys("BaguioT@doido");
        driver.findElement(By.xpath(inserirPassword)).click();
        driver.findElement(By.xpath(confirmarPassword)).click();
        driver.findElement(By.xpath(confirmarPassword)).sendKeys("BaguioT@doido");
        driver.findElement(By.xpath(confirmarPassword)).click();

        Thread.sleep(5000);
        driver.findElement(By.xpath(refreshNaPagina)).click();

    }
}

//https://demo.automationtesting.in/Register.html site para realizar o teste.

//https://www.browserstack.com/guide/selenium-scroll-tutorial - código scroll javascript
