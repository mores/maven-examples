package com.test.shopify.generated.types;

import java.lang.Double;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields to update a price rule.
 */
public class PriceRuleValueInput {
  /**
   * The percentage value of the price rule.
   */
  private Double percentageValue;

  /**
   * The fixed amount value of the price rule.
   */
  private String fixedAmountValue;

  public PriceRuleValueInput() {
  }

  /**
   * The percentage value of the price rule.
   */
  public Double getPercentageValue() {
    return percentageValue;
  }

  public void setPercentageValue(Double percentageValue) {
    this.percentageValue = percentageValue;
  }

  /**
   * The fixed amount value of the price rule.
   */
  public String getFixedAmountValue() {
    return fixedAmountValue;
  }

  public void setFixedAmountValue(String fixedAmountValue) {
    this.fixedAmountValue = fixedAmountValue;
  }

  @Override
  public String toString() {
    return "PriceRuleValueInput{percentageValue='" + percentageValue + "', fixedAmountValue='" + fixedAmountValue + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PriceRuleValueInput that = (PriceRuleValueInput) o;
    return Objects.equals(percentageValue, that.percentageValue) &&
        Objects.equals(fixedAmountValue, that.fixedAmountValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(percentageValue, fixedAmountValue);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The percentage value of the price rule.
     */
    private Double percentageValue;

    /**
     * The fixed amount value of the price rule.
     */
    private String fixedAmountValue;

    public PriceRuleValueInput build() {
      PriceRuleValueInput result = new PriceRuleValueInput();
      result.percentageValue = this.percentageValue;
      result.fixedAmountValue = this.fixedAmountValue;
      return result;
    }

    /**
     * The percentage value of the price rule.
     */
    public Builder percentageValue(Double percentageValue) {
      this.percentageValue = percentageValue;
      return this;
    }

    /**
     * The fixed amount value of the price rule.
     */
    public Builder fixedAmountValue(String fixedAmountValue) {
      this.fixedAmountValue = fixedAmountValue;
      return this;
    }
  }
}
