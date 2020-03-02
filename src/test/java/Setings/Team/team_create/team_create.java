package Setings.Team.team_create;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Wait;

import java.util.Random;
import java.util.concurrent.ThreadFactory;


public class team_create {

    public ChromeDriver driver;
    private Random random;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome", "\u200E\u2068Macintosh HD\u2069 ▸ \u2068Пользователи\u2069 ▸ \u2068vitaliihrebeniuk\u2069 ▸ \u2068Рабочий стол\u2069 ▸ \u2068crm.solo.create_user\u2069 ▸ \u2068chromedriver\u2069 ");
        driver = new ChromeDriver();
        System.out.println("start");

    }

    @Test
    public void team_create() throws InterruptedException {

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

        //Click on the button AddTeam
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[6]/main/div/div[2]/div/div/div/div/div[1]/div/div/div/button")).click();
        Thread.sleep(1000);

        //Name
        Random random = new Random();
        int n = random.nextInt(2000) + 1;
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[2]/div/div/div[2]/div[1]/div/div[1]/div/input")).sendKeys("team" + n + "autotest");
        Thread.sleep(1000);

        //Comment
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[2]/div/div/div[2]/div[2]/div/div[1]/div/textarea")).sendKeys("autotestteam");
        Thread.sleep(1000);

        //Click on the button cancel
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[2]/div/div/div[3]/button[1]")).click();
        Thread.sleep(1000);

        //Click on the button AddTeam
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[6]/main/div/div[2]/div/div/div/div/div[1]/div/div/div/button")).click();
        Thread.sleep(1000);

        //Name
        int n_team = random.nextInt(2000) + 1;
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[2]/div/div/div[2]/div[1]/div/div[1]/div/input")).sendKeys("team" + n_team + "autotest");
        Thread.sleep(1000);

        //Comment
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[2]/div/div/div[2]/div[2]/div/div[1]/div/textarea")).sendKeys("autotestteam");
        Thread.sleep(1000);

        //Click on the button Save
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[2]/div/div/div[3]/button[2]")).click();
        Thread.sleep(1000);

        //Log out
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[6]/main/div/nav/div/button[3]")).click();
        Thread.sleep(1000);

        //Choice Settings
        driver.findElement(By.xpath("//*[@id=\"navigation\"]/div[1]/div[2]/div[3]/div/button")).click();
        Thread.sleep(2000);

        //Choice Team
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[2]/a")).click();
        Thread.sleep(2000);

        driver.quit();








    }
}