package com.test.shopify.generated.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields for footer content customizations.
 */
public class CheckoutBrandingFooterContentInput {
  /**
   * The visibility settings for footer content.
   */
  private CheckoutBrandingVisibility visibility;

  public CheckoutBrandingFooterContentInput() {
  }

  /**
   * The visibility settings for footer content.
   */
  public CheckoutBrandingVisibility getVisibility() {
    return visibility;
  }

  public void setVisibility(CheckoutBrandingVisibility visibility) {
    this.visibility = visibility;
  }

  @Override
  public String toString() {
    return "CheckoutBrandingFooterContentInput{visibility='" + visibility + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CheckoutBrandingFooterContentInput that = (CheckoutBrandingFooterContentInput) o;
    return Objects.equals(visibility, that.visibility);
  }

  @Override
  public int hashCode() {
    return Objects.hash(visibility);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The visibility settings for footer content.
     */
    private CheckoutBrandingVisibility visibility;

    public CheckoutBrandingFooterContentInput build() {
      CheckoutBrandingFooterContentInput result = new CheckoutBrandingFooterContentInput();
      result.visibility = this.visibility;
      return result;
    }

    /**
     * The visibility settings for footer content.
     */
    public Builder visibility(CheckoutBrandingVisibility visibility) {
      this.visibility = visibility;
      return this;
    }
  }
}
