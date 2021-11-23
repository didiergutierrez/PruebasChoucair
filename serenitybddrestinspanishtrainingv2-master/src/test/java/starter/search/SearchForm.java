package starter.search;

import org.openqa.selenium.By;

public class SearchForm {
    public static By SEARCH_FIELD = By.id("search_query_top");
    public static By SEARCH_BUTTON = By.xpath("//*[@id='searchbox']/button");
    public static By USERNAME_FIELD= By.id("email");
    public static By PASSWORD_FIELD= By.id("passwd");
    public static By LOGIN_BUTTON= By.id("SubmitLogin");
    public static By Sign_In_BUTTON=By.xpath("//*[@id='header']/div[2]/div/div/nav/div[1]/a");
    public static By NAME_ACCOUNT=By.xpath("//*[@id='header']/div[2]/div/div/nav/div[1]/a/span");
}
