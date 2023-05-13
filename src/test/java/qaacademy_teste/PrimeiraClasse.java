package qaacademy_teste;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class PrimeiraClasse {

    String cursosOnlineBotao = "//*[@id='comp-k7g9c7sd0label']";
    String cursosPresenciaisBotao = "comp-k7g9c7sd1label";

    @Test
    public void testeAberturaNavegador(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.qaacademy.com.br/");

        driver.findElement(By.xpath(cursosOnlineBotao)).click();
        driver.findElement(By.id(cursosPresenciaisBotao)).click();
    }
    
}