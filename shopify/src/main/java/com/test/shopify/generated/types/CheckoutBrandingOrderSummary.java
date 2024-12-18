package com.test.shopify.generated.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The order summary customizations.
 */
public class CheckoutBrandingOrderSummary {
  /**
   * The background image of the order summary container.
   */
  private CheckoutBrandingImage backgroundImage;

  /**
   * The selected color scheme of the order summary container.
   */
  private CheckoutBrandingColorSchemeSelection colorScheme;

  public CheckoutBrandingOrderSummary() {
  }

  /**
   * The background image of the order summary container.
   */
  public CheckoutBrandingImage getBackgroundImage() {
    return backgroundImage;
  }

  public void setBackgroundImage(CheckoutBrandingImage backgroundImage) {
    this.backgroundImage = backgroundImage;
  }

  /**
   * The selected color scheme of the order summary container.
   */
  public CheckoutBrandingColorSchemeSelection getColorScheme() {
    return colorScheme;
  }

  public void setColorScheme(CheckoutBrandingColorSchemeSelection colorScheme) {
    this.colorScheme = colorScheme;
  }

  @Override
  public String toString() {
    return "CheckoutBrandingOrderSummary{backgroundImage='" + backgroundImage + "', colorScheme='" + colorScheme + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CheckoutBrandingOrderSummary that = (CheckoutBrandingOrderSummary) o;
    return Objects.equals(backgroundImage, that.backgroundImage) &&
        Objects.equals(colorScheme, that.colorScheme);
  }

  @Override
  public int hashCode() {
    return Objects.hash(backgroundImage, colorScheme);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The background image of the order summary container.
     */
    private CheckoutBrandingImage backgroundImage;

    /**
     * The selected color scheme of the order summary container.
     */
    private CheckoutBrandingColorSchemeSelection colorScheme;

    public CheckoutBrandingOrderSummary build() {
      CheckoutBrandingOrderSummary result = new CheckoutBrandingOrderSummary();
      result.backgroundImage = this.backgroundImage;
      result.colorScheme = this.colorScheme;
      return result;
    }

    /**
     * The background image of the order summary container.
     */
    public Builder backgroundImage(CheckoutBrandingImage backgroundImage) {
      this.backgroundImage = backgroundImage;
      return this;
    }

    /**
     * The selected color scheme of the order summary container.
     */
    public Builder colorScheme(CheckoutBrandingColorSchemeSelection colorScheme) {
      this.colorScheme = colorScheme;
      return this;
    }
  }
}
