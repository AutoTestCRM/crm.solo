package Leads.edit_lead;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Random;


public class edit_lead {

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
        driver.findElement(By.id("16")).click();
        Thread.sleep(2000);

        //Choice Lead
        driver.findElement(By.xpath("//*[@id=\"navigation\"]/div[1]/div[2]/div/div/button")).click();
        Thread.sleep(1000);

        //Choice Lead List
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[2]/a")).click();
        Thread.sleep(3000);

        //Choice Lead
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[61]/main/div/div[2]/div/div/div/div/div[2]/div/table/tbody/tr[1]/td[11]/a")).click();
        Thread.sleep(3000);

        //Link
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[12]/main/div/div[2]/div/div/div/div/div/div/div/div/div[1]/div[1]/div/div/div/div[1]/div/div/div[1]/div[1]/input")).sendKeys("autotest");
        Thread.sleep(1000);

        //Countries
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[12]/main/div/div[2]/div/div/div/div/div/div/div/div/div[1]/div[1]/div/div/div/div[5]/div/div/div[1]/div[1]/div[1]/input")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[9]/div/div/div[1]/a")).click();
        Thread.sleep(1000);

        //Source Type
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[12]/main/div/div[2]/div/div/div/div/div/div/div/div/div[1]/div[1]/div/div/div/div[6]/div/div/div[1]/div[1]/input")).click();
        Thread.sleep(1000);

        //Source Category
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[12]/main/div/div[2]/div/div/div/div/div/div/div/div/div[1]/div[1]/div/div/div/div[7]/div/div/div[1]/div[1]/input")).click();
        Thread.sleep(1000);

        //Monthly Reach Folowers
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[12]/main/div/div[2]/div/div/div/div/div/div/div/div/div[1]/div[1]/div/div/div/div[10]/div/div/div[1]/div/input")).sendKeys("10000");
        Thread.sleep(1000);

        //Comment to lead
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[12]/main/div/div[2]/div/div/div/div/div/div/div/div/div[1]/div[1]/div/div/div/div[14]/div/div/div[1]/div/textarea")).sendKeys("commentautotest");
        Thread.sleep(1000);

        //AffID
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[12]/main/div/div[2]/div/div/div/div/div/div/div/div/div[1]/div[1]/div/div/div/div[11]/div/div/div[1]/div/input")).sendKeys("1234");
        Thread.sleep(1000);

        //SiteID
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[12]/main/div/div[2]/div/div/div/div/div/div/div/div/div[1]/div[1]/div/div/div/div[12]/div/div/div[1]/div/input")).sendKeys("123");
        Thread.sleep(1000);

        //Tags
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[12]/main/div/div[2]/div/div/div/div/div/div/div/div/div[1]/div[1]/div/div/div/div[13]/div/div/div[1]/div[1]/div[1]/input")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[4]/div/div/div[1]/a")).click();
        Thread.sleep(1000);

        //Save button
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[12]/main/div/div[2]/div/div/div/div/div/div/div/div/div[2]/button")).click();
        Thread.sleep(1000);


    }
}