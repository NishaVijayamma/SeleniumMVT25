package exercise2;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class BoardGames {
    @Test
    public void boardGamesTest(){

        WebDriver driver = new ChromeDriver();
        driver.get("https://boardgamegeek.com/");
        // cookies
        driver.findElement(By.cssSelector("button.fc-cta-consent")).click();
        //driver.findElement(By.cssSelector(".fc-button-label")).click();

      // WebElement searchBox = driver.findElement(By.cssSelector("input[name =searchTerm]"));
        WebElement searchBox =driver.findElement(By.cssSelector(".form-control"));
      //  WebElement searchBox =driver.findElement(By.cssSelector("input[id^='1']"));

        searchBox.sendKeys("Things in Rings");
        searchBox.sendKeys(Keys.ENTER);

        //WebElement image = driver.findElement(By.cssSelector("img[alt='Board Game: Things in Rings']"));
        WebElement image = driver.findElement(By.cssSelector("img[alt*='Game: Things in']"));
        image.click();
      //  assertTrue(driver.findElement(By.linkText("Things in Rings")).isDisplayed());
        String title = driver.findElement(By.cssSelector("span[itemprop='name'].ng-binding")).getText();
        assertEquals("Things in Rings",title);
       // assertTrue(driver.findElement(By.cssSelector("span[itemprop='name'].ng-binding")).isDisplayed());
        driver.quit();

    }
}
