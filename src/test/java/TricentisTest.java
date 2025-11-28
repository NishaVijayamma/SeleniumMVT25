import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TricentisTest {
    @Test
    public void tricentisOpenTest() {
        WebDriver driver = new ChromeDriver();
        // open web browser
        driver.get("https://demowebshop.tricentis.com/");
        //System.out.println(driver.getTitle());
        assertEquals("Demo Web Shop", driver.getTitle());
        WebElement element = driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[2]/ul[1]/li[1]/a"));
        String text = element.getText();
        assertEquals("BOOKS", text);
        element.click();
       driver.findElement(By.name("q")).sendKeys("Computing");
        driver.findElement(By.className("search-box-button")).click();
/*
Använd sökfunktionen för att söka efter en produkt.
Kontrollera att sökresultaten innehåller produkten du sökte
efter genom att hämta titlarna på resultaten och jämföra med söktermen
 */
        WebElement searchBox = driver.findElement(By.id("small-searchterms"));
        searchBox.clear();
        searchBox.sendKeys("book");
        driver.findElement(By.className("search-box-button")).click();
        assertTrue(driver.findElement(By.linkText("Health Book")).isDisplayed());

       /* WebElement searchBox2 = driver.findElement(By.id("small-searchterms"));
        searchBox2.clear();
        searchBox2.sendKeys("desktop");
        driver.findElement(By.className("search-box-button")).click();
        assertTrue(driver.findElement(By.xpath("Desktop PC with CDRW",)).isDisplayed());*/

        WebElement linkElectronics = driver.findElement(By.linkText("Electronics"));
        String text2 = linkElectronics.getText();
        assertEquals("Electronics", text2);
        linkElectronics.click();
        WebElement linkTextDigital = driver.findElement(By.partialLinkText("Digital"));
        String text3 =linkTextDigital.getText();
        assertEquals("Digital downloads", text3);
        linkTextDigital.click();

        //WebElement searchBox = driver.findElement(By.name("q"));
        //searchBox.sendKeys("Computing");
        //WebElement search = driver.findElement(By.className("search-box-button"));
        //search.click();

      //  assertEquals("computers", text2);

        // WebElement logo = driver.findElement(By.className("header-logo"));


        // System.out.println(driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[2]/ul[1]/li[1]/a")).getText());
        //driver.quit();
    }
}
