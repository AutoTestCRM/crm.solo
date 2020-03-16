package Deals;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Random;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

public class deals_payoutlist_fincontrol {
    public ChromeDriver driver;
    private Random random;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome", "\u200E\u2068Macintosh HD\u2069 ▸ \u2068Пользователи\u2069 ▸ \u2068vitaliihrebeniuk\u2069 ▸ \u2068Рабочий стол\u2069 ▸ \u2068crm.solo.create_user\u2069 ▸ \u2068chromedriver\u2069 ");
        driver = new ChromeDriver();
        System.out.println("start");
    }

    @Test
    public void payout_list_fincontrol() throws InterruptedException {

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
        driver.findElement(By.id("279")).click();
        Thread.sleep(2000);
        //Choice Finance
        driver.findElement(By.xpath("//*[@id=\"navigation\"]/div[1]/div[2]/div/div/button")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div/a")).click();
        //Wait payout List
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        WebElement elem2 = driver.findElement(By.xpath("//*[@id=\"app\"]/div[8]/main/div/div[2]/div/div/div/div/div/div/div/div[2]/div/div[1]/div/div[6]/div/div[1]/div/table/tbody/tr[1]"));

        Thread.sleep(5000);
        driver.quit();
    }
    @Test
    public void payout_list_fincontrol_generate_payout() throws InterruptedException {

        driver.get("https://test.solo-crm.com/#/");

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
        driver.findElement(By.id("279")).click();
        Thread.sleep(2000);
        //Choice Finance
        driver.findElement(By.xpath("//*[@id=\"navigation\"]/div[1]/div[2]/div/div/button")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div/a")).click();
        Thread.sleep(2000);
        //Click on the Generate Payout
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[8]/main/div/div[2]/div/div/div/div/div/div/div/div[2]/div/div[1]/div/button")).click();
        Thread.sleep(1000);
        //Download Payout
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[8]/main/div/div[2]/div/div/div/div/div/div/div/div[2]/div/div[1]/div/div[6]/div/div[1]/div/table/tbody/tr[1]/td[4]/button/div/i")).click();
        Thread.sleep(1000);

        driver.quit();
    }

    @Test
    public void payout_list_fincontrol_download_payout() throws InterruptedException {

        driver.get("https://test.solo-crm.com/#/");

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
        driver.findElement(By.id("279")).click();
        Thread.sleep(2000);
        //Choice Finance
        driver.findElement(By.xpath("//*[@id=\"navigation\"]/div[1]/div[2]/div/div/button")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div/a")).click();
        //Wait Payout List
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        WebElement elem2 = driver.findElement(By.xpath("//*[@id=\"app\"]/div[8]/main/div/div[2]/div/div/div/div/div/div/div/div[2]/div/div[1]/div/div[6]/div/div[1]/div/table/tbody/tr[1]/td[4]/button"));

        //Download Payout
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[8]/main/div/div[2]/div/div/div/div/div/div/div/div[2]/div/div[1]/div/div[6]/div/div[1]/div/table/tbody/tr[1]/td[4]/button")).click();
        Thread.sleep(1000);

        driver.quit();
    }

}