import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TricentisTest {
    @Test
    public void tricentisOpenTest(){
         WebDriver driver = new ChromeDriver();
         // open web browser
        driver.get("https://demowebshop.tricentis.com/");
        //System.out.println(driver.getTitle());
       assertEquals("Demo Web Shop",driver.getTitle());
       String text = driver.
        driver.quit();
    }
}
