package com.test.shopify.generated.types;

import java.lang.Double;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The font size.
 */
public class CheckoutBrandingFontSize {
  /**
   * The base font size.
   */
  private Double base;

  /**
   * The scale ratio used to derive all font sizes such as small and large.
   */
  private Double ratio;

  public CheckoutBrandingFontSize() {
  }

  /**
   * The base font size.
   */
  public Double getBase() {
    return base;
  }

  public void setBase(Double base) {
    this.base = base;
  }

  /**
   * The scale ratio used to derive all font sizes such as small and large.
   */
  public Double getRatio() {
    return ratio;
  }

  public void setRatio(Double ratio) {
    this.ratio = ratio;
  }

  @Override
  public String toString() {
    return "CheckoutBrandingFontSize{base='" + base + "', ratio='" + ratio + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CheckoutBrandingFontSize that = (CheckoutBrandingFontSize) o;
    return Objects.equals(base, that.base) &&
        Objects.equals(ratio, that.ratio);
  }

  @Override
  public int hashCode() {
    return Objects.hash(base, ratio);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The base font size.
     */
    private Double base;

    /**
     * The scale ratio used to derive all font sizes such as small and large.
     */
    private Double ratio;

    public CheckoutBrandingFontSize build() {
      CheckoutBrandingFontSize result = new CheckoutBrandingFontSize();
      result.base = this.base;
      result.ratio = this.ratio;
      return result;
    }

    /**
     * The base font size.
     */
    public Builder base(Double base) {
      this.base = base;
      return this;
    }

    /**
     * The scale ratio used to derive all font sizes such as small and large.
     */
    public Builder ratio(Double ratio) {
      this.ratio = ratio;
      return this;
    }
  }
}
