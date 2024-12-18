package com.test.shopify.generated.types;

import java.lang.Boolean;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields to determine which discount classes the discount can combine with.
 */
public class DiscountCombinesWithInput {
  /**
   * Combines with product discounts.
   */
  private Boolean productDiscounts = false;

  /**
   * Combines with order discounts.
   */
  private Boolean orderDiscounts = false;

  /**
   * Combines with shipping discounts.
   */
  private Boolean shippingDiscounts = false;

  public DiscountCombinesWithInput() {
  }

  /**
   * Combines with product discounts.
   */
  public Boolean getProductDiscounts() {
    return productDiscounts;
  }

  public void setProductDiscounts(Boolean productDiscounts) {
    this.productDiscounts = productDiscounts;
  }

  /**
   * Combines with order discounts.
   */
  public Boolean getOrderDiscounts() {
    return orderDiscounts;
  }

  public void setOrderDiscounts(Boolean orderDiscounts) {
    this.orderDiscounts = orderDiscounts;
  }

  /**
   * Combines with shipping discounts.
   */
  public Boolean getShippingDiscounts() {
    return shippingDiscounts;
  }

  public void setShippingDiscounts(Boolean shippingDiscounts) {
    this.shippingDiscounts = shippingDiscounts;
  }

  @Override
  public String toString() {
    return "DiscountCombinesWithInput{productDiscounts='" + productDiscounts + "', orderDiscounts='" + orderDiscounts + "', shippingDiscounts='" + shippingDiscounts + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DiscountCombinesWithInput that = (DiscountCombinesWithInput) o;
    return Objects.equals(productDiscounts, that.productDiscounts) &&
        Objects.equals(orderDiscounts, that.orderDiscounts) &&
        Objects.equals(shippingDiscounts, that.shippingDiscounts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(productDiscounts, orderDiscounts, shippingDiscounts);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * Combines with product discounts.
     */
    private Boolean productDiscounts = false;

    /**
     * Combines with order discounts.
     */
    private Boolean orderDiscounts = false;

    /**
     * Combines with shipping discounts.
     */
    private Boolean shippingDiscounts = false;

    public DiscountCombinesWithInput build() {
      DiscountCombinesWithInput result = new DiscountCombinesWithInput();
      result.productDiscounts = this.productDiscounts;
      result.orderDiscounts = this.orderDiscounts;
      result.shippingDiscounts = this.shippingDiscounts;
      return result;
    }

    /**
     * Combines with product discounts.
     */
    public Builder productDiscounts(Boolean productDiscounts) {
      this.productDiscounts = productDiscounts;
      return this;
    }

    /**
     * Combines with order discounts.
     */
    public Builder orderDiscounts(Boolean orderDiscounts) {
      this.orderDiscounts = orderDiscounts;
      return this;
    }

    /**
     * Combines with shipping discounts.
     */
    public Builder shippingDiscounts(Boolean shippingDiscounts) {
      this.shippingDiscounts = shippingDiscounts;
      return this;
    }
  }
}
