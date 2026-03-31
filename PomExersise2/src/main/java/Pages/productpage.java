package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class productpage extends Basepage{
    public productpage(WebDriver driver) {
        super(driver);
    }

    //locator
    private final By productBtnLocator=By.xpath("//a[@href=\"/products\"]");
    private final By addBtnLocator =By.xpath("(//i[@class=\"fa fa-shopping-cart\"])[2]");
    private final By continueBtnLocator =By.xpath("//button[@class=\"btn btn-success close-modal btn-block\"]");
    private final By addBtn2Locator =By.xpath("(//i[@class=\"fa fa-shopping-cart\"])[4]");
    private final By viewCartLocator =By.xpath("//a[@href=\"/view_cart\"]//u");

    private final By product1NameLocator=By.xpath("//a[@href=\"/product_details/1\"]");
    private final By product2NameLocator=By.xpath("//a[@href=\"/product_details/2\"]");
    private final By product1priceLocator =By.xpath("(//td[@class=\"cart_price\"])[1]");
    private final By product2priceLocator =By.xpath("(//td[@class=\"cart_price\"])[2]");

    private final By product1Quantity=By.xpath("(//button[@class=\"disabled\"])[1]");
    private final By product2Quantity=By.xpath("(//button[@class=\"disabled\"])[2]");

    private final By total1pricrLocator=By.xpath("(//td[@class=\"cart_total\"])[1]");
    private final By total2pricrLocator=By.xpath("(//td[@class=\"cart_total\"])[2]");


    public void clickOnProductPage()
    {
        Click(productBtnLocator);
    }

    public void hoverOverFirstProduct()
    {
        hover(addBtnLocator);
    }

    public void ClickContinueBtn()
    {
        Click(continueBtnLocator);
    }

    public void hoverOverSecondProduct()
    {
        Click(addBtn2Locator);
    }

    public void viewCart()
    {
        Click(viewCartLocator);
    }

    public String CheckForProduct1() {

        return getText(product1NameLocator);
    }
    public String CheckForProduct2() {

        return getText(product2NameLocator);
    }

    public String product1price()
    {
        return getText(product1priceLocator);
    }
    public String product2price()
    {
        return getText(product2priceLocator);
    }

    public String product1Quantity()
    {
        return getText(product1Quantity);
    }
    public String product2Quantity()
    {
        return getText(product2Quantity);
    }

    public String totalprice1()
    {
        return getText(total1pricrLocator);
    }

    public String totalprice2()
    {
        return getText(total2pricrLocator);
    }

}
