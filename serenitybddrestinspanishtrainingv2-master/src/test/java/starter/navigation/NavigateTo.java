package starter.navigation;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import org.openqa.selenium.WebElement;

public class NavigateTo {
    public static Performable theDuckDuckGoHomePage() {
        return Task.where("{0} opens the DuckDuckGo home page",
                Open.browserOn().the(LoginToHome.class));
    }
    public static Performable LoginToHome() {
        return Task.where("{0} opens the your logo page",
                Open.browserOn().the(LoginToHome.class));
    }
}
