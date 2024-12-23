package com.test.shopify.generated.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The customizations that you can make to cart links at checkout.
 */
public class CheckoutBrandingCartLink {
  /**
   * Whether the cart link is visible at checkout.
   */
  private CheckoutBrandingVisibility visibility;

  public CheckoutBrandingCartLink() {
  }

  /**
   * Whether the cart link is visible at checkout.
   */
  public CheckoutBrandingVisibility getVisibility() {
    return visibility;
  }

  public void setVisibility(CheckoutBrandingVisibility visibility) {
    this.visibility = visibility;
  }

  @Override
  public String toString() {
    return "CheckoutBrandingCartLink{visibility='" + visibility + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CheckoutBrandingCartLink that = (CheckoutBrandingCartLink) o;
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
     * Whether the cart link is visible at checkout.
     */
    private CheckoutBrandingVisibility visibility;

    public CheckoutBrandingCartLink build() {
      CheckoutBrandingCartLink result = new CheckoutBrandingCartLink();
      result.visibility = this.visibility;
      return result;
    }

    /**
     * Whether the cart link is visible at checkout.
     */
    public Builder visibility(CheckoutBrandingVisibility visibility) {
      this.visibility = visibility;
      return this;
    }
  }
}
