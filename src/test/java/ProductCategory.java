import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.junit.jupiter.api.Test;

import java.util.List;

//import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
public class ProductCategory {
    @Test
    public void productCategoryTest(){
        WebDriver driver = new ChromeDriver();
        driver.get(" https://demowebshop.tricentis.com/");
        WebElement element = driver.findElement(By.linkText("Books"));
        element.click();
        // Display the prices of book
        List<WebElement>elements =driver.findElements(By.cssSelector(".product-item"));
        for(WebElement product : elements){
            WebElement actualPrice = product.findElement(By.cssSelector(".prices .actual-price"));
            WebElement originalPrice = product.findElement(By.cssSelector(".prices .old-price"));
            String priceText = originalPrice.getText();
            String priceOldText = actualPrice.getText();
            double bookPriceOld = Double.parseDouble(priceText);
            double bookPriceNew = Double.parseDouble(priceOldText);
            System.out.println("Old price" + bookPriceOld+ " New Price" +bookPriceNew);
            assertTrue(bookPriceOld  >= 0 && bookPriceOld  <= 500 );
            assertTrue(bookPriceNew >= 0 && bookPriceNew <= 500 );


        }


    }



}
