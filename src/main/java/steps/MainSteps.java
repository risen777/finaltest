package steps;


import pages.MainPage;
import ru.yandex.qatools.allure.annotations.Step;


/**
 * Created by Sergey
 */
public class MainSteps {
    @Step("Выбрано меню {0}")
    public void stepSelectMainMenu(String menuItem) {
        new MainPage(BaseSteps.getDriver()).selectMainMenu(menuItem);
    }


}
