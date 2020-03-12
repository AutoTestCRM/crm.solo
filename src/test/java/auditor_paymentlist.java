import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Random;
import java.util.concurrent.TimeUnit;

public class auditor_paymentlist {
    public ChromeDriver driver;
    private Random random;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome", "\u200E\u2068Macintosh HD\u2069 ▸ \u2068Пользователи\u2069 ▸ \u2068vitaliihrebeniuk\u2069 ▸ \u2068Рабочий стол\u2069 ▸ \u2068crm.solo.create_user\u2069 ▸ \u2068chromedriver\u2069 ");
        driver = new ChromeDriver();
        System.out.println("start");
    }

    @Test
    public void auditor_paymentlist() throws InterruptedException {

        driver.get("https://solo-crm.com/#/");

        //Login Admin
        // Login
        String login = "admin_qa";
        driver.findElement(By.xpath("//*[@id=\"app\"]/div/main/div/div/div/div/div/div/div[2]/div/div/form/div[1]/div[2]/div[1]/div/input")).sendKeys(login);
        //Password
        String password = "132465798";
        driver.findElement(By.xpath("//*[@id=\"app\"]/div/main/div/div/div/div/div/div/div[2]/div/div/form/div[2]/div[2]/div[1]/div/input")).sendKeys(password);
        //Click SignIn
        driver.findElement(By.xpath("//*[@id=\"app\"]/div/main/div/div/div/div/div/div/div[2]/div/div/form/div[3]/button")).click();
        Thread.sleep(2000);

        //ChoiceManager
        //Choice Settings
        driver.findElement(By.xpath("//*[@id=\"navigation\"]/div[1]/div[2]/div[3]/div/button")).click();
        Thread.sleep(2000);
        //Choice Users
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/a")).click();
        Thread.sleep(5000);
        //Choice Manager
        driver.findElement(By.id("425")).click();
        Thread.sleep(2000);

        //Choice Payment List
        driver.findElement(By.xpath("//*[@id=\"navigation\"]/div[1]/div[2]/div/div/button")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div/a")).click();
        Thread.sleep(2000);

        //Click on the link
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[18]/main/div/div[2]/div/div/div/div/div/div[2]/div/div[1]/div/div[2]/div/table/tbody/tr[1]/td[7]/a")).click();
        Thread.sleep(10000);
        driver.switchTo().window("Payment List");
        Thread.sleep(5000);

        //Click on the Comment
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[8]/main/div/div[2]/div/div/div/div/div/div[2]/div/div[1]/div/div[2]/div/table/tbody/tr[1]/td[11]/span/span/button")).click();
        //Waiting comment span
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement elem2 = driver.findElement(By.xpath("//*[@id=\"app\"]/div[8]/main/div/div[2]/div/div/div/div/div/div[2]/div/div[1]/div/div[2]/div/table/tbody/tr[1]/td[11]/span/span/button/span"));

    }
}