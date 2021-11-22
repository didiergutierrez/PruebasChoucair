package starter.dashboard;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

public class LoginSucess implements Question<String> {

    public static Question<String> value(){
        return new LoginSucess();
    }

    @Override
    public String answeredBy(Actor actor) {
        return BrowseTheWeb.as(actor).find(LoginOverview.msgError).getText();
    }
}
