package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import steps.BaseSteps;

/**
 * Created by Sergey
 */
public class FullFilterOfMarket {

    @FindBy(xpath = "//*[@class='checkbox__label']/..")
    WebElement сhooseProducer;
    @FindBy(id = "glf-pricefrom-var")
    WebElement priceInput;

    @FindBy(xpath = "//*[contains(@class,'button_theme_pseudo')]")


    public WebElement completeFilterButton;


    public FullFilterOfMarket(WebDriver driver) {
        PageFactory.initElements(BaseSteps.getDriver(), this);
    }

    //Выбор производителя
    public void selectTvProducer(String menuItem) {
        сhooseProducer.findElement(By.xpath("//*[contains(text(),'" + menuItem + "')]")).click();

    }

    //Цена от
    public void fillPriceFilterFrom(String value) {
        priceInput.clear();
        priceInput.sendKeys(value);
    }

    //Вернуться из маркета в рынок
    public void completeFilterButton() {


        WebElement element = BaseSteps.getDriver().findElement(By.xpath("/.//*[contains(text(),'Показать подходящие')]"));
        JavascriptExecutor executor = (JavascriptExecutor) BaseSteps.getDriver();
        executor.executeScript("arguments[0].click()", element);


    }
}
