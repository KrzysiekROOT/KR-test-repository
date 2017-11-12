package ru.stqa.traning;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

import static org.openqa.selenium.support.ui.ExpectedConditions.titleIs;

/**
 * Created by krzysztof on 11/10/17.
 */

public class navigationTest extends TestBase {

    @Test
    public void appearanceTest(){
    WebElement appearance = (new WebDriverWait(driver,10))
            .until(ExpectedConditions.presenceOfElementLocated(By.linkText("Appearance")));
    appearance.click();

    WebElement tag = driver.findElement(By.xpath("//*[@id=\"main\"]/h1"));
        Assert.assertEquals(tag.getText(), "Template");
        WebElement logotype = (new WebDriverWait(driver,10))
                .until(ExpectedConditions.presenceOfElementLocated(By.linkText("Logotype")));
        logotype.click();
        WebElement h1 = driver.findElement(By.xpath("//*[@id=\"main\"]/h1"));
        Assert.assertEquals(h1.getText(), "Logotype");

    }

    @Test
    public void catalogTest(){
        WebElement catalog = (new WebDriverWait(driver,10))
                .until(ExpectedConditions.presenceOfElementLocated(By.linkText("Catalog")));
        catalog.click();
        WebElement catalogH1 = driver.findElement(By.cssSelector("main > h1"));
        Assert.assertEquals(catalogH1.getText(), "Catalog");

        WebElement productGroups = (new WebDriverWait(driver,10))
                .until(ExpectedConditions.presenceOfElementLocated(By.linkText("Product Groups")));
        productGroups.click();
        WebElement productGroupsH1 = driver.findElement(By.cssSelector("main > h1"));
        Assert.assertEquals(productGroupsH1.getText(), "Product Groups");

        WebElement optionGroups = (new WebDriverWait(driver,10))
                .until(ExpectedConditions.presenceOfElementLocated(By.linkText("Option Groups")));
        optionGroups.click();
        WebElement optionGroupsH1 = driver.findElement(By.cssSelector("main > h1"));
        Assert.assertEquals(optionGroupsH1.getText(), "Option Groups");

        WebElement manufactures = (new WebDriverWait(driver,10))
                .until(ExpectedConditions.presenceOfElementLocated(By.linkText("Manufacturers")));
        manufactures.click();
        WebElement manufacturesH1 = driver.findElement(By.cssSelector("main > h1"));
        Assert.assertEquals(manufacturesH1.getText(), "Manufacturers");

        WebElement suppliers = (new WebDriverWait(driver,10))
                .until(ExpectedConditions.presenceOfElementLocated(By.linkText("Suppliers")));
        suppliers.click();
        WebElement suppliersH1 = driver.findElement(By.cssSelector("main > h1"));
        Assert.assertEquals(suppliersH1.getText(), "Suppliers");

        WebElement delivery = (new WebDriverWait(driver,10))
                .until(ExpectedConditions.presenceOfElementLocated(By.linkText("Delivery Statuses")));
        delivery.click();
        WebElement deliveryH1 = driver.findElement(By.cssSelector("main > h1"));
        Assert.assertEquals(deliveryH1.getText(), "Delivery Statuses");

        WebElement soldOut = (new WebDriverWait(driver,10))
                .until(ExpectedConditions.presenceOfElementLocated(By.linkText("Sold Out Statuses")));
        soldOut.click();
        WebElement soldOutH1 = driver.findElement(By.cssSelector("main > h1"));
        Assert.assertEquals(soldOutH1.getText(), "Sold Out Statuses");

        WebElement quantity = (new WebDriverWait(driver,10))
                .until(ExpectedConditions.presenceOfElementLocated(By.linkText("Quantity Units")));
        quantity.click();
        WebElement quantityH1 = driver.findElement(By.cssSelector("main > h1"));
        Assert.assertEquals(quantityH1.getText(), "Quantity Units");

        WebElement csv = (new WebDriverWait(driver,10))
                .until(ExpectedConditions.presenceOfElementLocated(By.linkText("CSV Import/Export")));
        csv.click();
        WebElement csvH1 = driver.findElement(By.cssSelector("main > h1"));
        Assert.assertEquals(csvH1.getText(), "CSV Import/Export");
    }

    @Test
    public void countriesTest(){
        WebElement countries = (new WebDriverWait(driver,10))
                .until(ExpectedConditions.presenceOfElementLocated(By.linkText("Countries")));
        countries.click();
        WebElement countriesH1 = driver.findElement(By.cssSelector("main > h1"));
        Assert.assertEquals(countriesH1.getText(), "Countries");
    }

    @Test
    public void currenciesTest(){
        WebElement currencies = (new WebDriverWait(driver,10))
                .until(ExpectedConditions.presenceOfElementLocated(By.linkText("Currencies")));
        currencies.click();
        WebElement countriesH1 = driver.findElement(By.cssSelector("main > h1"));
        Assert.assertEquals(countriesH1.getText(), "Currencies");
    }

    @Test
    public void customersTest(){
        WebElement customers = (new WebDriverWait(driver,10))
                .until(ExpectedConditions.presenceOfElementLocated(By.linkText("Customers")));
        customers.click();
        WebElement countriesH1 = driver.findElement(By.cssSelector("main > h1"));
        Assert.assertEquals(countriesH1.getText(), "Customers");

        WebElement csvImport = (new WebDriverWait(driver,10))
                .until(ExpectedConditions.presenceOfElementLocated(By.linkText("CSV Import/Export")));
        csvImport.click();
        WebElement csvImportH1 = driver.findElement(By.cssSelector("main > h1"));
        Assert.assertEquals(csvImportH1.getText(), "CSV Import/Export");

        WebElement newsletter = (new WebDriverWait(driver,10))
                .until(ExpectedConditions.presenceOfElementLocated(By.linkText("Newsletter")));
        newsletter.click();
        WebElement newsletterH1 = driver.findElement(By.cssSelector("main > h1"));
        Assert.assertEquals(newsletterH1.getText(), "Newsletter");

    }
    @Test
    public void geoZonesTest(){
        WebElement geoZones = (new WebDriverWait(driver,10))
                .until(ExpectedConditions.presenceOfElementLocated(By.linkText("Geo Zones")));
        geoZones.click();
        WebElement geoH1 = driver.findElement(By.cssSelector("main > h1"));
        Assert.assertEquals(geoH1.getText(), "Geo Zones");
    }

    @Test
    public void languagesTest(){
        WebElement languages = (new WebDriverWait(driver,10))
                .until(ExpectedConditions.presenceOfElementLocated(By.linkText("Languages")));
        languages.click();
        WebElement languagesH1 = driver.findElement(By.cssSelector("main > h1"));
        Assert.assertEquals(languagesH1.getText(), "Languages");

        WebElement storage = (new WebDriverWait(driver,10))
                .until(ExpectedConditions.presenceOfElementLocated(By.linkText("Storage Encoding")));
        storage.click();
        WebElement storageH1 = driver.findElement(By.cssSelector("main > h1"));
        Assert.assertEquals(storageH1.getText(), "Storage Encoding");
    }

    @Test
    public void modulesTest(){
        WebElement lii = (new WebDriverWait(driver,10))
                .until(ExpectedConditions.presenceOfElementLocated(By.linkText("Modules")));
        lii.click();
        WebElement tag = driver.findElement(By.cssSelector("main > h1"));
        Assert.assertEquals(tag.getText(), "Job Modules");

        WebElement customerModule = (new WebDriverWait(driver,10))
                .until(ExpectedConditions.presenceOfElementLocated(By.linkText("Customer Modules")));
        customerModule.click();
        WebElement customerH1 = driver.findElement(By.cssSelector("main > h1"));
        Assert.assertEquals(customerH1.getText(), "Customer Modules");

        WebElement shipping = (new WebDriverWait(driver,10))
                .until(ExpectedConditions.presenceOfElementLocated(By.linkText("Shipping Modules")));
        shipping.click();
        WebElement shippingH1 = driver.findElement(By.cssSelector("main > h1"));
        Assert.assertEquals(shippingH1.getText(), "Shipping Modules");

        WebElement payment = (new WebDriverWait(driver,10))
                .until(ExpectedConditions.presenceOfElementLocated(By.linkText("Payment Modules")));
        payment.click();
        WebElement paymentH1 = driver.findElement(By.cssSelector("main > h1"));
        Assert.assertEquals(paymentH1.getText(), "Payment Modules");

        WebElement order = (new WebDriverWait(driver,10))
                .until(ExpectedConditions.presenceOfElementLocated(By.linkText("Order Modules")));
        order.click();
        WebElement orderH1 = driver.findElement(By.cssSelector("main > h1"));
        Assert.assertEquals(orderH1.getText(), "Order Modules");

        WebElement orderTotal = (new WebDriverWait(driver,10))
                .until(ExpectedConditions.presenceOfElementLocated(By.linkText("Order Total Modules")));
        orderTotal.click();
        WebElement orderTotalH1 = driver.findElement(By.cssSelector("main > h1"));
        Assert.assertEquals(orderTotalH1.getText(), "Order Total Modules");

        WebElement jobModule = (new WebDriverWait(driver,10))
                .until(ExpectedConditions.presenceOfElementLocated(By.linkText("Job Modules")));
        jobModule.click();
        WebElement jobModuleH1 = driver.findElement(By.cssSelector("main > h1"));
        Assert.assertEquals(jobModuleH1.getText(), "Job Modules");
    }

    @Test
    public void OrdersTest(){
        WebElement orders = (new WebDriverWait(driver,10))
                .until(ExpectedConditions.presenceOfElementLocated(By.linkText("Orders")));
        orders.click();
        WebElement ordersH1 = driver.findElement(By.cssSelector("main > h1"));
        Assert.assertEquals(ordersH1.getText(), "Orders");

        WebElement orderStatus = (new WebDriverWait(driver,10))
                .until(ExpectedConditions.presenceOfElementLocated(By.linkText("Order Statuses")));
        orderStatus.click();
        WebElement orderStatusH1 = driver.findElement(By.cssSelector("main > h1"));
        Assert.assertEquals(orderStatusH1.getText(), "Order Statuses");
    }

    @Test
    public void PagesTest(){
        WebElement lii = (new WebDriverWait(driver,10))
                .until(ExpectedConditions.presenceOfElementLocated(By.linkText("Pages")));
        lii.click();
        WebElement tag = driver.findElement(By.cssSelector("main > h1"));
        Assert.assertEquals(tag.getText(), "Pages");

        WebElement csv = (new WebDriverWait(driver,10))
                .until(ExpectedConditions.presenceOfElementLocated(By.linkText("CSV Import/Export")));
        csv.click();
        WebElement csvH1 = driver.findElement(By.cssSelector("main > h1"));
        Assert.assertEquals(csvH1.getText(), "CSV Import/Export");
    }

    @Test
    public void ReportsTest(){
        WebElement reports = (new WebDriverWait(driver,10))
                .until(ExpectedConditions.presenceOfElementLocated(By.linkText("Reports")));
        reports.click();
        WebElement reportsH1 = driver.findElement(By.cssSelector("main > h1"));
        Assert.assertEquals(reportsH1.getText(), "Monthly Sales");

        WebElement mostSold = (new WebDriverWait(driver,10))
                .until(ExpectedConditions.presenceOfElementLocated(By.linkText("Most Sold Products")));
        mostSold.click();
        WebElement mostSoldH1 = driver.findElement(By.cssSelector("main > h1"));
        Assert.assertEquals(mostSoldH1.getText(), "Most Sold Products");

        WebElement mostShopping = (new WebDriverWait(driver,10))
                .until(ExpectedConditions.presenceOfElementLocated(By.linkText("Most Shopping Customers")));
        mostShopping.click();
        WebElement mostShoppingH1 = driver.findElement(By.cssSelector("main > h1"));
        Assert.assertEquals(mostShoppingH1.getText(), "Most Shopping Customers");
    }

    @Test
    public void SettingsTest(){
        WebElement settings = (new WebDriverWait(driver,10))
                .until(ExpectedConditions.presenceOfElementLocated(By.linkText("Settings")));
        settings.click();
        WebElement settingH1 = driver.findElement(By.cssSelector("main > h1"));
        Assert.assertEquals(settingH1.getText(), "Settings");

        WebElement defaults = (new WebDriverWait(driver,10))
                .until(ExpectedConditions.presenceOfElementLocated(By.linkText("Defaults")));
        defaults.click();
        WebElement defaultsH1 = driver.findElement(By.cssSelector("main > h1"));
        Assert.assertEquals(defaultsH1.getText(), "Settings");

        WebElement listings = (new WebDriverWait(driver,10))
                .until(ExpectedConditions.presenceOfElementLocated(By.linkText("Listings")));
        listings.click();
        WebElement listingsH1 = driver.findElement(By.cssSelector("main > h1"));
        Assert.assertEquals(listingsH1.getText(), "Settings");

        WebElement images = (new WebDriverWait(driver,10))
                .until(ExpectedConditions.presenceOfElementLocated(By.linkText("Images")));
        images.click();
        WebElement imagesH1 = driver.findElement(By.cssSelector("main > h1"));
        Assert.assertEquals(imagesH1.getText(), "Settings");

        WebElement checkout = (new WebDriverWait(driver,10))
                .until(ExpectedConditions.presenceOfElementLocated(By.linkText("Checkout")));
        checkout.click();
        WebElement checkoutH1 = driver.findElement(By.cssSelector("main > h1"));
        Assert.assertEquals(checkoutH1.getText(), "Settings");

        WebElement advanced = (new WebDriverWait(driver,10))
                .until(ExpectedConditions.presenceOfElementLocated(By.linkText("Advanced")));
        advanced.click();
        WebElement advancedH1 = driver.findElement(By.cssSelector("main > h1"));
        Assert.assertEquals(advancedH1.getText(), "Settings");

        WebElement security = (new WebDriverWait(driver,10))
                .until(ExpectedConditions.presenceOfElementLocated(By.linkText("Security")));
        security.click();
        WebElement securityH1 = driver.findElement(By.cssSelector("main > h1"));
        Assert.assertEquals(securityH1.getText(), "Settings");
    }
    @Test
    public void SlidesTest(){
        WebElement slides = (new WebDriverWait(driver,10))
                .until(ExpectedConditions.presenceOfElementLocated(By.linkText("Slides")));
        slides.click();
        WebElement slidesH1 = driver.findElement(By.cssSelector("main > h1"));
        Assert.assertEquals(slidesH1.getText(), "Slides");
    }
    @Test
    public void TaxTest(){
        WebElement tax = (new WebDriverWait(driver,10))
                .until(ExpectedConditions.presenceOfElementLocated(By.linkText("Tax")));
        tax.click();
        WebElement tag = driver.findElement(By.cssSelector("main > h1"));
        Assert.assertEquals(tag.getText(), "Tax Rates");

        WebElement taxClasses = (new WebDriverWait(driver,10))
                .until(ExpectedConditions.presenceOfElementLocated(By.linkText("Tax Classes")));
        taxClasses.click();
        WebElement taxH1 = driver.findElement(By.cssSelector("main > h1"));
        Assert.assertEquals(taxH1.getText(), "Tax Classes");
    }

    @Test
    public void translationsTest(){
        WebElement translations = (new WebDriverWait(driver,10))
                .until(ExpectedConditions.presenceOfElementLocated(By.linkText("Translations")));
        translations.click();
        WebElement searchH1 = driver.findElement(By.cssSelector("main > h1"));
        Assert.assertEquals(searchH1.getText(), "Search Translations");

        WebElement scanfiles = (new WebDriverWait(driver,10))
                .until(ExpectedConditions.presenceOfElementLocated(By.linkText("Scan Files")));
        scanfiles.click();
        WebElement scanFilesH1 = driver.findElement(By.cssSelector("main > h1"));
        Assert.assertEquals(scanFilesH1.getText(), "Scan Files For Translations");

        WebElement csvImport = (new WebDriverWait(driver,10))
                .until(ExpectedConditions.presenceOfElementLocated(By.linkText("CSV Import/Export")));
        csvImport.click();
        WebElement csvImportH1 = driver.findElement(By.cssSelector("main > h1"));
        Assert.assertEquals(csvImportH1.getText(), "CSV Import/Export");
    }

    @Test
    public void UsersTest(){
        WebElement lii = (new WebDriverWait(driver,10))
                .until(ExpectedConditions.presenceOfElementLocated(By.linkText("Users")));
        lii.click();
        WebElement tag = driver.findElement(By.cssSelector("main > h1"));
        Assert.assertEquals(tag.getText(), "Users");
    }
    @Test
    public void vQmodsTest(){
        WebElement lii = (new WebDriverWait(driver,10))
                .until(ExpectedConditions.presenceOfElementLocated(By.linkText("vQmods")));
        lii.click();
        WebElement tag = driver.findElement(By.cssSelector("main > h1"));
        Assert.assertEquals(tag.getText(), "vQmods");
    }}
