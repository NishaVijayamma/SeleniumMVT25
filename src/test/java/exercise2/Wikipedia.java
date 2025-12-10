package exercise2;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.junit.jupiter.api.Test;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class Wikipedia {
    @Test
    public void wikipediaTest() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        // driver.manage().window().fullscreen();
        driver.get("https://en.wikipedia.org/wiki/Main_Page");

        WebElement search = driver.findElement(By.cssSelector("input[class^='cdx']"));
        search.sendKeys("Einstein");
        waitMethod(driver, "#v-1-1").click();
        //clickMethod(driver, "#v-1-1");
   /*  WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(1000));
       WebElement element = wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.cssSelector("input[class^='cdx']"))));
       element.click();

    */

    }
        private void clickMethod (WebDriver driver,String selector){
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(1000));
            WebElement element = wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.cssSelector(selector))));
            element.click();
        }

        private WebElement waitMethod (WebDriver driver,String selector){
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(1000));
            return wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(selector)));

        }


}

      /*

       WebElement element = (new WebDriverWait(driver, Duration.ofSeconds(10))).until(ExpectedConditions.
                visibilityOfElementLocated(By.cssSelector("input[class^='cdx']")));

        element.sendKeys("ABC");

       /* List<WebElement>text = (new WebDriverWait(driver, Duration.ofSeconds(10))).until(ExpectedConditions.
                presenceOfAllElementsLocatedBy(By.cssSelector("ul[class*='listbox'] li ")));

       text.get(0).click();

       driver.quit();*/

        /*
        click(driver, By.cssSelector("ul[class*='listbox'] li:nth-child(1)"));

        WebElement heading = new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("h1[id^='firs']")));
        assertEquals("ABC", heading.getText());
        // driver.quit();

    }

    private static void click(WebDriver driver, By by) {

        (new WebDriverWait(driver, Duration.ofSeconds(30))).until(ExpectedConditions.

                elementToBeClickable(by));

        driver.findElement(by).click();

    }
*/

