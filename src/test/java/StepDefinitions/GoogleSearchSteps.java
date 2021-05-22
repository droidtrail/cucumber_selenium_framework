package StepDefinitions;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class GoogleSearchSteps {

    WebDriver driver = null;
//
//    @Dado("browser está aberto")
//    public void browser_está_aberto() {
//        String projectPath = System.getProperty("user.dir");
//        System.setProperty("webdriver.chrome.driver", projectPath + "/src/test/resources/drivers/chromedriver.exe");
//        driver = new ChromeDriver();
//        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//        driver.manage().window().maximize();
//    }
//
//    @Dado("o usuário está na página de busca do Google")
//    public void o_usuário_está_na_página_de_busca_do_google() {
//        driver.navigate().to("https://google.com.br");
//    }
//
//    @Quando("o usuário digita o texto da busca")
//    public void o_usuário_digita_o_texto_da_busca() {
//        driver.findElement(By.name("q")).sendKeys("Automation Step by Step");
//    }
//
//    @Quando("clica em Enter")
//    public void clica_em_enter() {
//        driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
//    }
//
//    @Então("o usuário visualiza o resultado da busca")
//    public void o_usuário_visualiza_o_resultado_da_busca() {
//        driver.getPageSource().contains("Online Courses");
//        driver.close();
//        driver.quit();
//    }
}
