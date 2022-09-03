package Pages;

import Base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class SearchPage extends BasePage {
    protected static final String searchInput = "//*[@id=\"search\"]/input"; //xpath
    protected static final String buttonInput = "//*[@id=\"search\"]/span/button"; //xpath
    protected static final String addToChart =  "//*[@id=\"content\"]/div[3]/div/div/div[2]/div[2]/button[1]/span"; //xpath
    protected static final String successMessage = "#product-search > div.alert.alert-success.alert-dismissible"; //className

    public void searchProduct(String product) throws InterruptedException{
        WebElement searchProduct = getWebElement(By.xpath(searchInput));
        searchProduct.clear();
        searchProduct.sendKeys(product);
        Thread.sleep(2000);

    }

    public void search(){
        WebElement search = getWebElement(By.xpath(buttonInput));
        search.click();
    }

    public void addProduct(){
        WebElement addProduct = getWebElement(By.xpath(addToChart));
        addProduct.click();
    }

    public String getMessage(){
        WebElement message = getWebElement(By.cssSelector(successMessage));
        return message.getText();
    }


}
