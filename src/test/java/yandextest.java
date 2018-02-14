import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;



/**
 * Created by Sergey
 */
public class yandextest {
    WebDriver driver;
    String baseUrl;


    @Before
    public void beforeTest() {
        System.setProperty("webdriver.chrome.driver", "drv/chromedriver.exe");
        driver = new ChromeDriver();
        baseUrl = "https://www.yandex.ru/";
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get(baseUrl);
    }

@Test
@Ignore
public void testYandex() {
    Actions action = new Actions(driver);
    driver.findElement(By.xpath("//*[contains(@class,'home-arrow')]//*[contains(text(),'Маркет')]")).click();
  //  Wait<WebDriver> wait =new WebDriverWait(driver,5,1000);
  //  WebElement sendBtn=driver.findElement(By.xpath("//li[contains(@class,'current')]/.//*[contains(text(),'Электроника')]"));
//    wait.until(ExpectedConditions.visibilityOf(sendBtn));
 //  WebElement title=driver.findElement(By.xpath("//h4[@class='modal-title']"));

   // WebElement subLink = driver.findElement(By.xpath("//li[contains(@class,'current')]/.//*[contains(text(),'Электроника')]"));
   // action.moveToElement(subLink).build().perform();


 //driver.findElement(By.xpath("//li[contains(@class,'current')]/.//*[contains(text(),'Электроника')]")).click();
    driver.findElement(By.xpath(".//*[contains(text(), 'Электроника')]")).click();

    driver.findElement(By.xpath("//*[contains(@class,'catalog-')]/.//*[text()='Телевизоры']")).click();
    driver.findElement(By.xpath(("//*[contains(text(),'Перейти ко всем фильтрам')]"))).click();

    fillField(By.id("glf-pricefrom-var"), "20000");
    driver.findElement(By.xpath(("//*[contains(text(),'Samsung')]"))).click();
    driver.findElement(By.xpath(("//*[contains(text(),'LG')]"))).click();
    WebElement element = driver.findElement(By.xpath("//*[contains(@class,'button_theme_pseudo')]/.//*[contains(text(),'Показать подходящие')]"));
    JavascriptExecutor executor = (JavascriptExecutor)driver;
    executor.executeScript("arguments[0].click()", element);
  //    driver.findElement(By.xpath("//*[contains(@class,'button_theme_pseudo')]/.//*[contains(text(),'Показать подходящие')]")).click();
  //  List list = driver.findElements(By.xpath("//div[@data-id]"));

  //  driver.findElement(byLocator).getText();

 //   List<WebElement> list = driver
   //         .findElements(By.xpath("//div[@data-id]"));
//   int listSize=list.size();
  // String listText=list.get(1).getText();
    getListSize(By.xpath("//div[@data-id]"));
    getListText(By.xpath("//div[@data-id]"));




    Assert.assertEquals(12,
            driver.findElements(By.xpath("//div[@data-id]")));

    fillField(By.name("name"),"LG 43UJ634V");


    Assert.assertEquals("LG 43UJ634V",
            driver.findElement(By.name("name")).getAttribute("value"));

}



public void getListSize(By locator){

       driver.findElements(locator).size();
}

public  String getListText(By locator){

return  driver.findElements(locator).get(1).getText();
}


    public  void  fillField(By locator,String value){
        driver.findElement(locator).clear();
        driver.findElement(locator).sendKeys(value);




    }



    @After
    public  void afterTest(){
        driver.quit();

    }

}














