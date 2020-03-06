package Setings.User;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Random;
public class edit_user {
    public ChromeDriver driver;
    private Random random;

    public void setUp() {
        System.setProperty("webdriver.chrome", "\u200E\u2068Macintosh HD\u2069 ▸ \u2068Пользователи\u2069 ▸ \u2068vitaliihrebeniuk\u2069 ▸ \u2068Рабочий стол\u2069 ▸ \u2068crm.solo.create_user\u2069 ▸ \u2068chromedriver\u2069 ");
        driver = new ChromeDriver();
        System.out.println("start");

    }

    @Test
    public void EditUser() throws InterruptedException {

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
        //Choice Users
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/a")).click();
        Thread.sleep(2000);

        //Choice User in Users List
        driver.findElement(By.cssSelector("[href=\"#/users/card/119\"]")).click();
        Thread.sleep(1000);

        //change fill Login
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[8]/main/div/div[2]/div/div/div/div/div/div/div/div/div/form/div[1]/div[1]/div[1]/div/div[1]/div/input")).sendKeys("autotest");
        Thread.sleep(1000);
        //Change Role
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[8]/main/div/div[2]/div/div/div/div/div/div/div/div/div/form/div[1]/div[2]/div/div/div[1]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[3]/div/div/div[3]/a")).click();
        Thread.sleep(1000);
        //Choice Name
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[8]/main/div/div[2]/div/div/div/div/div/div/div/div/div/form/div[1]/div[1]/div[2]/div/div[1]/div/input")).sendKeys("autotest");
        Thread.sleep(1000);

        //Choice Status
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[8]/main/div/div[2]/div/div/div/div/div/div/div/div/div/form/div[1]/div[2]/div[2]/div/div[1]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[2]/div/div/div[1]/a")).click();
        Thread.sleep(1000);

        //Fill Email field
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[8]/main/div/div[2]/div/div/div/div/div/div/div/div/div/form/div[1]/div[1]/div[3]/div/div[1]/div/input")).sendKeys("autotest");
        Thread.sleep(1000);

        //Fill Password field
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[8]/main/div/div[2]/div/div/div/div/div/div/div/div/div/form/div[1]/div[2]/div[3]/div[1]/div[1]/div/input")).sendKeys("autotest");
        Thread.sleep(1000);

        //Fill the Skype field
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[8]/main/div/div[2]/div/div/div/div/div/div/div/div/div/form/div[1]/div[1]/div[4]/div/div[1]/div/input")).sendKeys("autotest");
        Thread.sleep(1000);

        //Fill the Bid id gield
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[8]/main/div/div[2]/div/div/div/div/div/div/div/div/div/form/div[1]/div[2]/div[4]/div/div[1]/div/input")).sendKeys("123");
        Thread.sleep(1000);

        //Click on the buton Save
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[8]/main/div/div[2]/div/div/div/div/div/div/div/div/div/form/button")).click();
        Thread.sleep(1000);

        driver.quit();

    }
}
