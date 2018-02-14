package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import steps.BaseSteps;

/**
 * Created by Sergey
 */
public class MainPage {
    @FindBy(xpath = "//*[contains(@class,'home-arrow')]")
    WebElement mainMenu;


    /*Начальная страница -переход в маркет*/
    public MainPage(WebDriver driver) {
        PageFactory.initElements(BaseSteps.getDriver(), this);
    }

    public void selectMainMenu(String menuItem) {
        mainMenu.findElement(By.xpath("//*[contains(text(),'"+menuItem+"')]")).click();

    }



    }

