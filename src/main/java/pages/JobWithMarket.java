package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import steps.BaseSteps;

import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Created by Sergey
 */
public class JobWithMarket {


    @FindBy(xpath = "//div[contains(@class,'n-snippet-card2 i-bem')]//div[@class='n-snippet-card2__title']")
    List<WebElement> listTVelements;

    @FindBy(name = "text")
    WebElement searchElem;
    @FindBy(name = "text")
    public WebElement elemName;

    @FindBy(name = "viewtype")
    public WebElement clickToBar;
    @FindBy(xpath = "//*[contains(text(),'Перейти ко всем фильтрам')]")
    WebElement goToFilterTv;

    public JobWithMarket(WebDriver driver) {
        PageFactory.initElements(BaseSteps.getDriver(), this);
    }


    public static String listElement;

    public int getListSize() {
        return listTVelements.size();
    }
//Соответствие запомненного значения
    public void checkListSize(int count) {
        assertEquals(count, new JobWithMarket(BaseSteps.getDriver()).getListSize());
    }


    public String getElem(int index) {
        return listTVelements.get(index).getText();
    }

//Ввести 1-ый элемент
    public void fillField() {
        listElement = listTVelements.get(0).getText();
        searchElem.clear();
        searchElem.sendKeys(listElement);

    }

    public void selectBar() {
        clickToBar.click();

    }

    public void goToFilter() {
        goToFilterTv.findElement(By.xpath("//*[contains(text(),'Перейти ко всем фильтрам')]")).click();

    }

    public void checkElements(String rememberElement) {
        assertEquals(rememberElement, new JobWithMarket(BaseSteps.getDriver()).elemName.getAttribute("value"));

        //  new TvPage(BaseSteps.getDriver()).stepCheckElements();

    }

}