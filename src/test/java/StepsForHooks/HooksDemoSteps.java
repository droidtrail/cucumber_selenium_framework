package StepsForHooks;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class HooksDemoSteps {

    WebDriver driver = null;

//    @Before(order = 1)
//    @Before("@smoke")
//    @Before(value="@smoke", order = 1)
//    public void browserSetup() {
//        System.out.println("Eu estou dentro do BEFORE");
//        System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
//        driver = new ChromeDriver();
//        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        driver.manage().window().maximize();
//
//    }
//
//    @Before(order = 0)
//    public void setup2(){
//        System.out.println("Eu estou dentro do setup2 \n");
//    }
//
//    @After
//    public void tearDown() {
//        System.out.println("Eu estou dentro do AFTER");
//        driver.close();
//        driver.quit();
//    }
//
//    @After(order = 0)
//    public void tearDown2() {
//        System.out.println("Eu estou dentro do AFTER2 \n");
//    }
//
//    @BeforeStep
//    public void beforeSteps(){
//        System.out.println("I am inside beforeSteps");
//    }
//
//    @AfterStep
//    public void afterSteps(){
//        System.out.println("I am inside afterSteps");
//    }
//
//    @Dado("o usuário está na página de login")
//    public void o_usuário_está_na_página_de_login() {
//
//    }
//
//    @Quando("o usuário preencher o username e a senha")
//    public void o_usuário_preencher_o_username_e_a_senha() {
//
//    }
//
//    @E("o usuário clica em login")
//    public void o_usuário_clica_em_login() {
//
//    }
//
//    @Então("o usário é redirecionado para a home page")
//    public void o_usário_é_redirecionado_para_a_home_page() {
//
//    }
}
