package group.revealed.pages;

import group.revealed.utils.BasePage;
import lombok.NonNull;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SportsdirectHomepage extends BasePage {

    @FindBy (className = "nikeLogoMenu")
    WebElement nikeLogo;


    public SportsdirectHomepage(@NonNull WebDriver driver)
    {
        super(driver);
        PageFactory.initElements(driver, this);
    }
    public void chooseNikeSale()
    {
        WebElement saleTab = driver.findElement(By.id("liTopLevelMenu_2624418"));
        new Actions(driver)
                .moveToElement(saleTab)
                .perform();
        click(nikeLogo);
    }
}