import Base.BasePage;
import Pages.RegisterPage;
import Pages.SearchPage;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class SearchTest {
    private static WebDriver driver;

    @BeforeAll
    static void setUp(){
        BasePage basePage = new BasePage();
        basePage.openApp();
        driver = basePage.getDriver();
    }

    @Test
    public void testSearch() throws InterruptedException{
        SearchPage page = new SearchPage();
        Thread.sleep(50000);
        page.searchProduct("iPhone");
        Thread.sleep(1000);
        page.search();
        Thread.sleep(1000);
        page.addProduct();
        Thread.sleep(3000);
        String successMessage = page.getMessage();
        Thread.sleep(3000);
        assertTrue(successMessage.contains("Success: You have added iPhone to your shopping cart!"));
        System.out.println("Result: " + successMessage);
    }

    @AfterAll
    static void tearDown(){
        driver.quit();
    }
}
