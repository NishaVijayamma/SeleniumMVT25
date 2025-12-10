package exercise2;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DemoCategoryList {
    @Test
    public void  testCategories(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://demowebshop.tricentis.com/");
        //List<WebElement>elements = driver.findElements(By.cssSelector(".block-category-navigation .inactive"));
       // List<WebElement>elements = driver.findElements(By.cssSelector(".block-category-navigation a"));
        List<WebElement>elements = driver.findElements(By.cssSelector(".block-category-navigation li"));
        String[] items ={ "Books", "Computers","Electronics","Apparel & Shoes", "Digital downloads","Jewelry", "Gift Cards"};

        List<String> actual = new ArrayList<>();
        for (WebElement c : elements) {
            System.out.println(c.getText());
            actual.add(c.getText());
        }
    assertEquals(actual, Arrays.asList(items));

    driver.quit();



    }

}
