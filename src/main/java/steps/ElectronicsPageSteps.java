package steps;

import pages.ElectronicsPage;
import pages.MarketPage;
import ru.yandex.qatools.allure.annotations.Step;

/**
 * Created by Sergey
 */
public class ElectronicsPageSteps {


    @Step("Выбран вид маркета , {0}")
    public void stepSelectElecMenu(String menuItem) {
        new ElectronicsPage(BaseSteps.getDriver()).selectElecMenu(menuItem);
    }

}
