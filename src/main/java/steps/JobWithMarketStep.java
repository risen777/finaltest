package steps;

import pages.JobWithMarket;
import ru.yandex.qatools.allure.annotations.Step;

import static org.junit.Assert.assertEquals;

/**
 * Created by Sergey
 */
public class JobWithMarketStep {

    String rememberElement;


    @Step("Проверить, что элементов на странице , {0}")
    public void stepChecktListSize(int count) {
        new JobWithMarket(BaseSteps.getDriver()).checkListSize(count);
    }

    @Step("Запомнен первый элемент в списке , {0}")
    public void stepGetElem(int index) {

        rememberElement = new JobWithMarket(BaseSteps.getDriver()).getElem(index);
    }

    @Step("В поисковую строку введено запомненное значение")
    public void stepFillFieldTv() {

        new JobWithMarket(BaseSteps.getDriver()).fillField();
    }

    @Step("Проверить, что наименование товара соответствует запомненному значению")
    public void stepCheckElements() {
        new JobWithMarket(BaseSteps.getDriver()).checkElements(rememberElement);
    }

    @Step("Выбрать форму плитки")
    public void stepSelectBar() {

        new JobWithMarket(BaseSteps.getDriver()).selectBar();
    }

    @Step("Осуществлён переход в расширенный поиск , {0}")
    public void stepGoToFilter() {
        new JobWithMarket(BaseSteps.getDriver()).goToFilter();
    }

}
