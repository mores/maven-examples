package com.test.shopify.generated.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields used to update the components customizations.
 */
public class CheckoutBrandingCustomizationsInput {
  /**
   * The global customizations.
   */
  private CheckoutBrandingGlobalInput global;

  /**
   * The header customizations.
   */
  private CheckoutBrandingHeaderInput header;

  /**
   * The Heading Level 1 customizations.
   */
  private CheckoutBrandingHeadingLevelInput headingLevel1;

  /**
   * The Heading Level 2 customizations.
   */
  private CheckoutBrandingHeadingLevelInput headingLevel2;

  /**
   * The Heading Level 3 customizations.
   */
  private CheckoutBrandingHeadingLevelInput headingLevel3;

  /**
   * The main area customizations.
   */
  private CheckoutBrandingMainInput main;

  /**
   * The order summary customizations.
   */
  private CheckoutBrandingOrderSummaryInput orderSummary;

  /**
   * The form controls customizations.
   */
  private CheckoutBrandingControlInput control;

  /**
   * The text fields customizations.
   */
  private CheckoutBrandingTextFieldInput textField;

  /**
   * The checkboxes customizations.
   */
  private CheckoutBrandingCheckboxInput checkbox;

  /**
   * The selects customizations.
   */
  private CheckoutBrandingSelectInput select;

  /**
   * The primary buttons customizations.
   */
  private CheckoutBrandingButtonInput primaryButton;

  /**
   * The secondary buttons customizations.
   */
  private CheckoutBrandingButtonInput secondaryButton;

  /**
   * The favicon image (must be of PNG format).
   */
  private CheckoutBrandingImageInput favicon;

  /**
   * The choice list customizations.
   */
  private CheckoutBrandingChoiceListInput choiceList;

  /**
   * The merchandise thumbnails customizations.
   */
  private CheckoutBrandingMerchandiseThumbnailInput merchandiseThumbnail;

  public CheckoutBrandingCustomizationsInput() {
  }

  /**
   * The global customizations.
   */
  public CheckoutBrandingGlobalInput getGlobal() {
    return global;
  }

  public void setGlobal(CheckoutBrandingGlobalInput global) {
    this.global = global;
  }

  /**
   * The header customizations.
   */
  public CheckoutBrandingHeaderInput getHeader() {
    return header;
  }

  public void setHeader(CheckoutBrandingHeaderInput header) {
    this.header = header;
  }

  /**
   * The Heading Level 1 customizations.
   */
  public CheckoutBrandingHeadingLevelInput getHeadingLevel1() {
    return headingLevel1;
  }

  public void setHeadingLevel1(CheckoutBrandingHeadingLevelInput headingLevel1) {
    this.headingLevel1 = headingLevel1;
  }

  /**
   * The Heading Level 2 customizations.
   */
  public CheckoutBrandingHeadingLevelInput getHeadingLevel2() {
    return headingLevel2;
  }

  public void setHeadingLevel2(CheckoutBrandingHeadingLevelInput headingLevel2) {
    this.headingLevel2 = headingLevel2;
  }

  /**
   * The Heading Level 3 customizations.
   */
  public CheckoutBrandingHeadingLevelInput getHeadingLevel3() {
    return headingLevel3;
  }

  public void setHeadingLevel3(CheckoutBrandingHeadingLevelInput headingLevel3) {
    this.headingLevel3 = headingLevel3;
  }

  /**
   * The main area customizations.
   */
  public CheckoutBrandingMainInput getMain() {
    return main;
  }

  public void setMain(CheckoutBrandingMainInput main) {
    this.main = main;
  }

  /**
   * The order summary customizations.
   */
  public CheckoutBrandingOrderSummaryInput getOrderSummary() {
    return orderSummary;
  }

  public void setOrderSummary(CheckoutBrandingOrderSummaryInput orderSummary) {
    this.orderSummary = orderSummary;
  }

  /**
   * The form controls customizations.
   */
  public CheckoutBrandingControlInput getControl() {
    return control;
  }

  public void setControl(CheckoutBrandingControlInput control) {
    this.control = control;
  }

  /**
   * The text fields customizations.
   */
  public CheckoutBrandingTextFieldInput getTextField() {
    return textField;
  }

  public void setTextField(CheckoutBrandingTextFieldInput textField) {
    this.textField = textField;
  }

  /**
   * The checkboxes customizations.
   */
  public CheckoutBrandingCheckboxInput getCheckbox() {
    return checkbox;
  }

  public void setCheckbox(CheckoutBrandingCheckboxInput checkbox) {
    this.checkbox = checkbox;
  }

  /**
   * The selects customizations.
   */
  public CheckoutBrandingSelectInput getSelect() {
    return select;
  }

  public void setSelect(CheckoutBrandingSelectInput select) {
    this.select = select;
  }

  /**
   * The primary buttons customizations.
   */
  public CheckoutBrandingButtonInput getPrimaryButton() {
    return primaryButton;
  }

  public void setPrimaryButton(CheckoutBrandingButtonInput primaryButton) {
    this.primaryButton = primaryButton;
  }

  /**
   * The secondary buttons customizations.
   */
  public CheckoutBrandingButtonInput getSecondaryButton() {
    return secondaryButton;
  }

  public void setSecondaryButton(CheckoutBrandingButtonInput secondaryButton) {
    this.secondaryButton = secondaryButton;
  }

  /**
   * The favicon image (must be of PNG format).
   */
  public CheckoutBrandingImageInput getFavicon() {
    return favicon;
  }

  public void setFavicon(CheckoutBrandingImageInput favicon) {
    this.favicon = favicon;
  }

  /**
   * The choice list customizations.
   */
  public CheckoutBrandingChoiceListInput getChoiceList() {
    return choiceList;
  }

  public void setChoiceList(CheckoutBrandingChoiceListInput choiceList) {
    this.choiceList = choiceList;
  }

  /**
   * The merchandise thumbnails customizations.
   */
  public CheckoutBrandingMerchandiseThumbnailInput getMerchandiseThumbnail() {
    return merchandiseThumbnail;
  }

  public void setMerchandiseThumbnail(
      CheckoutBrandingMerchandiseThumbnailInput merchandiseThumbnail) {
    this.merchandiseThumbnail = merchandiseThumbnail;
  }

  @Override
  public String toString() {
    return "CheckoutBrandingCustomizationsInput{global='" + global + "', header='" + header + "', headingLevel1='" + headingLevel1 + "', headingLevel2='" + headingLevel2 + "', headingLevel3='" + headingLevel3 + "', main='" + main + "', orderSummary='" + orderSummary + "', control='" + control + "', textField='" + textField + "', checkbox='" + checkbox + "', select='" + select + "', primaryButton='" + primaryButton + "', secondaryButton='" + secondaryButton + "', favicon='" + favicon + "', choiceList='" + choiceList + "', merchandiseThumbnail='" + merchandiseThumbnail + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CheckoutBrandingCustomizationsInput that = (CheckoutBrandingCustomizationsInput) o;
    return Objects.equals(global, that.global) &&
        Objects.equals(header, that.header) &&
        Objects.equals(headingLevel1, that.headingLevel1) &&
        Objects.equals(headingLevel2, that.headingLevel2) &&
        Objects.equals(headingLevel3, that.headingLevel3) &&
        Objects.equals(main, that.main) &&
        Objects.equals(orderSummary, that.orderSummary) &&
        Objects.equals(control, that.control) &&
        Objects.equals(textField, that.textField) &&
        Objects.equals(checkbox, that.checkbox) &&
        Objects.equals(select, that.select) &&
        Objects.equals(primaryButton, that.primaryButton) &&
        Objects.equals(secondaryButton, that.secondaryButton) &&
        Objects.equals(favicon, that.favicon) &&
        Objects.equals(choiceList, that.choiceList) &&
        Objects.equals(merchandiseThumbnail, that.merchandiseThumbnail);
  }

  @Override
  public int hashCode() {
    return Objects.hash(global, header, headingLevel1, headingLevel2, headingLevel3, main, orderSummary, control, textField, checkbox, select, primaryButton, secondaryButton, favicon, choiceList, merchandiseThumbnail);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The global customizations.
     */
    private CheckoutBrandingGlobalInput global;

    /**
     * The header customizations.
     */
    private CheckoutBrandingHeaderInput header;

    /**
     * The Heading Level 1 customizations.
     */
    private CheckoutBrandingHeadingLevelInput headingLevel1;

    /**
     * The Heading Level 2 customizations.
     */
    private CheckoutBrandingHeadingLevelInput headingLevel2;

    /**
     * The Heading Level 3 customizations.
     */
    private CheckoutBrandingHeadingLevelInput headingLevel3;

    /**
     * The main area customizations.
     */
    private CheckoutBrandingMainInput main;

    /**
     * The order summary customizations.
     */
    private CheckoutBrandingOrderSummaryInput orderSummary;

    /**
     * The form controls customizations.
     */
    private CheckoutBrandingControlInput control;

    /**
     * The text fields customizations.
     */
    private CheckoutBrandingTextFieldInput textField;

    /**
     * The checkboxes customizations.
     */
    private CheckoutBrandingCheckboxInput checkbox;

    /**
     * The selects customizations.
     */
    private CheckoutBrandingSelectInput select;

    /**
     * The primary buttons customizations.
     */
    private CheckoutBrandingButtonInput primaryButton;

    /**
     * The secondary buttons customizations.
     */
    private CheckoutBrandingButtonInput secondaryButton;

    /**
     * The favicon image (must be of PNG format).
     */
    private CheckoutBrandingImageInput favicon;

    /**
     * The choice list customizations.
     */
    private CheckoutBrandingChoiceListInput choiceList;

    /**
     * The merchandise thumbnails customizations.
     */
    private CheckoutBrandingMerchandiseThumbnailInput merchandiseThumbnail;

    public CheckoutBrandingCustomizationsInput build() {
      CheckoutBrandingCustomizationsInput result = new CheckoutBrandingCustomizationsInput();
      result.global = this.global;
      result.header = this.header;
      result.headingLevel1 = this.headingLevel1;
      result.headingLevel2 = this.headingLevel2;
      result.headingLevel3 = this.headingLevel3;
      result.main = this.main;
      result.orderSummary = this.orderSummary;
      result.control = this.control;
      result.textField = this.textField;
      result.checkbox = this.checkbox;
      result.select = this.select;
      result.primaryButton = this.primaryButton;
      result.secondaryButton = this.secondaryButton;
      result.favicon = this.favicon;
      result.choiceList = this.choiceList;
      result.merchandiseThumbnail = this.merchandiseThumbnail;
      return result;
    }

    /**
     * The global customizations.
     */
    public Builder global(CheckoutBrandingGlobalInput global) {
      this.global = global;
      return this;
    }

    /**
     * The header customizations.
     */
    public Builder header(CheckoutBrandingHeaderInput header) {
      this.header = header;
      return this;
    }

    /**
     * The Heading Level 1 customizations.
     */
    public Builder headingLevel1(CheckoutBrandingHeadingLevelInput headingLevel1) {
      this.headingLevel1 = headingLevel1;
      return this;
    }

    /**
     * The Heading Level 2 customizations.
     */
    public Builder headingLevel2(CheckoutBrandingHeadingLevelInput headingLevel2) {
      this.headingLevel2 = headingLevel2;
      return this;
    }

    /**
     * The Heading Level 3 customizations.
     */
    public Builder headingLevel3(CheckoutBrandingHeadingLevelInput headingLevel3) {
      this.headingLevel3 = headingLevel3;
      return this;
    }

    /**
     * The main area customizations.
     */
    public Builder main(CheckoutBrandingMainInput main) {
      this.main = main;
      return this;
    }

    /**
     * The order summary customizations.
     */
    public Builder orderSummary(CheckoutBrandingOrderSummaryInput orderSummary) {
      this.orderSummary = orderSummary;
      return this;
    }

    /**
     * The form controls customizations.
     */
    public Builder control(CheckoutBrandingControlInput control) {
      this.control = control;
      return this;
    }

    /**
     * The text fields customizations.
     */
    public Builder textField(CheckoutBrandingTextFieldInput textField) {
      this.textField = textField;
      return this;
    }

    /**
     * The checkboxes customizations.
     */
    public Builder checkbox(CheckoutBrandingCheckboxInput checkbox) {
      this.checkbox = checkbox;
      return this;
    }

    /**
     * The selects customizations.
     */
    public Builder select(CheckoutBrandingSelectInput select) {
      this.select = select;
      return this;
    }

    /**
     * The primary buttons customizations.
     */
    public Builder primaryButton(CheckoutBrandingButtonInput primaryButton) {
      this.primaryButton = primaryButton;
      return this;
    }

    /**
     * The secondary buttons customizations.
     */
    public Builder secondaryButton(CheckoutBrandingButtonInput secondaryButton) {
      this.secondaryButton = secondaryButton;
      return this;
    }

    /**
     * The favicon image (must be of PNG format).
     */
    public Builder favicon(CheckoutBrandingImageInput favicon) {
      this.favicon = favicon;
      return this;
    }

    /**
     * The choice list customizations.
     */
    public Builder choiceList(CheckoutBrandingChoiceListInput choiceList) {
      this.choiceList = choiceList;
      return this;
    }

    /**
     * The merchandise thumbnails customizations.
     */
    public Builder merchandiseThumbnail(
        CheckoutBrandingMerchandiseThumbnailInput merchandiseThumbnail) {
      this.merchandiseThumbnail = merchandiseThumbnail;
      return this;
    }
  }
}
