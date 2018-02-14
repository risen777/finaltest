package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
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
public class ElectronicsPage {

    @FindBy(xpath = "//ul[@class='topmenu__list']")
    WebElement elecMenu;

    public ElectronicsPage(WebDriver driver) {
        PageFactory.initElements(BaseSteps.getDriver(), this);
    }

    /*Выбор в разделе электроника/наушниках */
    public void selectElecMenu(String menuItem) {
        //  WebDriverWait waitWait = new WebDriverWait(BaseSteps.getDriver(), 40);
        //   WebElement wElect = waitWait.until(ExpectedConditions.visibilityOfElementLocated(((By.xpath("//li[@data-department='"+menuItem+"']")))));
        //    wElect.click();

        WebElement element = elecMenu.findElement(By.xpath("//li[@data-department='" + menuItem + "']"));
        JavascriptExecutor executor = (JavascriptExecutor) BaseSteps.getDriver();
        executor.executeScript("arguments[0].click()", element);

    }

}
