package ru.stqa.traning;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

/**
 * Created by krzysztof on 11/12/17.
 */
public class StickerTest extends TestBase{

@Test
    public void sticker(){
    driver.navigate().to("http://localhost/litecart/public_html");
    List<WebElement> ducks = (new WebDriverWait(driver,10))
            .until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.className("image-wrapper")));
    ducks.forEach(duck ->{
    List<WebElement> sticker = duck.findElements(By.className("sticker"));
    if (sticker.size() > 1);{
        Assert.assertEquals(sticker.size(), 1);
    }
    });}
}
