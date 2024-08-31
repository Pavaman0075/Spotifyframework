package com.spotify.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProfilePage {
	@FindBy(xpath = "(//span[@data-encore-id='text'])[2]")
	private WebElement Profiletxt;
	@FindBy(xpath = "//a[@role='menuitem']")
	private WebElement Profile;
	@FindBy(xpath = "//form[@role='search']")
	private WebElement Search;

}
