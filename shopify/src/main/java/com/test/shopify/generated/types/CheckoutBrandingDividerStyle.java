package com.test.shopify.generated.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The customizations for the page, content, main, and order summary dividers.
 */
public class CheckoutBrandingDividerStyle {
  /**
   * The border style for the divider.
   */
  private CheckoutBrandingBorderStyle borderStyle;

  /**
   * The border width for the divider.
   */
  private CheckoutBrandingBorderWidth borderWidth;

  public CheckoutBrandingDividerStyle() {
  }

  /**
   * The border style for the divider.
   */
  public CheckoutBrandingBorderStyle getBorderStyle() {
    return borderStyle;
  }

  public void setBorderStyle(CheckoutBrandingBorderStyle borderStyle) {
    this.borderStyle = borderStyle;
  }

  /**
   * The border width for the divider.
   */
  public CheckoutBrandingBorderWidth getBorderWidth() {
    return borderWidth;
  }

  public void setBorderWidth(CheckoutBrandingBorderWidth borderWidth) {
    this.borderWidth = borderWidth;
  }

  @Override
  public String toString() {
    return "CheckoutBrandingDividerStyle{borderStyle='" + borderStyle + "', borderWidth='" + borderWidth + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CheckoutBrandingDividerStyle that = (CheckoutBrandingDividerStyle) o;
    return Objects.equals(borderStyle, that.borderStyle) &&
        Objects.equals(borderWidth, that.borderWidth);
  }

  @Override
  public int hashCode() {
    return Objects.hash(borderStyle, borderWidth);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The border style for the divider.
     */
    private CheckoutBrandingBorderStyle borderStyle;

    /**
     * The border width for the divider.
     */
    private CheckoutBrandingBorderWidth borderWidth;

    public CheckoutBrandingDividerStyle build() {
      CheckoutBrandingDividerStyle result = new CheckoutBrandingDividerStyle();
      result.borderStyle = this.borderStyle;
      result.borderWidth = this.borderWidth;
      return result;
    }

    /**
     * The border style for the divider.
     */
    public Builder borderStyle(CheckoutBrandingBorderStyle borderStyle) {
      this.borderStyle = borderStyle;
      return this;
    }

    /**
     * The border width for the divider.
     */
    public Builder borderWidth(CheckoutBrandingBorderWidth borderWidth) {
      this.borderWidth = borderWidth;
      return this;
    }
  }
}
