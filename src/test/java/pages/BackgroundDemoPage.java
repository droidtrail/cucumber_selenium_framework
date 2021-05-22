package pages;

import org.jetbrains.annotations.NotNull;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class BackgroundDemoPage {

    protected WebDriver driver;
    private By txt_username = By.id("txtUsername");
    private By txt_password = By.id("txtPassword");
    private By btn_login = By.id("btnLogin");
    private By btn_marketplace = By.id("MP_link");
    private By txt_welcome = By.id("welcome");
    private By txt_logout = By.linkText("Logout");
    private By btn_dashboard = By.cssSelector("#menu_dashboard_index > b");
    private By txt_quickLaunch = By.cssSelector("#panel_resizable_0_0 > legend");

    public void accessHomePage(String url) {
        String projectPath = System.getProperty("user.dir");
        System.setProperty("webdriver.chrome.driver", projectPath + "/src/test/resources/drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.navigate().to(url);
    }

    public void enterUsername(String username) {
        driver.findElement(txt_username).sendKeys(username);
    }

    public void enterPassword(String senha) {
        driver.findElement(txt_password).sendKeys(senha);
    }

    public void clickLogin() {
        driver.findElement(btn_login).click();
    }

    public void userIsHomePage(String pageTitle) {
        if(!driver.getTitle().equals(pageTitle)){
            throw new IllegalStateException("Página errada" + driver.getCurrentUrl());
        }
    }

    public void userIsLoggedIn(){
        driver.findElement(btn_marketplace).isDisplayed();
    }

    public void clickWelcome() {
        driver.findElement(txt_welcome).click();
    }

    public void checkLogoutVisible(){
        driver.findElement(txt_logout).isDisplayed();
    }

    public void clickDashboard(){
        driver.findElement(btn_dashboard).click();
    }

    public void quickLaunchIsVisible(){
        driver.findElement(txt_quickLaunch).click();
    }

    public void browserClose() {
      driver.close();
      driver.quit();
    }
}
