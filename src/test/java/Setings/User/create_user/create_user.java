package Setings.User.create_user;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Random;


public class create_user {

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
        //Choice Users
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/a")).click();
        Thread.sleep(2000);

        //Click on the Add User button
        driver.findElement(By.cssSelector("[href=\"#/users/add\"]")).click();
        Thread.sleep(3000);

        //Fill Login field
        Random random = new Random();
        int n = random.nextInt(2000) + 1;
        String login_user = "autotest" + n + "users";
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[8]/main/div/div[2]/div/div/div/div/div/div/div/div/div/form/div[1]/div[1]/div/div/div[1]/div/input")).sendKeys(login_user);
        Thread.sleep(1000);
        //Choice Role
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[8]/main/div/div[2]/div/div/div/div/div/div/div/div/div/form/div[1]/div[2]/div/div/div[1]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[3]/div/div/div[2]/a")).click();
        Thread.sleep(1000);

        //Choice Name
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[8]/main/div/div[2]/div/div/div/div/div/div/div/div/div/form/div[1]/div[3]/div/div/div[1]/div/input")).sendKeys(login_user);
        Thread.sleep(1000);

        //Choice Status
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[8]/main/div/div[2]/div/div/div/div/div/div/div/div/div/form/div[1]/div[4]/div/div/div[1]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[2]/div/div/div[1]/a")).click();
        Thread.sleep(1000);

        //Fill Email field
        String email = "autotestuser" + n + "@gmail.com";
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[8]/main/div/div[2]/div/div/div/div/div/div/div/div/div/form/div[1]/div[5]/div/div/div[1]/div/input")).sendKeys(email);
        Thread.sleep(1000);

        //Fill Password field
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[8]/main/div/div[2]/div/div/div/div/div/div/div/div/div/form/div[1]/div[6]/div/div[1]/div[1]/div/input")).sendKeys(password);
        Thread.sleep(1000);

        //Fill the Skype field
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[8]/main/div/div[2]/div/div/div/div/div/div/div/div/div/form/div[1]/div[7]/div/div/div[1]/div/input")).sendKeys(login_user);
        Thread.sleep(1000);

        //Fill the Bid id gield
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[8]/main/div/div[2]/div/div/div/div/div/div/div/div/div/form/div[1]/div[8]/div/div/div[1]/div/input")).sendKeys("123");
        Thread.sleep(1000);

        //Clear all fields
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[8]/main/div/div[2]/div/div/div/div/div/div/div/div/div/form/button[2]")).click();

        //Second fill Login field
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[8]/main/div/div[2]/div/div/div/div/div/div/div/div/div/form/div[1]/div[1]/div/div/div[1]/div/input")).sendKeys(login_user);
        Thread.sleep(1000);
        //Choice Role
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[8]/main/div/div[2]/div/div/div/div/div/div/div/div/div/form/div[1]/div[2]/div/div/div[1]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[3]/div/div/div[2]/a")).click();
        Thread.sleep(1000);
        //Choice Name
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[8]/main/div/div[2]/div/div/div/div/div/div/div/div/div/form/div[1]/div[3]/div/div/div[1]/div/input")).sendKeys(login_user);
        Thread.sleep(1000);
        //Choice Status
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[8]/main/div/div[2]/div/div/div/div/div/div/div/div/div/form/div[1]/div[4]/div/div/div[1]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[2]/div/div/div[1]/a")).click();
        Thread.sleep(1000);
        //Email
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[8]/main/div/div[2]/div/div/div/div/div/div/div/div/div/form/div[1]/div[5]/div/div/div[1]/div/input")).sendKeys(email);
        Thread.sleep(1000);
        //Fill Password field
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[8]/main/div/div[2]/div/div/div/div/div/div/div/div/div/form/div[1]/div[6]/div/div[1]/div[1]/div/input")).sendKeys(password);
        Thread.sleep(1000);
        //Fill the Skype field
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[8]/main/div/div[2]/div/div/div/div/div/div/div/div/div/form/div[1]/div[7]/div/div/div[1]/div/input")).sendKeys(login_user);
        Thread.sleep(1000);
        //Fill the Bid id gield
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[8]/main/div/div[2]/div/div/div/div/div/div/div/div/div/form/div[1]/div[8]/div/div/div[1]/div/input")).sendKeys("123");
        Thread.sleep(1000);

        //Click on the Save button
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[8]/main/div/div[2]/div/div/div/div/div/div/div/div/div/form/button[1]")).click();
        Thread.sleep(2000);

        driver.quit();
        System.out.println("succes");
    }
}
