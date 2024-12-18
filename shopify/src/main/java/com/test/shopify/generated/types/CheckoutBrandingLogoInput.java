package com.test.shopify.generated.types;

import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields used to update the logo customizations.
 */
public class CheckoutBrandingLogoInput {
  /**
   * The logo image (must not be of SVG format).
   */
  private CheckoutBrandingImageInput image;

  /**
   * The maximum width of the logo.
   */
  private Integer maxWidth;

  public CheckoutBrandingLogoInput() {
  }

  /**
   * The logo image (must not be of SVG format).
   */
  public CheckoutBrandingImageInput getImage() {
    return image;
  }

  public void setImage(CheckoutBrandingImageInput image) {
    this.image = image;
  }

  /**
   * The maximum width of the logo.
   */
  public Integer getMaxWidth() {
    return maxWidth;
  }

  public void setMaxWidth(Integer maxWidth) {
    this.maxWidth = maxWidth;
  }

  @Override
  public String toString() {
    return "CheckoutBrandingLogoInput{image='" + image + "', maxWidth='" + maxWidth + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CheckoutBrandingLogoInput that = (CheckoutBrandingLogoInput) o;
    return Objects.equals(image, that.image) &&
        Objects.equals(maxWidth, that.maxWidth);
  }

  @Override
  public int hashCode() {
    return Objects.hash(image, maxWidth);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The logo image (must not be of SVG format).
     */
    private CheckoutBrandingImageInput image;

    /**
     * The maximum width of the logo.
     */
    private Integer maxWidth;

    public CheckoutBrandingLogoInput build() {
      CheckoutBrandingLogoInput result = new CheckoutBrandingLogoInput();
      result.image = this.image;
      result.maxWidth = this.maxWidth;
      return result;
    }

    /**
     * The logo image (must not be of SVG format).
     */
    public Builder image(CheckoutBrandingImageInput image) {
      this.image = image;
      return this;
    }

    /**
     * The maximum width of the logo.
     */
    public Builder maxWidth(Integer maxWidth) {
      this.maxWidth = maxWidth;
      return this;
    }
  }
}
