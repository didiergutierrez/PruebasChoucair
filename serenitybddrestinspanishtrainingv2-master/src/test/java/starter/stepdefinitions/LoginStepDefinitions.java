package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import starter.navigation.NavigateTo;
import starter.search.SearchFor;
import starter.search.SearchLogin;
import starter.search.SearchResult;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;
import static org.hamcrest.core.Every.everyItem;
import static org.hamcrest.core.IsEqual.equalTo;
import static starter.matchers.StringContainsIgnoringCase.containsIgnoringCase;

public class LoginStepDefinitions {

    @Given("^(.*) has an active account")
    public void didier_has_an_active_account(String actor) {
        theActorCalled(actor).attemptsTo(NavigateTo.theYourLogoGoHomePage());
    }

    @When("^he inserts their credentials (.*) and (.*)")
    public void he_inserts_their_credentials_user_and_pass(String user,String pass) {
        withCurrentActor(
                SearchLogin.login(user,pass)
        );
    }

    @Then("he should have access to manage his account")
    public void he_should_have_access_to_manage_his_account() {

        theActorInTheSpotlight().should(
                seeThat("Valid credentials",
                        SearchResult.accountName(), equalTo("didier gutierrez"))
        );
    }
}
