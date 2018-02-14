package steps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * Created by Sergey
 */
public class ScenarioSteps {
    MainSteps mainSteps = new MainSteps();
    BaseSteps baseSteps = new BaseSteps();
    ElectronicsPageSteps electronicsPageSteps = new ElectronicsPageSteps();
    FullFilterOfMarketSteps fullFilterOfMarketSteps = new FullFilterOfMarketSteps();
    MarketPageSteps marketPageSteps = new MarketPageSteps();


    JobWithMarketStep jobWithMarketStep = new JobWithMarketStep();

    @When("^Открыт браузер и развернут на весь экран")
    public static void stepSetUp() throws Exception {
        BaseSteps.stepSetUp();
    }

    @When("^Осуществлён переход в \"(.*)\"$")
    public void stepSelectMainMenu(String menuItem) {
        mainSteps.stepSelectMainMenu(menuItem);
    }

    @When("^Выбран раздел маркета \"(.*)\"$")
    public void stepSelectSubMenu(String menuItem) {
        marketPageSteps.stepSelectSubMenu(menuItem);
    }

    @When("^Выбран вид маркета \"(.*)\"$")
    public void stepSelectElecMenu(String menuItem) {
        electronicsPageSteps.stepSelectElecMenu(menuItem);
    }

    @Then("^Осуществлён переход в расширенный поиск")
    public void stepSelectSubMenuItem() {
        jobWithMarketStep.stepGoToFilter();
    }


    @When("^Задан параметр поиска от \"(.*)\"$")
    public void stepFillPriceFrom(String value) {
        fullFilterOfMarketSteps.stepFillPriceFrom(value);
    }

    @When("^Выбран производитель \"(.*)\"$")
    public void stepSelectTvProducer(String menuItem) {
        fullFilterOfMarketSteps.stepSelectTvProducer(menuItem);
    }


    @When("^Нажата кнопка Показать подходящие")
    public void stepCompleteFilterButton() {
        fullFilterOfMarketSteps.stepCompleteFilterButton();
    }


    @When("^Проверить, что элементов на странице \"(.*)\"$")
    public void stepCheckListSizeHead(int count) {
        jobWithMarketStep.stepChecktListSize(count);

    }

    @When("^Запомнен первый элемент в списке \"(.*)\"$")
    public void stepGetElemHead(int index) {
        jobWithMarketStep.stepGetElem(index);
    }

    @Then("^Выбрать форму плитки")
    public void stepGetElemHead() {
        jobWithMarketStep.stepSelectBar();
    }

    @Then("^В поисковую строку введено запомненное значение")
    public void stepFillFieldHead() {
        jobWithMarketStep.stepFillFieldTv();
    }

    @Then("^Нажата на кнопка Найти")
    public void stepButtonSearchHead() {
        marketPageSteps.stepButtonSearch();
    }

    @Then("^Проверить, что наименование товара соответствует запомненному значению")
    public void stepCheckElementHead() {
        jobWithMarketStep.stepCheckElements();


    }

}



















