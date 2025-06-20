package com.automate.pages;

import com.automate.pages.screen.ScreenActions;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public final class SettingsPage extends ScreenActions {

  @AndroidFindBy(accessibility = "test-LOGOUT")
  private MobileElement logOutButton;

  public LoginPage pressLogOutButton() {
    click(logOutButton, "Logout");
    return new LoginPage();
  }
}
