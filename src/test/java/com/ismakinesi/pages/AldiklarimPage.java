package com.ismakinesi.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AldiklarimPage extends BasePage {

    @FindBy(css=".fal.fa-hands-helping")
    public WebElement aldiklarim;

    @FindBy(css = "[src^='https://api.ismakinesi.com/photos/']")
    public WebElement photosAl;

    @FindBy(css = "div.sold.text-center:nth-child(1)")
    public WebElement alinanArac;

    @FindBy(xpath = "//h1[.='Aldıklarım']")
    public WebElement aldikPage;

    @FindBy(css = "div[id*='ad']")
    public WebElement teklifVerilenUrunler;

    @FindBy(css = "a[href='/profile/item/offer/list']")
    public WebElement tekliflerim;

    @FindBy(css = "div[class*='status']")
    public WebElement teklifVerilenArac;
}
