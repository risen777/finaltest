package steps;

import pages.FullFilterOfMarket;
import ru.yandex.qatools.allure.annotations.Step;

/**
 * Created by Sergey
 */
public class FullFilterOfMarketSteps {

    @Step("нажата кнопка показать подходящие{0}")
    public void stepCompleteFilterButton() {
        new FullFilterOfMarket(BaseSteps.getDriver()).completeFilterButton();
    }

    @Step("Поле {0} заполнено значением - {1}")

    public void stepFillPriceFrom(String field) {

        new FullFilterOfMarket(BaseSteps.getDriver()).fillPriceFilterFrom(field);

    }

    @Step("нажата кнопка показать выбора производителя{0}")
    public void stepSelectTvProducer(String menuItem) {
        new FullFilterOfMarket(BaseSteps.getDriver()).selectTvProducer(menuItem);
    }


}
