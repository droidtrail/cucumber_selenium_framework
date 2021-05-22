package StepsForBackground;

import io.cucumber.java.After;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import org.openqa.selenium.WebDriver;
import pages.BackgroundDemoPage;

public class BackgroundDemoSteps {

    WebDriver driver = null;
    BackgroundDemoPage page;

    @Dado("usuário está na página de autenticação")
    public void usuário_está_na_página_de_autenticação() {

        page = new BackgroundDemoPage();
        page.accessHomePage("https://opensource-demo.orangehrmlive.com/index.php/auth/login");

    }

    @Quando("o usuário digita o usuário e a senha")
    public void o_usuário_digita_o_usuário_e_a_senha() {

        page.enterUsername("Admin");
        page.enterPassword("admin123");

    }

    @Quando("clica no botão de login")
    public void clica_no_botão_de_login() {
        page.clickLogin();
    }

    @Então("o usuário navega até a página principal")
    public void o_usuário_navega_até_a_página_principal() {
        page.userIsHomePage("OrangeHRM");
    }

    @Dado("usuário está logado")
    public void usuário_está_logado() {
        page.userIsLoggedIn();
    }

    @Quando("usuário clicar no link welcome")
    public void usuário_clicar_no_link_welcome() {
        page.clickWelcome();
    }

    @Então("o link de logout deve estar visível")
    public void o_link_de_logout_deve_estar_visível() {
        page.checkLogoutVisible();
    }

    @Quando("usuário clicar no dashboard link")
    public void usuário_clicar_no_dashboard_link() {
        page.clickDashboard();
    }

    @Então("quick launch toolbar deve estar visível")
    public void quick_launch_toolbar_deve_estar_visível() {
        page.quickLaunchIsVisible();
    }

    @After
    public void fecharNavegador() {
        page.browserClose();
    }

}
