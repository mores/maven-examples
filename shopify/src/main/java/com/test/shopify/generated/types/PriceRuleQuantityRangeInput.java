package com.test.shopify.generated.types;

import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields to update the quantity range within which the price rule is applicable.
 */
public class PriceRuleQuantityRangeInput {
  /**
   * The upper bound of the quantity range.
   */
  private Integer lessThan;

  /**
   * The upper or equal bound of the quantity range.
   */
  private Integer lessThanOrEqualTo;

  /**
   * The lower bound of the quantity range.
   */
  private Integer greaterThan;

  /**
   * The lower or equal bound of the quantity range.
   */
  private Integer greaterThanOrEqualTo;

  public PriceRuleQuantityRangeInput() {
  }

  /**
   * The upper bound of the quantity range.
   */
  public Integer getLessThan() {
    return lessThan;
  }

  public void setLessThan(Integer lessThan) {
    this.lessThan = lessThan;
  }

  /**
   * The upper or equal bound of the quantity range.
   */
  public Integer getLessThanOrEqualTo() {
    return lessThanOrEqualTo;
  }

  public void setLessThanOrEqualTo(Integer lessThanOrEqualTo) {
    this.lessThanOrEqualTo = lessThanOrEqualTo;
  }

  /**
   * The lower bound of the quantity range.
   */
  public Integer getGreaterThan() {
    return greaterThan;
  }

  public void setGreaterThan(Integer greaterThan) {
    this.greaterThan = greaterThan;
  }

  /**
   * The lower or equal bound of the quantity range.
   */
  public Integer getGreaterThanOrEqualTo() {
    return greaterThanOrEqualTo;
  }

  public void setGreaterThanOrEqualTo(Integer greaterThanOrEqualTo) {
    this.greaterThanOrEqualTo = greaterThanOrEqualTo;
  }

  @Override
  public String toString() {
    return "PriceRuleQuantityRangeInput{lessThan='" + lessThan + "', lessThanOrEqualTo='" + lessThanOrEqualTo + "', greaterThan='" + greaterThan + "', greaterThanOrEqualTo='" + greaterThanOrEqualTo + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PriceRuleQuantityRangeInput that = (PriceRuleQuantityRangeInput) o;
    return Objects.equals(lessThan, that.lessThan) &&
        Objects.equals(lessThanOrEqualTo, that.lessThanOrEqualTo) &&
        Objects.equals(greaterThan, that.greaterThan) &&
        Objects.equals(greaterThanOrEqualTo, that.greaterThanOrEqualTo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lessThan, lessThanOrEqualTo, greaterThan, greaterThanOrEqualTo);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The upper bound of the quantity range.
     */
    private Integer lessThan;

    /**
     * The upper or equal bound of the quantity range.
     */
    private Integer lessThanOrEqualTo;

    /**
     * The lower bound of the quantity range.
     */
    private Integer greaterThan;

    /**
     * The lower or equal bound of the quantity range.
     */
    private Integer greaterThanOrEqualTo;

    public PriceRuleQuantityRangeInput build() {
      PriceRuleQuantityRangeInput result = new PriceRuleQuantityRangeInput();
      result.lessThan = this.lessThan;
      result.lessThanOrEqualTo = this.lessThanOrEqualTo;
      result.greaterThan = this.greaterThan;
      result.greaterThanOrEqualTo = this.greaterThanOrEqualTo;
      return result;
    }

    /**
     * The upper bound of the quantity range.
     */
    public Builder lessThan(Integer lessThan) {
      this.lessThan = lessThan;
      return this;
    }

    /**
     * The upper or equal bound of the quantity range.
     */
    public Builder lessThanOrEqualTo(Integer lessThanOrEqualTo) {
      this.lessThanOrEqualTo = lessThanOrEqualTo;
      return this;
    }

    /**
     * The lower bound of the quantity range.
     */
    public Builder greaterThan(Integer greaterThan) {
      this.greaterThan = greaterThan;
      return this;
    }

    /**
     * The lower or equal bound of the quantity range.
     */
    public Builder greaterThanOrEqualTo(Integer greaterThanOrEqualTo) {
      this.greaterThanOrEqualTo = greaterThanOrEqualTo;
      return this;
    }
  }
}
