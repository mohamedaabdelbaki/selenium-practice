package Tests;

import Pages.productpage;
import org.testng.annotations.Test;

public class ProductTest extends BaseTest {
    protected productpage product;


    @Test
    public void addProductsInCart()
    {

        product=new productpage(driver);
        //Click 'Products' button

        product.clickOnProductPage();
        driver.navigate().refresh();

        //Hover over first product and click Add to cart
        product.hoverOverFirstProduct();
        // Click 'Continue Shopping' button
        product.ClickContinueBtn();
        //Hover over second product and click 'Add to cart'
        product.hoverOverSecondProduct();
        // Click 'View Cart' button
        product.viewCart();

        //Verify both products are added to Cart
       soft.assertEquals(product.CheckForProduct1().toLowerCase(),"blue top");
       soft.assertEquals(product.CheckForProduct2().toLowerCase(),"men tshirt");

       //. Verify their prices, quantity and total price
        soft.assertEquals(product.product1price(),"Rs. 500");
        soft.assertEquals(product.product2price(),"Rs. 400");
        //Quantity
        soft.assertEquals(product.product1Quantity(),"1");
        soft.assertEquals(product.product2Quantity(),"1");
        //price
        soft.assertEquals(product.totalprice1(),product.product1price());
        soft.assertEquals(product.totalprice2(),product.product2price());


        soft.assertAll();
    }
}
