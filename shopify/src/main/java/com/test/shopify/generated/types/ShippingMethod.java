package com.test.shopify.generated.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The shipping method for the delivery. Customers will see applicable shipping methods in the shipping section of checkout.
 */
public class ShippingMethod {
  /**
   * A unique code associated with the rate. For example: `expedited_mail`
   */
  private String code;

  /**
   * A description of the rate, which customers will see at checkout.
   * For example: `Local delivery`, `Free Express Worldwide`, `Includes tracking and insurance`.
   */
  private String label;

  public ShippingMethod() {
  }

  /**
   * A unique code associated with the rate. For example: `expedited_mail`
   */
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  /**
   * A description of the rate, which customers will see at checkout.
   * For example: `Local delivery`, `Free Express Worldwide`, `Includes tracking and insurance`.
   */
  public String getLabel() {
    return label;
  }

  public void setLabel(String label) {
    this.label = label;
  }

  @Override
  public String toString() {
    return "ShippingMethod{code='" + code + "', label='" + label + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ShippingMethod that = (ShippingMethod) o;
    return Objects.equals(code, that.code) &&
        Objects.equals(label, that.label);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, label);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * A unique code associated with the rate. For example: `expedited_mail`
     */
    private String code;

    /**
     * A description of the rate, which customers will see at checkout.
     * For example: `Local delivery`, `Free Express Worldwide`, `Includes tracking and insurance`.
     */
    private String label;

    public ShippingMethod build() {
      ShippingMethod result = new ShippingMethod();
      result.code = this.code;
      result.label = this.label;
      return result;
    }

    /**
     * A unique code associated with the rate. For example: `expedited_mail`
     */
    public Builder code(String code) {
      this.code = code;
      return this;
    }

    /**
     * A description of the rate, which customers will see at checkout.
     * For example: `Local delivery`, `Free Express Worldwide`, `Includes tracking and insurance`.
     */
    public Builder label(String label) {
      this.label = label;
      return this;
    }
  }
}
