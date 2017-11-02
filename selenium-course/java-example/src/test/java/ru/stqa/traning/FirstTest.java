package ru.stqa.traning;

import org.junit.After;
import org.junit.Test;


/**
 * Created by krzysztof on 11/2/17.
 */
public class FirstTest extends TestBase {

    @Test
    public void myFirstTest() {
        driver.navigate().to("http://www.google.com");
    }
    @After
    public void after(){
        driver.quit();
    }
}
