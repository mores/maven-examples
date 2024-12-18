package com.test.shopify.generated.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The main container customizations.
 */
public class CheckoutBrandingMain {
  /**
   * The background image of the main container.
   */
  private CheckoutBrandingImage backgroundImage;

  /**
   * The selected color scheme of the main container.
   */
  private CheckoutBrandingColorSchemeSelection colorScheme;

  public CheckoutBrandingMain() {
  }

  /**
   * The background image of the main container.
   */
  public CheckoutBrandingImage getBackgroundImage() {
    return backgroundImage;
  }

  public void setBackgroundImage(CheckoutBrandingImage backgroundImage) {
    this.backgroundImage = backgroundImage;
  }

  /**
   * The selected color scheme of the main container.
   */
  public CheckoutBrandingColorSchemeSelection getColorScheme() {
    return colorScheme;
  }

  public void setColorScheme(CheckoutBrandingColorSchemeSelection colorScheme) {
    this.colorScheme = colorScheme;
  }

  @Override
  public String toString() {
    return "CheckoutBrandingMain{backgroundImage='" + backgroundImage + "', colorScheme='" + colorScheme + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CheckoutBrandingMain that = (CheckoutBrandingMain) o;
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
     * The background image of the main container.
     */
    private CheckoutBrandingImage backgroundImage;

    /**
     * The selected color scheme of the main container.
     */
    private CheckoutBrandingColorSchemeSelection colorScheme;

    public CheckoutBrandingMain build() {
      CheckoutBrandingMain result = new CheckoutBrandingMain();
      result.backgroundImage = this.backgroundImage;
      result.colorScheme = this.colorScheme;
      return result;
    }

    /**
     * The background image of the main container.
     */
    public Builder backgroundImage(CheckoutBrandingImage backgroundImage) {
      this.backgroundImage = backgroundImage;
      return this;
    }

    /**
     * The selected color scheme of the main container.
     */
    public Builder colorScheme(CheckoutBrandingColorSchemeSelection colorScheme) {
      this.colorScheme = colorScheme;
      return this;
    }
  }
}
