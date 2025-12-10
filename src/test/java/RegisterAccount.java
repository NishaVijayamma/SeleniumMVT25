import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class RegisterAccount {
   /* @Test
    public void registerAccount() throws InterruptedException {
        WebDriver driver1 = new ChromeDriver();
        // open web browser
        driver1.get("https://demowebshop.tricentis.com/");
        WebElement register = driver1.findElement(By.className("ico-register"));
        register.click();
        WebElement gender = driver1.findElement(By.id("gender-female"));
        gender.click();
        WebElement firstName = driver1.findElement(By.name("FirstName"));
        firstName.sendKeys("Nisha");
        WebElement lastName = driver1.findElement(By.id("LastName"));
        lastName.sendKeys("V");
        WebElement eMail = driver1.findElement(By.id("Email"));
        eMail.sendKeys("nishav765+5@gmail.com");
        WebElement passWord = driver1.findElement(By.id("Password"));
        passWord.sendKeys("12345678*");
        WebElement confirmPassWord = driver1.findElement(By.id("ConfirmPassword"));
        confirmPassWord.sendKeys("12345678*");
        WebElement regButton = driver1.findElement(By.id("register-button"));
        regButton.click();
        Thread.sleep(2000);
        String actual = driver1.findElement(By.className("result")).getText();
        assertEquals("Your registration completed", actual);
        // Kontrollera att du hamnar på en bekräftelsesida eller får ett meddelande som säger att kontot skapades.
       // String page = driver1.getPageSource();
      //  boolean registrationSuccess = page.contains("Your registration completed");

       // assertTrue(registrationSuccess, "Expected message not found");
    }
    }*/

    @Test
    public void testLogIn() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demowebshop.tricentis.com/login");
        WebElement email = driver.findElement(By.className("email"));
        email.sendKeys("vsn4891@gmail.com");
        WebElement passWord = driver.findElement(By.id("Password"));
        passWord.sendKeys("12345678*");
        WebElement logIn = driver.findElement(By.cssSelector("input.login-button"));
        logIn.click();
        // Verify Verifiera att du är inloggad
        //assertTrue(driver.findElement(By.linkText("vsn4891@gmail.com")).isDisplayed());
        assertTrue(driver.findElement(By.className("account")).isDisplayed());
        // Log out
        WebElement logOut = driver.findElement(By.className("ico-logout"));
        logOut.click();
        //Logga ut och verifiera att du är utloggad
        //assertTrue(driver.findElement(By.className("master-wrapper-page")).isDisplayed());
        assertTrue(driver.findElement(By.linkText("Log in")).isDisplayed());



    }




}
