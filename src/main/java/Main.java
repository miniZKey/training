import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args){

        System.setProperty("webdriver.chrome.driver", "E:\\Tools\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://seasonvar.ru/");
        WebElement icon = driver.findElement(By.xpath("/html/body/div[3]/header/div[3]/form/div/input"));
        icon.click();
        icon.sendKeys("The Boys", Keys.ENTER);
        WebElement OpenFilm = driver.findElement(By.xpath("/html/body/div[3]/div/div[1]/div/div/div/div[3]/div/a[1]"));
        OpenFilm.click();
        WebElement ChooseTranslate = driver.findElement(By.xpath("/html/body/div[3]/div/div[1]/div/div[3]/div/div[1]/div[1]/ul/li[4]"));
        ChooseTranslate.click();
        WebElement PlayFilm = driver.findElement(By.xpath("/html/body/div[3]/div/div[1]/div/div[3]/div/div[1]/div[1]/div/pjsdiv/pjsdiv[6]/pjsdiv[4]"));
        PlayFilm.click();

    }
}
