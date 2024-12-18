package com.test.shopify.generated.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields to update the money range within which the price rule is applicable.
 */
public class PriceRuleMoneyRangeInput {
  /**
   * The upper bound of the money range.
   */
  private String lessThan;

  /**
   * The upper or equal bound of the money range.
   */
  private String lessThanOrEqualTo;

  /**
   * The lower bound of the money range.
   */
  private String greaterThan;

  /**
   * The lower or equal bound of the money range.
   */
  private String greaterThanOrEqualTo;

  public PriceRuleMoneyRangeInput() {
  }

  /**
   * The upper bound of the money range.
   */
  public String getLessThan() {
    return lessThan;
  }

  public void setLessThan(String lessThan) {
    this.lessThan = lessThan;
  }

  /**
   * The upper or equal bound of the money range.
   */
  public String getLessThanOrEqualTo() {
    return lessThanOrEqualTo;
  }

  public void setLessThanOrEqualTo(String lessThanOrEqualTo) {
    this.lessThanOrEqualTo = lessThanOrEqualTo;
  }

  /**
   * The lower bound of the money range.
   */
  public String getGreaterThan() {
    return greaterThan;
  }

  public void setGreaterThan(String greaterThan) {
    this.greaterThan = greaterThan;
  }

  /**
   * The lower or equal bound of the money range.
   */
  public String getGreaterThanOrEqualTo() {
    return greaterThanOrEqualTo;
  }

  public void setGreaterThanOrEqualTo(String greaterThanOrEqualTo) {
    this.greaterThanOrEqualTo = greaterThanOrEqualTo;
  }

  @Override
  public String toString() {
    return "PriceRuleMoneyRangeInput{lessThan='" + lessThan + "', lessThanOrEqualTo='" + lessThanOrEqualTo + "', greaterThan='" + greaterThan + "', greaterThanOrEqualTo='" + greaterThanOrEqualTo + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PriceRuleMoneyRangeInput that = (PriceRuleMoneyRangeInput) o;
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
     * The upper bound of the money range.
     */
    private String lessThan;

    /**
     * The upper or equal bound of the money range.
     */
    private String lessThanOrEqualTo;

    /**
     * The lower bound of the money range.
     */
    private String greaterThan;

    /**
     * The lower or equal bound of the money range.
     */
    private String greaterThanOrEqualTo;

    public PriceRuleMoneyRangeInput build() {
      PriceRuleMoneyRangeInput result = new PriceRuleMoneyRangeInput();
      result.lessThan = this.lessThan;
      result.lessThanOrEqualTo = this.lessThanOrEqualTo;
      result.greaterThan = this.greaterThan;
      result.greaterThanOrEqualTo = this.greaterThanOrEqualTo;
      return result;
    }

    /**
     * The upper bound of the money range.
     */
    public Builder lessThan(String lessThan) {
      this.lessThan = lessThan;
      return this;
    }

    /**
     * The upper or equal bound of the money range.
     */
    public Builder lessThanOrEqualTo(String lessThanOrEqualTo) {
      this.lessThanOrEqualTo = lessThanOrEqualTo;
      return this;
    }

    /**
     * The lower bound of the money range.
     */
    public Builder greaterThan(String greaterThan) {
      this.greaterThan = greaterThan;
      return this;
    }

    /**
     * The lower or equal bound of the money range.
     */
    public Builder greaterThanOrEqualTo(String greaterThanOrEqualTo) {
      this.greaterThanOrEqualTo = greaterThanOrEqualTo;
      return this;
    }
  }
}
