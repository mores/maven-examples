package com.test.shopify.generated.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The customizations that apply to specific components or areas of the user interface.
 */
public class CheckoutBrandingCustomizations {
  /**
   * The checkboxes customizations.
   */
  private CheckoutBrandingCheckbox checkbox;

  /**
   * The choice list customizations.
   */
  private CheckoutBrandingChoiceList choiceList;

  /**
   * The form controls customizations.
   */
  private CheckoutBrandingControl control;

  /**
   * The favicon image.
   */
  private CheckoutBrandingImage favicon;

  /**
   * The global customizations.
   */
  private CheckoutBrandingGlobal global;

  /**
   * The header customizations.
   */
  private CheckoutBrandingHeader header;

  /**
   * The Heading Level 1 customizations.
   */
  private CheckoutBrandingHeadingLevel headingLevel1;

  /**
   * The Heading Level 2 customizations.
   */
  private CheckoutBrandingHeadingLevel headingLevel2;

  /**
   * The Heading Level 3 customizations.
   */
  private CheckoutBrandingHeadingLevel headingLevel3;

  /**
   * The main area customizations.
   */
  private CheckoutBrandingMain main;

  /**
   * The merchandise thumbnails customizations.
   */
  private CheckoutBrandingMerchandiseThumbnail merchandiseThumbnail;

  /**
   * The order summary customizations.
   */
  private CheckoutBrandingOrderSummary orderSummary;

  /**
   * The primary buttons customizations.
   */
  private CheckoutBrandingButton primaryButton;

  /**
   * The secondary buttons customizations.
   */
  private CheckoutBrandingButton secondaryButton;

  /**
   * The selects customizations.
   */
  private CheckoutBrandingSelect select;

  /**
   * The text fields customizations.
   */
  private CheckoutBrandingTextField textField;

  public CheckoutBrandingCustomizations() {
  }

  /**
   * The checkboxes customizations.
   */
  public CheckoutBrandingCheckbox getCheckbox() {
    return checkbox;
  }

  public void setCheckbox(CheckoutBrandingCheckbox checkbox) {
    this.checkbox = checkbox;
  }

  /**
   * The choice list customizations.
   */
  public CheckoutBrandingChoiceList getChoiceList() {
    return choiceList;
  }

  public void setChoiceList(CheckoutBrandingChoiceList choiceList) {
    this.choiceList = choiceList;
  }

  /**
   * The form controls customizations.
   */
  public CheckoutBrandingControl getControl() {
    return control;
  }

  public void setControl(CheckoutBrandingControl control) {
    this.control = control;
  }

  /**
   * The favicon image.
   */
  public CheckoutBrandingImage getFavicon() {
    return favicon;
  }

  public void setFavicon(CheckoutBrandingImage favicon) {
    this.favicon = favicon;
  }

  /**
   * The global customizations.
   */
  public CheckoutBrandingGlobal getGlobal() {
    return global;
  }

  public void setGlobal(CheckoutBrandingGlobal global) {
    this.global = global;
  }

  /**
   * The header customizations.
   */
  public CheckoutBrandingHeader getHeader() {
    return header;
  }

  public void setHeader(CheckoutBrandingHeader header) {
    this.header = header;
  }

  /**
   * The Heading Level 1 customizations.
   */
  public CheckoutBrandingHeadingLevel getHeadingLevel1() {
    return headingLevel1;
  }

  public void setHeadingLevel1(CheckoutBrandingHeadingLevel headingLevel1) {
    this.headingLevel1 = headingLevel1;
  }

  /**
   * The Heading Level 2 customizations.
   */
  public CheckoutBrandingHeadingLevel getHeadingLevel2() {
    return headingLevel2;
  }

  public void setHeadingLevel2(CheckoutBrandingHeadingLevel headingLevel2) {
    this.headingLevel2 = headingLevel2;
  }

  /**
   * The Heading Level 3 customizations.
   */
  public CheckoutBrandingHeadingLevel getHeadingLevel3() {
    return headingLevel3;
  }

  public void setHeadingLevel3(CheckoutBrandingHeadingLevel headingLevel3) {
    this.headingLevel3 = headingLevel3;
  }

  /**
   * The main area customizations.
   */
  public CheckoutBrandingMain getMain() {
    return main;
  }

  public void setMain(CheckoutBrandingMain main) {
    this.main = main;
  }

  /**
   * The merchandise thumbnails customizations.
   */
  public CheckoutBrandingMerchandiseThumbnail getMerchandiseThumbnail() {
    return merchandiseThumbnail;
  }

  public void setMerchandiseThumbnail(CheckoutBrandingMerchandiseThumbnail merchandiseThumbnail) {
    this.merchandiseThumbnail = merchandiseThumbnail;
  }

  /**
   * The order summary customizations.
   */
  public CheckoutBrandingOrderSummary getOrderSummary() {
    return orderSummary;
  }

  public void setOrderSummary(CheckoutBrandingOrderSummary orderSummary) {
    this.orderSummary = orderSummary;
  }

  /**
   * The primary buttons customizations.
   */
  public CheckoutBrandingButton getPrimaryButton() {
    return primaryButton;
  }

  public void setPrimaryButton(CheckoutBrandingButton primaryButton) {
    this.primaryButton = primaryButton;
  }

  /**
   * The secondary buttons customizations.
   */
  public CheckoutBrandingButton getSecondaryButton() {
    return secondaryButton;
  }

  public void setSecondaryButton(CheckoutBrandingButton secondaryButton) {
    this.secondaryButton = secondaryButton;
  }

  /**
   * The selects customizations.
   */
  public CheckoutBrandingSelect getSelect() {
    return select;
  }

  public void setSelect(CheckoutBrandingSelect select) {
    this.select = select;
  }

  /**
   * The text fields customizations.
   */
  public CheckoutBrandingTextField getTextField() {
    return textField;
  }

  public void setTextField(CheckoutBrandingTextField textField) {
    this.textField = textField;
  }

  @Override
  public String toString() {
    return "CheckoutBrandingCustomizations{checkbox='" + checkbox + "', choiceList='" + choiceList + "', control='" + control + "', favicon='" + favicon + "', global='" + global + "', header='" + header + "', headingLevel1='" + headingLevel1 + "', headingLevel2='" + headingLevel2 + "', headingLevel3='" + headingLevel3 + "', main='" + main + "', merchandiseThumbnail='" + merchandiseThumbnail + "', orderSummary='" + orderSummary + "', primaryButton='" + primaryButton + "', secondaryButton='" + secondaryButton + "', select='" + select + "', textField='" + textField + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CheckoutBrandingCustomizations that = (CheckoutBrandingCustomizations) o;
    return Objects.equals(checkbox, that.checkbox) &&
        Objects.equals(choiceList, that.choiceList) &&
        Objects.equals(control, that.control) &&
        Objects.equals(favicon, that.favicon) &&
        Objects.equals(global, that.global) &&
        Objects.equals(header, that.header) &&
        Objects.equals(headingLevel1, that.headingLevel1) &&
        Objects.equals(headingLevel2, that.headingLevel2) &&
        Objects.equals(headingLevel3, that.headingLevel3) &&
        Objects.equals(main, that.main) &&
        Objects.equals(merchandiseThumbnail, that.merchandiseThumbnail) &&
        Objects.equals(orderSummary, that.orderSummary) &&
        Objects.equals(primaryButton, that.primaryButton) &&
        Objects.equals(secondaryButton, that.secondaryButton) &&
        Objects.equals(select, that.select) &&
        Objects.equals(textField, that.textField);
  }

  @Override
  public int hashCode() {
    return Objects.hash(checkbox, choiceList, control, favicon, global, header, headingLevel1, headingLevel2, headingLevel3, main, merchandiseThumbnail, orderSummary, primaryButton, secondaryButton, select, textField);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The checkboxes customizations.
     */
    private CheckoutBrandingCheckbox checkbox;

    /**
     * The choice list customizations.
     */
    private CheckoutBrandingChoiceList choiceList;

    /**
     * The form controls customizations.
     */
    private CheckoutBrandingControl control;

    /**
     * The favicon image.
     */
    private CheckoutBrandingImage favicon;

    /**
     * The global customizations.
     */
    private CheckoutBrandingGlobal global;

    /**
     * The header customizations.
     */
    private CheckoutBrandingHeader header;

    /**
     * The Heading Level 1 customizations.
     */
    private CheckoutBrandingHeadingLevel headingLevel1;

    /**
     * The Heading Level 2 customizations.
     */
    private CheckoutBrandingHeadingLevel headingLevel2;

    /**
     * The Heading Level 3 customizations.
     */
    private CheckoutBrandingHeadingLevel headingLevel3;

    /**
     * The main area customizations.
     */
    private CheckoutBrandingMain main;

    /**
     * The merchandise thumbnails customizations.
     */
    private CheckoutBrandingMerchandiseThumbnail merchandiseThumbnail;

    /**
     * The order summary customizations.
     */
    private CheckoutBrandingOrderSummary orderSummary;

    /**
     * The primary buttons customizations.
     */
    private CheckoutBrandingButton primaryButton;

    /**
     * The secondary buttons customizations.
     */
    private CheckoutBrandingButton secondaryButton;

    /**
     * The selects customizations.
     */
    private CheckoutBrandingSelect select;

    /**
     * The text fields customizations.
     */
    private CheckoutBrandingTextField textField;

    public CheckoutBrandingCustomizations build() {
      CheckoutBrandingCustomizations result = new CheckoutBrandingCustomizations();
      result.checkbox = this.checkbox;
      result.choiceList = this.choiceList;
      result.control = this.control;
      result.favicon = this.favicon;
      result.global = this.global;
      result.header = this.header;
      result.headingLevel1 = this.headingLevel1;
      result.headingLevel2 = this.headingLevel2;
      result.headingLevel3 = this.headingLevel3;
      result.main = this.main;
      result.merchandiseThumbnail = this.merchandiseThumbnail;
      result.orderSummary = this.orderSummary;
      result.primaryButton = this.primaryButton;
      result.secondaryButton = this.secondaryButton;
      result.select = this.select;
      result.textField = this.textField;
      return result;
    }

    /**
     * The checkboxes customizations.
     */
    public Builder checkbox(CheckoutBrandingCheckbox checkbox) {
      this.checkbox = checkbox;
      return this;
    }

    /**
     * The choice list customizations.
     */
    public Builder choiceList(CheckoutBrandingChoiceList choiceList) {
      this.choiceList = choiceList;
      return this;
    }

    /**
     * The form controls customizations.
     */
    public Builder control(CheckoutBrandingControl control) {
      this.control = control;
      return this;
    }

    /**
     * The favicon image.
     */
    public Builder favicon(CheckoutBrandingImage favicon) {
      this.favicon = favicon;
      return this;
    }

    /**
     * The global customizations.
     */
    public Builder global(CheckoutBrandingGlobal global) {
      this.global = global;
      return this;
    }

    /**
     * The header customizations.
     */
    public Builder header(CheckoutBrandingHeader header) {
      this.header = header;
      return this;
    }

    /**
     * The Heading Level 1 customizations.
     */
    public Builder headingLevel1(CheckoutBrandingHeadingLevel headingLevel1) {
      this.headingLevel1 = headingLevel1;
      return this;
    }

    /**
     * The Heading Level 2 customizations.
     */
    public Builder headingLevel2(CheckoutBrandingHeadingLevel headingLevel2) {
      this.headingLevel2 = headingLevel2;
      return this;
    }

    /**
     * The Heading Level 3 customizations.
     */
    public Builder headingLevel3(CheckoutBrandingHeadingLevel headingLevel3) {
      this.headingLevel3 = headingLevel3;
      return this;
    }

    /**
     * The main area customizations.
     */
    public Builder main(CheckoutBrandingMain main) {
      this.main = main;
      return this;
    }

    /**
     * The merchandise thumbnails customizations.
     */
    public Builder merchandiseThumbnail(CheckoutBrandingMerchandiseThumbnail merchandiseThumbnail) {
      this.merchandiseThumbnail = merchandiseThumbnail;
      return this;
    }

    /**
     * The order summary customizations.
     */
    public Builder orderSummary(CheckoutBrandingOrderSummary orderSummary) {
      this.orderSummary = orderSummary;
      return this;
    }

    /**
     * The primary buttons customizations.
     */
    public Builder primaryButton(CheckoutBrandingButton primaryButton) {
      this.primaryButton = primaryButton;
      return this;
    }

    /**
     * The secondary buttons customizations.
     */
    public Builder secondaryButton(CheckoutBrandingButton secondaryButton) {
      this.secondaryButton = secondaryButton;
      return this;
    }

    /**
     * The selects customizations.
     */
    public Builder select(CheckoutBrandingSelect select) {
      this.select = select;
      return this;
    }

    /**
     * The text fields customizations.
     */
    public Builder textField(CheckoutBrandingTextField textField) {
      this.textField = textField;
      return this;
    }
  }
}
