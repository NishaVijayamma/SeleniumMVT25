package exercise2;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.support.ui.Select;
import org.junit.jupiter.api.Test;

import java.util.List;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class EbaySelect {
    @Test
    public void ebayTest() throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.ebay.com/");

        Select select = new Select(driver.findElement(By.cssSelector("select#gh-cat")));
        select.selectByIndex(2);
        WebElement searchBox= driver.findElement(By.cssSelector("input#gh-ac"));

        searchBox.sendKeys("van Gogh");
        searchBox.sendKeys(Keys.ENTER);


/*
        //Variant2
        Select Category = new Select(driver.findElement(By.cssSelector("select#gh-cat")));
        Category.selectByVisibleText("Art");
        WebElement searchBox= driver.findElement(By.cssSelector("input#gh-ac"));
        searchBox.sendKeys("van Gogh");
        WebElement searchBoxButton = driver.findElement(By.cssSelector("#gh-search-btn"));
        searchBoxButton.click() ;
        */
       Thread.sleep(2000);
        // Verifiera något på sidan du landar på
        List<WebElement> results = driver.findElements(
                By.cssSelector(".BOLD"));
        boolean found = false;

        for (WebElement item : results) {
            String text = item.getText();
            if (text.contains("van Gogh")) {
                found = true;
                break;
            }
        }

        assertTrue(found, "van Gogh not found");

    }





}
