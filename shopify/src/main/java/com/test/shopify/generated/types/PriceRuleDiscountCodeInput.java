package com.test.shopify.generated.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields to manipulate a discount code.
 */
public class PriceRuleDiscountCodeInput {
  /**
   * The code to use the discount.
   */
  private String code;

  public PriceRuleDiscountCodeInput() {
  }

  /**
   * The code to use the discount.
   */
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  @Override
  public String toString() {
    return "PriceRuleDiscountCodeInput{code='" + code + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PriceRuleDiscountCodeInput that = (PriceRuleDiscountCodeInput) o;
    return Objects.equals(code, that.code);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The code to use the discount.
     */
    private String code;

    public PriceRuleDiscountCodeInput build() {
      PriceRuleDiscountCodeInput result = new PriceRuleDiscountCodeInput();
      result.code = this.code;
      return result;
    }

    /**
     * The code to use the discount.
     */
    public Builder code(String code) {
      this.code = code;
      return this;
    }
  }
}
