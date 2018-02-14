package steps;

import pages.MarketPage;
import ru.yandex.qatools.allure.annotations.Step;

/**
 * Created by Sergey
 */
public class MarketPageSteps {
    @Step("Выбран вид маркета{0}")
    public void stepSelectSubMenu(String menuItem) {
        new MarketPage(BaseSteps.getDriver()).selectSubMenu(menuItem);


    }

    @Step("^Нажимаем на кнопку - найти")
    public void stepButtonSearch() {
        new MarketPage(BaseSteps.getDriver()).buttonSearch();


    }


}
