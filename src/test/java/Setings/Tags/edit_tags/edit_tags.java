package Setings.Tags.edit_tags;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Random;

public class edit_tags {

    public ChromeDriver driver;
    private Random random;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome", "\u200E\u2068Macintosh HD\u2069 ▸ \u2068Пользователи\u2069 ▸ \u2068vitaliihrebeniuk\u2069 ▸ \u2068Рабочий стол\u2069 ▸ \u2068crm.solo.create_user\u2069 ▸ \u2068chromedriver\u2069 ");
        driver = new ChromeDriver();
        System.out.println("start");

    }

    @Test
    public void create_tags() throws InterruptedException {

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
        driver.findElement(By.id("17")).click();
        Thread.sleep(2000);

        //Choice Settings
        driver.findElement(By.xpath("//*[@id=\"navigation\"]/div[1]/div[2]/div[3]/div/button")).click();
        Thread.sleep(1000);

        //Choice Tags
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[4]/a")).click();
        Thread.sleep(1000);

        //Choice Tags
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[6]/main/div/div[2]/div/div/div/div/div[2]/div/table/tbody/tr[1]/td[3]/button")).click();
        Thread.sleep(1000);
        //Name
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[2]/div/div/div[1]/div/div/div[1]/div/input")).sendKeys("autotest");
        Thread.sleep(1000);
        //Click on the Close button
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[2]/div/div/div[2]/button[2]")).click();
        Thread.sleep(1000);

        //Choice Tags
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[6]/main/div/div[2]/div/div/div/div/div[2]/div/table/tbody/tr[1]/td[3]/button")).click();
        Thread.sleep(1000);
        //Name
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[2]/div/div/div[1]/div/div/div[1]/div/input")).sendKeys("autotest");
        Thread.sleep(1000);
        //Click on the save button
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[2]/div/div/div[2]/button[1]")).click();
        Thread.sleep(1000);

        driver.quit();

    }
}
