package StepDefinitions;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class LoginDemoSteps {

//    WebDriver driver = null;
//
//    @Dado("navegador está aberto")
//    public void navegador_está_aberto() {
//        String projectPath = System.getProperty("user.dir");
//        System.setProperty("webdriver.chrome.driver", projectPath + "/src/test/resources/drivers/chromedriver.exe");
//        driver = new ChromeDriver();
//        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//        driver.manage().window().maximize();
//    }
//
//    @E("o usuário está na página de login")
//    public void o_usuário_está_na_página_de_login() {
//        driver.navigate().to("https://example.testproject.io/web/");
//    }
//
//    @Quando("^o usuário preencher o (.*) e a (.*)$")
//    public void o_usuário_preencher_o_username_e_a_senha(String username, String senha) {
//        driver.findElement(By.id("name")).sendKeys(username);
//        driver.findElement(By.id("password")).sendKeys(senha);
//
//    }
//
//    @Quando("o usuário clica em login")
//    public void o_usuário_clica_em_login() {
//        driver.findElement(By.id("login")).click();
//    }
//
//    @Então("o usário é redirecionado para a home page")
//    public void o_usário_é_redirecionado_para_a_home_page() {
//        driver.findElement(By.id("logout")).isDisplayed();
//        driver.close();
//        driver.quit();
//    }
}
