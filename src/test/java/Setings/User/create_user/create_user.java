package Setings.User.create_user;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Random;


public class create_user {

    public ChromeDriver driver;
    private Random random;

    @After
    public void pass() {
        System.out.println("Test Succesfuly!");
    }
    @After
    public void quit() {
        driver.quit();
    }

    @Test
    public void setUp() {
        System.setProperty("webdriver.chrome", "\u200E\u2068Macintosh HD\u2069 ▸ \u2068Пользователи\u2069 ▸ \u2068vitaliihrebeniuk\u2069 ▸ \u2068Рабочий стол\u2069 ▸ \u2068crm.solo.create_user\u2069 ▸ \u2068chromedriver\u2069 ");
        driver = new ChromeDriver();
        System.out.println("start");

    }

    @Test
    public void CreateUsers() throws InterruptedException {
        System.setProperty("webdriver.chrome", "\u200E\u2068Macintosh HD\u2069 ▸ \u2068Пользователи\u2069 ▸ \u2068vitaliihrebeniuk\u2069 ▸ \u2068Рабочий стол\u2069 ▸ \u2068crm.solo.create_user\u2069 ▸ \u2068chromedriver\u2069 ");
        driver = new ChromeDriver();
        System.out.println("start");
        //Get site
        driver.get("https://test.solo-crm.com/#/");
        Thread.sleep(2000);
    }

    @Test public void login_admin() throws InterruptedException {
            System.setProperty("webdriver.chrome", "\u200E\u2068Macintosh HD\u2069 ▸ \u2068Пользователи\u2069 ▸ \u2068vitaliihrebeniuk\u2069 ▸ \u2068Рабочий стол\u2069 ▸ \u2068crm.solo.create_user\u2069 ▸ \u2068chromedriver\u2069 ");
            driver = new ChromeDriver();
            System.out.println("start");
            //Get site
            driver.get("https://test.solo-crm.com/#/");
            Thread.sleep(2000);
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
        }
    @Test public void choice_manager() throws InterruptedException {
        System.setProperty("webdriver.chrome", "\u200E\u2068Macintosh HD\u2069 ▸ \u2068Пользователи\u2069 ▸ \u2068vitaliihrebeniuk\u2069 ▸ \u2068Рабочий стол\u2069 ▸ \u2068crm.solo.create_user\u2069 ▸ \u2068chromedriver\u2069 ");
        driver = new ChromeDriver();
        System.out.println("start");
        //Get site
        driver.get("https://test.solo-crm.com/#/");
        Thread.sleep(2000);
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
    }
    @Test public void enter_to_user_page() throws InterruptedException {
        System.setProperty("webdriver.chrome", "\u200E\u2068Macintosh HD\u2069 ▸ \u2068Пользователи\u2069 ▸ \u2068vitaliihrebeniuk\u2069 ▸ \u2068Рабочий стол\u2069 ▸ \u2068crm.solo.create_user\u2069 ▸ \u2068chromedriver\u2069 ");
        driver = new ChromeDriver();
        System.out.println("start");
        //Get site
        driver.get("https://test.solo-crm.com/#/");
        Thread.sleep(2000);
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
    }
    @Test public void eneter_to_create_user_page() throws InterruptedException {
        System.setProperty("webdriver.chrome", "\u200E\u2068Macintosh HD\u2069 ▸ \u2068Пользователи\u2069 ▸ \u2068vitaliihrebeniuk\u2069 ▸ \u2068Рабочий стол\u2069 ▸ \u2068crm.solo.create_user\u2069 ▸ \u2068chromedriver\u2069 ");
        driver = new ChromeDriver();
        System.out.println("start");
        //Get site
        driver.get("https://test.solo-crm.com/#/");
        Thread.sleep(2000);
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
    }
    @Test public void fill_login_field() throws InterruptedException {
        System.setProperty("webdriver.chrome", "\u200E\u2068Macintosh HD\u2069 ▸ \u2068Пользователи\u2069 ▸ \u2068vitaliihrebeniuk\u2069 ▸ \u2068Рабочий стол\u2069 ▸ \u2068crm.solo.create_user\u2069 ▸ \u2068chromedriver\u2069 ");
        driver = new ChromeDriver();
        System.out.println("start");
        //Get site
        driver.get("https://test.solo-crm.com/#/");
        Thread.sleep(2000);
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
    }
    @Test public void choice_role() throws InterruptedException {
        System.setProperty("webdriver.chrome", "\u200E\u2068Macintosh HD\u2069 ▸ \u2068Пользователи\u2069 ▸ \u2068vitaliihrebeniuk\u2069 ▸ \u2068Рабочий стол\u2069 ▸ \u2068crm.solo.create_user\u2069 ▸ \u2068chromedriver\u2069 ");
        driver = new ChromeDriver();
        System.out.println("start");
        //Get site
        driver.get("https://test.solo-crm.com/#/");
        Thread.sleep(2000);
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
    }
    @Test public void choice_name() throws InterruptedException {
        System.setProperty("webdriver.chrome", "\u200E\u2068Macintosh HD\u2069 ▸ \u2068Пользователи\u2069 ▸ \u2068vitaliihrebeniuk\u2069 ▸ \u2068Рабочий стол\u2069 ▸ \u2068crm.solo.create_user\u2069 ▸ \u2068chromedriver\u2069 ");
        driver = new ChromeDriver();
        System.out.println("start");
        //Get site
        driver.get("https://test.solo-crm.com/#/");
        Thread.sleep(2000);
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
    }
    @Test public void choice_status() throws InterruptedException {
        System.setProperty("webdriver.chrome", "\u200E\u2068Macintosh HD\u2069 ▸ \u2068Пользователи\u2069 ▸ \u2068vitaliihrebeniuk\u2069 ▸ \u2068Рабочий стол\u2069 ▸ \u2068crm.solo.create_user\u2069 ▸ \u2068chromedriver\u2069 ");
        driver = new ChromeDriver();
        System.out.println("start");
        Random random = new Random();
        int n = random.nextInt(2000) + 1;
        String login_user = "autotest" + n + "users";
        //Get site
        driver.get("https://test.solo-crm.com/#/");
        Thread.sleep(2000);
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
    }
    @Test public void fill_email_fields() throws InterruptedException {
        System.setProperty("webdriver.chrome", "\u200E\u2068Macintosh HD\u2069 ▸ \u2068Пользователи\u2069 ▸ \u2068vitaliihrebeniuk\u2069 ▸ \u2068Рабочий стол\u2069 ▸ \u2068crm.solo.create_user\u2069 ▸ \u2068chromedriver\u2069 ");
        driver = new ChromeDriver();
        System.out.println("start");
        Random random = new Random();
        int n = random.nextInt(2000) + 1;
        String login_user = "autotest" + n + "users";
        //Get site
        driver.get("https://test.solo-crm.com/#/");
        Thread.sleep(2000);
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
        String email = "autotest" + n + "users" + "@gmail.com";
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[8]/main/div/div[2]/div/div/div/div/div/div/div/div/div/form/div[1]/div[5]/div/div/div[1]/div/input")).sendKeys(email);
        Thread.sleep(1000);
    }
    @Test public void fill_password_field() throws InterruptedException {
        System.setProperty("webdriver.chrome", "\u200E\u2068Macintosh HD\u2069 ▸ \u2068Пользователи\u2069 ▸ \u2068vitaliihrebeniuk\u2069 ▸ \u2068Рабочий стол\u2069 ▸ \u2068crm.solo.create_user\u2069 ▸ \u2068chromedriver\u2069 ");
        driver = new ChromeDriver();
        System.out.println("start");
        Random random = new Random();
        int n = random.nextInt(2000) + 1;
        String login_user = "autotest" + n + "users";
        //Get site
        driver.get("https://test.solo-crm.com/#/");
        Thread.sleep(2000);
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

        String email = "autotest" + n + "users" + "@gmail.com";
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[8]/main/div/div[2]/div/div/div/div/div/div/div/div/div/form/div[1]/div[5]/div/div/div[1]/div/input")).sendKeys(email);
        Thread.sleep(1000);
        //Fill Password field
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[8]/main/div/div[2]/div/div/div/div/div/div/div/div/div/form/div[1]/div[6]/div/div[1]/div[1]/div/input")).sendKeys(password);
        Thread.sleep(1000);
    }
    @Test public void fill_skype_field() throws InterruptedException {
        System.setProperty("webdriver.chrome", "\u200E\u2068Macintosh HD\u2069 ▸ \u2068Пользователи\u2069 ▸ \u2068vitaliihrebeniuk\u2069 ▸ \u2068Рабочий стол\u2069 ▸ \u2068crm.solo.create_user\u2069 ▸ \u2068chromedriver\u2069 ");
        driver = new ChromeDriver();
        System.out.println("start");
        Random random = new Random();
        int n = random.nextInt(2000) + 1;
        String login_user = "autotest" + n + "users";
        //Get site
        driver.get("https://test.solo-crm.com/#/");
        Thread.sleep(2000);
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
        int n1 = random.nextInt(2000) + 1;
        String email = "autotest" + n1 + "users" + "@gmail.com";
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[8]/main/div/div[2]/div/div/div/div/div/div/div/div/div/form/div[1]/div[5]/div/div/div[1]/div/input")).sendKeys(email);
        Thread.sleep(3000);
        //Fill Password field
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[8]/main/div/div[2]/div/div/div/div/div/div/div/div/div/form/div[1]/div[6]/div/div[1]/div[1]/div/input")).sendKeys(password);
        Thread.sleep(3000);
        //Fill the Skype field
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[8]/main/div/div[2]/div/div/div/div/div/div/div/div/div/form/div[1]/div[7]/div/div/div[1]/div/input")).sendKeys(login_user);
        Thread.sleep(3000);
    }
    @Test public void fill_bid() throws InterruptedException {
        System.setProperty("webdriver.chrome", "\u200E\u2068Macintosh HD\u2069 ▸ \u2068Пользователи\u2069 ▸ \u2068vitaliihrebeniuk\u2069 ▸ \u2068Рабочий стол\u2069 ▸ \u2068crm.solo.create_user\u2069 ▸ \u2068chromedriver\u2069 ");
        driver = new ChromeDriver();
        System.out.println("start");

        Random random = new Random();
        int n = random.nextInt(2000) + 1;
        String login_user = "autotest" + n + "users";

        Random random1 = new Random();
        int n1 = random1.nextInt(2000) + 1;
        String email = "autotest" + n1 + "users" + "@gmail.com";

        //Get site
        driver.get("https://test.solo-crm.com/#/");
        Thread.sleep(2000);
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
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[8]/main/div/div[2]/div/div/div/div/div/div/div/div/div/form/div[1]/div[5]/div/div/div[1]/div/input")).sendKeys(email);
        Thread.sleep(1000);
        //Fill Password field
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[8]/main/div/div[2]/div/div/div/div/div/div/div/div/div/form/div[1]/div[6]/div/div[1]/div[1]/div/input")).sendKeys(password);
        Thread.sleep(1000);
        //Fill the Skype field
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[8]/main/div/div[2]/div/div/div/div/div/div/div/div/div/form/div[1]/div[7]/div/div/div[1]/div/input")).sendKeys(login_user);
        Thread.sleep(1000);
        //Fill the Bid id field
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[8]/main/div/div[2]/div/div/div/div/div/div/div/div/div/form/div[1]/div[8]/div/div/div[1]/div/input")).sendKeys("123");
        Thread.sleep(1000);
    }
    @Test public void clear_all_fields() throws InterruptedException {
        System.setProperty("webdriver.chrome", "\u200E\u2068Macintosh HD\u2069 ▸ \u2068Пользователи\u2069 ▸ \u2068vitaliihrebeniuk\u2069 ▸ \u2068Рабочий стол\u2069 ▸ \u2068crm.solo.create_user\u2069 ▸ \u2068chromedriver\u2069 ");
        driver = new ChromeDriver();
        System.out.println("start");

        Random random = new Random();
        int n = random.nextInt(2000) + 1;
        String login_user = "autotest" + n + "users";

        Random random1 = new Random();
        int n1 = random1.nextInt(2000) + 1;
        String email = "autotest" + n1 + "users" + "@gmail.com";

        //Get site
        driver.get("https://test.solo-crm.com/#/");
        Thread.sleep(2000);
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
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[8]/main/div/div[2]/div/div/div/div/div/div/div/div/div/form/div[1]/div[5]/div/div/div[1]/div/input")).sendKeys(email);
        Thread.sleep(1000);
        //Fill Password field
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[8]/main/div/div[2]/div/div/div/div/div/div/div/div/div/form/div[1]/div[6]/div/div[1]/div[1]/div/input")).sendKeys(password);
        Thread.sleep(1000);
        //Fill the Skype field
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[8]/main/div/div[2]/div/div/div/div/div/div/div/div/div/form/div[1]/div[7]/div/div/div[1]/div/input")).sendKeys(login_user);
        Thread.sleep(1000);
        //Fill the Bid id field
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[8]/main/div/div[2]/div/div/div/div/div/div/div/div/div/form/div[1]/div[8]/div/div/div[1]/div/input")).sendKeys("123");
        Thread.sleep(1000);
        //Clear all fields
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[8]/main/div/div[2]/div/div/div/div/div/div/div/div/div/form/button[2]")).click();

    }
    @Test public void reffiling() throws InterruptedException {
        System.setProperty("webdriver.chrome", "\u200E\u2068Macintosh HD\u2069 ▸ \u2068Пользователи\u2069 ▸ \u2068vitaliihrebeniuk\u2069 ▸ \u2068Рабочий стол\u2069 ▸ \u2068crm.solo.create_user\u2069 ▸ \u2068chromedriver\u2069 ");
        driver = new ChromeDriver();
        System.out.println("start");

        Random random = new Random();
        int n = random.nextInt(2000) + 1;
        String login_user = "autotest" + n + "users";

        Random random1 = new Random();
        int n1 = random1.nextInt(2000) + 1;
        String email = "autotest" + n1 + "users" + "@gmail.com";

        //Get site
        driver.get("https://test.solo-crm.com/#/");
        Thread.sleep(2000);
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
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[8]/main/div/div[2]/div/div/div/div/div/div/div/div/div/form/div[1]/div[5]/div/div/div[1]/div/input")).sendKeys(email);
        Thread.sleep(1000);
        //Fill Password field
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[8]/main/div/div[2]/div/div/div/div/div/div/div/div/div/form/div[1]/div[6]/div/div[1]/div[1]/div/input")).sendKeys(password);
        Thread.sleep(1000);
        //Fill the Skype field
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[8]/main/div/div[2]/div/div/div/div/div/div/div/div/div/form/div[1]/div[7]/div/div/div[1]/div/input")).sendKeys(login_user);
        Thread.sleep(1000);
        //Fill the Bid id field
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[8]/main/div/div[2]/div/div/div/div/div/div/div/div/div/form/div[1]/div[8]/div/div/div[1]/div/input")).sendKeys("123");
        Thread.sleep(1000);
    }
    @Test public void click_save_button() throws InterruptedException {
        System.setProperty("webdriver.chrome", "\u200E\u2068Macintosh HD\u2069 ▸ \u2068Пользователи\u2069 ▸ \u2068vitaliihrebeniuk\u2069 ▸ \u2068Рабочий стол\u2069 ▸ \u2068crm.solo.create_user\u2069 ▸ \u2068chromedriver\u2069 ");
        driver = new ChromeDriver();
        System.out.println("start");
        Random random = new Random();
        int n = random.nextInt(2000) + 1;
        String login_user = "autotest" + n + "users";
        //Get site
        driver.get("https://test.solo-crm.com/#/");
        Thread.sleep(2000);
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
        String email = "autotest" + n + "users" + "@gmail.com";
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[8]/main/div/div[2]/div/div/div/div/div/div/div/div/div/form/div[1]/div[5]/div/div/div[1]/div/input")).sendKeys(email);
        Thread.sleep(1000);
        //Fill Password field
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[8]/main/div/div[2]/div/div/div/div/div/div/div/div/div/form/div[1]/div[6]/div/div[1]/div[1]/div/input")).sendKeys(password);
        Thread.sleep(1000);
        //Fill the Skype field
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[8]/main/div/div[2]/div/div/div/div/div/div/div/div/div/form/div[1]/div[7]/div/div/div[1]/div/input")).sendKeys(login_user);
        Thread.sleep(1000);
        //Fill the Bid id field
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[8]/main/div/div[2]/div/div/div/div/div/div/div/div/div/form/div[1]/div[8]/div/div/div[1]/div/input")).sendKeys("123");
        Thread.sleep(1000);
        //Click on the Save button
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[8]/main/div/div[2]/div/div/div/div/div/div/div/div/div/form/button[1]")).click();
        Thread.sleep(2000);
    }
}
