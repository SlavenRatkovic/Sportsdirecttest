package group.revealed.steps;

import group.revealed.driver.DriverManager;
import group.revealed.pages.*;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

@SuppressWarnings("unused")
@RequiredArgsConstructor
public class Base {

    @Getter
    private final WebDriver driver = DriverManager.getDriver();

    @Getter
    private final WebDriverWait wdWait = new WebDriverWait(driver, Duration.ofSeconds(20));

    //Sportsdirect
    @Getter
    private final SportsdirectHomepage sportsdirectHomepage = new SportsdirectHomepage(driver);
    @Getter
    private final SportsdirectNikeSalePage sportsdirectNikeSalePage = new SportsdirectNikeSalePage(driver);

}
