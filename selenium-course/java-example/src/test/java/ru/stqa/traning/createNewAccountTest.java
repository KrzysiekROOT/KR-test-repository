package ru.stqa.traning;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import sun.security.util.Password;

/**
 * Created by krzysztof on 11/17/17.
 */
public class createNewAccountTest extends createNewAccount {

     final static String PASSWORD = "admin";
    final static String EMAIL = "krzysztofrudyk0@gmail.com";

    @Test
    public void createNewAccount(){
        WebElement createNewAccount = (new WebDriverWait(driver,10))
        .until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"box-account-login\"]/form/p/a")));
        createNewAccount.click();

        WebElement taxID = driver.findElement(By.name("tax_id"));
        taxID.clear();
        taxID.sendKeys("PL1234567890");
        WebElement firstName = driver.findElement(By.name("firstname"));
        firstName.clear();
        firstName.sendKeys("Krzysztof");
        WebElement address1 = driver.findElement(By.name("address1"));
        address1.clear();
        address1.sendKeys("Rog81");
        WebElement postcode = driver.findElement(By.name("postcode"));
        postcode.clear();
        postcode.sendKeys("51-411");
        WebElement email = driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/main/div/form/div[6]/div[1]/div/input"));
        email.clear();
        email.sendKeys(EMAIL);
        WebElement password = driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/main/div/form/div[7]/div[1]/div/input"));
        password.clear();
        password.sendKeys(PASSWORD);
        WebElement company = driver.findElement(By.name("company"));
        company.clear();
        company.sendKeys("Company");
        WebElement lastname = driver.findElement(By.name("lastname"));
        lastname.clear();
        lastname.sendKeys("Rudyk");
        WebElement address2 = driver.findElement(By.name("address2"));
        address2.clear();
        address2.sendKeys("Rog2");
        WebElement city = driver.findElement(By.name("city"));
        city.clear();
        city.sendKeys("Wroclaw");
        WebElement phone = driver.findElement(By.name("phone"));
        phone.clear();
        phone.sendKeys("631287612");
        WebElement confirmed_password = driver.findElement(By.name("confirmed_password"));
        confirmed_password.clear();
        confirmed_password.sendKeys(PASSWORD);

        WebElement createAccountButton = driver.findElement(By.name("create_account"));
        createAccountButton.click();
        System.out.println();
        WebElement sucessMessage = (new WebDriverWait(driver,10))
                .until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div[1]/div[2]/main/div[1]/div")));
        WebElement logoutButton = driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/aside/div/div[2]/div[2]/ul/li[3]/a"));
        logoutButton.click();
        System.out.println();

        WebElement emailInput = driver.findElement(By.name("email"));
        emailInput.sendKeys(EMAIL);
        WebElement passwordEmail = driver.findElement(By.name("password"));
        passwordEmail.sendKeys(PASSWORD);
        WebElement loginButton = driver.findElement(By.name("login"));
        loginButton.click();
        WebElement logoutButton2 = driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/aside/div/div[2]/div[2]/ul/li[3]/a"));
        logoutButton2.click();

    }
}
