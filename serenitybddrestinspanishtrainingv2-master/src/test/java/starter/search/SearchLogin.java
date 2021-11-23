package starter.search;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Clear;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.By;

public class SearchLogin {
    public static Performable login(String user,String pass) {
        return Task.where("{0} attempts to search for #login",
                Click.on((SearchForm.Sign_In_BUTTON)),
                Clear.field(SearchForm.USERNAME_FIELD),
                Clear.field(SearchForm.PASSWORD_FIELD),
                Enter.theValue(user).into(SearchForm.USERNAME_FIELD),
                Enter.theValue(pass).into(SearchForm.PASSWORD_FIELD),
                Click.on(SearchForm.LOGIN_BUTTON)
        ).with("user").of(user);
    }
}
