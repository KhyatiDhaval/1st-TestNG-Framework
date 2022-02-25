import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class HomeWorkTestScript {
    WebDriver driver;

    @Test(priority = 1)
    void openBrowser() {
        System.out.println("Open the nopCommerce website");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.get("https://demo.nopcommerce.com");
    }
    @Test(priority = 2)
    void selectComputers() {
        System.out.println("Click on Computers");
        driver.findElement(By.xpath("/html/body/div[6]/div[2]/ul[1]/li[1]/a")).click();
    }
    @Test(priority = 3)
    void selectDesktopsFromComputerList() {
        System.out.println("Select Desktops from Computers List");
        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[3]/div/div[2]/div[1]/div/div[1]/div/div/a/img")).click();
    }
    @Test(priority = 4)
    void selectLenovoIdeaCenter600AllInOnePC() {
        System.out.println("Selecting the Lenovo Idea 600 All-In-One PC");
        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[3]/div/div[2]/div[2]/div[2]/div/div/div[3]/div/div[2]/h2/a")).click();
    }
    @Test(priority = 5)
    void addRequiredQuantityOfDesktops() {
        System.out.println("Adding 1 quantity of desktops to the shopping cart");
        driver.findElement(By.xpath("//*[@id=\"product_enteredQuantity_3\"]")).sendKeys("");
    }
    @Test(priority = 6)
    void clickOnAddToCart() {
        System.out.println("Click on add to cart button");
        driver.findElement(By.xpath("//*[@id=\"add-to-cart-button-3\"]")).click();
    }
    @Test(priority = 7)
    void shoppingCart() {
        System.out.println("Click on shopping cart");
        driver.findElement(By.xpath("//*[@id=\"topcartlink\"]/a/span[1]")).click();
    }
    @Test(priority = 8)
    void changeQuantity() {
        System.out.println("Changing quantity from 1 to 3");
        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div/form/div[1]/table/tbody/tr/td[5]/input")).clear();
        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div/form/div[1]/table/tbody/tr/td[5]/input")).sendKeys("3");
    }

    @Test(priority = 9)
    void updateShoppingCart() {
        System.out.println("Updating the shopping cart");
        driver.findElement(By.xpath("//*[@id=\"updatecart\"]")).click();
    }
    @Test(priority = 10)
    void acceptTermsAndConditions() {
        System.out.println("Tick on terms and conditions checkbox");
        driver.findElement(By.xpath("//*[@id=\"shopping-cart-form\"]/div[3]/div[2]/div[3]/label")).click();
    }
    @Test(priority = 11)
    void clickOnCheckoutButton() {
        System.out.println("Click on checkout button to checkout");
        driver.findElement(By.id("checkout")).click();
    }
    @Test(priority = 12)
    void checkoutAsGuest() {
        System.out.println("Click on checkout as guest");
        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[1]/div[3]/button[1]")).click();
    }

    @Test(priority = 13)
    void firstName() {
        System.out.println("Enter billing name");
        driver.findElement(By.id("BillingNewAddress_FirstName")).sendKeys("K");
    }
    @Test(priority = 14)
    void lastName() {
        System.out.println("Enter last name");
        driver.findElement(By.id("BillingNewAddress_LastName")).sendKeys("Patel");
    }
    @Test(priority = 15)
    void email() {
        System.out.println("Enter E-mail address");
        driver.findElement(By.name("BillingNewAddress.Email")).sendKeys("patelkhyati@yahoo.com");
    }
    @Test(priority = 16)
    void company() {
        System.out.println("Enter a company name");
        driver.findElement(By.id("BillingNewAddress_Company")).sendKeys("Unify Testing");
    }
    @Test(priority = 17)
    void selectCountryName() {
        System.out.println("Select country name from dropdpwn list");
        WebElement country = driver.findElement(By.id("BillingNewAddress_CountryId"));
        Select select = new Select(country);
        select.selectByVisibleText("United Kingdom");
    }
    @Test(priority = 18)
    void cityName() {
        System.out.println("Enter the city name to your billing address.");
        driver.findElement(By.id("BillingNewAddress_City")).sendKeys("London");
    }
    @Test(priority = 19)
    void enterAddress1() {
        System.out.println("Enter the house number and street name.");
        driver.findElement(By.name("BillingNewAddress.Address1")).sendKeys("140, London Road");
    }
    @Test(priority = 20)
    void enterAddress2() {
        System.out.println("Enter the 2nd line of the billing address.");
        driver.findElement(By.id("BillingNewAddress_Address2")).sendKeys("South London");
    }
    @Test(priority = 21)
    void zipPostalCode() {
        System.out.println("Enter the Zip code or Post code of the billing address");
        driver.findElement(By.name("BillingNewAddress.ZipPostalCode")).sendKeys("CR2 5VB");
    }
    @Test(priority = 22)
    void phoneNumber() {
        System.out.println("Enter the phone number.");
        driver.findElement(By.id("BillingNewAddress_PhoneNumber")).sendKeys("0209384833");
    }
    @Test(priority = 23)
    void faxNumber() {
        System.out.println("Enter the Fax number");
        driver.findElement(By.id("BillingNewAddress_FaxNumber")).sendKeys("+567528484");
    }
    @Test(priority = 24)
    void clickOnContinue() {
        System.out.println("click in Continue button");
        driver.findElement(By.name("save")).click();
    }
//@Test(priority = 25)
//    void clickOnGround() {
//        System.out.println("Select shipping method");
//        driver.findElement(By.xpath("//*[@id=\"shipping-methods-form\"]/ul/li[1]/div[1]/label")).click();
//    }
//@Test(priority = 26)
//    void clickOnContinueButton(){
//        System.out.println("Click on continue button");
//        driver.findElement(By.className("button-1 shipping-method-next-step-button")).click();
//    }

    @Test(priority = 25)
    void closeDriver(){
        System.out.println("Close the browser.");
        driver.close();
    }
}

