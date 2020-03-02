package Setings.Team;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Random;

public class edit_team {

    public ChromeDriver driver;
    private Random random;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome", "\u200E\u2068Macintosh HD\u2069 ▸ \u2068Пользователи\u2069 ▸ \u2068vitaliihrebeniuk\u2069 ▸ \u2068Рабочий стол\u2069 ▸ \u2068crm.solo.create_user\u2069 ▸ \u2068chromedriver\u2069 ");
        driver = new ChromeDriver();
        System.out.println("start");
    }

    @Test
    public void CreateUsers() throws InterruptedException {

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
        driver.findElement(By.id("59")).click();
        Thread.sleep(2000);

        //Choice Settings
        driver.findElement(By.xpath("//*[@id=\"navigation\"]/div[1]/div[2]/div[3]/div/button")).click();
        Thread.sleep(1000);

        //Choice Team
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[2]/a")).click();
        Thread.sleep(2000);

        //Choice Team SMM-2
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[6]/main/div/div[2]/div/div/div/div/div[2]/div/table/tbody/tr/td[5]/a")).click();
        Thread.sleep(1000);

        //Rename Team Name
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[9]/main/div/div[2]/div/div/div/div/div/div/div/div/div/div[1]/div[1]/div/div[1]/div/input")).sendKeys("autotest");
        Thread.sleep(1000);

        //Add User on the Team
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[9]/main/div/div[2]/div/div/div/div/div/div/div/div/div/div[1]/div[2]/div/div[1]/div[1]/div[1]/input")).sendKeys("Test_");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[4]/div/div/div/a")).click();
        Thread.sleep(1000);

        //Delete User
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[9]/main/div/div[2]/div/div/div/div/div/div/div/div/div/div[1]/div[2]/div/div[1]/div[1]/div[1]/span[19]/span/div/i")).click();
        Thread.sleep(1000);

        //Add Team Lead
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[9]/main/div/div[2]/div/div/div/div/div/div/div/div/div/div[1]/div[3]/div/div[1]/div[1]/div[1]/input")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[3]/div/div/div[1]/a")).click();
        Thread.sleep(1000);

        //Delete Team Lead
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[9]/main/div/div[2]/div/div/div/div/div/div/div/div/div/div[1]/div[3]/div/div[1]/div[1]/div[1]/span[3]/span/div/i")).click();
        Thread.sleep(1000);

        //Add Buying Control
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[9]/main/div/div[2]/div/div/div/div/div/div/div/div/div/div[1]/div[4]/div/div[1]/div[1]/div[1]/input")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[2]/div/div/div[1]/a")).click();
        Thread.sleep(1000);

        //Delete Buying Control
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[9]/main/div/div[2]/div/div/div/div/div/div/div/div/div/div[1]/div[4]/div/div[1]/div[1]/div[1]/span[5]/span/div/i")).click();
        Thread.sleep(1000);

        //Payments
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[9]/main/div/div[2]/div/div/div/div/div/div/div/div/div/div[1]/div[8]/div/div/div[2]/div[1]/div[1]/div[2]/div/i")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[9]/main/div/div[2]/div/div/div/div/div/div/div/div/div/div[1]/div[8]/div/div/div[1]/div/div/div[2]/a")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[9]/main/div/div[2]/div/div/div/div/div/div/div/div/div/div[1]/div[8]/div/div/div[1]/div/div/div[2]/a")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[9]/main/div/div[2]/div/div/div/div/div/div/div/div/div/div[1]/div[3]/div/div[1]/div[1]/div[1]/input")).click();
        Thread.sleep(1000);


        //Comment
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[9]/main/div/div[2]/div/div/div/div/div/div/div/div/div/div[1]/div[9]/div/div[1]/div/textarea")).sendKeys("autotest");
        Thread.sleep(1000);

        //Click on the button Save
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[9]/main/div/div[2]/div/div/div/div/div/div/div/div/div/div[1]/button")).click();

        driver.quit();

    }
}
