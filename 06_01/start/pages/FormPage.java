import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FormPage {
    public static void submitForm(WebDriver driver) {
        driver.findElement(By.id("first-name")).sendKeys("John");
        driver.findElement(By.id("last-name")).sendKeys("Smith");
        driver.findElement(By.id("job-title")).sendKeys("Doctor");

        driver.findElement(By.id("radio-button-2")).click();

        driver.findElement(By.id("checkbox-3")).click();

        driver.findElement(By.id("select-menu")).click();
        driver.findElement(By.cssSelector("option[value='1']")).click();

        driver.findElement(By.id("datepicker")).sendKeys("12/12/3000");

        driver.findElement(By.cssSelector(".btn.btn-lg.btn-primary")).click();
    }
}
