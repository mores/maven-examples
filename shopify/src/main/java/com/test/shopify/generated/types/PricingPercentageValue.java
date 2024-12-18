package com.test.shopify.generated.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * One type of value given to a customer when a discount is applied to an order.
 * The application of a discount with this value gives the customer the specified percentage off a specified item.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class PricingPercentageValue implements PricingValue {
  /**
   * The percentage value of the object. This is a number between -100 (free) and 0 (no discount).
   */
  private double percentage;

  public PricingPercentageValue() {
  }

  /**
   * The percentage value of the object. This is a number between -100 (free) and 0 (no discount).
   */
  public double getPercentage() {
    return percentage;
  }

  public void setPercentage(double percentage) {
    this.percentage = percentage;
  }

  @Override
  public String toString() {
    return "PricingPercentageValue{percentage='" + percentage + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PricingPercentageValue that = (PricingPercentageValue) o;
    return percentage == that.percentage;
  }

  @Override
  public int hashCode() {
    return Objects.hash(percentage);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The percentage value of the object. This is a number between -100 (free) and 0 (no discount).
     */
    private double percentage;

    public PricingPercentageValue build() {
      PricingPercentageValue result = new PricingPercentageValue();
      result.percentage = this.percentage;
      return result;
    }

    /**
     * The percentage value of the object. This is a number between -100 (free) and 0 (no discount).
     */
    public Builder percentage(double percentage) {
      this.percentage = percentage;
      return this;
    }
  }
}
