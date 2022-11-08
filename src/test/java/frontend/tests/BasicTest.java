package frontend.tests;

import com.codeborne.selenide.WebDriverRunner;
import frontend.components.LoginModal;
import frontend.components.Navbar;
import frontend.pages.HomePage;
import frontend.pages.RegisterPage;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BasicTest {

    private HomePage home;

    private Navbar navbar;

    private LoginModal modal;

    private RegisterPage register;

    @BeforeEach
    void setUp() throws InterruptedException {
        home = new HomePage();
        Thread.sleep(5000);
    }

    @Test
    @Order(1)
    void loginFail() {
        navbar = new Navbar();
        modal = new LoginModal();
        home.openHomePage();
        home.isAtHomePage();
        navbar.clickLoginIcon();
        modal.failLoginAsAdmin();
        assertFalse(navbar.newShowLinkIsVisible());
        assertEquals(WebDriverRunner.url(), "https://zavodlivakvecherina.herokuapp.com/?error");
    }

    @Test
    @Order(2)
    void registerSuccess() {
        register = new RegisterPage();
        register.openRegisterPage();
        register.registerNewAdmin();
        home.isAtHomePage();
        assertEquals(WebDriverRunner.url(), "https://zavodlivakvecherina.herokuapp.com/");

    }

    @Test
    @Order(3)
    void loginSuccess() {
        navbar = new Navbar();
        modal = new LoginModal();
        home.openHomePage();
        home.isAtHomePage();
        navbar.clickLoginIcon();
        modal.loginAsAdmin();
        assertTrue(navbar.newShowLinkIsVisible());
    }


    @Test
    @Order(4)
    void isAtHomePage() {

        home.openHomePage();
        home.isAtHomePage();
        assertEquals(WebDriverRunner.url(), "https://zavodlivakvecherina.herokuapp.com/");
    }

    @Test
    @Order(5)
    void assertShowTitle() {
        home.openHomePage();
        home.isAtHomePage();
        assertNotEquals(home.getLastShowName(), "Пиото и Тишината");
    }


}
