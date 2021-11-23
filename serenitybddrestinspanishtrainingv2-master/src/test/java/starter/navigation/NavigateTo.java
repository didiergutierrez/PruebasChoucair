package starter.navigation;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

public class NavigateTo {
    public static Performable theYourLogoGoHomePage() {
        return Task.where("{0} opens the Your logo page",
                Open.browserOn().the(YourLogoGoHomePage.class));
    }
}
