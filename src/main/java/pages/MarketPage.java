package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import steps.BaseSteps;

/**
 * Created by Sergey
 */
public class MarketPage {


    @FindBy(xpath = "//li[contains(@class,'current')]")
    WebElement subMenu;

    @FindBy(xpath = "//*[contains(@class,'header2__main')]//*[contains(@class,'button2 button2_size_ml')]")
    WebElement buttonSearch;

    public MarketPage(WebDriver driver) {
        PageFactory.initElements(BaseSteps.getDriver(), this);
    }

    /*Переход в электронику*/
     public void selectSubMenu(String menuItem) {
       subMenu.findElement(By.xpath("//*[contains(text(),'"+menuItem+"')]")).click();

    }
    //кнопка поиска
    public void buttonSearch() {
       // buttonSearch.findElement(By.xpath("/.//*[contains(text(),'Найти')]")).click();
      WebDriverWait waitWait = new WebDriverWait(BaseSteps.getDriver(), 30);
     WebElement wSearch = waitWait.until(ExpectedConditions.elementToBeClickable((By.xpath("//*[contains(@class,'header2__main')]//*[contains(@class,'button2 button2_size_ml')]"))));

      wSearch.click();



    }




}
