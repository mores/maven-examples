package com.test.shopify.generated.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * The input fields to update the validity period of a price rule.
 */
public class PriceRuleValidityPeriodInput {
  /**
   * The time after which the price rule is valid.
   */
  private OffsetDateTime start;

  /**
   * The time after which the price rule becomes invalid.
   */
  private OffsetDateTime end;

  public PriceRuleValidityPeriodInput() {
  }

  /**
   * The time after which the price rule is valid.
   */
  public OffsetDateTime getStart() {
    return start;
  }

  public void setStart(OffsetDateTime start) {
    this.start = start;
  }

  /**
   * The time after which the price rule becomes invalid.
   */
  public OffsetDateTime getEnd() {
    return end;
  }

  public void setEnd(OffsetDateTime end) {
    this.end = end;
  }

  @Override
  public String toString() {
    return "PriceRuleValidityPeriodInput{start='" + start + "', end='" + end + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PriceRuleValidityPeriodInput that = (PriceRuleValidityPeriodInput) o;
    return Objects.equals(start, that.start) &&
        Objects.equals(end, that.end);
  }

  @Override
  public int hashCode() {
    return Objects.hash(start, end);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The time after which the price rule is valid.
     */
    private OffsetDateTime start;

    /**
     * The time after which the price rule becomes invalid.
     */
    private OffsetDateTime end;

    public PriceRuleValidityPeriodInput build() {
      PriceRuleValidityPeriodInput result = new PriceRuleValidityPeriodInput();
      result.start = this.start;
      result.end = this.end;
      return result;
    }

    /**
     * The time after which the price rule is valid.
     */
    public Builder start(OffsetDateTime start) {
      this.start = start;
      return this;
    }

    /**
     * The time after which the price rule becomes invalid.
     */
    public Builder end(OffsetDateTime end) {
      this.end = end;
      return this;
    }
  }
}
