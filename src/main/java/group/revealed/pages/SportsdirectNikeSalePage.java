package group.revealed.pages;

import group.revealed.utils.BasePage;
import lombok.NonNull;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SportsdirectNikeSalePage extends BasePage
{
    @FindBy (id="lblCategoryHeader")
    WebElement nikeSaleHeader;
    @FindBy (className="productdescriptionbrand")
    WebElement nikeBrandName;
    @FindBy (id="prdsFound")
    WebElement nmbProducts;

    public SportsdirectNikeSalePage(@NonNull WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }
    public void checkNikeSale() throws InterruptedException {
        waitForElementToBeDisplayed(nikeSaleHeader);
        waitForElementToBeDisplayed(nikeBrandName);
        Assert.assertTrue("You didn't choose Nike in sales", nikeSaleHeader.getText().contains("NIKE SALE"));
        Assert.assertTrue("You didn't choose Nike in sales", nikeBrandName.getText().contains("NIKE"));
        System.out.println("You have succesfuly chosen Nike sale products!");
        System.out.println("Total number of products on sale: " + nmbProducts.getText());
        Thread.sleep(3000);
    }




}
