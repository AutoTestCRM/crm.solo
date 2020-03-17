package Deals;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Random;

public class create_wallet_crm {

    public ChromeDriver driver;
    private Random random;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome", "\u200E\u2068Macintosh HD\u2069 ▸ \u2068Пользователи\u2069 ▸ \u2068vitaliihrebeniuk\u2069 ▸ \u2068Рабочий стол\u2069 ▸ \u2068crm.solo.create_user\u2069 ▸ \u2068chromedriver\u2069 ");
        driver = new ChromeDriver();
        System.out.println("start");
    }

    @Test
    public void create_CARD() throws InterruptedException {

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
        driver.findElement(By.id("119")).click();
        Thread.sleep(2000);
        //Enter to PartnerCard
        driver.findElement(By.xpath("//*[@id=\"navigation\"]/div[1]/div[2]/div[2]/div/button")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/a")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[54]/main/div/div[2]/div/div/div/div/div/div[2]/div[1]/div/table/tbody/tr[1]/td[5]/a")).click();
        Thread.sleep(2000);
        //Choice Wallet
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[16]/main/div/div[2]/div/div/div/div/div[2]/div/div/div[1]/div/div/div[4]/a")).click();
        Thread.sleep(1000);
        //Add Wallet
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[16]/main/div/div[2]/div/div/div/div/div[2]/div/div/div[2]/div/div[3]/div/div/div/nav/div/button")).click();
        Thread.sleep(1000);

        //Choice Wallet Type
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[7]/div/div/div/div[2]/div[1]/div/div[1]/div[1]/div[1]/input")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[10]/div/div/div[1]/a")).click();
        Thread.sleep(1000);

        //Currency
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[7]/div/div/div/div[2]/div[2]/div/div[1]/div[1]/div[1]/input")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[9]/div/div/div/a")).click();
        Thread.sleep(1000);

        //Wallet/Card number
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[7]/div/div/div/div[2]/div[3]/div/div[1]/div/input")).sendKeys("5168742291301390");
        Thread.sleep(1000);

        //Click Save
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[7]/div/div/div/div[3]/button[2]")).click();
        Thread.sleep(3000);
        driver.quit();

    }
    @Test
    public void create_CHINABT() throws InterruptedException {

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
        driver.findElement(By.id("119")).click();
        Thread.sleep(2000);
        //Enter to PartnerCard
        driver.findElement(By.xpath("//*[@id=\"navigation\"]/div[1]/div[2]/div[2]/div/button")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/a")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[54]/main/div/div[2]/div/div/div/div/div/div[2]/div[1]/div/table/tbody/tr[1]/td[5]/a")).click();
        Thread.sleep(2000);
        //Choice Wallet
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[16]/main/div/div[2]/div/div/div/div/div[2]/div/div/div[1]/div/div/div[4]/a")).click();
        Thread.sleep(1000);
        //Add Wallet
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[16]/main/div/div[2]/div/div/div/div/div[2]/div/div/div[2]/div/div[3]/div/div/div/nav/div/button")).click();
        Thread.sleep(1000);

        //Choice Wallet Type
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[7]/div/div/div/div[2]/div[1]/div/div[1]/div[1]/div[1]/input")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[10]/div/div/div[2]/a")).click();
        Thread.sleep(1000);

        //Currency
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[7]/div/div/div/div[2]/div[2]/div/div[1]/div[1]/div[1]/input")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[9]/div/div/div/a")).click();
        Thread.sleep(1000);

        //Wallet/Card number
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[7]/div/div/div/div[2]/div[3]/div/div[1]/div/input")).sendKeys("1Dp2PGQuKjKJuWWrKxBTwuiZFKNQrnWMRz");
        Thread.sleep(1000);

        //Click Save
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[7]/div/div/div/div[3]/button[2]")).click();
        Thread.sleep(3000);
        driver.quit();

    }
    @Test
    public void create_MICROBTC() throws InterruptedException {

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
        driver.findElement(By.id("119")).click();
        Thread.sleep(2000);
        //Enter to PartnerCard
        driver.findElement(By.xpath("//*[@id=\"navigation\"]/div[1]/div[2]/div[2]/div/button")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/a")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[54]/main/div/div[2]/div/div/div/div/div/div[2]/div[1]/div/table/tbody/tr[1]/td[5]/a")).click();
        Thread.sleep(2000);
        //Choice Wallet
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[16]/main/div/div[2]/div/div/div/div/div[2]/div/div/div[1]/div/div/div[4]/a")).click();
        Thread.sleep(1000);
        //Add Wallet
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[16]/main/div/div[2]/div/div/div/div/div[2]/div/div/div[2]/div/div[3]/div/div/div/nav/div/button")).click();
        Thread.sleep(1000);

        //Choice Wallet Type
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[7]/div/div/div/div[2]/div[1]/div/div[1]/div[1]/div[1]/input")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[10]/div/div/div[3]/a")).click();
        Thread.sleep(1000);

        //Currency
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[7]/div/div/div/div[2]/div[2]/div/div[1]/div[1]/div[1]/input")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[9]/div/div/div/a")).click();
        Thread.sleep(1000);

        //Wallet/Card number
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[7]/div/div/div/div[2]/div[3]/div/div[1]/div/input")).sendKeys("1Dp2PGQuKjKJuWWrKxBTwuiZFKNQrnWMRz");
        Thread.sleep(1000);

        //Click Save
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[7]/div/div/div/div[3]/button[2]")).click();
        Thread.sleep(3000);
        driver.quit();

    }
    @Test
    public void create_NTEUR() throws InterruptedException {

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
        driver.findElement(By.id("119")).click();
        Thread.sleep(2000);
        //Enter to PartnerCard
        driver.findElement(By.xpath("//*[@id=\"navigation\"]/div[1]/div[2]/div[2]/div/button")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/a")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[54]/main/div/div[2]/div/div/div/div/div/div[2]/div[1]/div/table/tbody/tr[1]/td[5]/a")).click();
        Thread.sleep(2000);
        //Choice Wallet
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[16]/main/div/div[2]/div/div/div/div/div[2]/div/div/div[1]/div/div/div[4]/a")).click();
        Thread.sleep(1000);
        //Add Wallet
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[16]/main/div/div[2]/div/div/div/div/div[2]/div/div/div[2]/div/div[3]/div/div/div/nav/div/button")).click();
        Thread.sleep(1000);

        //Choice Wallet Type
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[7]/div/div/div/div[2]/div[1]/div/div[1]/div[1]/div[1]/input")).sendKeys("NT_EUR");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[10]/div/div/div/a")).click();
        Thread.sleep(1000);

        //Currency
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[7]/div/div/div/div[2]/div[2]/div/div[1]/div[1]/div[1]/input")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[9]/div/div/div/a")).click();
        Thread.sleep(1000);

        //Wallet/Card number
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[7]/div/div/div/div[2]/div[3]/div/div[1]/div/input")).sendKeys("451234567899");
        Thread.sleep(1000);

        //Click Save
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[7]/div/div/div/div[3]/button[2]")).click();
        Thread.sleep(3000);
        driver.quit();

    }
    @Test
    public void create_NTRUB() throws InterruptedException {

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
        driver.findElement(By.id("119")).click();
        Thread.sleep(2000);
        //Enter to PartnerCard
        driver.findElement(By.xpath("//*[@id=\"navigation\"]/div[1]/div[2]/div[2]/div/button")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/a")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[54]/main/div/div[2]/div/div/div/div/div/div[2]/div[1]/div/table/tbody/tr[1]/td[5]/a")).click();
        Thread.sleep(2000);
        //Choice Wallet
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[16]/main/div/div[2]/div/div/div/div/div[2]/div/div/div[1]/div/div/div[4]/a")).click();
        Thread.sleep(1000);
        //Add Wallet
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[16]/main/div/div[2]/div/div/div/div/div[2]/div/div/div[2]/div/div[3]/div/div/div/nav/div/button")).click();
        Thread.sleep(1000);

        //Choice Wallet Type
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[7]/div/div/div/div[2]/div[1]/div/div[1]/div[1]/div[1]/input")).sendKeys("NT_RUB");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[10]/div/div/div/a")).click();
        Thread.sleep(1000);

        //Currency
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[7]/div/div/div/div[2]/div[2]/div/div[1]/div[1]/div[1]/input")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[9]/div/div/div/a")).click();
        Thread.sleep(1000);

        //Wallet/Card number
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[7]/div/div/div/div[2]/div[3]/div/div[1]/div/input")).sendKeys("451234567899");
        Thread.sleep(1000);

        //Click Save
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[7]/div/div/div/div[3]/button[2]")).click();
        Thread.sleep(3000);
        driver.quit();

    }
    @Test
    public void create_NTUSD() throws InterruptedException {

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
        driver.findElement(By.id("119")).click();
        Thread.sleep(2000);
        //Enter to PartnerCard
        driver.findElement(By.xpath("//*[@id=\"navigation\"]/div[1]/div[2]/div[2]/div/button")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/a")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[54]/main/div/div[2]/div/div/div/div/div/div[2]/div[1]/div/table/tbody/tr[1]/td[5]/a")).click();
        Thread.sleep(2000);
        //Choice Wallet
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[16]/main/div/div[2]/div/div/div/div/div[2]/div/div/div[1]/div/div/div[4]/a")).click();
        Thread.sleep(1000);
        //Add Wallet
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[16]/main/div/div[2]/div/div/div/div/div[2]/div/div/div[2]/div/div[3]/div/div/div/nav/div/button")).click();
        Thread.sleep(1000);

        //Choice Wallet Type
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[7]/div/div/div/div[2]/div[1]/div/div[1]/div[1]/div[1]/input")).sendKeys("NT_USD");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[10]/div/div/div/a")).click();
        Thread.sleep(1000);

        //Currency
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[7]/div/div/div/div[2]/div[2]/div/div[1]/div[1]/div[1]/input")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[9]/div/div/div/a")).click();
        Thread.sleep(1000);

        //Wallet/Card number
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[7]/div/div/div/div[2]/div[3]/div/div[1]/div/input")).sendKeys("451234567899");
        Thread.sleep(1000);

        //Click Save
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[7]/div/div/div/div[3]/button[2]")).click();
        Thread.sleep(3000);
        driver.quit();

    }
    @Test
    public void create_PAYERCARDEUR() throws InterruptedException {

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
        driver.findElement(By.id("119")).click();
        Thread.sleep(2000);
        //Enter to PartnerCard
        driver.findElement(By.xpath("//*[@id=\"navigation\"]/div[1]/div[2]/div[2]/div/button")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/a")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[54]/main/div/div[2]/div/div/div/div/div/div[2]/div[1]/div/table/tbody/tr[1]/td[5]/a")).click();
        Thread.sleep(2000);
        //Choice Wallet
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[16]/main/div/div[2]/div/div/div/div/div[2]/div/div/div[1]/div/div/div[4]/a")).click();
        Thread.sleep(1000);
        //Add Wallet
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[16]/main/div/div[2]/div/div/div/div/div[2]/div/div/div[2]/div/div[3]/div/div/div/nav/div/button")).click();
        Thread.sleep(1000);

        //Choice Wallet Type
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[7]/div/div/div/div[2]/div[1]/div/div[1]/div[1]/div[1]/input")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[10]/div/div/div[7]/a")).click();
        Thread.sleep(1000);

        //Currency
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[7]/div/div/div/div[2]/div[2]/div/div[1]/div[1]/div[1]/input")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[9]/div/div/div/a")).click();
        Thread.sleep(1000);

        //Wallet/Card number
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[7]/div/div/div/div[2]/div[3]/div/div[1]/div/input")).sendKeys("5168742291301390");
        Thread.sleep(1000);

        //Click Save
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[7]/div/div/div/div[3]/button[2]")).click();
        Thread.sleep(3000);
        driver.quit();

    }
    @Test
    public void create_PAYMASTER() throws InterruptedException {

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
        driver.findElement(By.id("119")).click();
        Thread.sleep(2000);
        //Enter to PartnerCard
        driver.findElement(By.xpath("//*[@id=\"navigation\"]/div[1]/div[2]/div[2]/div/button")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/a")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[54]/main/div/div[2]/div/div/div/div/div/div[2]/div[1]/div/table/tbody/tr[1]/td[5]/a")).click();
        Thread.sleep(2000);
        //Choice Wallet
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[16]/main/div/div[2]/div/div/div/div/div[2]/div/div/div[1]/div/div/div[4]/a")).click();
        Thread.sleep(1000);
        //Add Wallet
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[16]/main/div/div[2]/div/div/div/div/div[2]/div/div/div[2]/div/div[3]/div/div/div/nav/div/button")).click();
        Thread.sleep(1000);

        //Choice Wallet Type
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[7]/div/div/div/div[2]/div[1]/div/div[1]/div[1]/div[1]/input")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[10]/div/div/div[8]/a")).click();
        Thread.sleep(1000);

        //Currency
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[7]/div/div/div/div[2]/div[2]/div/div[1]/div[1]/div[1]/input")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[9]/div/div/div/a")).click();
        Thread.sleep(1000);

        //Wallet/Card number
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[7]/div/div/div/div[2]/div[3]/div/div[1]/div/input")).sendKeys("5168742291301390");
        Thread.sleep(1000);

        //Click Save
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[7]/div/div/div/div[3]/button[2]")).click();
        Thread.sleep(3000);
        driver.quit();

    }
    @Test
    public void create_QIWI() throws InterruptedException {

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
        driver.findElement(By.id("119")).click();
        Thread.sleep(2000);
        //Enter to PartnerCard
        driver.findElement(By.xpath("//*[@id=\"navigation\"]/div[1]/div[2]/div[2]/div/button")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/a")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[54]/main/div/div[2]/div/div/div/div/div/div[2]/div[1]/div/table/tbody/tr[1]/td[5]/a")).click();
        Thread.sleep(2000);
        //Choice Wallet
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[16]/main/div/div[2]/div/div/div/div/div[2]/div/div/div[1]/div/div/div[4]/a")).click();
        Thread.sleep(1000);
        //Add Wallet
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[16]/main/div/div[2]/div/div/div/div/div[2]/div/div/div[2]/div/div[3]/div/div/div/nav/div/button")).click();
        Thread.sleep(1000);

        //Choice Wallet Type
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[7]/div/div/div/div[2]/div[1]/div/div[1]/div[1]/div[1]/input")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[10]/div/div/div[9]/a")).click();
        Thread.sleep(1000);

        //Currency
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[7]/div/div/div/div[2]/div[2]/div/div[1]/div[1]/div[1]/input")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[9]/div/div/div/a")).click();
        Thread.sleep(1000);

        //Wallet/Card number
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[7]/div/div/div/div[2]/div[3]/div/div[1]/div/input")).sendKeys("79123456789");
        Thread.sleep(1000);

        //Click Save
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[7]/div/div/div/div[3]/button[2]")).click();
        Thread.sleep(3000);
        driver.quit();

    }
    @Test
    public void create_QIWICARD() throws InterruptedException {

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
        driver.findElement(By.id("119")).click();
        Thread.sleep(2000);
        //Enter to PartnerCard
        driver.findElement(By.xpath("//*[@id=\"navigation\"]/div[1]/div[2]/div[2]/div/button")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/a")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[54]/main/div/div[2]/div/div/div/div/div/div[2]/div[1]/div/table/tbody/tr[1]/td[5]/a")).click();
        Thread.sleep(2000);
        //Choice Wallet
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[16]/main/div/div[2]/div/div/div/div/div[2]/div/div/div[1]/div/div/div[4]/a")).click();
        Thread.sleep(1000);
        //Add Wallet
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[16]/main/div/div[2]/div/div/div/div/div[2]/div/div/div[2]/div/div[3]/div/div/div/nav/div/button")).click();
        Thread.sleep(1000);

        //Choice Wallet Type
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[7]/div/div/div/div[2]/div[1]/div/div[1]/div[1]/div[1]/input")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[10]/div/div/div[10]/a")).click();
        Thread.sleep(1000);

        //Currency
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[7]/div/div/div/div[2]/div[2]/div/div[1]/div[1]/div[1]/input")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[9]/div/div/div/a")).click();
        Thread.sleep(1000);

        //Wallet/Card number
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[7]/div/div/div/div[2]/div[3]/div/div[1]/div/input")).sendKeys("5168742291301390");
        Thread.sleep(1000);

        //Click Save
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[7]/div/div/div/div[3]/button[2]")).click();
        Thread.sleep(3000);
        driver.quit();

    }
    @Test
    public void create_ROYALPAYCARD() throws InterruptedException {

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
        driver.findElement(By.id("119")).click();
        Thread.sleep(2000);
        //Enter to PartnerCard
        driver.findElement(By.xpath("//*[@id=\"navigation\"]/div[1]/div[2]/div[2]/div/button")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/a")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[54]/main/div/div[2]/div/div/div/div/div/div[2]/div[1]/div/table/tbody/tr[1]/td[5]/a")).click();
        Thread.sleep(2000);
        //Choice Wallet
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[16]/main/div/div[2]/div/div/div/div/div[2]/div/div/div[1]/div/div/div[4]/a")).click();
        Thread.sleep(1000);
        //Add Wallet
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[16]/main/div/div[2]/div/div/div/div/div[2]/div/div/div[2]/div/div[3]/div/div/div/nav/div/button")).click();
        Thread.sleep(1000);

        //Choice Wallet Type
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[7]/div/div/div/div[2]/div[1]/div/div[1]/div[1]/div[1]/input")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[10]/div/div/div[11]/a")).click();
        Thread.sleep(1000);

        //Currency
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[7]/div/div/div/div[2]/div[2]/div/div[1]/div[1]/div[1]/input")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[9]/div/div/div/a")).click();
        Thread.sleep(1000);

        //Wallet/Card number
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[7]/div/div/div/div[2]/div[3]/div/div[1]/div/input")).sendKeys("5168742291301390");
        Thread.sleep(1000);

        //Click Save
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[7]/div/div/div/div[3]/button[2]")).click();
        Thread.sleep(3000);
        driver.quit();

    }
    @Test
    public void create_ROYALPAYCARDUAH() throws InterruptedException {

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
        driver.findElement(By.id("119")).click();
        Thread.sleep(2000);
        //Enter to PartnerCard
        driver.findElement(By.xpath("//*[@id=\"navigation\"]/div[1]/div[2]/div[2]/div/button")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/a")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[54]/main/div/div[2]/div/div/div/div/div/div[2]/div[1]/div/table/tbody/tr[1]/td[5]/a")).click();
        Thread.sleep(2000);
        //Choice Wallet
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[16]/main/div/div[2]/div/div/div/div/div[2]/div/div/div[1]/div/div/div[4]/a")).click();
        Thread.sleep(1000);
        //Add Wallet
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[16]/main/div/div[2]/div/div/div/div/div[2]/div/div/div[2]/div/div[3]/div/div/div/nav/div/button")).click();
        Thread.sleep(1000);

        //Choice Wallet Type
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[7]/div/div/div/div[2]/div[1]/div/div[1]/div[1]/div[1]/input")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[10]/div/div/div[12]/a")).click();
        Thread.sleep(1000);

        //Currency
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[7]/div/div/div/div[2]/div[2]/div/div[1]/div[1]/div[1]/input")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[9]/div/div/div/a")).click();
        Thread.sleep(1000);

        //Wallet/Card number
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[7]/div/div/div/div[2]/div[3]/div/div[1]/div/input")).sendKeys("5168742291301390");
        Thread.sleep(1000);

        //Click Save
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[7]/div/div/div/div[3]/button[2]")).click();
        Thread.sleep(3000);
        driver.quit();

    }
    @Test
    public void create_ROYALPAYCARDVRBRUB() throws InterruptedException {

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
        driver.findElement(By.id("119")).click();
        Thread.sleep(2000);
        //Enter to PartnerCard
        driver.findElement(By.xpath("//*[@id=\"navigation\"]/div[1]/div[2]/div[2]/div/button")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/a")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[54]/main/div/div[2]/div/div/div/div/div/div[2]/div[1]/div/table/tbody/tr[1]/td[5]/a")).click();
        Thread.sleep(2000);
        //Choice Wallet
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[16]/main/div/div[2]/div/div/div/div/div[2]/div/div/div[1]/div/div/div[4]/a")).click();
        Thread.sleep(1000);
        //Add Wallet
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[16]/main/div/div[2]/div/div/div/div/div[2]/div/div/div[2]/div/div[3]/div/div/div/nav/div/button")).click();
        Thread.sleep(1000);

        //Choice Wallet Type
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[7]/div/div/div/div[2]/div[1]/div/div[1]/div[1]/div[1]/input")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[10]/div/div/div[13]/a")).click();
        Thread.sleep(1000);

        //Currency
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[7]/div/div/div/div[2]/div[2]/div/div[1]/div[1]/div[1]/input")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[9]/div/div/div/a")).click();
        Thread.sleep(1000);

        //Wallet/Card number
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[7]/div/div/div/div[2]/div[3]/div/div[1]/div/input")).sendKeys("5168742291301390");
        Thread.sleep(1000);

        //Click Save
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[7]/div/div/div/div[3]/button[2]")).click();
        Thread.sleep(3000);
        driver.quit();

    }
    @Test
    public void create_ROYALPAYMCEUR() throws InterruptedException {

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
        driver.findElement(By.id("119")).click();
        Thread.sleep(2000);
        //Enter to PartnerCard
        driver.findElement(By.xpath("//*[@id=\"navigation\"]/div[1]/div[2]/div[2]/div/button")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/a")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[54]/main/div/div[2]/div/div/div/div/div/div[2]/div[1]/div/table/tbody/tr[1]/td[5]/a")).click();
        Thread.sleep(2000);
        //Choice Wallet
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[16]/main/div/div[2]/div/div/div/div/div[2]/div/div/div[1]/div/div/div[4]/a")).click();
        Thread.sleep(1000);
        //Add Wallet
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[16]/main/div/div[2]/div/div/div/div/div[2]/div/div/div[2]/div/div[3]/div/div/div/nav/div/button")).click();
        Thread.sleep(1000);

        //Choice Wallet Type
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[7]/div/div/div/div[2]/div[1]/div/div[1]/div[1]/div[1]/input")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[10]/div/div/div[14]/a")).click();
        Thread.sleep(1000);

        //Currency
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[7]/div/div/div/div[2]/div[2]/div/div[1]/div[1]/div[1]/input")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[9]/div/div/div/a")).click();
        Thread.sleep(1000);

        //Wallet/Card number
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[7]/div/div/div/div[2]/div[3]/div/div[1]/div/input")).sendKeys("5168742291301390");
        Thread.sleep(1000);

        //Click Save
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[7]/div/div/div/div[3]/button[2]")).click();
        Thread.sleep(3000);
        driver.quit();

    }
    @Test
    public void create_ROYALPAYVSEUR() throws InterruptedException {

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
        driver.findElement(By.id("119")).click();
        Thread.sleep(2000);
        //Enter to PartnerCard
        driver.findElement(By.xpath("//*[@id=\"navigation\"]/div[1]/div[2]/div[2]/div/button")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/a")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[54]/main/div/div[2]/div/div/div/div/div/div[2]/div[1]/div/table/tbody/tr[1]/td[5]/a")).click();
        Thread.sleep(2000);
        //Choice Wallet
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[16]/main/div/div[2]/div/div/div/div/div[2]/div/div/div[1]/div/div/div[4]/a")).click();
        Thread.sleep(1000);
        //Add Wallet
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[16]/main/div/div[2]/div/div/div/div/div[2]/div/div/div[2]/div/div[3]/div/div/div/nav/div/button")).click();
        Thread.sleep(1000);

        //Choice Wallet Type
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[7]/div/div/div/div[2]/div[1]/div/div[1]/div[1]/div[1]/input")).sendKeys("ROYALPAY_VISA");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[10]/div/div/div/a")).click();
        Thread.sleep(1000);

        //Currency
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[7]/div/div/div/div[2]/div[2]/div/div[1]/div[1]/div[1]/input")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[9]/div/div/div/a")).click();
        Thread.sleep(1000);

        //Wallet/Card number
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[7]/div/div/div/div[2]/div[3]/div/div[1]/div/input")).sendKeys("5168742291301390");
        Thread.sleep(1000);

        //Click Save
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[7]/div/div/div/div[3]/button[2]")).click();
        Thread.sleep(3000);
        driver.quit();

    }
    @Test
    public void create_SKREUR() throws InterruptedException {

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
        driver.findElement(By.id("119")).click();
        Thread.sleep(2000);
        //Enter to PartnerCard
        driver.findElement(By.xpath("//*[@id=\"navigation\"]/div[1]/div[2]/div[2]/div/button")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/a")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[54]/main/div/div[2]/div/div/div/div/div/div[2]/div[1]/div/table/tbody/tr[1]/td[5]/a")).click();
        Thread.sleep(2000);
        //Choice Wallet
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[16]/main/div/div[2]/div/div/div/div/div[2]/div/div/div[1]/div/div/div[4]/a")).click();
        Thread.sleep(1000);
        //Add Wallet
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[16]/main/div/div[2]/div/div/div/div/div[2]/div/div/div[2]/div/div[3]/div/div/div/nav/div/button")).click();
        Thread.sleep(1000);

        //Choice Wallet Type
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[7]/div/div/div/div[2]/div[1]/div/div[1]/div[1]/div[1]/input")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[10]/div/div/div[16]/a")).click();
        Thread.sleep(1000);

        //Currency
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[7]/div/div/div/div[2]/div[2]/div/div[1]/div[1]/div[1]/input")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[9]/div/div/div/a")).click();
        Thread.sleep(1000);

        //Wallet/Card number
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[7]/div/div/div/div[2]/div[3]/div/div[1]/div/input")).sendKeys("110456437");
        Thread.sleep(1000);

        //Click Save
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[7]/div/div/div/div[3]/button[2]")).click();
        Thread.sleep(3000);
        driver.quit();

    }
    @Test
    public void create_SKRUSD() throws InterruptedException {

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
        driver.findElement(By.id("119")).click();
        Thread.sleep(2000);
        //Enter to PartnerCard
        driver.findElement(By.xpath("//*[@id=\"navigation\"]/div[1]/div[2]/div[2]/div/button")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/a")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[54]/main/div/div[2]/div/div/div/div/div/div[2]/div[1]/div/table/tbody/tr[1]/td[5]/a")).click();
        Thread.sleep(2000);
        //Choice Wallet
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[16]/main/div/div[2]/div/div/div/div/div[2]/div/div/div[1]/div/div/div[4]/a")).click();
        Thread.sleep(1000);
        //Add Wallet
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[16]/main/div/div[2]/div/div/div/div/div[2]/div/div/div[2]/div/div[3]/div/div/div/nav/div/button")).click();
        Thread.sleep(1000);

        //Choice Wallet Type
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[7]/div/div/div/div[2]/div[1]/div/div[1]/div[1]/div[1]/input")).sendKeys("SKR_USD");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[10]/div/div/div/a")).click();
        Thread.sleep(1000);

        //Currency
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[7]/div/div/div/div[2]/div[2]/div/div[1]/div[1]/div[1]/input")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[9]/div/div/div/a")).click();
        Thread.sleep(1000);

        //Wallet/Card number
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[7]/div/div/div/div[2]/div[3]/div/div[1]/div/input")).sendKeys("110456437");
        Thread.sleep(1000);

        //Click Save
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[7]/div/div/div/div[3]/button[2]")).click();
        Thread.sleep(3000);
        driver.quit();

    }
    @Test
    public void create_USERACCOUNT() throws InterruptedException {

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
        driver.findElement(By.id("119")).click();
        Thread.sleep(2000);
        //Enter to PartnerCard
        driver.findElement(By.xpath("//*[@id=\"navigation\"]/div[1]/div[2]/div[2]/div/button")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/a")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[54]/main/div/div[2]/div/div/div/div/div/div[2]/div[1]/div/table/tbody/tr[1]/td[5]/a")).click();
        Thread.sleep(2000);
        //Choice Wallet
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[16]/main/div/div[2]/div/div/div/div/div[2]/div/div/div[1]/div/div/div[4]/a")).click();
        Thread.sleep(1000);
        //Add Wallet
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[16]/main/div/div[2]/div/div/div/div/div[2]/div/div/div[2]/div/div[3]/div/div/div/nav/div/button")).click();
        Thread.sleep(1000);

        //Choice Wallet Type
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[7]/div/div/div/div[2]/div[1]/div/div[1]/div[1]/div[1]/input")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[10]/div/div/div[18]/a")).click();
        Thread.sleep(1000);

        //Currency
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[7]/div/div/div/div[2]/div[2]/div/div[1]/div[1]/div[1]/input")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[9]/div/div/div/a")).click();
        Thread.sleep(1000);

        //Wallet/Card number
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[7]/div/div/div/div[2]/div[3]/div/div[1]/div/input")).sendKeys("31321865");
        Thread.sleep(1000);

        //Click Save
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[7]/div/div/div/div[3]/button[2]")).click();
        Thread.sleep(3000);
        driver.quit();

    }
    @Test
    public void create_WME() throws InterruptedException {

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
        driver.findElement(By.id("119")).click();
        Thread.sleep(2000);
        //Enter to PartnerCard
        driver.findElement(By.xpath("//*[@id=\"navigation\"]/div[1]/div[2]/div[2]/div/button")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/a")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[54]/main/div/div[2]/div/div/div/div/div/div[2]/div[1]/div/table/tbody/tr[1]/td[5]/a")).click();
        Thread.sleep(2000);
        //Choice Wallet
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[16]/main/div/div[2]/div/div/div/div/div[2]/div/div/div[1]/div/div/div[4]/a")).click();
        Thread.sleep(1000);
        //Add Wallet
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[16]/main/div/div[2]/div/div/div/div/div[2]/div/div/div[2]/div/div[3]/div/div/div/nav/div/button")).click();
        Thread.sleep(1000);

        //Choice Wallet Type
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[7]/div/div/div/div[2]/div[1]/div/div[1]/div[1]/div[1]/input")).sendKeys("WME");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[10]/div/div/div/a")).click();
        Thread.sleep(1000);

        //Currency
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[7]/div/div/div/div[2]/div[2]/div/div[1]/div[1]/div[1]/input")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[9]/div/div/div/a")).click();
        Thread.sleep(1000);

        //Wallet/Card number
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[7]/div/div/div/div[2]/div[3]/div/div[1]/div/input")).sendKeys("E123456789999");
        Thread.sleep(1000);

        //Click Save
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[7]/div/div/div/div[3]/button[2]")).click();
        Thread.sleep(3000);
        driver.quit();

    }
    @Test
    public void create_WMR() throws InterruptedException {

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
        driver.findElement(By.id("119")).click();
        Thread.sleep(2000);
        //Enter to PartnerCard
        driver.findElement(By.xpath("//*[@id=\"navigation\"]/div[1]/div[2]/div[2]/div/button")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/a")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[54]/main/div/div[2]/div/div/div/div/div/div[2]/div[1]/div/table/tbody/tr[1]/td[5]/a")).click();
        Thread.sleep(2000);
        //Choice Wallet
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[16]/main/div/div[2]/div/div/div/div/div[2]/div/div/div[1]/div/div/div[4]/a")).click();
        Thread.sleep(1000);
        //Add Wallet
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[16]/main/div/div[2]/div/div/div/div/div[2]/div/div/div[2]/div/div[3]/div/div/div/nav/div/button")).click();
        Thread.sleep(1000);

        //Choice Wallet Type
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[7]/div/div/div/div[2]/div[1]/div/div[1]/div[1]/div[1]/input")).sendKeys("WMR");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[10]/div/div/div/a")).click();
        Thread.sleep(1000);

        //Currency
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[7]/div/div/div/div[2]/div[2]/div/div[1]/div[1]/div[1]/input")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[9]/div/div/div/a")).click();
        Thread.sleep(1000);

        //Wallet/Card number
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[7]/div/div/div/div[2]/div[3]/div/div[1]/div/input")).sendKeys("R123456789999");
        Thread.sleep(1000);

        //Click Save
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[7]/div/div/div/div[3]/button[2]")).click();
        Thread.sleep(3000);
        driver.quit();

    }
    @Test
    public void create_WMRROYAL() throws InterruptedException {

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
        driver.findElement(By.id("119")).click();
        Thread.sleep(2000);
        //Enter to PartnerCard
        driver.findElement(By.xpath("//*[@id=\"navigation\"]/div[1]/div[2]/div[2]/div/button")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/a")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[54]/main/div/div[2]/div/div/div/div/div/div[2]/div[1]/div/table/tbody/tr[1]/td[5]/a")).click();
        Thread.sleep(2000);
        //Choice Wallet
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[16]/main/div/div[2]/div/div/div/div/div[2]/div/div/div[1]/div/div/div[4]/a")).click();
        Thread.sleep(1000);
        //Add Wallet
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[16]/main/div/div[2]/div/div/div/div/div[2]/div/div/div[2]/div/div[3]/div/div/div/nav/div/button")).click();
        Thread.sleep(1000);

        //Choice Wallet Type
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[7]/div/div/div/div[2]/div[1]/div/div[1]/div[1]/div[1]/input")).sendKeys("WMR_ROYAL");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[10]/div/div/div/a")).click();
        Thread.sleep(1000);

        //Currency
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[7]/div/div/div/div[2]/div[2]/div/div[1]/div[1]/div[1]/input")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[9]/div/div/div/a")).click();
        Thread.sleep(1000);

        //Wallet/Card number
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[7]/div/div/div/div[2]/div[3]/div/div[1]/div/input")).sendKeys("R123456789999");
        Thread.sleep(1000);

        //Click Save
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[7]/div/div/div/div[3]/button[2]")).click();
        Thread.sleep(3000);
        driver.quit();

    }
    @Test
    public void create_WMU() throws InterruptedException {

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
        driver.findElement(By.id("119")).click();
        Thread.sleep(2000);
        //Enter to PartnerCard
        driver.findElement(By.xpath("//*[@id=\"navigation\"]/div[1]/div[2]/div[2]/div/button")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/a")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[54]/main/div/div[2]/div/div/div/div/div/div[2]/div[1]/div/table/tbody/tr[1]/td[5]/a")).click();
        Thread.sleep(2000);
        //Choice Wallet
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[16]/main/div/div[2]/div/div/div/div/div[2]/div/div/div[1]/div/div/div[4]/a")).click();
        Thread.sleep(1000);
        //Add Wallet
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[16]/main/div/div[2]/div/div/div/div/div[2]/div/div/div[2]/div/div[3]/div/div/div/nav/div/button")).click();
        Thread.sleep(1000);

        //Choice Wallet Type
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[7]/div/div/div/div[2]/div[1]/div/div[1]/div[1]/div[1]/input")).sendKeys("WMU");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[10]/div/div/div/a")).click();
        Thread.sleep(1000);

        //Currency
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[7]/div/div/div/div[2]/div[2]/div/div[1]/div[1]/div[1]/input")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[9]/div/div/div/a")).click();
        Thread.sleep(1000);

        //Wallet/Card number
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[7]/div/div/div/div[2]/div[3]/div/div[1]/div/input")).sendKeys("U123456789999");
        Thread.sleep(1000);

        //Click Save
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[7]/div/div/div/div[3]/button[2]")).click();
        Thread.sleep(3000);
        driver.quit();

    }
    @Test
    public void create_WMZ() throws InterruptedException {

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
        driver.findElement(By.id("119")).click();
        Thread.sleep(2000);
        //Enter to PartnerCard
        driver.findElement(By.xpath("//*[@id=\"navigation\"]/div[1]/div[2]/div[2]/div/button")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/a")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[54]/main/div/div[2]/div/div/div/div/div/div[2]/div[1]/div/table/tbody/tr[1]/td[5]/a")).click();
        Thread.sleep(2000);
        //Choice Wallet
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[16]/main/div/div[2]/div/div/div/div/div[2]/div/div/div[1]/div/div/div[4]/a")).click();
        Thread.sleep(1000);
        //Add Wallet
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[16]/main/div/div[2]/div/div/div/div/div[2]/div/div/div[2]/div/div[3]/div/div/div/nav/div/button")).click();
        Thread.sleep(1000);

        //Choice Wallet Type
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[7]/div/div/div/div[2]/div[1]/div/div[1]/div[1]/div[1]/input")).sendKeys("WMZ");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[10]/div/div/div/a")).click();
        Thread.sleep(1000);

        //Currency
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[7]/div/div/div/div[2]/div[2]/div/div[1]/div[1]/div[1]/input")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[9]/div/div/div/a")).click();
        Thread.sleep(1000);

        //Wallet/Card number
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[7]/div/div/div/div[2]/div[3]/div/div[1]/div/input")).sendKeys("Z123456789999");
        Thread.sleep(1000);

        //Click Save
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[7]/div/div/div/div[3]/button[2]")).click();
        Thread.sleep(3000);
        driver.quit();

    }
    @Test
    public void create_YANDEX() throws InterruptedException {

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
        driver.findElement(By.id("119")).click();
        Thread.sleep(2000);
        //Enter to PartnerCard
        driver.findElement(By.xpath("//*[@id=\"navigation\"]/div[1]/div[2]/div[2]/div/button")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/a")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[54]/main/div/div[2]/div/div/div/div/div/div[2]/div[1]/div/table/tbody/tr[1]/td[5]/a")).click();
        Thread.sleep(2000);
        //Choice Wallet
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[16]/main/div/div[2]/div/div/div/div/div[2]/div/div/div[1]/div/div/div[4]/a")).click();
        Thread.sleep(1000);
        //Add Wallet
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[16]/main/div/div[2]/div/div/div/div/div[2]/div/div/div[2]/div/div[3]/div/div/div/nav/div/button")).click();
        Thread.sleep(1000);

        //Choice Wallet Type
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[7]/div/div/div/div[2]/div[1]/div/div[1]/div[1]/div[1]/input")).sendKeys("YANDEX");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[10]/div/div/div/a")).click();
        Thread.sleep(1000);

        //Currency
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[7]/div/div/div/div[2]/div[2]/div/div[1]/div[1]/div[1]/input")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[9]/div/div/div/a")).click();
        Thread.sleep(1000);

        //Wallet/Card number
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[7]/div/div/div/div[2]/div[3]/div/div[1]/div/input")).sendKeys("123456789999999");
        Thread.sleep(1000);

        //Click Save
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[7]/div/div/div/div[3]/button[2]")).click();
        Thread.sleep(3000);
        driver.quit();

    }
}