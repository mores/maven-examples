package com.test.shopify.generated.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields used to update the order summary container customizations.
 */
public class CheckoutBrandingOrderSummaryInput {
  /**
   * The selected color scheme for the order summary container of the checkout.
   */
  private CheckoutBrandingColorSchemeSelection colorScheme;

  /**
   * The background image of the order summary container (must not be of SVG format).
   */
  private CheckoutBrandingImageInput backgroundImage;

  public CheckoutBrandingOrderSummaryInput() {
  }

  /**
   * The selected color scheme for the order summary container of the checkout.
   */
  public CheckoutBrandingColorSchemeSelection getColorScheme() {
    return colorScheme;
  }

  public void setColorScheme(CheckoutBrandingColorSchemeSelection colorScheme) {
    this.colorScheme = colorScheme;
  }

  /**
   * The background image of the order summary container (must not be of SVG format).
   */
  public CheckoutBrandingImageInput getBackgroundImage() {
    return backgroundImage;
  }

  public void setBackgroundImage(CheckoutBrandingImageInput backgroundImage) {
    this.backgroundImage = backgroundImage;
  }

  @Override
  public String toString() {
    return "CheckoutBrandingOrderSummaryInput{colorScheme='" + colorScheme + "', backgroundImage='" + backgroundImage + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CheckoutBrandingOrderSummaryInput that = (CheckoutBrandingOrderSummaryInput) o;
    return Objects.equals(colorScheme, that.colorScheme) &&
        Objects.equals(backgroundImage, that.backgroundImage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(colorScheme, backgroundImage);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The selected color scheme for the order summary container of the checkout.
     */
    private CheckoutBrandingColorSchemeSelection colorScheme;

    /**
     * The background image of the order summary container (must not be of SVG format).
     */
    private CheckoutBrandingImageInput backgroundImage;

    public CheckoutBrandingOrderSummaryInput build() {
      CheckoutBrandingOrderSummaryInput result = new CheckoutBrandingOrderSummaryInput();
      result.colorScheme = this.colorScheme;
      result.backgroundImage = this.backgroundImage;
      return result;
    }

    /**
     * The selected color scheme for the order summary container of the checkout.
     */
    public Builder colorScheme(CheckoutBrandingColorSchemeSelection colorScheme) {
      this.colorScheme = colorScheme;
      return this;
    }

    /**
     * The background image of the order summary container (must not be of SVG format).
     */
    public Builder backgroundImage(CheckoutBrandingImageInput backgroundImage) {
      this.backgroundImage = backgroundImage;
      return this;
    }
  }
}
