package com.neotech.pages2;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.neotech.utils.BaseClass;

public class Task1Page extends BaseClass {

	@FindBy(xpath = "/html/body/div[2]/div/div[1]/div[2]/div/div[1]/div[3]/div/div/form/div/div/div/input")
	public WebElement searchBox;

	@FindBy(xpath = "//li[@class='inline-block leading-4 align-top rounded-r-md']")
	public WebElement nextPage;

	@FindBy(xpath = "//*[@id=\"paging\"]/nav/ul/li[8]/a")
	public WebElement lastPage;

	@FindBy(xpath = "//div[@id='paging']//li")
	public List<WebElement> pageList;

	@FindBy(xpath = "//div[60]//span[@class='block font-semibold text-sm-1/2 leading-none mt-6 mb-0 max-h-10 hover:max-h-full min-h-10 overflow-hidden hover:overflow-visible text-center']")
	public WebElement lastProduct;

	@FindBy(xpath = "//input[@id='buyButton']")
	public WebElement addToCart;

	@FindBy(xpath = "//i[@class='icon-shopping-cart pr-1']")
	public WebElement viewCart;

	@FindBy(xpath = "//div[@class='itemDelete']/button[@type='button']")
	public WebElement delete;

	public Task1Page() {
		PageFactory.initElements(driver, this);
	}
}
