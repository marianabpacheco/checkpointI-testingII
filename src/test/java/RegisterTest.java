import Base.BasePage;
import Pages.RegisterPage;
import Pages.SearchPage;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class RegisterTest {
    private static WebDriver driver;

    @BeforeAll
    static void setUp(){
        BasePage basePage = new BasePage();
        basePage.openApp();
        driver = basePage.getDriver();
    }

    @Test
    public void testRegister() throws InterruptedException{
        RegisterPage page = new RegisterPage();
        Thread.sleep(50000);
        page.goToRegisterPage();
        Thread.sleep(1000);
        page.insertPersonalDetails("Aaron","Preston","eu.dui@google.com","(653) 983-643");
        page.insertPassword("password","password");
        page.denySubscription();
        page.confirmPrivacyPolicy();
        page.createAccount();
        Thread.sleep(1000);
        String successMessage = page.getMessage();
        Thread.sleep(4000);
        assertTrue(successMessage.contains("Congratulations! Your new account has been successfully created!"));
        System.out.println("Result: " + successMessage);
    }

    @AfterAll
    static void tearDown(){
        driver.quit();
    }
}
