package ru.stqa.traning;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/**
 * Created by krzysztof on 11/3/17.
 */
public class Litecart_Admin_Login_Test extends TestBase{

    @Before
    public void before(){
    driver.navigate().to("http://localhost/litecart/public_html/admin");
    }

    @Test
    public void loginTest(){
        WebElement email = driver.findElement(By.name("username"));
        WebElement password = driver.findElement(By.name("password"));
        WebElement loginButton = driver.findElement(By.xpath("//*[@id=\"box-login\"]/form/div[2]/button"));
        email.sendKeys("admin");
        password.sendKeys("admin");
        loginButton.click();
    }
    @After
    public void after(){
        driver.quit();
    }

}
