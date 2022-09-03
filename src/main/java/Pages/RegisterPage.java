package Pages;

import Base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class RegisterPage extends BasePage {
    protected static final String dropdown = "//*[@id=\"top-links\"]/ul/li[2]/a/span[1]"; //xpath
    protected static final String register = "//*[@id=\"top-links\"]/ul/li[2]/ul/li[1]/a";
    protected static final String firstName = "input-firstname"; //id
    protected static final String lastName = "input-lastname"; //id
    protected static final String email = "input-email"; //id
    protected static final String telephone = "input-telephone"; //id
    protected static final String password = "input-password"; //id
    protected static final String confirmPassword = "input-confirm"; //id
    protected static final String subscribe = "//*[@id=\"content\"]/form/fieldset[3]/div/div/label[2]/input";
    protected static final String privacyPolicy = "//*[@id=\"content\"]/form/div/div/input[1]";
    protected static final String successMessage = "//*[@id=\"content\"]/p[1]";
    protected static final String continueButton = "//*[@id=\"content\"]/form/div/div/input[2]";


    public void goToRegisterPage() throws InterruptedException{
        WebElement dropdownButton = getWebElement(By.xpath(dropdown));
        dropdownButton.click();
        Thread.sleep(1000);
        WebElement registerButton = getWebElement(By.xpath(register));
        registerButton.click();
    }

    public void insertPersonalDetails(String name,String secondName,String personalEmail, String telephoneNumber){
        WebElement firstNameInput = getWebElement(By.id(firstName));
        firstNameInput.clear();
        firstNameInput.sendKeys(name);

        WebElement lastNameInput = getWebElement(By.id(lastName));
        lastNameInput.clear();
        lastNameInput.sendKeys(secondName);

        WebElement emailInput = getWebElement(By.id(email));
        emailInput.clear();
        emailInput.sendKeys(personalEmail);

        WebElement telephoneInput = getWebElement(By.id(telephone));
        telephoneInput.clear();
        telephoneInput.sendKeys(telephoneNumber);
    }

    public void insertPassword(String personalPassword, String confirm){
        WebElement passwordInput = getWebElement(By.id(password));
        passwordInput.clear();
        passwordInput.sendKeys(personalPassword);

        WebElement confirmPasswordInput = getWebElement(By.id(confirmPassword));
        confirmPasswordInput.clear();
        confirmPasswordInput.sendKeys(confirm);
    }

    public void denySubscription(){
        WebElement subscribeInput = getWebElement(By.xpath(subscribe));
        subscribeInput.click();


    }

    public void confirmPrivacyPolicy(){
        WebElement privacyInput = getWebElement(By.xpath(privacyPolicy));
        privacyInput.click();
    }

    public void createAccount(){
        WebElement createAccount = getWebElement(By.xpath(continueButton));
        createAccount.click();
    }

    public String getMessage(){
        WebElement message = getWebElement(By.xpath(successMessage));
        return message.getText();
    }

}
