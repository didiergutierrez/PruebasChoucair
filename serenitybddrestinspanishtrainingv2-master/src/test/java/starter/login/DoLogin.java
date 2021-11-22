package starter.login;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class DoLogin implements Task {
    private final String username;
    private final String passwd;

    public DoLogin(String username, String passwd) {
        this.username = username;
        this.passwd = passwd;
    }
    public static Performable withCredentials(String username,String passwd){
        return instrumented(DoLogin.class,username,passwd);
    }

    @Override
    public <T extends Actor> void performAs(T actor){
        actor.attemptsTo(
                Enter.theValue(username).into(LoginForm.USERNAME_FIELD),
                Enter.theValue(passwd).into(LoginForm.PASSWORD_FIELD),
                Click.on(LoginForm.LOGIN_BUTTON)
        );
    }

}
